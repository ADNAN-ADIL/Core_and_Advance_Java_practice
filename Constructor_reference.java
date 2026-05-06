import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Stu_dent{
    private String name;
    private int age;

    public Stu_dent() {
    }

    public Stu_dent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Stu_dent{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
public class Constructor_reference {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Navin","Harsh","John");

        List<Stu_dent> students = new ArrayList<>();

//        for(String name : names){
//            students.add(new Stu_dent(name));
//        }

//        students = names.stream()
//                        .map(name->new Stu_dent(name))
//                        .toList();
        students = names.stream()
                        .map(Stu_dent::new)
                        .toList();
        System.out.println(students);
    }
}
