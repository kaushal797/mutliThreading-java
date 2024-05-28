package ProducerConsumerProblem;

import org.w3c.dom.UserDataHandler;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    //constructor
    public SharedResource(int bufferSize){
        sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int item) throws Exception{

        //if buffer is full wait for the customer to consume items
        while(sharedBuffer.size() == bufferSize){
            System.out.println("Buffer is full,Producer is waiting for the consumer");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("Produced : " + item);

        //notify the consumer to consume
        notify();
    }

    public synchronized int consume() throws Exception{

        while(sharedBuffer.isEmpty()){
            System.out.println("Buffer is empty,Consumer is waiitng for producer");
            wait();
        }
        int item = sharedBuffer.poll();
        System.out.println("Consumed : " + item);
        notify();
        return item;
    }
}
