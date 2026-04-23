import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students /*implements Comparable<Students>*/{
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

//    public int compareTo(Students that) {
//
//        if(this.age > that.age)
//            return 1;
//        else
//            return -1;
//    }
}
public class Comparator_VS_comparable {
    public static void main(String[] args) {

//        Comparator<Integer> com = new Comparator<Integer>() {
//            public int compare(Integer i, Integer j) {
//                if(i%10 > j%10)
//                return 1;
//                else
//                    return -1;
//            }
//        };
        Comparator<Students> com = ( i,  j)-> i.age > j.age?1:-1;

//                if(i.age > j.age)
//                    return 1;
//                else
//                    return -1;
//        List<Integer> studs = new ArrayList();
//        nums.add(43);
//        nums.add(31);
//        nums.add(72);
//        nums.add(29);
        List<Students> studs = new ArrayList<>();
        studs.add(new Students(21, "Navin"));
        studs.add(new Students(12, "John"));
        studs.add(new Students(18, "Parul"));
        studs.add(new Students(20, "Kiran"));

//        Collections.sort(studs);
        Collections.sort(studs, com);

        for(Students s : studs)
        System.out.println(s);
    }
}
