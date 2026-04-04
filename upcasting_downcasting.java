class A
{
    public void show1()
    {
        System.out.println("in A show");
    }
}
class B extends A
{
    public void show2()
    {
        System.out.println("in B show");
    }
}
public class upcasting_downcasting {
    public static void main(String[] args) {
//        double d = 4.5;
//        int i = (int)d;
//        System.out.println(i);
        A obj = new B();  //upcasting -object is of B but refer to A
        obj.show1();

        B obj1 = (B)obj; //downcasting -(obj os of type A)refernce of A is typecasted into object of type B
        obj1.show2();  //obj is parent reference is downcasted in to child refernce as obj1
    }
}
