public class Calcular {

    public Calcular(double[] valores)
    {
        double v = operacaoVetor(valores);
        System.out.print("Resultado: " + v);
    }

    public Calcular(double valor1, double valor2)
    {
        double v = operacao(valor1, valor2);
        System.out.print("Resultado: " + v);
    }

    public Calcular()
    {

    }

    private double operacaoVetor(double[] vals)
    {
        double temp = 1;
        for (int i = 0; i < vals.length; i++)
        {
            temp*=vals[i];
        }
        return temp;
    }

    private double operacao(double v1, double v2)
    {
        return v1 * v2;
    }


}