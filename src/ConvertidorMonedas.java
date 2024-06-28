import java.util.Scanner;

public class ConvertidorMonedas extends PrincipalConexion {

    public static void convertir(String monedaOrigen, String monedaFin, PrincipalConexion conexion, Scanner lectura){
        double cantidad;
        double conversion;


        MonedasOmdb monedas = conexion.buscarMoneda(monedaOrigen,monedaFin);
        System.out.println("Hoy la moneda: " + monedaOrigen + " vale: " + monedas.conversion_rate()+ " " + monedaFin);
        System.out.println("Ingresa la cantidad en "+ monedaOrigen + " que desea convertir:");
        cantidad = Double.parseDouble(lectura.nextLine());
        conversion = cantidad * monedas.conversion_rate();
        System.out.println(cantidad + " " + monedaOrigen + " son: "+ conversion + " " + monedaFin);


    }
}
