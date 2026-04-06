class A3{
    int age;
    public void show(){
        System.out.println("in show");
    }
//    class B{
//        public void config(){
//            System.out.println("in config");
//        }
//    }
    static class B{
        public void config(){
            System.out.println("in config");
        }
    }
}
public class inner_class {
    public static void main(String[] args) {
        A3 obj = new A3();
        obj.show();

//        A3.B obj1 = obj.new B();
//        obj1.config();

        A3.B obj1 = new A3.B();
        obj1.config();
    }
}
