package com.sunil.spring.basics.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sunil.spring.basics.springbasics.xml.XmlPersonDAO;

@SpringBootApplication
public class SpringXmlApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringXmlApplication.class);
			
	/**
	 * Here run() method returns the applicationContext object which is managing all the BEAN's in the application.
	 * Here we are only consuming a BubbleSortAlgorithm beans in BinarySearhImpl bean
	 * and dependencies are identified using @Autowired annotation in SortAlgorithm
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Application Context
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//This line will print this
		//15:31:30.956 [main] INFO com.sunil.spring.basics.springbasics.SpringXmlApplication -
		//Beans : [xmlJdbcConnection, xmlPersonDAO] 
		
		//With @Component Scan this line will print this 
		//15:39:01.498 [main] INFO com.sunil.spring.basics.springbasics.SpringXmlApplication - 
		//Beans : [springCDIApplication, springComponentScanApplication, springScopeApplication, springXmlApplication, springbasicsApplication, binarySearchImpl, bubbleSortAlgorithm, quickSortAlgorithm, someCDIBusiness, someCDIDAO, scopedTarget.jdbcConnection, jdbcConnection, personDAO, org.springframework.context.annotation.internalConfigurationAnnotationProcessor, org.springframework.context.annotation.internalAutowiredAnnotationProcessor, org.springframework.context.annotation.internalCommonAnnotationProcessor, org.springframework.context.event.internalEventListenerProcessor, org.springframework.context.event.internalEventListenerFactory, 
		//xmlJdbcConnection, xmlPersonDAO, componentDAO, scopedTarget.componentJdbcConnection, componentJdbcConnection, org.springframework.boot.autoconfigure.AutoConfigurationPackages, org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration, propertySourcesPlaceholderConfigurer, org.springframework.boot.autoconfigure.aop.AopAutoConfiguration$ClassProxyingConfiguration, forceAutoProxyCreatorToUseClassProxying, org.springframework.boot.autoconfigure.aop.AopAutoConfiguration, org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration, applicationAvailability, org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration, org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor, org.springframework.boot.context.internalConfigurationPropertiesBinderFactory, org.springframework.boot.context.internalConfigurationPropertiesBinder, org.springframework.boot.context.properties.BoundConfigurationProperties, org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter, org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration, lifecycleProcessor, spring.lifecycle-org.springframework.boot.autoconfigure.context.LifecycleProperties, org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration, spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties, org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration, spring.sql.init-org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties, org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer$DependsOnDatabaseInitializationPostProcessor, org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration, taskExecutorBuilder, applicationTaskExecutor, spring.task.execution-org.springframework.boot.autoconfigure.task.TaskExecutionProperties, org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration, scheduledBeanLazyInitializationExcludeFilter, taskSchedulerBuilder, spring.task.scheduling-org.springframework.boot.autoconfigure.task.TaskSchedulingProperties, org.springframework.aop.config.internalAutoProxyCreator] 
		//Please refer the applicationContext.xml
		LOGGER.info("Beans : {} " , (Object)applicationContext.getBeanDefinitionNames());
		
		//Here we wanted the bean of XmlPersonDAO
		XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);
		
		System.out.println(personDAO);
		System.out.println(personDAO.getXmlJdbcConnection());
			
		applicationContext.close();
	}

}
