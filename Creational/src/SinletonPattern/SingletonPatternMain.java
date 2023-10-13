package SinletonPattern;

public class SingletonPatternMain {
    public static void main(String[] args) {
        SingleObject so = SingleObject.getInstance();
        so.showMessage();
    }
}
