class Hi_A extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Hi");
            try {  Thread.sleep(10); }
            catch (InterruptedException e) {   throw new RuntimeException(e); }
        }
    }
}
class Hi_B extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Hello");
            try {  Thread.sleep(10); }
            catch (InterruptedException e) {   throw new RuntimeException(e); }
        }
    }
}

public class Multiple_threads {
    public static void main(String[] args) {
        Hi_A obj1 = new Hi_A();
        Hi_B obj2 = new Hi_B();

//        System.out.println(obj1.getPriority());

        obj2.setPriority(Thread.MAX_PRIORITY);
//        obj2.setPriority(Thread.MIN_PRIORITY);
//        obj2.setPriority(Thread.NORM_PRIORITY);

        obj1.start();
        try {  Thread.sleep(2); }
        catch (InterruptedException e) {   throw new RuntimeException(e); }
        obj2.start();
    }
}
