@FunctionalInterface
interface A8{
    int add(int i, int j);
}
public class Functional_interface_with_return {
    public static void main(String[] args) {
//        A8 obj = new A8(){
//            public int add(int i,int j){
//                return i+j;
//            }
//        };
        A8 obj = (i,j) -> i+j;
        int result = obj.add(5,4);
        System.out.println(result);
    }
}
