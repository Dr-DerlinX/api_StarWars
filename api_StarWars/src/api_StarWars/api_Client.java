package api_StarWars;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import class_StarWars.process_jsom;

public class api_Client {

    private static final String url_client = "https://swapi.dev/api/films/";
    private static String json;
    static process_jsom process = new process_jsom();

    public static void getSolicitud(String buscar) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url_client + buscar))
                .build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        processResponce(response);
    }

    private static void processResponce(HttpResponse<String> response) {

        int statusCodes = response.statusCode();

        if (statusCodes == 200){
            //String json = response.body();
            setJson(response.body());
            process.processJson(getJson());

            System.out.println("Json" + getJson());
        }
        else {
            System.out.println("OCURRO UN ERROR EN LA RESPUESTA HTTP : " + statusCodes);
        }

    }


    public static String getJson() {
        return json;
    }

    public static void setJson(String json) {
        api_Client.json = json;
    }
}
