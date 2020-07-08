package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFullName("Ivan Ivanov");
        student1.setGroup("U-315");
        student1.setEntryDate(new Date());

        System.out.println(student1.getFullName() + " is studying in group " + student1.getGroup() + " since " + student1.getEntryDate());

    }
}
