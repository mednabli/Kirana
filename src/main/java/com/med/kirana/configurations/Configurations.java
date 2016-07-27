package com.med.kirana.configurations;


import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;




@EnableWebMvc
@EnableTransactionManagement
@ComponentScan("com.med.kirana")
@Configuration
@EnableJpaRepositories(basePackages="com.med.kirana.repositories",entityManagerFactoryRef="entityManagerFactory")
public class Configurations extends WebMvcConfigurerAdapter {

	private static final String PROPERTY_NAME_DATABASE_DRIVER = "com.mysql.jdbc.Driver";
	private static final String PROPERTY_NAME_DATABASE_PASSWORD = "";
	private static final String PROPERTY_NAME_DATABASE_URL = "jdbc:mysql://localhost:3306/kirana";
	private static final String PROPERTY_NAME_DATABASE_USERNAME = "root";
	private static final String PROPERTY_NAME_HIBERNATE_DIALECT = "org.hibernate.dialect.MySQL5InnoDBDialect";
	private static final String PROPERTY_NAME_PACKAGES_TO_SCAN = "com.med.kirana.models";
	private static final String PROPERTY_NAME_HBM2DLL_AUTO = "create";
	
	
	@Bean(name="entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(DataSource dataSource, JpaVendorAdapter jpaVendorAdapter){
        LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactory.setDataSource(dataSource);
        entityManagerFactory.setJpaVendorAdapter(jpaVendorAdapter);
        Properties properties=new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", PROPERTY_NAME_HBM2DLL_AUTO);
		entityManagerFactory.setJpaProperties(properties);
        entityManagerFactory.setPackagesToScan(PROPERTY_NAME_PACKAGES_TO_SCAN);
        return entityManagerFactory;
    }
	
	@Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(true);
        adapter.setGenerateDdl(true);
        adapter.setDatabasePlatform(PROPERTY_NAME_HIBERNATE_DIALECT);
        return adapter;
    }
	
	@Bean
    public DriverManagerDataSource dataSource(){
    	DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(PROPERTY_NAME_DATABASE_DRIVER);
        ds.setUrl(PROPERTY_NAME_DATABASE_URL);
        ds.setUsername(PROPERTY_NAME_DATABASE_USERNAME);
        ds.setPassword(PROPERTY_NAME_DATABASE_PASSWORD);
        return ds;
    }
	
	@Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
	
	@Bean
    public TilesConfigurer tilesConfigurer(){
    	TilesConfigurer tilesConfigurer=new TilesConfigurer();
    	tilesConfigurer.setDefinitions("/WEB-INF/tilesDefinitions.xml");
    	return tilesConfigurer;
    }
    
    @Bean
    public UrlBasedViewResolver urlBasedViewResolver(){
    	UrlBasedViewResolver viewResolver=new UrlBasedViewResolver();
    	viewResolver.setViewClass(TilesView.class);
    	return viewResolver;
    }
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

}
