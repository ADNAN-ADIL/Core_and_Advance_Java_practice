// class -> class --> extends
// class -> interface --> implements
// interface -> interface --> extends

interface A4{
    int age = 44;       //final and static
    String area = "Mumbai";
    void show();
    void config();
}
interface X{
    void run();
}
interface Y extends X{

}
class B4 implements A4,Y{
    public void show() {
        System.out.println("in show");
    }
    public void config() {
        System.out.println("in config");
    }
    public void run(){
        System.out.println("running...");
    }
}
public class Interface {
    public static void main(String[] args) {
        A4 obj = new B4();
        obj.show();
        obj.config();

        X obj1 = new B4();
        obj1.run();

        //  A.area="Hyderabad";

        System.out.println(A4.area);
    }
}
