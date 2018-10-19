package cn.appsys.dao.appcatagory;


import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.appsys.dao.appcategory.AppCategoryMapper;
import cn.appsys.pojo.AppCategory;


public class TestAppCataGory {

	private Logger logger = Logger.getLogger(TestAppCataGory.class);
	
	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		AppCategoryMapper appCategoryMapper = (AppCategoryMapper)ctx.getBean("appCategoryMapper");
		try {
			List<AppCategory> list = appCategoryMapper.getAppCategoryListByParentId(1);
			for (AppCategory appCategory : list) {
				logger.info(appCategory.getCategoryName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
