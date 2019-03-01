package com.company;

public class ObjectPractice05 {
    public static void main(String[] args){
        Person person = new Person();

        Person[] persons = {new Person("森田", "奈良"), new Person("木村","埼玉"),
                new Person("高山","東京"),new Person("茂木","沖縄")
        };

        for(int i = 0; i < persons.length ;i++){
            persons[i].getSelfIntroduction();
        }  //前の授業でやった配列
    }
}
