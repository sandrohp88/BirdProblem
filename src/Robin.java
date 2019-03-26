public class Robin extends Bird implements CanFly, CanHop {
    private static final int flyRange = 20;
    private static final int hopRange = 1;
    private static final int windTolerance = 20;
    private static final int temperatureTolerance = 0;

    public Robin(String commonName) {
        super(commonName);
        setWindSpeedResistence(Robin.windTolerance);
        setTemperatureTolerance(Robin.temperatureTolerance);
    }

    @Override
    public int fly(int windSpeed) throws Exception {
        if (windSpeed <= Robin.windTolerance) {
            this.setTraveledDistance(Robin.flyRange);
            return Robin.flyRange;
        } else {
            throw new Exception(String.format("%ss can't fly if winSpeed is greater than %d", this.getCommonName(), this.getWindSpeedResistence()));
        }
    }

    @Override
    public int hope(int temperature) throws Exception {
        if (temperature <= Robin.temperatureTolerance) {
            this.setTraveledDistance(Robin.hopRange);
            return Robin.hopRange;
        } else {
            throw new Exception(String.format("%ss can't hop if temperature is less than %d", this.getCommonName(), this.getTemperatureTolerance()));
        }
    }
}
