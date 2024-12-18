public class Main {
    public static void main(String[] args) throws Exception {
        Funcionario funcionario = new Funcionario(
                "Eduardo",
                1,
                "eduardo@email.com");
        funcionario.email.atualizarEmail(
                "eduardo@email.com.br");

        Client client = new Client(
                "Gabriel",
                new BancoX());

        Cachorro cachorro = new Cachorro();
        cachorro.comer("ração");
        String nomeDoCachorro = cachorro.nome;

        Cachorro tombaLata = new Cachorro();
        tombaLata.comer("comida");
    }
}