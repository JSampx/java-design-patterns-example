//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Singleton config = Singleton.getInstance();

        System.out.println(config);
        Singleton config2 = Singleton.getInstance();
        System.out.println(config2);
    }
}