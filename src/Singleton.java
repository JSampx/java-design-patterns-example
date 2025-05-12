public class Singleton {

    private final String CONFIG_1 = "Config 1";
    private final String CONFIG_2 = "Config 2";
    private final String CONFIG_3 = "Config 3";

    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();
        }return instance;
    }



    public String getCONFIG_1() {
        return CONFIG_1;
    }

    public String getCONFIG_2() {
        return CONFIG_2;
    }

    public String getCONFIG_3() {
        return CONFIG_3;
    }
}
