package com.design.pattern.creational.builder;

public class UserBuilder {
    private String name;
    private Integer age;
    private String grade;

    public UserBuilder setName(String name){
        this.name = name;
        return this;
    }
    public UserBuilder setAge(Integer age){
        this.age = age;
        return this;
    }
    public UserBuilder setGrade(String grade){
        this.grade = grade;
        return this;
    }

    public User build() {
        return new User(name,age,grade);
    }


}
