package codes;

import codes.tools.A;

class C extends A{
    public void abc(){
        System.out.println(marks);
    }
}
public class Demo {
    public static void main(String[] args) {
//        Calc obj = new Calc();
//        AdvCalc obj1 = new AdvCalc();
        A obj = new A();
//        System.out.println(obj.marks);
        obj.show();

        B obj1 = new B();
        System.out.println(obj1.marks);
    }
}
