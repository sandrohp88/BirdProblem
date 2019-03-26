public class Crow extends Bird implements CanHop, CanFly {
    private static final int flyRange = 30;
    private static final int hopRange = 1;
    private static final int windTolerance = 25;
    private static final int temperatureTolerance = 0;

    public Crow(String commonName) {
        super(commonName);
        setWindSpeedResistence(Crow.windTolerance);
    }

    @Override
    public int fly(int windSpeed) throws Exception {
        if (windSpeed <= Crow.windTolerance) {
            this.setTraveledDistance(Crow.flyRange);
            return Crow.flyRange;
        } else {
            throw new Exception(String.format("%ss can't fly if winSpeed is greater than %d", this.getCommonName(), this.getWindSpeedResistence()));
        }
    }

    @Override
    public int hope(int temperature) throws Exception {
        if (temperature <= Crow.temperatureTolerance) {
            this.setTraveledDistance(Crow.hopRange);
            return Crow.hopRange;
        } else {
            throw new Exception(String.format("%ss can't hop if temperature is less than %d", this.getCommonName(), this.getTemperatureTolerance()));
        }
    }
}
