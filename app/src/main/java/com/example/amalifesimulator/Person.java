package com.example.amalifesimulator;

public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private Integer health;
    private Integer money;
    private Integer sex; // 0 for male, 1 for female

    public Person(String firstName, String lastName, Integer age, Integer health, Integer money, Integer sex) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setHealth(health);
        setMoney(money);
        setSex(sex);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public void incrementAge() {
        age++;
    }
}
