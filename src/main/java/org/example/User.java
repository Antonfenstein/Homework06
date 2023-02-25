package org.example;

public class User {
    String name;
    int id;
    int age;

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public User() {
    }
    public String changeName(String newName){
        newName=this.name;
        return newName;
    }


}
