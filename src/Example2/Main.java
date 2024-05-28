package Example2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method start");

        SharedResource sharedResource = new SharedResource();

        //producer thread
        Thread producerThread = new Thread(new ProduceTask(sharedResource));
        Thread consumeTaskThread = new Thread(new ConsumeTask(sharedResource));

        producerThread.start();
        consumeTaskThread.start();

        System.out.println("Main method end");
    }
}
