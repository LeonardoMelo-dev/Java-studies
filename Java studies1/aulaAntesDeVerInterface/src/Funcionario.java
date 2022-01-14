public class Funcionario extends ClasseImutavel{
    private String nome;
    private double salario;
    private final int RA;

    //Final só pode ser inicializado no construtor
    public  Funcionario(int valor, int RA)
    {
        super(valor);
        this.RA = RA;
    }

}
