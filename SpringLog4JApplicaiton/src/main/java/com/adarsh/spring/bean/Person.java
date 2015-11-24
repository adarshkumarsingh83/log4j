package com.adarsh.spring.bean;

import org.apache.log4j.Logger;

import java.io.Serializable;


/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 7/4/12
 * Time: 6:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person implements Serializable {

    private static final Logger logger = Logger.getLogger(Person.class);

    static{
        logger.info("Person static block ");
    }

    private Integer personId;
    private String personName;
    private String personEmail;

    {
        logger.info("Person instance block ");
    }

    public Person(){
        logger.info("Person constructor ");
    }

    public Person(Integer personId, String personName, String personEmail) {
        this.personId = personId;
        this.personName = personName;
        this.personEmail = personEmail;
        logger.info("Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", personEmail='" + personEmail + '\'' +
                '}');
    }


    public Integer getPersonId() {
        logger.info("Person getPersonId()" + personId);
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
        logger.info("Person setPersonId()" + personId);
    }

    public String getPersonName() {
        logger.info("Person getPersonName()" + personName);
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
        logger.info("Person setPersonName()" + personName);
    }

    public String getPersonEmail() {
        logger.info("Person getPersonEmail()" + personEmail);
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
        logger.info("Person setPersonEmail()" + personEmail);
    }

    public void displayPerson(Person person){
        logger.info(person.toString());
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", personEmail='" + personEmail + '\'' +
                '}';
    }
}
