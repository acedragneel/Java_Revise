package patterns.creation.builder.carmanual;

public class ManualBuilder implements Builder{
    private Manual manual;

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int seats) {
        this.manual.setSeatsInfo("This car has " + seats + " seats.");
    }

    @Override
    public void setEngine(String engine) {
        this.manual.setEngineInfo("Engine: " + engine);
    }

    @Override
    public void setTripComputer(boolean hasTripComputer) {
        this.manual.setTriComputerInfo("Trip Computer: " + (hasTripComputer ? "Included" : "Not Included"));
    }

    @Override
    public void setGPS(boolean hasGPS) {
        this.manual.setGpsInfo("GPS: " + (hasGPS ? "Included" : "Not Included"));
    }

    public Manual getProduct(){
        Manual product = this.manual;
        this.reset();
        return product;
    }
}
