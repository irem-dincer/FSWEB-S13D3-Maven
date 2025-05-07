package org.example;

//blueprint
public class Person {
    //instance variable

    String firstName;
    String lastName;
    int age;

    String job;
    String location;
    String nationality;

    //Constructors;
    public Person(String firstName, String lastName , int age) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;

    }

    public Person(String firstName, String lastName , int age, String job, String location , String nationality) {
        this(firstName,lastName,age);
        this.job=job;
        this.location=location;
        this.nationality=nationality;

    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public boolean isTeen(){

        if(age>= 13 && age<=19){
            return  true;
        }
        return  false;
    }

}
