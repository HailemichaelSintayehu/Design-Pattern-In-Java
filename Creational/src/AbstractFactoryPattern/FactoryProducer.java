package AbstractFactoryPattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean expensive) {
        if (expensive) {
            return new ExpensivePhoneFactory();
        } else {
            return new PhoneFactory();
        }
    }
}
