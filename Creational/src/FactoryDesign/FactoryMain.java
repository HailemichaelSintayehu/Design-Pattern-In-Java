package FactoryDesign;

public class FactoryMain {
    public static void main(String[] args) {
            //OS os = new Android();
            //os.Spac();

        PhoneFactory pf = new PhoneFactory();
        OS iphone = pf.getOS("Iphone");
        iphone.Spac();

    }

}
