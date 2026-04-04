class A2{
    public void show(){
        System.out.println("in A Show");
    }
}
class B2 extends A2{
    public void show(){
        System.out.println("in B Show");
    }
}
class C2 extends A2{
    public void show(){
        System.out.println("in C Show");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
        A2 obj = new A2();
        obj.show();

        obj = new B2();
        obj.show();

        obj = new C2();
        obj.show();
    }
}
