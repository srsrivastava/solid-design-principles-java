package example;

public class Main {

    public static void main(String[] args) {
        Worker robot = new RobotWorker();
        robot.work();
        robot.eat();   // Runtime crash
    }
}