package Example2;

public class ProduceTask implements Runnable{
    SharedResource sharedResource;

    //constructor
    ProduceTask(SharedResource sh){
        this.sharedResource = sh;
    }

    @Override
    public void run(){
        System.out.println("Produce Thread: " + Thread.currentThread().getName());

        try{
            Thread.sleep(5000l);
        }catch (Exception e){

        }
        sharedResource.addItem();
    }
}
