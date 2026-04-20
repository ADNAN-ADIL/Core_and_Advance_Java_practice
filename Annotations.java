@Deprecated
class A6{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in A Show");
    }
}
class B6 extends A6{
    @Override
//    public void showTheDataWhichBelongToThisClass(){
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in B Show");
    }
}
public class Annotations {
    public static void main(String[] args) {
        B6 obj = new B6();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
