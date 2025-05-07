package org.example;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John","Doe",20,"Engineer","Ankara", "Turkey" );
        System.out.println("Firstname: " + person.firstName +"," +" "+  "LastName: " + person.lastName);
        System.out.println("Age: " + person.age +"," +" "+ "Job: " + person.job);
        System.out.println("Location: " + person.location +"," + " "+ "Nationality: " + person.nationality);
    }
}
