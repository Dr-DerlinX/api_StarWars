package app_StarWars;
import java.io.IOException;
import java.util.Scanner;
import api_StarWars.api_Client;

public class app {

    public static void main(String[] args) throws IOException, InterruptedException {
        //Aplicacion en proceso

        Scanner scanner = new Scanner(System.in);
        String op;

        while (true){
           menu_Opciones();
           op = scanner.nextLine();
           api_Client.getSolicitud(op);
           if (op.equalsIgnoreCase("salir")) break;
        }

    }

    public static void menu_Opciones(){

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
}
