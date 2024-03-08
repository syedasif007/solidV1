import runner.Runner;
import runner.bad.BadRunner;
import runner.good.GoodRunner;

public class Main {

    public static void main(String[] args) {
        Runner runner = new BadRunner();
        runner.run();

        runner = new GoodRunner();
        runner.run();
    }
}
