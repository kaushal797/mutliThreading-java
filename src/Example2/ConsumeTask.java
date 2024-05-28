package Example2;

import com.sun.tools.jconsole.JConsoleContext;

public class  ConsumeTask implements Runnable{
    SharedResource sharedResource;

    //constructor
    ConsumeTask(SharedResource sh){
        this.sharedResource = sh;
    }
    @Override
    public void run(){
        System.out.println("Consumer Task : " + Thread.currentThread().getName());
        sharedResource.consumeItem();
    }
}
