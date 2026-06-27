package POO.aulas.Encapsulamento;


public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //constructor
    public ControleRemoto() {
        volume = 50;
        ligado = false;
        tocando = false;
    }

    // GETTERS and SETTERS
    private int getVolume() {

        return volume;
    }

    private void setVolume(int volume) {

        this.volume = volume;
    }

    private boolean getLigado() {

        return ligado;
    }

    private void setLigado(boolean ligado) {

        this.ligado = ligado;
    }

    private boolean getTocando() {

        return tocando;
    }

    private void setTocando(boolean tocando) {

        this.tocando = tocando;
    }

    //Methods of interface
    @Override
    public void ligar() {

        setLigado(true);
    }

    @Override
    public void desligar() {

        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Ligado: " + getLigado());
        System.out.println("Volume: " + getVolume());

        if (this.getLigado()) {
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("/");
            }
        } else {
            System.out.println("O menu só pode abrir se a TV estiver ligada");
        }
    }

    @Override
    public void fecharMenu() {

        System.out.println("Fechando Menu");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
            System.out.println("Desligando Mudo");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !this.getTocando()) {
            this.setTocando(true);
            System.out.println("Play");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
            System.out.println("Pause");
        }
    }
}
