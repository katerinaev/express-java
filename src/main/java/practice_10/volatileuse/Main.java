package practice_10.volatileuse;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        StopChecker stopChecker = new StopChecker();
        Thread thread = new Thread(stopChecker);
        thread.start();
        Thread.sleep(2000);
        stopChecker.stop();

        System.out.println("Counter is: " + stopChecker.getCount());
    }
}
