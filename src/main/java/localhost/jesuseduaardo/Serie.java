package localhost.jesuseduaardo;

public class Serie extends Contenido implements IVisualizable {

    private int noTemporadas;

    public Serie() {
        this.noTemporadas = 1;
        super.setVisto(false);
    }

    public Serie(String titulo, String creador) {
        super.setTitulo(titulo);
        super.setCreador(creador);
        this.noTemporadas = 1;
        super.setVisto(false);
    }

    public Serie(String titulo, String creador, int noTemporadas, String genero, int year, String duracion) {
        super.setTitulo(titulo);
        super.setCreador(creador);
        this.noTemporadas = noTemporadas;
        super.setGenero(genero);
        super.setYear(year);
        super.setDuracion(duracion);
        super.setVisto(false);
    }

    public int getNoTemporadas() {
        return noTemporadas;
    }

    public void setNoTemporadas(int noTemporadas) {
        this.noTemporadas = noTemporadas;
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public void setTitulo(String titulo) {
        super.setTitulo(titulo);
    }

    @Override
    public String getGenero() {
        return super.getGenero();
    }

    @Override
    public void setGenero(String genero) {
        super.setGenero(genero);
    }

    @Override
    public String getCreador() {
        return super.getCreador();
    }

    @Override
    public void setCreador(String creador) {
        super.setCreador(creador);
    }

    @Override
    public String getDuracion() {
        return super.getDuracion();
    }

    @Override
    public void setDuracion(String duracion) {
        super.setDuracion(duracion);
    }

    @Override
    public boolean isVisto() {
        return super.isVisto();
    }

    @Override
    public void setVisto(boolean visto) {
        super.setVisto(visto);
    }

    @Override
    public void marcarVisto() {
        super.setVisto(true);
    }

    @Override
    public boolean esVisto() {
        return super.isVisto();
    }

    @Override
    public String tiempoVisto() {
        return super.getDuracion();
    }

    @Override
    public String toString() {
        return "Serie{" +
                super.toString()+
                " noTemporadas=" + noTemporadas +
                "} ";
    }
}
