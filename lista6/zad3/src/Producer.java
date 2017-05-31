/**
 * Created by kacper on 05.04.17.
 */
package java.lang.Object;

public class Producer extends Buffor {
    private int counter;
    Producer(int counter){
        this.counter = counter;
    }
    while(true){
        if(this.counter == Integer.MAX_VALUE) this.counter = Integer.MIN_VALUE;
        if(buffer.NotFull()) {
            buffer.add(counter++);
        }
        else while(buffer.Full()){wait();}

    }
}
