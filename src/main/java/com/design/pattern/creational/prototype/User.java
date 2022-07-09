package com.design.pattern.creational.prototype;

public class User implements Cloneable {
    private String name;
    private String grade;
    private Integer age;

    public User(String name, String grade, Integer age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public User clone() {
        User user = null;
//        user = new User(name, grade, age);
        try {
            user = (User) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return user;
    }

    public static void main(String[] args) {
        User user = new User("test", "one", 4);

        User user1 = (User) user.clone();
        User user2 = new User("test", "one", 230);
        System.out.println(user1.getName());
        user1.setName("newTest");
        System.out.println("user name is "+ user.getName());
        System.out.println("user1 name is "+ user1.getName());
    }
}
