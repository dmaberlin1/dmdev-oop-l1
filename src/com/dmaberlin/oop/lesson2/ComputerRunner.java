package com.dmaberlin.oop.lesson2;

public class ComputerRunner {
    // Ctrl+P - показать все перегрузки метода
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.printState();
        Computer computer2 = new Computer(1050);
        computer2.printState();
        Computer computer3 = new Computer(1050,16,"Asus");
        computer3.printState();
        computer3.load(true);
        computer2.load(false);
    }
}
