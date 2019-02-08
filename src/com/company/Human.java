package com.company;

public class Human {
    //静态成员变量
    public static int number = 0;
    //成员变量
    public String name;
    public int weight;

    //构造方法的目的是：初始化对象
    //构造方法1
    public Human() {
        //当前对象
        this.name = "default";
        this.weight = 180;
        Human.number += 1;
    }

    //构造方法2
    public Human(String name, int weight) {
        this.name = name;
        this.weight = weight;
        Human.number += 1;
    }

    //静态方法里构造对象
    public static Human newHuman(String name, int weight) {
        return new Human(name, weight);
    }

    //改名字
    public void rename(String newName) {
        this.name = newName;
    }

    //减肥
    public int workout() {
        this.weight = weight - 5;
        return weight;
    }

    public static int getNumber() {
        return number;
    }

}
