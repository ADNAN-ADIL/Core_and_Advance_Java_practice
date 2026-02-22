class Mobile{
    String brand;
    int price;
//    String name;
    static String name;

    static {
        name = "Phone";
        System.out.println("in static block");
    }
    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }
    public void show(){
        System.out.println(brand + " : " + price + " : "+name);
    }
//    public static void show1(Mobile obj){
////        System.out.println("in static method");
//        System.out.println(obj.brand + " : " + obj.price + " : " + name);
//    }
}
public class static_variable_method_block {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Mobile");

//        Mobile obj1 = new Mobile();
//        obj1.brand = "Apple";
//        obj1.price = 1500;
//        obj1.name = "Smartphone";
//        Mobile.name = "SmartPhone";

//        Mobile obj2 = new Mobile();
//        obj2.brand = "Samsung";
//        obj2.price = 1700;
//        obj2.name = "Smartphone";
//        Mobile.name = "SmartPhone";

//        obj1.name = "Phone";
//        Mobile.name = "Phone";

//        obj1.show();
//        obj2.show();

//        Mobile.show1(obj1);
    }
}
