package hashcode;

import java.util.Arrays;
import java.util.List;

public class ExemploHashCode {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Welcome", "to", "Baeldung");

        if (words.contains("Baeldung")) {
            System.out.println("Baeldung is in the list");
        }
    }
}
