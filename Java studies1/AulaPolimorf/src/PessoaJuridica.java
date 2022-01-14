public class PessoaJuridica extends Pessoa
{
    private long cnpj;

    @Override
    public String getNome()
    {
        return "Pessoa Juridica: "+super.getNome()+" - CNPJ: "+this.getCnpj();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
}
