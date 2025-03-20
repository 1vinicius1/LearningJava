public class Cliente {

    private String numConta;
    private String titular;
    private double depositoInicial;
    private double saldo;

    public Cliente(){}

    public Cliente(String titular, String numConta, double depositoInicial) {
        this.titular = titular;
        this.numConta = numConta;
        this.depositoInicial = depositoInicial;
        saldo += depositoInicial;
    }

    public Cliente(String titular, String numConta) {
        this.titular = titular;
        this.numConta = numConta;
    }

    public String getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getDepositoInicial() {
        return depositoInicial;
    }

    public void deposit(double valor){
        saldo += valor;
    }

    public void saque(double quantia){
        saldo = (saldo - quantia) - 5.00;
    }

    @Override
    public String toString() {
        return "Account " +
                getNumConta() +
                ", Holder: " +
                getTitular() +
                ", Balance: $ " +
                String.format("%.2f%n", getSaldo());
    }

}
