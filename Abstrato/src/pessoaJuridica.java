public class pessoaJuridica extends Contribuinte{

    private int funcionarios;

    public pessoaJuridica(){}

    public pessoaJuridica(String nome, Double rendaAnual, int funcionarios) {
        super(nome, rendaAnual);
        this.funcionarios = funcionarios;
    }

    public int getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(int funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public double imposto() {
        double impostoReal = 0;
        if (funcionarios > 10) {
            impostoReal = 0.14;
        }
        else {
            impostoReal = 0.16;
        }

        return getRendaAnual() * impostoReal;
    }
}
