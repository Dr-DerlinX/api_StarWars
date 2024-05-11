package app_StarWars;
import api_StarWars.*;
import class_StarWars.process_jsom;
import java.io.IOException;
import java.util.Scanner;

public class app {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException, InterruptedException {

        //Aplicacion en proceso

        String op = "3";
        api_Client.getSolicitud(op);
        //process_jsom processJsom = new process_jsom();
        //processJsom.processJson(api_Client.getJson());

    }

    public static void menu_Inicial(){
        System.out.println("==Lista de peliculas de Star Wars==");
        System.out.println("= 1 = A new Hope                  =");
        System.out.println("= 2 = The Empire Strikes Back     =");
        System.out.println("= 3 = Return of the Jedi          =");
        System.out.println("= 4 = The Phantom Menace          =");
        System.out.println("= 5 = Attack of the Clones        =");
        System.out.println("= 6 = Revenge of the Sith         =");
        System.out.println("===================================");
        System.out.println("========(SALIR) para terminar======");
        System.out.println("===================================");
    }

    public static void menu_Opciones() throws IOException, InterruptedException {

        api_Client client1 = new api_Client();
        String opciones;

        System.out.println("SELECIONE LA PELICULA A BUSCAR :");

    }
}
