package com.kenw.sshmv.test;

import com.kenw.sshmv.service.*;
import com.kenw.sshmv.service.impl.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class TestTestService extends TestCase{
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestTestService( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestTestService.class );
    }

    /**
     * Rigourous Test :-)
     */	
	public void testTestService(){
		//通过spring.xml配置文件创建Spring的应用程序上下文环境
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		//从Spring的IOC容器中获取bean对象
		ITestService testService = (TestService) ac.getBean("myTestService");
		//执行测试方法
						
		testService.sayHello();
	}

}
