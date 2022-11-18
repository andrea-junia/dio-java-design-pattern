package design.pattern.factory.model;

public class IPhone implements Mobile {
    private int ramSize;
    private String processor;
    private String GPU;
    public IPhone(int ramSize, String processor, String gPU) {
        this.ramSize = ramSize;
        this.processor = processor;
        this.GPU = gPU;
    }
    
}
