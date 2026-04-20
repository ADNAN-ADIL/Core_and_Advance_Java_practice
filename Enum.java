enum Status{
    Running, Failed, Pending, Success
}
public class Enum {
    public static void main(String[] args) {
//        Status s = Status.Success;
//        Status []ss = Status.values();
        Status []ss = Status.values();
//        System.out.println(s.ordinal());

        for(Status s : ss){
            System.out.println(s + " : " + s.ordinal());
        }
    }
}
