package example;

public class Main {

    public static void makeBirdFly(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        Bird sparrow = new Bird();
        Bird ostrich = new Ostrich();

        makeBirdFly(sparrow);
        makeBirdFly(ostrich); //Runtime crash
    }
}

