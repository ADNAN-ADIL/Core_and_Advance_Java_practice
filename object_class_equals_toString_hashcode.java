import java.util.Objects;

class Laptop{
    String model;
    int price;

    public String toString() {
        return "Laptop{" + "model='" + model + '\'' + ", price=" + price + '}';
    }
    //    public String toString(){
//        return model + " : " + price;
//    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    public int hashCode() {
        return Objects.hash(model, price);
    }
//    public boolean equals(Laptop that){
////        if(this.model.equals(that.model) && this.price == that.price)
////            return true;
////        else
////            return false;
//        return this.model.equals(that.model) && this.price == that.price;
//    }
}
public class object_class_equals_toString_hashcode {
    public static void main(String[] args) {
    Laptop obj1 = new Laptop();
    obj1.model = "Lenovo Yoga";
    obj1.price = 1000;
    Laptop obj2 = new Laptop();
    obj2.model = "Lenovo Yoga";
    obj2.price = 1000;

    boolean result = obj1.equals(obj2);

        System.out.println(result);
    }
}
