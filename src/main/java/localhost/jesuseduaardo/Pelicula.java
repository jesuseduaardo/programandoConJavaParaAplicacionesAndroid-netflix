package localhost.jesuseduaardo;

public class Pelicula extends Contenido implements IVisualizable{
    public Pelicula() {
    }

    public Pelicula(String titulo, String creador) {
        super.setTitulo(titulo);
        super.setCreador(creador);
    }

    public Pelicula(String titulo, String creador, String genero, int year, String duracion) {
        super.setTitulo(titulo);
        super.setCreador(creador);
        super.setGenero(genero);
        super.setYear(year);
        super.setDuracion(duracion);
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
        return "Pelicula{" + super.toString() + "}";
    }
}
