public class Email {
    public String value;
    public Email(String email) {
        this.value = email;
    }
    public void atualizarEmail(String novoEmail) throws Exception {
        validarEmail(novoEmail);
        this.value = novoEmail;
    }
    private void validarEmail(String email) throws Exception {
        if (email.length() < 5) {
            throw new Exception("Email não pode ter menos que 5 caracteres");
        }
    }
}
