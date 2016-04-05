package com.fzjt.xiaoliu.read.interfaces.util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;

/**
 * 
 * @className:com.fzjt.xiaoliu.read.interfaces.util.Configurations
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 下午12:34:54
 * @author:ZhangYun
 */
public class Configurations extends HttpServlet
{
    
	private static final long serialVersionUID = 1L;
	private Properties propertie;
    private InputStream inputFile;
    private FileOutputStream outputFile;
   
   
    public Configurations()
    {
        propertie = new Properties();
    }
   
   
    public Configurations(String filePath)
    {
    	filePath= "./src/interface_name.properties";
        propertie = new Properties();
        try {
            inputFile = new FileInputStream(filePath);
            propertie.load(inputFile);
            inputFile.close();
        } catch (FileNotFoundException ex) {
            System.out.println("读取属性文件--->失败！- 原因：文件路径错误或者文件不存在");
        } catch (IOException ex) {
            System.out.println("装载文件--->失败!");
        }
    }
   
    public String getValue(String key,ServletContext application)
    {
        try {
            String value = "";
            inputFile = application.getResourceAsStream("/WEB-INF/classes/interface_name.properties");
            propertie.load(inputFile);
            inputFile.close();
            if(propertie.containsKey(key)){
                value = propertie.getProperty(key);
                return value;
            }else
                return value;
        } catch (FileNotFoundException e) {
        	System.out.println(e.getMessage().toString());
            return "";
        } catch (IOException e) {
        	System.out.println(e.getMessage().toString());
            return "";
        } catch (Exception ex) {
        	System.out.println(ex.getMessage().toString());
            return "";
        }
    }
   
   
    public void clear()
    {
        propertie.clear();
    }
   
    public void setValue(String key, String value)
    {
        propertie.setProperty(key, value);
    }
   
   
    public void saveFile(String fileName, String description)
    {
        try {
            outputFile = new FileOutputStream(fileName);
            propertie.store(outputFile, description);
            outputFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}