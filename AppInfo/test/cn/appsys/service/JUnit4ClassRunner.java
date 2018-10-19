package 
cn.appsys.service;

import java.io.FileNotFoundException;

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

public class JUnit4ClassRunner extends SpringJUnit4ClassRunner {

    static {  
        try {
        	System.out.println("log4j初始化成功！");
            Log4jConfigurer.initLogging("resources/log4j.properties");  
        } catch (FileNotFoundException ex) {
        	System.out.println("log4j初始化失败！");
            System.err.println("Cannot Initialize log4j"); 
            ex.printStackTrace();
        }  
    }
	
	public JUnit4ClassRunner(Class<?> clazz) throws InitializationError {
		super(clazz);
	}

}
