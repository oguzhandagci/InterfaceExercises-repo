package listasaparameter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // test your method here
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnSize(names));
    }
    public static int returnSize(List names) {
        return names.size();
    }

}
