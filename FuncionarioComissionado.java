public class FuncionarioComissionado {
    private double vendasMensais;
    private double percentualComissao;
    private Funcionario funcionario;

    public FuncionarioComissionado(double vendasMensais, double percentualComissao, Funcionario funcionario) {
        this.vendasMensais = vendasMensais;
        this.percentualComissao = percentualComissao;
        this.funcionario = funcionario;
    }

    public FuncionarioComissionado() {
    }

    public double getVendasMensais() {
        return vendasMensais;
    }

    public void setVendasMensais(double vendasMensais) {
        this.vendasMensais = vendasMensais;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    // public double calcularSalario(double vendasMensais, double percentualComissao){

    // }
    
}
