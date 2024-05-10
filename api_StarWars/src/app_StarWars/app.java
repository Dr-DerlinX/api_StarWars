package app_StarWars;
import api_StarWars.*;

import java.io.IOException;

public class app {

    public static void main(String[] args) throws IOException, InterruptedException {
        //La Aplicacion aun esta en ploceso....

        String pelicula =  "2/";
        api_Client client;
        api_Client.getSolicitud(pelicula);
    }

}
