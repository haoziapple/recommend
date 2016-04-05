/**
 * Copyright (C) 2015 FuZhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.turn.img.service.ImgService
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:LiangJin
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-11-6     LiangJin       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.service;

import java.sql.SQLException;
import java.util.List;

import com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.bean.req.ReqImgInfo;
import com.fzjt.xiaoliu.read.interfaces.business.home.turnImg.bean.rsp.RspImgInfo;

/**
 * service层 调dao 查询轮播图片信息
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.business.turn.img.service.ImgService
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-11-6 下午2:43:32
 * @author:LiangJin
 */
public interface ImgService
{
    /**
     * 查询首页轮播图片集合
     * 
     * @Description:
     * @return List
     * @throws SQLException
     * @version:v1.0
     * @author:LiChangjiang
     * @date:2015-11-7 下午4:30:21
     */
    List<RspImgInfo> queryImgInfo(ReqImgInfo reqInfo) throws SQLException;

}
