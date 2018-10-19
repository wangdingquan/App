package cn.appsys.dao.appinfo;

import java.io.FileNotFoundException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import cn.appsys.pojo.AppInfo;

public class TestAppinfo{

	private Logger logger = Logger.getLogger(TestAppinfo.class);
	

	@Test
	public void testGetAppInfoCount() {
		PropertyConfigurator.configure(TestAppinfo.class.getClassLoader().getResource("log4j.properties"));
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext-mybatis.xml");
		AppInfoMapper appInfoMapper = (AppInfoMapper) ctx
				.getBean("appInfoMapper");

		try {
			int count = appInfoMapper.getAppInfoCount(null, null, null, null,
					null, null, null);
			logger.info(count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetAppInfoList() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext-mybatis.xml");
		AppInfoMapper appInfoMapper = (AppInfoMapper) ctx
				.getBean("appInfoMapper");
		try {
			List<AppInfo> list =appInfoMapper.getAppInfoList(null, null,
					null, null, null,
					null, null, 0, 2);
			for (AppInfo appInfo : list) {
				logger.info(appInfo.getCategoryLevel1Name());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
