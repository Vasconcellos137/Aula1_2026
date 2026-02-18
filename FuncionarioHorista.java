public class FuncionarioHorista {
    private int horasTrabalhadas;
    private double valorPorHora;
    private Funcionario funcionario;

    public FuncionarioHorista(int horasTrabalhadas, double valorPorHora, Funcionario funcionario) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
        this.funcionario = funcionario;
    }

    public FuncionarioHorista() {
    }
    
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double calcularSalario(double valorPorHora, int horasTrabalhadas ){
        double salario = valorPorHora*horasTrabalhadas;
        return salario;
    }

}
