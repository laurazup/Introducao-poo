public class Client {
    public String nome;
    public CartaoDeCredito cartaoDeCredito;
    public Client(String nome, CartaoDeCredito cartaoDeCredito) {
        this.nome = nome;
        this.cartaoDeCredito = cartaoDeCredito;
    }
    public void pagar() {
        this.cartaoDeCredito.efetuarPagamento();
    }
}
