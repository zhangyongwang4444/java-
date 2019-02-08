package com.company;

public class Main {
    public static void main(String[] args) {
        Human def = new Human();
        System.out.println(def.getName());
        System.out.println(def.getWeight());

        System.out.println(Human.getNumber());
        
        Human jeff = new Human("jeff", 120);
        System.out.println(jeff.getName());
        System.out.println(jeff.getWeight());

        Human jemmy = Human.newHuman("jemmy", 100); //使用静态方法实例化一个对象

        jeff.setName("david");
        Human david = jeff; // jeff -> Human('david',120) david -> Human('david',120)
        int newWeight = david.workout(); // int newWeight = jeff.workout()
        System.out.println(david.getWeight());
        System.out.println(jeff.getWeight());

        for (int i = 0; i < 10; i++) {
            jeff.workout();
        }

        //while loop
//        int i = 1;
//        while (i < 10) {
//            jeff.workout();
//            i++;
//        }

        System.out.println(jeff.getWeight());
    }
}
