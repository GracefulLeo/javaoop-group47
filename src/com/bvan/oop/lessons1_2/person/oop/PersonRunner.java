package com.bvan.oop.lessons1_2.person.oop;

/**
 * @author bvanchuhov
 */
public class PersonRunner {

    public static void main(String[] args) {
        Person person = new Person("John", 25);
        System.out.println(person.sayHello());
    }
}
