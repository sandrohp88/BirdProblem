import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        World.temperature = 20;
        World.windSpeed = 12;

        Bird penguin = new Penguin("penguin");
        Bird hawk = new Hawk("hawk");
        Bird robin = new Robin("robin");
        Bird crow = new Crow("crow");
        Vector<Bird> birds = new Vector<>();
        birds.add(penguin);
        birds.add(hawk);
        birds.add(robin);
        birds.add(crow);



        // TODO: have each bird fly & hop
        flyAndHop(birds, World.temperature, World.windSpeed);

        // a storm arrives!

        World.temperature = -10;
        World.windSpeed = 30;

        // TODO: have each bird fly & hop
        flyAndHop(birds, World.temperature, World.windSpeed);
        // TODO: print total distances
        for(Bird bird: birds){
            bird.toString();
            System.out.println(bird.getTraveledDistance());
        }

    }

    public static void flyAndHop(Vector<Bird> birds ,int  temperature, int windSpeed){
        for(Bird bird: birds){
            if(bird instanceof CanFly){
                try {
                    ((CanFly) bird).fly(windSpeed);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
            if(bird instanceof CanHop){
                try {
                    ((CanHop) bird).hope(temperature);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }

    }
}

class World {
    static int temperature = 0; // celcius
    static int windSpeed = 0; // miles per hour
}
