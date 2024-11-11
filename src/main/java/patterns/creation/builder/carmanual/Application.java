package patterns.creation.builder.carmanual;

public class Application {

    public static void main(String args[]){
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car sportsCar = carBuilder.getProduct();
        System.out.println(sportsCar);

        ManualBuilder manualBuilder = new ManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual sportsCarManual = manualBuilder.getProduct();
        System.out.println(sportsCarManual);



    }
}
