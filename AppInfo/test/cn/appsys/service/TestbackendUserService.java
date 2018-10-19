package cn.appsys.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.appsys.pojo.BackendUser;
import cn.appsys.service.backend.BackendUserService;

@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations="/applicationContext-mybatis.xml")
public class TestbackendUserService {
	
	
	private Logger logger = Logger.getLogger(TestbackendUserService.class);
	
	@Resource
	private BackendUserService backendUserService;
	
	@Test
	public void testLogin() throws Exception{
		BackendUser backendUser = backendUserService.login("admin", "123456");
		logger.info(backendUser.getUserName());
	}

}
