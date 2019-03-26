public class Penguin extends Bird implements CanHop {
    private static final int hopRange = 2;
    public Penguin(String commonName) {
        super(commonName);
    }

    @Override
    public int hope(int temperature) {
        setTraveledDistance(Penguin.hopRange);
        return Penguin.hopRange;
    }


}
