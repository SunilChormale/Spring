package com.sunil.spring.basics.springbasics.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

/*
 * @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
 * First Case:
 * We have Bean as SCOPE_SINGLETON and Dependency i.e jdbcConnection as SCOPE_PROTOTYPE
 * 
 * Output:
 * Same Beans with Same Dependencies
 */

/*
 * @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
 * First Case:
 * We have Bean as SCOPE_PROTOTYPE and Dependency i.e jdbcConnection as SCOPE_PROTOTYPE
 * 
 * Output:
 * Different Beans with Same Dependencies (There is no effect of SCOPE_PROTOTYPE on dependencies)
 */

public class PersonDAO {
	
	@Autowired
	JdbcConnection jdbcConnection;

	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

	
}
