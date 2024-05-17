//Crie um Optional de um objeto e use os métodos of, ofNullable, ifPresent, orElse deste optional
package exercicios;
import java.util.Optional;

public class Exercicio1 {

    public static void main(String[] args) {
        Integer op1 = optionalOf(398);
//        optionalOfNullable("Maria");
//        optionalIfPresent();
//        optionalOrElse();

        System.out.println(op1);

    }

    public static Integer optionalOf(Integer value) {
        Optional<Integer> optional = Optional.of(value);
        return optional.get();
    }

    public static void optionalOfNullable(String value) {
        Optional<String> optional = Optional.ofNullable(value);
        System.out.println(optional);
    }

    public static void optionalIfPresent() {
        Optional<Character> optional = Optional.ofNullable('A');
//        Optional<Character> optional = Optional.ofNullable(null);
        System.out.println(optional.isPresent());
    }

    public static void optionalOrElse() {
        Optional<String> optional = Optional.ofNullable("Hello");
//        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional.orElse("939"));
    }

}
