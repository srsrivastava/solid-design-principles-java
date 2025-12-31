package example;

public class Main {

    public static void main(String[] args) {

        Workable human = new HumanWorker();
        Workable robot = new RobotWorker();

        human.work();
        robot.work();
    }
}
