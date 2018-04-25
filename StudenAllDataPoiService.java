package com.poiproject.service;

import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletOutputStream;

import com.poiproject.model.StudentAllData;

/** 
* @author  作者 E-mail: Running
* @date 创建时间：2018年4月24日 下午10:30:46 
* @version 1.0 
* @Description   接口
*
*/
public interface StudenAllDataPoiService {
	void exportExcel(); 
	void importExcel(String inputStreamPath,String fileName);
	void insertMoney(String inputStreamPath,String fileName);
}
