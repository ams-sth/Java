package pillarsofoop.inheritance.multiple.multiFunctionalDevice;

public class MFD extends Device implements Printer, Scanner {
    
    @Override
    public void printDocument(){
        System.out.println("Documnent printed: ");
    }
    @Override
    public String scanDocument(){
        System.out.println("Scanning Document....");
        return "Scan complete";
    }
};