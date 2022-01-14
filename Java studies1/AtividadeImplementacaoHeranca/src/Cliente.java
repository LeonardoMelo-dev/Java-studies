public class Cliente implements Pessoa{

    private String nome;
    private String CPF;
    private int idade;
    private int idCliente;
    private Double valorGasto;

    public Cliente(String nome, String CPF, int idade, int idCliente, double valorGasto)
    {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.idCliente = idCliente;
        this.valorGasto = valorGasto;
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Double getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(Double valorGasto) {
        this.valorGasto = valorGasto;
    }

    public String toString()
    {
        return  "Cliente\nNome: "+getNome()+"\nCPF: "+ getCPF()+"\nIdade: "+getIdade()+"\nNúmero identificador: "+getIdCliente()+"\nValor total gasto na loja: "+getValorGasto();
    }

}
