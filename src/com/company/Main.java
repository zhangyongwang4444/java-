package com.company;

public class Main {
    public static void main(String[] args) {
        Human def = new Human();
        System.out.println(def.name);
        System.out.println(def.weight);

        System.out.println(Human.number);
        Human.number = 10;
        System.out.println(Human.getNumber());

        Human jeff = new Human("jeff", 120);
        System.out.println(jeff.name);
        System.out.println(jeff.weight);

        Human jemmy = Human.newHuman("jemmy", 100); //使用静态方法实例化一个对象

        jeff.rename("david");
        Human david = jeff; // jeff -> Human('david',120) david -> Human('david',120)
        int newWeight = david.workout(); // int newWeight = jeff.workout()
        System.out.println(david.weight);
        System.out.println(jeff.weight);

        for (int i = 0; i < 10; i++) {
            jeff.workout();
        }

        //while loop
//        int i = 1;
//        while (i < 10) {
//            jeff.workout();
//            i++;
//        }

        System.out.println(jeff.weight);
    }
}
