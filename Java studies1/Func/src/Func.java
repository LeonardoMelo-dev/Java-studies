public abstract class Funcionario {
    private String nome;
    private int RA;
    public Funcionario9String nome, int RA)
    {
        this.nome = nome;
        this.RA = RA;
    }
    public String getNome () {
        return nome;
    }
    public int getRA() {
        return RA;
    }
}

public class Professor extends Funcionario{
    private String titulacao;
    public Professor(String titulacao, String nome, int RA) {
        **
        thius.titulacao = titulacao;
    }
    public String getTitulacao() {
        return titulacao;
    }
}
public class Mensalidade extends Professor{
    private double salarioBase;
    public Mensalidade(double salarioBase, Strin titulacao, String nome, int RA) {
        **
        tis.salarioBase = salarioBase;
    }
    public double getSalarioBase(){
        return salarioBase;
    }
}