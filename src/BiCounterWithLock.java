import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
    private int i=0;
    private int j=0;

    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();

    //We use lock,unlock in case of memory leaks because of multiple threads
    synchronized public void incrementI(){
        lockForI.lock(); //Get Lock
        i++;
        lockForI.unlock(); //Release Lock

    }

    synchronized public void incrementJ(){
        lockForJ.lock(); //Get Lock
        j++;
        lockForJ.unlock(); //Release Lock

    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}
