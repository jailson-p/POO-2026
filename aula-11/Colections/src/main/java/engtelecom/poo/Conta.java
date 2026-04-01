package engtelecom.poo;

public class Conta {

    private String numConta;
    private String titular;
    private double saldo;


    public Conta(String titular, String numConta, int saldo) {
        this.titular = titular;
        this.numConta = numConta;
        this.saldo = (saldo > 0) ? saldo : 0;
    }

    public double sacar(double valor){
        this.saldo -= (valor < saldo) ? valor : 0;
        return this.saldo;
    }
    public double depositar(double valor){
        this.saldo += (valor > 0) ? valor : 0;
        return this.saldo;
    }



    @Override
    public String toString() {
        return String.format("Conta: %s%nTitular: %s%nSaldo: %.2f", numConta,titular,saldo);
    }
}
