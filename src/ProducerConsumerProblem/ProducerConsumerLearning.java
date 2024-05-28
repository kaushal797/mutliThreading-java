package ProducerConsumerProblem;

public class ProducerConsumerLearning {

    public static void main(String[] args) {

        SharedResource sharedBuffer = new SharedResource(3);

            //lambda expression
            Thread producerThread = new Thread(() -> {
                try {
                    for (int i = 1; i <= 6; i++) {
                        sharedBuffer.produce(i);
                    }
                } catch (Exception e) {

                }
            });

            Thread consumerThread = new Thread(() -> {
                try {
                    for (int i = 1; i <= 6; i++) {
                        sharedBuffer.consume();
                    }
                } catch (Exception e) {
                    //nbhjdbc
                }
            });

            producerThread.start();
            consumerThread.start();
        }
    }
