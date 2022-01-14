public class PolimorfMainn
{
    public static void main(String[] args)
    {
        Pessoa fisica = new PessoaFisica();

        fisica.setNome("Nolberto Nobrega");
        //fisica.setCPF(213234543); //não funciona
        System.out.println(fisica.getNome());

        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        pessoaFisica.setNome("Robinson Crusoe");
        pessoaFisica.setCpf(453534534324234234l);

        pessoaJuridica.setNome("Superbom");
        pessoaJuridica.setCnpj(34235346345546645l);

        Pessoa [] pessoas = new Pessoa[2];

        pessoas[0] = pessoaFisica; //instanciando o objt pessoaFisica a pessoa
        pessoas[1] = pessoaJuridica; //instanciando o objt pessoaJuridica a pessoa

        for(Pessoa i: pessoas)
        {
            System.out.println(i.getNome());
        }

        int [] valores = {1,324,54,34,423,2};

//        for(int elemento: valores)
//        {
//            System.out.println(elemento);
//        }

        PessoaFisica pessoaFisica2 = (PessoaFisica) pessoaFisica; //casting
        pessoaFisica2.setCpf(2312);



        double [] notas = {6.0, 6.0, 3.5, 8.5};
        double a=0,b,c,d;


    }
}
