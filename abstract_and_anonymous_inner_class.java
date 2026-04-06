abstract class A5{
    public abstract void show();
    public abstract void config();
}
//class B3 extends A5{
//    public void show() {
//        System.out.println("in B show");
//    }
//}
public class abstract_and_anonymous_inner_class {
    public static void main(String[] args) {
        A5 obj = new A5(){
            public void show(){
                System.out.println("in new show");
            }
            public void config() {
                System.out.println("in config");
            }
        };
        obj.show();
        obj.config();
    }
}
