interface Computer1{
    void code();
}
class Laptop1 implements Computer1{
    public void code(){
        System.out.println("code, compile, run");
    }
}
class Desktop implements Computer1{
    public void code(){
        System.out.println("code, compile, run : Faster");
    }
}
class Developer{
    public void devApp(Computer1 lap){
        lap.code();
    }
}
public class need_of_interface {
    public static void main(String[] args) {
//        Laptop1 lap = new Laptop1();
//        Desktop desk = new Desktop();

        Computer1 lap = new Laptop1();
        Computer1 desk = new Desktop();

        Developer adil = new Developer();
//        adil.devApp(lap);
        adil.devApp(desk);
    }
}
