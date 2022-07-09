package com.design.pattern.creational.builder;

public class User {
    private String name;
    private Integer age;
    private String grade;

    public User(String name, Integer age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    public static UserBuilder builder(){
        return new UserBuilder();
    }

    public static void main(String[] args) {
       User user = User.builder().setName("test")
                .setAge(10)
                .setGrade("One")
                .build();
        System.out.println(user.getName());
    }
}
