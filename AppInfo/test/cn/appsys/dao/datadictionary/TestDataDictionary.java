package cn.appsys.dao.datadictionary;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.appsys.pojo.DataDictionary;

public class TestDataDictionary {
	
	private Logger logger = Logger.getLogger(TestDataDictionary.class);
	
	@Test
	public void getDataDictionary(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		DataDictionaryMapper dataDictionaryMapper = (DataDictionaryMapper)ctx.getBean("dataDictionaryMapper");
		try {
			List<DataDictionary> list = dataDictionaryMapper.getDataDictionaryList(null);
			for (DataDictionary dataDictionary : list) {
				logger.info(dataDictionary.getTypeName());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
