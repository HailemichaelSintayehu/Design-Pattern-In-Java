package AbstractFactoryPattern;

import java.awt.*;

public abstract class AbstractFactory {
    abstract OS getOS(String phoneType);
}
