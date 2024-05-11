package class_StarWars;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

public class process_jsom {

    public void processJson(String json){

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Pelicula_Record pelicula = gson.fromJson(json, Pelicula_Record.class);
        Peliculas_Info peliculasInfo = new Peliculas_Info(pelicula);
        System.out.println(peliculasInfo.toString());

    }

}
