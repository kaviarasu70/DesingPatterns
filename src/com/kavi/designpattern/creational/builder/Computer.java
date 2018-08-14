package com.kavi.designpattern.creational.builder;

public class Computer {

    private String hardDisk;
    private String ram;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;
    //No Setters
    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }


    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public void setGraphicsCardEnabled(boolean graphicsCardEnabled) {
        isGraphicsCardEnabled = graphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
    }

    //private Constructor
    private Computer(ComputerBuilder computerBuilder) {
        this.hardDisk = computerBuilder.hardDisk;
        this.ram = computerBuilder.ram;
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
        this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;

    }

    public static class ComputerBuilder {

        private String hardDisk;
        private String ram;

        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hardDisk, String ram) {
            this.hardDisk = hardDisk;
            this.ram = ram;

        }

        public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
            isGraphicsCardEnabled = graphicsCardEnabled;
            return this;
        }

        public ComputerBuilder isBluetoothEnabled(boolean BluetoothEnabled) {
            isBluetoothEnabled = BluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }

    @Override
    public String toString() {
        return "Computer{" +
                "hardDisk='" + hardDisk + '\'' +
                ", ram='" + ram + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
}
