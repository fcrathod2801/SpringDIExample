package com.com.example;
// Interface
interface Keyboard{
    void type();
}

// First implementation
class WiredKeyboard implements Keyboard {
    public void type() {
        System.out.println("Typing with Wired Keyboard");
    }
}

// Second implementation
class WirelessKeyboard implements Keyboard {
    public void type() {
        System.out.println("Typing with Wireless Keyboard");
    }
}

// Computer class depends on interface
class Computer {

     Keyboard keyboard;

    // Constructor Injection
    Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    void start() {
        keyboard.type();
    }
}

// Main class
public class LooslyCouplingDemo {

    public static void main(String[] args) {


        Computer c1 = new Computer(new WiredKeyboard());
        c1.start();

        Keyboard k2 = new WirelessKeyboard();
        Computer c2 = new Computer(k2);
        c2.start();
    }
}
