package com.adarsh.spring.repository;

import com.adarsh.spring.bean.Person;
import org.apache.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 7/4/12
 * Time: 6:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class PersonRepository {

    private static final Logger logger = Logger.getLogger(PersonRepository.class);

    static{
        logger.info("PersonRepository static block");
    }

    private Person person;

    {
        logger.info("PersonRepository instance block");
    }

    public PersonRepository() {
        logger.info("PersonRepository constructor");
    }

    public Person getPerson() {
        logger.info("PersonRepository getPerson()");
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
        logger.info("PersonRepository setPerson()");
    }
}
