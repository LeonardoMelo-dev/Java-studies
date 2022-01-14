public class PessoaFisica extends Pessoa
{
    private long cpf;

    @Override
    public String getNome()
    {
        return "Pessoa Fisica: "+super.getNome()+" - CPF: "+this.getCpf();
    }


    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }


    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}
