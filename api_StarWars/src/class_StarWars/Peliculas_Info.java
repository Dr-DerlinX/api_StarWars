package class_StarWars;

public class Peliculas_Info {

    private String titulo;
    private String lanzamiento;
    private String director;
    private String productor;

    public Peliculas_Info(){}


    public String getProductor() {
        return productor;
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
                "FECHA DE LANZAMINTO" + getLanzamiento() +", " +
                "DIRECTOR : " + getDirectr() + ", " +
                "PRODUCTOR : " + getProductor();
    }

}
