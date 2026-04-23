import java.util.*;
//import java.util.List;


public class Array_List_and_Set {
    public static void main(String[] args) {
//        Collection<Integer> nums = new ArrayList<Integer>();
//        List<Integer> nums = new ArrayList<Integer>();
//        Set<Integer> nums = new HashSet<Integer>();
        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(62);
        nums.add(54);
        nums.add(82);
        nums.add(21);
//        nums.add(6);
//        nums.add("5");
        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
        System.out.println(values.next());
//        System.out.println(nums.indexOf(5));
//        System.out.println(nums.get(2));
//        for(int n: nums){
//            System.out.println(n);
//        }
    }
}
