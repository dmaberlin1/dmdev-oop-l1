package com.dmaberlin.oop.lesson2;
//модификаторы доступа
//public - доступен во всём приложении, к нему имеют доступ все классы
// package private - по дефолту , доступен в пределах нашего пакета
//
public class Computer {
    //Two main vaules of Class  -  fields/methods
//    field of class
    int ssd=500;
    int ram=1024;
    String motherBoard;
    //суть перегрузки это методи с однаковым названием, но с разным кол-вом параметров
    // в перегрузку не входит возвращаемый тип, потому что он не входит в сигнатуру метода
    // Ctrl+P - показать все перегрузки метода

    public Computer(){
        System.out.println("I am created");
        System.out.println();
    }

    Computer(int newSsd){
//        this used in conflict situation
        this.ssd=newSsd;
        ram=0;
        motherBoard="default";
    }
    Computer(int newSsd,int newRam,String newMotherBoard){
        ssd=newSsd;
        ram=newRam;
        motherBoard=newMotherBoard;
    }

    //func or method of class
    // возвращаемый тип не входит в сигнатуру метода
    void load(){
        System.out.println("I am loading");
    }
    void load(boolean linux){
        System.out.print("I am loading");
//        System.out.println();

        if(linux){
            System.out.print(" on system- gnu/linux");
        }else{
            System.out.print(" on system- win");

        }
        System.out.println();
    }
    void printState(){
        System.out.println("ssd: "+ssd);
        System.out.println("ram: "+ram);
        System.out.println("motherBoard: "+motherBoard);
        System.out.println();
    }
}
