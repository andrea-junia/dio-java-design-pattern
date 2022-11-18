package design.pattern.factory.model;

public class SamSung implements Mobile {
    private int ramSize;
    private String processor;

    public SamSung(int ramSize) {
        this.ramSize = ramSize;
    }
    
    public SamSung(String processor) {
        this.processor = processor;
        this.ramSize = 8;
    }    
    
}