package com.poiproject.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import javax.annotation.Resource;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.poiproject.mappers.StudentAllDataMapper;
import com.poiproject.model.StudentAllData;
import com.poiproject.model.StudentAllDataExample;
import com.poiproject.service.StudenAllDataPoiService;

/** 
* @author  作者 E-mail: Running
* @date 创建时间：2018年4月24日 下午10:31:10 
* @version 1.0 
* @Description 数据表导入导出以及相关操作  service实现类
*
*/
@Service
public class StudenAllDataPoiServiceImpl implements StudenAllDataPoiService{
	@Resource
	StudentAllDataMapper studentAllDataMapper;
	//导出数据表
	@Override
	public void exportExcel() {
//		public void exportExcel(List<StudentAllData> studentAllDataList, ServletOutputStream outputStream) {

		try {
			//1、创建工作簿
			HSSFWorkbook workbook = new HSSFWorkbook();
			//1.1、创建合并单元格对象
			CellRangeAddress cellRangeAddress = new CellRangeAddress(0, 0, 0, 18);//起始行号，结束行号，起始列号，结束列号
			//2、创建工作表
			HSSFSheet sheet = workbook.createSheet("2017年度家庭经济困难学生获资助统计一览表");
			//2.1、加载合并单元格对象
			sheet.addMergedRegion(cellRangeAddress);
			//设置默认列宽
			sheet.setDefaultColumnWidth(25);
			//3、创建行
			//3.1、创建头标题行；并且设置头标题
			HSSFRow row1 = sheet.createRow(0);
			HSSFCell cell1 = row1.createCell(0);
			//加载单元格样式
			cell1.setCellValue("2017年度家庭经济困难学生获资助统计一览表");
			//3.2、创建列标题行；并且设置列标题
			HSSFRow row2 = sheet.createRow(1);
			String[] titles = {"序号","系别", "学号", "姓名", "认定等级","奖学金","助学金","励志奖","奖补专项","校园地贷款","生源地贷款","优秀学生干部","生活补贴","国家奖学金","自强之星","公益之星","文体之星","创新创业之星","干部之星"};
			for(int i = 0; i < titles.length; i++){
				HSSFCell cell2 = row2.createCell(i);
				//加载单元格样式
				cell2.setCellValue(titles[i]);
			}
			List<StudentAllData> studentAllDataList=null;
			StudentAllDataExample studentAllDataExample=new StudentAllDataExample();
			studentAllDataList=studentAllDataMapper.selectByExample(studentAllDataExample);
			//4、操作单元格；将用户列表写入excel
			if(studentAllDataList != null){
				for(int j = 0; j < studentAllDataList.size(); j++){
					HSSFRow row = sheet.createRow(j+2);
					//序号
					HSSFCell cell11 = row.createCell(0);
					cell11.setCellValue(studentAllDataList.get(j).getId());
					//系别
					HSSFCell cell12 = row.createCell(1);
					cell12.setCellValue(studentAllDataList.get(j).getDepart());
					//学号
					HSSFCell cell13 = row.createCell(2);
					cell13.setCellValue(studentAllDataList.get(j).getStudentId());
					//姓名
					HSSFCell cell14 = row.createCell(3);
					cell14.setCellValue(studentAllDataList.get(j).getName());
					//认定等级
					HSSFCell cell15 = row.createCell(4);
					cell15.setCellValue(studentAllDataList.get(j).getCognizanceGrade());
					//奖学金
					if(studentAllDataList.get(j).getJianXueJin()!=null){
						HSSFCell cell16 = row.createCell(5);
						cell16.setCellValue(studentAllDataList.get(j).getJianXueJin());
					}
					//助学金
					if(studentAllDataList.get(j).getZhuXueJin()!=null){
						HSSFCell cell17 = row.createCell(6);
						cell17.setCellValue(studentAllDataList.get(j).getZhuXueJin());
					}
					//励志奖
					if(studentAllDataList.get(j).getLiZhi()!=null){
						HSSFCell cell18 = row.createCell(7);
						cell18.setCellValue(studentAllDataList.get(j).getLiZhi());
					}
					//奖补专项
					if(studentAllDataList.get(j).getJianBu()!=null){
						HSSFCell cell19 = row.createCell(8);
						cell19.setCellValue(studentAllDataList.get(j).getJianBu());
					}
					//校园地贷款
				    if(studentAllDataList.get(j).getXiaoYuanDi()!=null){
				    	HSSFCell cell110 = row.createCell(9);
				    	cell110.setCellValue(studentAllDataList.get(j).getXiaoYuanDi());
				    }
					//生源地贷款
				    if(studentAllDataList.get(j).getShengYuanDi()!=null){
				    	HSSFCell cell111 = row.createCell(10);
				    	cell111.setCellValue(studentAllDataList.get(j).getShengYuanDi());
				    }
					//优秀学生干部
				    if(studentAllDataList.get(j).getYouXiuGanBu()!=null){
				    	HSSFCell cell112 = row.createCell(11);
				    	cell112.setCellValue(studentAllDataList.get(j).getYouXiuGanBu());
				    }
					//生活补贴
				    if(studentAllDataList.get(j).getShengHuoBu()!=null){
				    	HSSFCell cell113 = row.createCell(12);
				    	cell113.setCellValue(studentAllDataList.get(j).getShengHuoBu());
				    }
					//国家奖学金
				    if(studentAllDataList.get(j).getGuoJiaJian()!=null){
				    	HSSFCell cell114 = row.createCell(13);
				    	cell114.setCellValue(studentAllDataList.get(j).getGuoJiaJian());
				    }
					//自强之星
				    if(studentAllDataList.get(j).getZiQiang()!=null){
				    	HSSFCell cell115 = row.createCell(14);
				    	cell115.setCellValue(studentAllDataList.get(j).getZiQiang());
				    }
					//公益之星
				    if(studentAllDataList.get(j).getGongYi()!=null){
				    	
				    	HSSFCell cell116 = row.createCell(15);
				    	cell116.setCellValue(studentAllDataList.get(j).getGongYi());
				    }
					//文体之星
				    if(studentAllDataList.get(j).getWenTi()!=null){
				    	
				    	HSSFCell cell117 = row.createCell(16);
				    	cell117.setCellValue(studentAllDataList.get(j).getWenTi());
				    	
				    }
					//创新创业之星
				    if(studentAllDataList.get(j).getChuangYe()!=null){
				    	HSSFCell cell118 = row.createCell(17);
				    	cell118.setCellValue(studentAllDataList.get(j).getChuangYe());
				    }
					//干部之星
				    if(studentAllDataList.get(j).getGanBu()!=null){
				    	HSSFCell cell119 = row.createCell(18);
				    	cell119.setCellValue(studentAllDataList.get(j).getGanBu());
				    }

				}
			}
			FileOutputStream outputStream=new FileOutputStream("D:\\upload\\studentdata\\out\\数据表.xls");
			//5、输出
			workbook.write(outputStream);
			workbook.close();
			outputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//导入数据表分析
	@Override
	public void importExcel(String inputStreamPath,String fileName) {
		FileInputStream InputStream=null;
		try {
			InputStream = new FileInputStream(inputStreamPath);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} 
		try {
			String studentdataExcelFileName=fileName;
			//正则表达式匹配
			boolean is03Excel = studentdataExcelFileName.matches("^.+\\.(?i)(xls)$");
			//1、读取工作簿
			Workbook workbook = is03Excel ? new HSSFWorkbook(InputStream):new XSSFWorkbook(InputStream);
			//2、读取工作表
			Sheet sheet = workbook.getSheetAt(0);
			//3、读取行
			if(sheet.getPhysicalNumberOfRows() > 2){
				StudentAllData studentAllData=null;
				for(int k = 2; k < sheet.getPhysicalNumberOfRows(); k++){
					//4、读取单元格
					Row row = sheet.getRow(k);
					studentAllData = new StudentAllData();
					//序号
					Cell cell0 = row.getCell(0);
					cell0.setCellType(Cell.CELL_TYPE_STRING);
					studentAllData.setId(Integer.parseInt(cell0.getStringCellValue()));
					//系别
					Cell cell1 = row.getCell(1);
					cell1.setCellType(Cell.CELL_TYPE_STRING);
					studentAllData.setDepart(cell1.getStringCellValue());
					//学号
					Cell cell2 = row.getCell(2);
					cell2.setCellType(Cell.CELL_TYPE_STRING);
					studentAllData.setStudentId(Integer.parseInt(cell2.getStringCellValue()));
					//姓名
					Cell cell3 = row.getCell(3);
					cell3.setCellType(Cell.CELL_TYPE_STRING);
					studentAllData.setName(cell3.getStringCellValue());
					//认定等级
					Cell cell4 = row.getCell(4);
					cell4.setCellType(Cell.CELL_TYPE_STRING);
					studentAllData.setCognizanceGrade(cell4.getStringCellValue());
					
					studentAllDataMapper.insert(studentAllData);
					System.out.println(studentAllData);
				}
			}
			workbook.close();
			InputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	
		
	}
	//插入金额数据
	@Override
	public void insertMoney(String inputStreamPath, String fileName) {
		FileInputStream InputStream=null;
		try {
			InputStream = new FileInputStream(inputStreamPath);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} try {
			String studentdataExcelFileName=fileName;
			boolean is03Excel = studentdataExcelFileName.matches("^.+\\.(?i)(xls)$");
			//1、读取工作簿
			Workbook workbook = is03Excel ? new HSSFWorkbook(InputStream):new XSSFWorkbook(InputStream);
			//2、读取工作表
			Sheet sheet = workbook.getSheetAt(0);
			//3、读取行
			if(sheet.getPhysicalNumberOfRows() > 2){
				//StudentAllData studentAllData=null;
				for(int k = 2; k < sheet.getPhysicalNumberOfRows(); k++){
					//其他处理
					List<StudentAllData> studentAllDataList=null;
					StudentAllDataExample studentAllDataExample=new StudentAllDataExample();
					//4、读取单元格
					Row row = sheet.getRow(k);
					//studentAllData = new StudentAllData();
					//学号
					Cell cell0 = row.getCell(0);
					cell0.setCellType(Cell.CELL_TYPE_STRING);
					int studentNum=Integer.parseInt(cell0.getStringCellValue());
					//studentAllData.setId(Integer.parseInt(cell0.getStringCellValue()));
					//姓名
					Cell cell1 = row.getCell(1);
					cell1.setCellType(Cell.CELL_TYPE_STRING);
					//studentAllData.setDepart(cell1.getStringCellValue());
					String name=cell1.getStringCellValue();
					//金额
					Cell cell2 = row.getCell(2);
					cell2.setCellType(Cell.CELL_TYPE_STRING);
					int money=Integer.parseInt(cell2.getStringCellValue());
					//studentAllData.setStudentId(Integer.parseInt(cell2.getStringCellValue()));
/**
 * 处理助学金表的导入
 */
//					//4、读取单元格
//					Row row = sheet.getRow(k);
//					//studentAllData = new StudentAllData();
//					//姓名
//					Cell cell0 = row.getCell(0);
//					//cell0.setCellType(Cell.CELL_TYPE_STRING);
//					String name=cell0.getStringCellValue();
//					//studentAllData.setId(Integer.parseInt(cell0.getStringCellValue()));
//					//学号
//					Cell cell1 = row.getCell(1);
//					//cell1.setCellType(Cell.CELL_TYPE_STRING);
//					int studentNum=Integer.parseInt(cell1.getStringCellValue());
//					//studentAllData.setDepart(cell1.getStringCellValue());
//					//助学金
//					Cell cell2 = row.getCell(2);
//					//cell2.setCellType(Cell.CELL_TYPE_STRING);
//					int money=Integer.parseInt(cell2.getStringCellValue())*2;
//					//studentAllData.setStudentId(Integer.parseInt(cell2.getStringCellValue()));
					
					System.out.println("==================================================");
					System.out.println("序号："+k+",学号："+studentNum+",姓名："+name+",金额："+money);
					System.out.println("==================================================");
					
					studentAllDataExample.createCriteria().andNameEqualTo(name);
					studentAllDataExample.createCriteria().andStudentIdEqualTo(studentNum);
					studentAllDataList=studentAllDataMapper.selectByExample(studentAllDataExample);
					if(!studentAllDataList.isEmpty()){
						
						StudentAllData studentAllData= studentAllDataList.get(0);
						System.out.println("查询出来的数据："+studentAllData);
						//设置助学金
						//studentAllData.setZhuXueJin(money);
						//设置奖学金
						//studentAllData.setJianXueJin(money);
						//设置励志奖学金
						//studentAllData.setLiZhi(money);
						//设置生源地
						//studentAllData.setShengYuanDi(money);
						//设置校园地
						//studentAllData.setXiaoYuanDi(money);
						//优秀学干
						studentAllData.setYouXiuGanBu(9.3);
						//生活补贴
						//studentAllData.setShengHuoBu(money);
						//国家奖学金
						//studentAllData.setGuoJiaJian(money);
						//自强之星
						//studentAllData.setZiQiang(money);
						//公益之星
						//studentAllData.setGongYi(money);
						//文体之星
						//studentAllData.setWenTi(money);
						//创业之星
						//studentAllData.setChuangYe(money);
						//干部之星
						//studentAllData.setGanBu(money);
						//奖补
//						if(studentAllData.getJianBu()!=null){
//							int temp=studentAllData.getJianBu()+money;
//							studentAllData.setJianBu(temp);
//							System.out.println("重复更新");
//						}else if(money>0&&studentAllData.getJianBu()==null){
//							studentAllData.setJianBu(money);
//						}
						studentAllDataMapper.updateByPrimaryKey(studentAllData);
					}
					
					
				}
			}
			workbook.close();
			InputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
