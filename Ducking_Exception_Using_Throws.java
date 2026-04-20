class Ah{
    public void show() throws ClassNotFoundException{
//        try {
            Class.forName("Cad");
//        }
//        catch(ClassNotFoundException e){
//            System.out.println("Not able to find the class" + e);
//        }
    }
}
public class Ducking_Exception_Using_Throws {
    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args){
        Ah obj = new Ah();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
