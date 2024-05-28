package Example1;

public class MonitorThread implements Runnable{

    //object refernce
    MonitorLock ob = new MonitorLock();

    //constructor
    MonitorThread(MonitorLock obj){
        this.ob = obj;
    }
    @Override
    public void run(){
        ob.task1();
    }
}
