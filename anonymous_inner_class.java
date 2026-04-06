class OuterA{
    public void show(){
        System.out.println("in A show");
    }
}
//class B3 extends OuterA{
//    public void show(){
//        System.out.println("in B show");
//    }
//}
public class anonymous_inner_class {
    public static void main(String[] args) {
//        OuterA obj = new B3();
        OuterA obj = new OuterA()
        {
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}
