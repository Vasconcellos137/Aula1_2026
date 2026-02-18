public class FuncionarioBonificado {
    private double bonus;
    private Funcionario funcionario;
    private FuncionarioComissionado funComic;

    public FuncionarioBonificado(double bonus, Funcionario funcionario, FuncionarioComissionado funComic) {
        this.bonus = bonus;
        this.funcionario = funcionario;
        this.funComic = funComic;
    }

    public FuncionarioBonificado() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public FuncionarioComissionado getFunComic() {
        return funComic;
    }

    public void setFunComic(FuncionarioComissionado funComic) {
        this.funComic = funComic;
    }

    public double calcularSalario()
}
