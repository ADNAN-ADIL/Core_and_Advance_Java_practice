class An{
    public An() {
        System.out.println("object created");
    }
        public void show(){
        System.out.println("in An show");
    }
}
public class anonymous_object {
    public static void main(String[] args) {
//        int marks;
//        marks = 99;

//        A obj = new A();
//        A obj;
//        obj = new A();
//        obj.show();

        new An().show(); //Anonymous object
        new An().show(); //Anonymous object
    }
}
