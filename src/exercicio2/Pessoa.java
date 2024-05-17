//Exercicio2: Crie um optional de um objeto pessoa.
// A classe pessoa deve conter nome e CPF. Compare os Optionals com o equals e veja se o resultado é true ou false.

package exercicio2;
public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }

}
