import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithAtomicInteger {
    private AtomicInteger i =new AtomicInteger();
    private AtomicInteger j= new AtomicInteger();

    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();

    //With AtomicInteger we are sure to be thread safe and we don't need locks and unlocks
    synchronized public void incrementI(){
        i.incrementAndGet();
    }

    synchronized public void incrementJ(){
        j.incrementAndGet();
    }

    public AtomicInteger getI() {
        return i;
    }

    public void setI(AtomicInteger i) {
        this.i = i;
    }

    public AtomicInteger getJ() {
        return j;
    }

    public void setJ(AtomicInteger j) {
        this.j = j;
    }
}
