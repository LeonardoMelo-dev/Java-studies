public class Gerente extends Funcionario
{
    private String setor;
    private String equipe;


    public Gerente()
    {

    }

    public Gerente(String nome, String CPF, int idade, String funcao, String setor, String equipe)
    {
        super(nome, CPF, idade, funcao);
        this.setor = setor;
        this.equipe = equipe;
    }


    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCPF() {
        return CPF;
    }

    @Override
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }


    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String getFuncao() {
        return funcao;
    }

    @Override
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public String toString()
    {
        return "Gerente\nNome: " + getNome() + "\nCPF: " + getCPF() + "\nIdade: " + getIdade() + "\nFunção: " + getFuncao() +
                "\nSetor: "+getSetor()+"\nEquipe: "+getEquipe();

    }
}


