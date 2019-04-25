package com.arshad.spring.basics.componentscan;

import com.arshad.spring.basics.springin5steps.scope.JdbcConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {
//    @Autowired
//    ComponentJdbcConnection jdbcConnection;

    @Autowired
    ComponentJdbcConnection componentJdbcConnection;

//    public ComponentJdbcConnection getJdbcConnection() {
//        return jdbcConnection;
//    }

    public ComponentJdbcConnection getComponentJdbcConnection() {
        return componentJdbcConnection;
    }

//    public void setComponentJdbcConnection(ComponentJdbcConnection jdbcConnection) {
//        this.jdbcConnection = jdbcConnection;
//    }

    public void setComponentJdbcConnection(ComponentJdbcConnection componentJdbcConnection) {
        this.componentJdbcConnection = componentJdbcConnection;
    }
}
