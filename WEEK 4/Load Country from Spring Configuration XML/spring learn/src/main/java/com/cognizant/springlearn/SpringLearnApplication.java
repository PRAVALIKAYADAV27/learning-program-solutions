package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void displayCountry() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);

        System.out.println("Country Code: " + country.getCode());
        System.out.println("Country Name: " + country.getName());
    }


    public static void main(String[] args) {
        LOGGER.debug("START of Main Method");
        displayCountry();
        LOGGER.debug("END of Main Method");
    }
}
