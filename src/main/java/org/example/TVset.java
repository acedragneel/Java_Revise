package org.example;

//Singleton Pattern
public class TVset {
    private static volatile TVset tvSetInstance = null;

    private TVset(){
        System.out.println("TV set instantiated");
    }

    public static TVset getTvSetInstance(){
        if(tvSetInstance == null) {
            synchronized (TVset.class) {
                if (tvSetInstance == null)
                    tvSetInstance = new TVset();
            }
        }
        return tvSetInstance;
    }
}
