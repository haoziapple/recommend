package com.fzjt.xiaoliu.read.interfaces.util;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.OracleConnection;
import oracle.sql.ARRAY;
import oracle.sql.ArrayDescriptor;
import oracle.sql.STRUCT;
import oracle.sql.StructDescriptor;

import org.springframework.jdbc.support.nativejdbc.C3P0NativeJdbcExtractor;

import com.ibatis.sqlmap.engine.type.BaseTypeHandler;
import com.ibatis.sqlmap.engine.type.TypeHandler;

public class PVArrayHandler extends BaseTypeHandler implements TypeHandler {
	
	@SuppressWarnings("unchecked")
	public void setParameter(PreparedStatement ps, int index, Object parameter, String jdbcType) throws SQLException {
		
		//获取OracleConnection
		C3P0NativeJdbcExtractor cp30NativeJdbcExtractor = (C3P0NativeJdbcExtractor)new C3P0NativeJdbcExtractor();  
		OracleConnection conn = (OracleConnection)cp30NativeJdbcExtractor.getNativeConnection(ps.getConnection()); 

		//创建存储过程入参结构数组
		StructDescriptor structDescriptor = new StructDescriptor("PVOBJECT", conn);
		ARRAY pvArray = null;
		List<PVObject> pvObjectList = (ArrayList<PVObject>)parameter;
		if(pvObjectList!=null && pvObjectList.size()>0){
			List<STRUCT> pvList = new ArrayList<STRUCT>();
			for(int i=0; i<pvObjectList.size(); i++){
				PVObject pvObject = pvObjectList.get(i);
				Object[] result = new Object[2];
				result[0] = pvObject.getPkey();
				result[1] = pvObject.getVkey();
				STRUCT item = new STRUCT(structDescriptor, conn, result);
				pvList.add(item);
			}
			pvArray = new ARRAY(ArrayDescriptor.createDescriptor(jdbcType, conn), conn, pvList.toArray());
		}
		/*
		else{
			pvArray = new ARRAY(ArrayDescriptor.createDescriptor(jdbcType, conn), conn, null);
		}
		*/
		ps.setArray(index, pvArray);
	}

	public Object getResult(ResultSet rs, String paramString) throws SQLException {
		throw new SQLException("暂不支持此方法");
	}

	public Object getResult(ResultSet rs, int paramInt) throws SQLException {
		throw new SQLException("暂不支持此方法");
	}

	public Object getResult(CallableStatement cs, int paramInt) throws SQLException {
		throw new SQLException("暂不支持此方法");
	}

	public Object valueOf(String s) {
		return null;
	}
}
