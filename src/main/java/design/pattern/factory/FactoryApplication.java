package design.pattern.factory;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import design.pattern.factory.factory.MobileFactory;
import design.pattern.factory.model.Mobile;

@SpringBootApplication
public class FactoryApplication {

	public static void main(String[] args) {
		Mobile mobile;
		mobile = MobileFactory.createMobile(Mobile.SAMSUNG);

		mobile = MobileFactory.createMobile(Mobile.XIAOMI);

		mobile = MobileFactory.createMobile(Mobile.IPHONE);
	}

}
