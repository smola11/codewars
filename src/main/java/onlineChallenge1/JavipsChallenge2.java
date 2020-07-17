package onlineChallenge1;

public class JavipsChallenge2 {

    // Explained: https://www.youtube.com/watch?v=WH5UvQJizH0
    // CPU Caches: https://www.youtube.com/watch?v=Zr8WKIOIKsk

    static class CountingThread extends Thread {

        private volatile boolean justStopIt = false; // volatile keyword fixes this code
        private long counter = 0;

        public void run() {
            while (!justStopIt) {
                ++counter;
            }
            System.out.println("Counted to: " + counter);
        }

        public void stopIt() {
            this.justStopIt = true;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CountingThread t = new CountingThread();
        t.start();
        Thread.sleep(1000);
        t.stopIt();
        System.out.println("Asked to stop.");
        Thread.sleep(2000);

        if (t.isAlive()) {
            System.out.println("But it didn't work...");
        } else {
            System.out.println("and it worked!");
        }
    }
}




