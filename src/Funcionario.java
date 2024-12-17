public class Funcionario {
    public String nome;
    public int id;
    public Email email;
    public Funcionario(String nome, int id, String email) {
        this.nome = nome;
        this.id = id;
        this.email = new Email(email);
    }
    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
}
