package com.myntra.entity;

import org.springframework.orm.jpa.persistenceunit.MutablePersistenceUnitInfo;
import org.springframework.orm.jpa.persistenceunit.PersistenceUnitPostProcessor;

/**
 * Created by neha.talesra on 15/05/18.
 */
public class HibernatePersistenceUnitPostProcessor implements PersistenceUnitPostProcessor {

    @Override
    public void postProcessPersistenceUnitInfo(MutablePersistenceUnitInfo pui) {

        pui.addProperty("hibernate.jdbc.batch_size", "10");
        pui.addProperty("hibernate.jdbc.fetch_size", "10");
        pui.addProperty("hibernate.order_inserts", Boolean.TRUE.toString());
        pui.addProperty("hibernate.order_updates", Boolean.TRUE.toString());
        pui.addProperty("hibernate.jdbc.batch_versioned_data", Boolean.TRUE.toString());
        pui.addProperty("hibernate.format_sql", Boolean.TRUE.toString());

    }
}
