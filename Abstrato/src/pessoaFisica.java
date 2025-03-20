public class pessoaFisica extends Contribuinte {

    private Double gastosSaude;

    public pessoaFisica(){}

    public pessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double imposto() {
        if(getRendaAnual() < 20000) {
            return (getRendaAnual() * 0.15) - (gastosSaude / 2);
        }
        else{
            return (getRendaAnual() * 0.25) - (gastosSaude / 2);
        }
    }
}
