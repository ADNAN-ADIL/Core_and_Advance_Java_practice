enum Laptop2{
//    Macbook(2000), XPS(2200), Surface(1500), Thinkpad(1800);
    Macbook(2000), XPS(2200), Surface, Thinkpad(1800);
    private int price;

    private Laptop2() {
        price = 500;
    }

    private Laptop2(int price) {
        this.price = price;
        System.out.println("in Laptop " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class Enum_Class {
    public static void main(String[] args) {
//        Laptop2 lap = Laptop2.Macbook;
//        System.out.println(lap + " : " + lap.getPrice());

        for(Laptop2 lap : Laptop2.values()){
            System.out.println(lap + " : " + lap.getPrice());
//            lap.setPrice(2000);
        }

    }
}
