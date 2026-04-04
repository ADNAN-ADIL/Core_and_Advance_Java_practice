public class wrapper_class {
    public static void main(String[] args) {
        int num = 7;
//        Integer num1 = new Integer(num); //storing a primitive value in object --Boxing
        Integer num1 = num;  // auto-boxing

//        int num2 = num1.intValue(); //getting a value from the object tyoe to primitive type --Unboxing
        int num2 = num1;  //Auto-unboxing
//        System.out.println(num1);
        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3*2);
    }
}
