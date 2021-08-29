package localhost.jesuseduaardo;

public class Contenido {

    private String titulo;
    private String genero;
    private String creador;
    private int year;
    private String duracion;
    private boolean visto;


    public Contenido() {
    }

    public Contenido(String titulo, String genero, String creador, int year, String duracion, boolean visto) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.year = year;
        this.duracion = duracion;
        this.visto = visto;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    @Override
    public String toString() {
        return  "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                ", year=" + year +
                ", duracion='" + duracion + '\'' +
                ", visto=" + visto;
    }
}
