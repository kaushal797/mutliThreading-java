package Example1;

public class MonitorLock {
    public synchronized void task1(){
        try{
            System.out.println("Inside task1");
            Thread.sleep(10000);

        }catch(Exception e){

        }
    }

    public void task2(){
        System.out.println("Inside task2");

        synchronized (this){
            System.out.println("task2 synchonized block");
        }
    }

    public void task3(){
        System.out.println("inside task3");
    }
}
