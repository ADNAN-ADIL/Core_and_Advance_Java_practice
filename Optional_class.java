import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optional_class {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin","Lakshmi","John","Kishor");

//        Optional<String> name = names.stream()
//                .filter(str->str.contains("x"))
//                .findFirst();

        String name = names.stream()
                .filter(str->str.contains("x"))
                .findFirst()
                .orElse("Not found");

//        System.out.println(name.orElse("Not found"));
        System.out.println(name);
    }
}
