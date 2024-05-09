package Resources;


public class Threads implements Runnable {
    private int n;
    public int getCount() {
        return n;
    }
    public synchronized void increase() {//synchronise the increaser method to get to 100,000
        //this means that THIS method must not be run by more than 1 thread at a time; bottleneck.
        //Add synchronize to make sure stale data isn't operated on
        n++;
    }

    @Override
    public void run() {

    }

    //to allocate a new thread object:    new Thread(PHILOSOPHERS[i]);
}
