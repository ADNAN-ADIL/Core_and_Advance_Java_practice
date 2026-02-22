class Human2
{
    private int age;
    private String name;
// Constructor is same as method but without return type or no return type is needed
    public Human2() {     //Default Constructor
        age=12;
        name="John";
        System.out.println("in constructor");
    }
//    public Human2(int a,String n){   //Parameterized Constructor
//        age = a;
//        name = n;
//    }

    public Human2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void SetAge(int age) {
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
}
public class constructors {
    public static void main(String[] args) {
        Human2 obj=new Human2();
        Human2 obj1=new Human2(18,"Adil");
        System.out.println(obj.getName()+" : "+obj.getAge());
        System.out.println(obj1.getName()+" : "+obj1.getAge());

//        obj.SetAge(30);
//        obj.setName("Reddy");
        //System.out.println(obj.getName()+" : "+obj.getAge());
    }
}
