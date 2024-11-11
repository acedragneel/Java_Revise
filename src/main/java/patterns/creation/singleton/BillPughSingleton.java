package patterns.creation.singleton;

public class BillPughSingleton {

    private BillPughSingleton(){}

    //class Helper
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
