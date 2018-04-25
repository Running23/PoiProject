package com.ibook.service;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 作者 E-mail: Running
 * @date 创建时间：2018年4月25日 上午12:08:57
 * @version 1.0
 * @Description
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class StudenAllDataPoiServiceTest {
	@Resource
	StudenAllDataPoiService studenAllDataPoiService;

	@Test
	public void testStudenAllDataPoiService() {
		studenAllDataPoiService.exportExcel();
		System.err.println("========================");
	}

	@Test
	public void testImportExcel() {
		System.out.println("==========================================");
		final String inputStreamPath = "D:\\upload\\studentdata\\in\\数据表.xlsx";
		final String fileName = "数据表.xlsx";

		studenAllDataPoiService.importExcel(inputStreamPath, fileName);

		System.err.println("==========================================");
	}
	@Test
	public void testinsertMoney() {
		System.out.println("==========================================");
		/**
		 * 助学金表
		 */
//		final String inputStreamPath = "D:\\upload\\studentdata\\in\\助学金表.xlsx";
//		final String fileName = "助学金表.xlsx";
		/**
		 * 奖学金表
		 */
//		final String inputStreamPath = "D:\\upload\\studentdata\\in\\奖学金.xlsx";
//		final String fileName = "奖学金.xlsx";
		/**
		 *励志奖学金
		 */
//		final String inputStreamPath = "D:\\upload\\studentdata\\in\\励志奖学金.xlsx";
//		final String fileName = "励志奖学金.xlsx";
		
//		/**
//		 *生源地
//		 */
//		final String inputStreamPath = "D:\\upload\\studentdata\\in\\生源地贷款.xlsx";
//		final String fileName = "生源地贷款.xlsx";
		
		/**
		 *校园地.xlsx
		 */
//		final String inputStreamPath = "D:\\upload\\studentdata\\in\\校园地.xlsx";
//		final String fileName = "校园地.xlsx";
		/**
		 *优秀学生干部.xlsx
		 */
		final String inputStreamPath = "D:\\upload\\studentdata\\in\\优秀学生干部.xlsx";
		final String fileName = "优秀学生干部.xlsx";
		/**
		 *生活补贴.xlsx
		 */
//		final String inputStreamPath = "D:\\upload\\studentdata\\in\\生活补贴.xlsx";
//		final String fileName = "生活补贴.xlsx";
		/**
		 *国家奖学金.xlsx
		 */
//		final String inputStreamPath = "D:\\upload\\studentdata\\in\\国家奖学金.xlsx";
//		final String fileName = "国家奖学金.xlsx";
		/**
		 *自强之星.xlsx
		 */
//		final String inputStreamPath = "D:\\upload\\studentdata\\in\\自强之星.xlsx";
//		final String fileName = "自强之星.xlsx";
		/**
		 *公益之星.xlsx
		 */
//		final String inputStreamPath = "D:\\upload\\studentdata\\in\\公益之星.xlsx";
//		final String fileName = "公益之星.xlsx";
		/**
		 *文体之星.xlsx
		 */
//		final String inputStreamPath = "D:\\upload\\studentdata\\in\\文体之星.xlsx";
//		final String fileName = "文体之星.xlsx";
		
		/**
		 *创业之星.xlsx
		 */
//		final String inputStreamPath = "D:\\upload\\studentdata\\in\\创业之星.xlsx";
//		final String fileName = "创业之星.xlsx";
		
		/**
		 *干部之星.xlsx
		 */
//		final String inputStreamPath = "D:\\upload\\studentdata\\in\\干部之星.xlsx";
//		final String fileName = "干部之星.xlsx";
		/**
		 *自强社优秀干部
		 */
//		final String inputStreamPath = "D:\\upload\\studentdata\\in\\自强社优秀干部.xlsx";
//		final String fileName = "自强社优秀干部.xlsx";
		/**
		 *自强社公益先锋.xlsx
		 */
//		final String inputStreamPath = "D:\\upload\\studentdata\\in\\自强社公益先锋.xlsx";
//		final String fileName = "自强社公益先锋.xlsx";
		/**
		 *学业基本分.xlsx
		 */
//		final String inputStreamPath = "D:\\upload\\studentdata\\in\\学业基本分.xlsx";
//		final String fileName = "学业基本分.xlsx";
//		
		studenAllDataPoiService.insertMoney(inputStreamPath, fileName);
		
		System.err.println("==========================================");
	}

}
