public non-sealed class Vendedor extends Colaborador{

    private double porcentualPorVendas;
    private double salario;


    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPorcentual(){
        return porcentualPorVendas;
    }
    public void setPorcentual(double porcentualPorVendas){
        this.porcentualPorVendas = porcentualPorVendas;
    }
}
