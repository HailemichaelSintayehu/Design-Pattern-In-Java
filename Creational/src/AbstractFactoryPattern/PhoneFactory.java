package AbstractFactoryPattern;

import java.awt.*;

public class PhoneFactory extends AbstractFactory {

    //use getShape method to get object of type shape
    @Override
    public OS getOS(String phoneType) {
        if (phoneType == null) {
            return null;
        }
        if (phoneType.equalsIgnoreCase("Android")) {
            return new Android();

        } else if (phoneType.equalsIgnoreCase("Iphone")) {
            return new IPhone();

        } else if (phoneType.equalsIgnoreCase("Pixel")) {
            return new Pixel();
        }

        return null;
    }


}
