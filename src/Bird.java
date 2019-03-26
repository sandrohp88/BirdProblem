public class Bird {
    protected String scientificName;
    protected String commonName;
    protected int windSpeedResistence;
    protected int temperatureTolerance;



    protected int traveledDistance; // In ft

    // Constructor
    public Bird(String commonName) {
        this.commonName = commonName;
    }



    public void setTraveledDistance(double distance) {
        this.traveledDistance += distance;
    }

    public int  getTraveledDistance() {
        return traveledDistance;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getCommonName() {
        return this.commonName;
    }

    @Override
    public String toString() {
        String moved = String.format("The %s moved %d ft", this.getCommonName(), this.getTraveledDistance());
        return moved;
    }

    public void setWindSpeedResistence(int windSpeedResistence) {
        this.windSpeedResistence = windSpeedResistence;
    }

    public int getWindSpeedResistence() {
        return this.windSpeedResistence;
    }

    public void setTemperatureTolerance(int temperatureTolerance) {
        this.temperatureTolerance = temperatureTolerance;
    }

    public int getTemperatureTolerance() {
        return this.temperatureTolerance;
    }
}
