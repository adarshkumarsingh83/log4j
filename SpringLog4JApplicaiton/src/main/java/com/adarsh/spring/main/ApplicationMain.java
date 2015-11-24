package com.adarsh.spring.main;

import com.adarsh.spring.bean.Person;
import com.adarsh.spring.repository.PersonRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 7/4/12
 * Time: 6:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationMain {

    private static final Logger logger = Logger.getLogger(ApplicationMain.class);

    static {
        logger.info("ApplicationMain static block");
    }

    private PersonRepository personRepository;

    {
        logger.info("ApplicationMain instance block");
    }

    public ApplicationMain() {
        logger.info("ApplicationMain constructors");
    }

    public static void main(String[] args) {
        logger.info("ApplicationMain main() started ");
        BeanFactory xmlBeanFactory=new XmlBeanFactory(new FileSystemResource("src\\main\\resources\\Spring-cfg.xml"));
        ApplicationMain applicationMain=(ApplicationMain)xmlBeanFactory.getBean("applicationMain");
        PersonRepository personRepository1=applicationMain.getPersonRepository();
        Person person=personRepository1.getPerson();
        applicationMain.displayPerson(person);
        logger.info("ApplicationMain main() ended ");
    }


    public PersonRepository getPersonRepository() {
        logger.info("ApplicationMain getPersonRepository() ");
        return personRepository;
    }

    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
        logger.info("ApplicationMain setPersonRepository() ");
    }

    public void displayPerson(Person person) {
        logger.info("ApplicationMain displayPerson() started ");
        person.displayPerson(person);
        logger.info("ApplicationMain displayPerson() ended ");
    }
}
