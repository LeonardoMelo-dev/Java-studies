public class Cachorro extends Mamifero
{
    public String come;


    public void setCorPelagem(String corPelagem) {
        super.setCorPelagem(corPelagem);
    }


    public int getEspectativaIdade() {
        return 0;
    }

    public String getCorPelagem() {
        return super.getCorPelagem();
    }

    public String comer() {
        return come;
    }

    public String fazerBarulho() {
        return null;
    }
}
