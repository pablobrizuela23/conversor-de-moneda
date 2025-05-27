import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMoneda {

    public double obtenerTasaDeCambio(String monedaBase, String monedaDestino ,double monto)  {
        String clave = "c9e8c1cf28e6809e62d78a6d";
        String url = "https://v6.exchangerate-api.com/v6/"+clave+"/pair/"+monedaBase+"/"+monedaDestino+"/"+monto;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        /*
        System.out.println(response.statusCode());
        System.out.println(response.body());
        */

        Gson gson = new Gson().newBuilder().
                setPrettyPrinting().
                create();

        TasaCambioResponse json = gson.fromJson(response.body(),TasaCambioResponse.class);
        double tasa = json.conversion_result();

        return tasa;

    }
}
