abstract class Car{
//    public void drive(){
//
//    }
    public abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("play music..");
    }
}
abstract class WagonR extends Car{
//    public void fly(){
//        System.out.println("Flying..");
//    }
    public void drive(){
        System.out.println("Driving..");
    }
}
class UpdatedWagonR extends WagonR{      //concrete class
    public void fly() {
        System.out.println("Flying..");
    }

}
public class Abstract_keyword {
    public static void main(String[] args) {
//        Car obj = new Car();
//        Car obj = new WagonR();
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
