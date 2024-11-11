package patterns.creation.builder.carmanual;

public class Manual {

    private String seatsInfo;
    private String engineInfo;

    private String triComputerInfo;

    private String gpsInfo;

    public void setSeatsInfo(String seatsInfo) {
        this.seatsInfo = seatsInfo;
    }

    public void setEngineInfo(String engineInfo) {
        this.engineInfo = engineInfo;
    }

    public void setTriComputerInfo(String triComputerInfo) {
        this.triComputerInfo = triComputerInfo;
    }

    public void setGpsInfo(String gpsInfo) {
        this.gpsInfo = gpsInfo;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "seatsInfo='" + seatsInfo + '\'' +
                ", engineInfo='" + engineInfo + '\'' +
                ", triComputerInfo='" + triComputerInfo + '\'' +
                ", gpsInfo='" + gpsInfo + '\'' +
                '}';
    }
}
