package com.sunil.spring.basics.springbasics.cdi;

import javax.inject.Inject;
import javax.inject.Named;

//Instead of @Component we can use @Named according to CDI means java.inject dependency
@Named 
public class SomeCDIBusiness {

	@Inject //Instead of @Autowired we can use @Inject 
	SomeCDIDAO someCdiDao;

	public SomeCDIDAO getSomeCdiDao() {
		return someCdiDao;
	}

	public void setSomeCdiDao(SomeCDIDAO someCdiDao) {
		this.someCdiDao = someCdiDao;
	}
	
}
