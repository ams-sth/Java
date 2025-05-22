package inheritance.multiple.multiFunctionalDevice;

public class Main {
    public static void main (String[] args){
        MFD mfd = new MFD();
        mfd.printDocument();
        mfd.scanDocument();
        mfd.turnOn();
        mfd.turnOff();
    }
};