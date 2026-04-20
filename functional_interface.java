@FunctionalInterface
//also Lambda expression(Arrow functions in JS)
interface A7{
//    void show();
    void show(int i);
//    void show(int i,int j);
//    void run();
}
//class B7 implements A7{
//    public void show(){
//        System.out.println("in Show");
//    }
//}
public class functional_interface {
    public static void main(String[] args) {
//        A7 obj = new A7(){
//            public void show(){
//                System.out.println("in show");
//            }
//        };  //functional interface using anonymous inner class
        //   	A obj=() -> System.out.println("in Show");
        //   	obj.show(); //Using Lambda expression.

//        A7 obj = new A7(){
//            public void show(int i){
//                System.out.println("in show" + i);
//            }
//        };
//        obj.show(5); simplying this using Lambda expression below
//        A7 obj =(int i) -> System.out.println("in show " + i);
//        obj.show(5);
        //For multiple variables :
//        A7 obj = (int i, int j) -> System.out.println(i + " in show " +j);
//        obj.show(5,7);
        A7 obj = i -> System.out.println("in show" +i);
        obj.show(5); //no need to declare int type while instantiating the object in lambda expression
    }
}
