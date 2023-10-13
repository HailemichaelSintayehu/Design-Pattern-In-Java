package AbstractFactoryPattern;

public class ExpensivePhoneFactory extends AbstractFactory{
    @Override
    public OS getOS(String phoneType) {
            return new IPhone();
  }
}
