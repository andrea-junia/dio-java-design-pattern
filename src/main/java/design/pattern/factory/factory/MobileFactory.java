package design.pattern.factory.factory;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.springframework.util.SocketUtils;
import org.yaml.snakeyaml.constructor.SafeConstructor;

import design.pattern.factory.model.IPhone;
import design.pattern.factory.model.Mobile;
import design.pattern.factory.model.SamSung;
import design.pattern.factory.model.Xiaomi;

public class MobileFactory {
    public static Mobile createMobile(String type){
        if(type.equals(Mobile.IPHONE)){
            System.out.println("Manufacturing IPhone");
            return new IPhone(2, "A9", "A9 GPu");
        }
        
        if(type.equals(Mobile.SAMSUNG)){
            System.out.println("Manufacturing SamgSung");
            return new SamSung("Intel");
        }
        
        if(type.equals(Mobile.XIAOMI)){
            System.out.println("Manufacturing Xiaomi");
            return new Xiaomi(2, "ARM");
        }
        return null;
    }
    
}
