public class Hawk extends Bird implements CanFly {
    private static final int flyRange = 100;
    private static final int windTolerance = 40;

    public Hawk(String commonName) {
        super(commonName);
        this.setWindSpeedResistence(Hawk.windTolerance);
    }

    @Override
    public int fly(int windSpeed) throws Exception {
        if (windSpeed < this.getWindSpeedResistence()) {
            this.setTraveledDistance(Hawk.flyRange);
            return Hawk.flyRange;
        } else {
            throw new Exception(String.format("%s can't fly if windSpeed is greater than %d", this.getCommonName(), Hawk.windTolerance));
        }
    }


}
