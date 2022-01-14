public class SistemaControleRemoto implements ControleRemoto{

    private int volume;
    private boolean ligado;
    private boolean tocando;

    private boolean ligar;
    private boolean desligar;
    private boolean abrirMenu;
    private boolean fecharMenu;
    private int maisVolume;
    private int menosVolume;
    private boolean ligarMudo;
    private boolean desligaMudo;
    private boolean play;
    private boolean pause;


    public SistemaControleRemoto ()
    {
        this.setLigado(true);
        this.setVolume(50);
        this.setTocando(false);
    }

    private boolean getLigado()
    {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private int getVolume()
    {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getTocando()
    {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    //Metodos abstratos
    @Override
    public void ligar()
    {
        this.setLigado(true);
    }

    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }

    @Override
    public void desligar()
    {
        this.setLigado(false);
    }

    public void setDesligar(boolean desligar) {
        this.desligar = desligar;
    }

    @Override
    public void abrirMenu()
    {
        if(this.getLigado())
        {
            System.out.println("------------- MENU -------------");
            System.out.println("Esta ligado? " + this.getLigado());
            System.out.println("Esta tocando? " + this.getTocando());
            System.out.println("Volume: " + this.getVolume());
            for (int i = 0; i < this.getVolume(); i += 10) {
                System.out.print("|");
            }
            System.out.println();
        }
        else
        {
            System.out.println("Ligue a TV para ver o menu");
        }
    }

    public void setAbrirMenu(boolean abrirMenu) {
        this.abrirMenu = abrirMenu;
    }

    @Override
    public void fecharMenu()
    {
        System.out.println("Fechando menu...");
        for (int i=0; i<20; i++)
        {
            System.out.println();
        }
    }

    public void setFecharMenu(boolean fecharMenu) {
        this.fecharMenu = fecharMenu;
    }

    @Override
    public void maisVolume()
    {
        if(this.getLigado())
        {
            this.setVolume(this.getVolume() + 5);
        }
        else
        {
            System.out.println("Impossivel almentar volume");
        }
    }

    public void setMaisVolume(int maisVolume) {
        this.maisVolume = maisVolume;
    }

    @Override
    public void menosVolume()
    {
        if(this.getLigado())
        {
            this.setVolume(this.getVolume() - 5);
        }
        else
        {
            System.out.println("Impossivel diminuir volume");
        }
    }

    public void setMenosVolume(int menosVolume) {
        this.menosVolume = menosVolume;
    }

    @Override
    public void ligarMudo()
    {
        if (this.getLigado() && this.getVolume() > 0)
        {
            this.setVolume(0);
        }
    }

    public void setLigarMudo(boolean ligarMudo) {
        this.ligarMudo = ligarMudo;
    }

    @Override
    public void desligarMudo()
    {
        if (this.getLigado() && this.getVolume() == 0)
        {
            this.setVolume(50);
        }
    }

    public void setDesligaMudo(boolean desligaMudo) {
        this.desligaMudo = desligaMudo;
    }

    @Override
    public void play()
    {
        if(this.getLigado() && !(this.getTocando()))
        {
            this.setTocando(true);
        }
        else
        {
            System.out.println("Não foi possível reproduzir");
        }
    }

    public void setPlay(boolean play) {
        this.play = play;
    }

    @Override
    public void pause()
    {
        if(this.getLigado() && this.getTocando())
        {
            this.setTocando(false);
        }
        else
        {
            System.out.println("Não foi possível reproduzir");
        }
    }

    public void setPause(boolean pause) {
        this.pause = pause;
    }
}
