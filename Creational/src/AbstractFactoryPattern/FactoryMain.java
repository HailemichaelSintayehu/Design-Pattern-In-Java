package AbstractFactoryPattern;

public class FactoryMain {
    public static void main(String[] args) {

        AbstractFactory phoneFactory = FactoryProducer.getFactory(false);
        OS os = phoneFactory.getOS("Android");
        os.Spac();

        AbstractFactory expensivePhoneFactory = FactoryProducer.getFactory(true);
        OS iphone = expensivePhoneFactory.getOS("Iphone");
        iphone.Spac();

    }

}
