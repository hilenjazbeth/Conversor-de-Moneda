import java.util.Scanner;

public class ConversorGeneral extends Exception{
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        PrincipalConexion conexion = new PrincipalConexion();

        int opcion = 0;
        while (opcion != 7) {
            System.out.println("\n *******************************************************" +
                    "\n BIENVENIDO/A AL CONVERSOR DE MONEDA" +
                    "\n 1) Dólar => Peso Argentino" +
                    "\n 2) Peso Argentino => Dólar" +
                    "\n 3) Dólar => Real brasileño" +
                    "\n 4) Real brasileño => Dólar" +
                    "\n 5) Dólar => Peso Colombiano" +
                    "\n 6) Peso Colombiano => Dólar" +
                    "\n 7) Salir" +
                    "\n *********************************************************************"+
                    "\n Elija una opción válida: \n" );

            //lectura = new Scanner(System.in);
            opcion = Integer.parseInt(lectura.nextLine());

            switch (opcion){
                case 1:
                    System.out.println("OPCION 1"+
                            "\n1) Dólar => Peso Argentino");
                    ConvertidorMonedas.convertir("USD", "ARS", conexion, lectura);
                    break;

                case 2:
                    System.out.println("OPCION 2"+
                            "\n2) Peso Argentino => Dólar");
                    ConvertidorMonedas.convertir("ARS", "USD", conexion, lectura);
                    break;

                case 3:
                    System.out.println("OPCION 3"+
                            "\n 3) Dólar => Real brasileño");
                    ConvertidorMonedas.convertir("USD", "BRL", conexion, lectura);
                    break;

                case 4:
                    System.out.println("OPCION 4"+
                                    "\n 4) Real brasileño => Dólar");
                    ConvertidorMonedas.convertir("USD", "BRL", conexion, lectura);
                    break;

                case 5:
                    System.out.println("OPCION 5"+
                            "\n 5) Dólar => Peso Colombiano");
                    ConvertidorMonedas.convertir("USD", "COP", conexion, lectura);
                    break;

                case 6:
                    System.out.println("OPCION 6"+
                            "\n 6) Peso Colombiano => Dólar");
                    ConvertidorMonedas.convertir("COP", "USD", conexion, lectura);
                    break;

                case 7:
                    System.out.println("Ha salido del programa");

                    break;

                default:
                    System.out.println("No se reconoce opción, intente de nuevo.");
                    break;
            }

        }
    }
}