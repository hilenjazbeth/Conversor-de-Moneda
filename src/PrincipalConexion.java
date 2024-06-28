import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PrincipalConexion {

    public MonedasOmdb buscarMoneda(String monedaOrigen, String monedaFin) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/b50235292eff6245b7d49dbf/pair/" + monedaOrigen + "/" + monedaFin);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), MonedasOmdb.class);

        } catch (Exception e) {
            throw new RuntimeException("Moneda no encontrada");
        }
    }

}



