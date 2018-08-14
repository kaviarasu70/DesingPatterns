package com.kavi.designpattern.creational.builder;

public class BuilderMain {

    public static void main(String arg[]) {

        Computer computer = new Computer.ComputerBuilder("200GB", "32gb")
                .isBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();
        System.out.println(computer.toString());
    }
}
