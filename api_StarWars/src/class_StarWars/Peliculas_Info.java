package class_StarWars;

public class Peliculas_Info {

    private String titulo;
    private String espisodio;
    private String director;
    private String productor;
    private String lanzamiento;

    public Peliculas_Info(){}

    public Peliculas_Info(Pelicula_Record peliculaRecord){
        this.titulo = peliculaRecord.title();
        this.espisodio = peliculaRecord.episode_id();
        this.director = peliculaRecord.director();
        this.productor = peliculaRecord.producer();
        this.lanzamiento = peliculaRecord.release_date();
    }

    public String getProductor() {
        return productor;
    }

    public String getEspisolio() {
        return espisodio;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public String getDirectr() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setEspisolio(String espisolio) {
        this.espisodio = espisolio;
    }

    public String getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(String lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "TITULO : " + getTitulo() +", " +
                "ESPISOLIO : " + getEspisolio() + ", " +
                "DIRECTOR : " + getDirectr() +", " +
                "PRODUCTOR : " + getProductor() + ", " +
                "FECHA DE LANZAMIENTO : " + getLanzamiento();
    }

}
