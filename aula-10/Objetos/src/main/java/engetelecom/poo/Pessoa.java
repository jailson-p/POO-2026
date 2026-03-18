package engetelecom.poo;

public class Pessoa {

    private String nome;
    private String cpf;
    private String email;

    public Pessoa(String nome, String cpf, String email) {
        this.nome = new String(nome);
        this.cpf = new String(cpf);
        this.email = new String(email);
    }

    public String getNome() { return this.nome; }

    public String getCpf() { return this.cpf; }

    public String getEmail() { return this.email; }

    public void setNome(String nome) { this.nome = nome; }

    public void setCpf(String cpf) { this.cpf = cpf; }

    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return  "nome=" + nome + '\n' +
                "cpf=" + cpf + '\n' +
                "email=" + email + '\n';
    }
}
