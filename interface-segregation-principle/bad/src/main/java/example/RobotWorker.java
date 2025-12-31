package example;

public class RobotWorker implements Worker {

    @Override
    public void work() {
        System.out.println("Robot working");
    }

    @Override
    public void eat() {
        //Robots don't eat
        throw new UnsupportedOperationException("Robot does not eat");
    }

    @Override
    public void sleep() {
        //Robots don't sleep
        throw new UnsupportedOperationException("Robot does not sleep");
    }
}
