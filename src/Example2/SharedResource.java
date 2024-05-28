package Example2;

public class SharedResource {

    boolean itemAvailable = false;

    public synchronized void addItem(){
        itemAvailable = true;
        System.out.println("Item added by : " + Thread.currentThread().getName() + "and invoking all threads");
        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("ConsumeItem method is called by : " + Thread.currentThread().getName());

        while(!itemAvailable){
            try{
                System.out.println("Thread " + Thread.currentThread().getName() + " is waiting now");
                wait();
            }catch (Exception e){
                //handle
            }
        }
        System.out.println("Item is consumed by : " + Thread.currentThread().getName());
        itemAvailable = false;
    }
}
