package org.factorypattern.simplefactory.uml;

/**
 * Description:
 * Author:Axel
 * Date: 2020-12-13 14:30
 * Version: 1.0.0
 * Update:
 */

public class PersonServiceBean {
    private PersonDao personDao;
    private void save(Person person){}
    public IDCard getIdCard(Integer personId){
        return null;
    }
    public void modify(){
        Department department = new Department();
    }
}

class Person{}
class PersonDao{}
class IDCard{}
class Department{}
