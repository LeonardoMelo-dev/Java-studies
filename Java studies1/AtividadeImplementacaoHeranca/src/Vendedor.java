public class Vendedor extends Funcionario{

    private double salario;
    private int numCaixa;


    public Vendedor()
    {

    }

    public Vendedor(String nome, String CPF, int idade, String funcao, double salario, int numCaixa)
    {
        super(nome, CPF, idade, funcao);
        this.salario = salario;
        this.numCaixa = numCaixa;
    }

    public String getNome()
    {
        return nome;
    }

    @Override
    public void setNome(String nome)
    {
        this.nome = nome;
    }


    public String getCPF()
    {
        return CPF;
    }

    @Override
    public void setCPF(String CPF)
    {
        this.CPF = CPF;
    }

    public int getIdade()
    {
        return idade;
    }

    @Override
    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    @Override
    public String getFuncao()
    {
        return funcao;
    }

    @Override
    public void setFuncao(String funcao)
    {
        this.funcao = funcao;
    }

    public double getValorVendido()
    {
        return salario;
    }

    public void setValorVendido(double valorVendido)
    {
        this.salario = valorVendido;
    }

    public int getNumCaixa()
    {
        return numCaixa;
    }

    public void setNumCaixa(int numCaixa)
    {
        this.numCaixa = numCaixa;
    }

    public void adicionarVenda(double quant)

    {
        salario += quant;
    }

    public String toString()
    {
        return  "Vendedor\nNome: "+getNome()+"\nCPF: "+ getCPF()+"\nIdade: "+getIdade()+ "\nFunção: "+getFuncao()+
                "\nSalario: "+ getValorVendido()+"\nNúmero do caixa: "+getNumCaixa();
    }
}
