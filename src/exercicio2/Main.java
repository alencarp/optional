//Exercicio2: Crie um optional de um objeto pessoa.
// A classe pessoa deve conter nome e CPF. Compare os Optionals com o equals e veja se o resultado é true ou false.

package exercicio2;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Maria", "839.390.290-98");
        Pessoa pessoa2 = new Pessoa("Maria", "839.390.290-98");

        Optional<Pessoa> optionalPessoa1 = Optional.of(pessoa1);
        Optional<Pessoa> optionalPessoa2 = Optional.of(pessoa2);

        System.out.println(optionalPessoa1.equals(optionalPessoa2));
    }
}
