package patterns.creation.builder.carmanual;

public class CarBuilder implements Builder{

    private Car car;

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        this.car.setSeats(seats);
    }

    @Override
    public void setEngine(String engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean hasTripComputer) {
        this.car.setTripComputer(hasTripComputer);
    }

    @Override
    public void setGPS(boolean hasGPS) {
        this.car.setGps(hasGPS);
    }

    public Car getProduct(){
        Car product = this.car;
        this.reset();
        return product;
    }
}
