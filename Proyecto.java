import java.io.IOException;
import java.util.Scanner;

class Proyecto{

    public static void main(String args[]) throws InterruptedException, IOException {

        extracted(args);
        menu();
    }

    private static void extracted(String[] args) throws InterruptedException {
        datos(args);
    }

    public static void datos(String[] args) throws InterruptedException {

        Scanner entrada = new Scanner(System.in);
        // Menu de inicio (Datos personales)
        // Start menu (Personal data)
        System.out.println("Digite su nombre");
        String nombre = entrada.nextLine();
        System.out.println("Digite su apellido");
        String apellido = entrada.nextLine();
        System.out.println("Digite su domicilio");
        String domicilio = entrada.nextLine();
        System.out.println("Digite su DNI");
        int dni = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite su numero de teléfono");
        int telefono = Integer.parseInt(entrada.nextLine());
        System.out.println(""); 
        System.out.println("Enter para continuar");
        entrada.nextLine(); 
        System.out.println("Cargando");
        Thread.sleep(1000);
        System.out.println("");
        System.out.println("GRACIAS POR UNIRTE A LA PROGRAMANETA");
        System.out.println("===========================================");

    }

    public static void menu() throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);
        // Declaramos de que tipo son las variables usadas
        // Declare the type of the variables used
        String alias, apellido1, contrasenia, nombre1, titular;
        int cantmes, dni1, nume, opcion, clave;
        double Crédito, efectivo, Débito, totalmes, valormes;
        System.out.println("transacción completada");

        valormes = 680.15;

        // Creamos un plan de eleccion al tipo de suscripcion mesl,mensual,anual - We
        // create a plan of choice to the type of weekly, monthly, annual subscription
        System.out.println("MENU");
        System.out.println("");
        System.out.println("1. Suscripción mensual al club Programaneta");
        System.out.println("2. Salir");
        System.out.println("");
        System.out.println("Digite la opción");
        opcion = Integer.parseInt(entrada.nextLine());
        System.out.println("");
        // En el caso que se eilja la opcion 1 se hara lo siguiente - In the event that
        // option 1 is chosen, the following will be done
        switch (opcion) {
            case 1:
                System.out.println("Digite la cantidad de meses que desea suscribirse: ");
                cantmes = Integer.parseInt(entrada.nextLine());
                totalmes = valormes * cantmes;
                System.out.println("Cargando");
                Thread.sleep(1000);
                System.out.println("");
                System.out.println("El costo de su suscripción es: $" + (totalmes));
                System.out.println("Desea continuar?");
                System.out.println("");
                System.out.println("1. Si");
                System.out.println("2. No");
                opcion = Integer.parseInt(entrada.nextLine());
                // el usuario elige el método de pago deseado - the user chooses the desired
                // payment method
                // Dentro de la opcion 1 creamos otro "SEGUN" con diferentes opciones - Within
                // option 1 we create another "SEGUN" with different options
                switch (opcion) {
                    case 1:
                        System.out.println("Selecciona el método de pago");
                        System.out.println("1. Efectivo/Transferencia bancaria");
                        System.out.println("Tarjetas");
                        System.out.println("2. Crédito. (Recargo de 10%)");
                        System.out.println("3. Débito. (Recargo de 5%)");
                        opcion = Integer.parseInt(entrada.nextLine());
                        // En el caso que elija la opcion 1 se le pedira que vuelva a elegir una opcion
                        // - In case you choose option 1 you will be asked to choose an option again
                        switch (opcion) {
                            case 1:
                                System.out.println("Seleccione método de pago");
                                System.out.println("");
                                System.out.println("1. Pagofacil");
                                System.out.println("2. Rapipago");
                                System.out.println("3. Mercado Pago");
                                opcion = Integer.parseInt(entrada.nextLine());
                                switch (opcion) {
                                    case 1:
                                        System.out.println("");
                                        System.out.println("Digite su nombre");
                                        nombre1 = entrada.nextLine();
                                        System.out.println("");
                                        System.out.println("Digite su apellido");
                                        apellido1 = entrada.nextLine();
                                        System.out.println("");
                                        System.out.println("Digite su numero DNI");
                                        dni1 = Integer.parseInt(entrada.nextLine());
                                        System.out.println("");
                                        System.out.println("Cargando");
                                        Thread.sleep(1000);
                                        System.out.println("Sus datos han sido cargados correctamente");
                                        System.out.println("Presione cualquier tecla para ver la factura");
                                        System.in.read();
                                                          
                                        System.out.println("Cargando");
                                        Thread.sleep(1000);
                                        System.out.println("");
                                        System.out.println("DATOS DE LA COMPRA");
                                        System.out.println("");
                                        System.out.println("                            Instrucciones de pago");
                                        System.out.println("");
                                        System.out.println(
                                                "Presenta este cupón en cualquier sucursal Pagofácil para realizar el pago.");
                                        System.out.println(
                                                "Su pago será procesado como máximo 1 dáa hábil después del pago.");
                                        System.out.println("Fecha de expiración: 30/04/2022");
                                        System.out.println("");
                                        System.out.println("Número de pedido                                 84929102");
                                        System.out.println("");
                                        System.out.println(
                                                "Valor:                                           ARS $" + (totalmes));
                                        System.out.println("");
                                        System.out.println(
                                                "Código manual                                    2123864912859931272");
                                        System.out.println("");
                                        System.out.println("                          IMPRIMIR TICKET");
                                        System.out.println(
                                                "=====================================================================   ");
                                        System.out.println(
                                                "              Bienvenido al club la programaneta                        ");
                                        System.out.println("");
                                        System.out.println("");
                                        // en caso de elegir opcion2 = completa los datos requeridos - in case of
                                        // choosing option 2 = complete the required data
                                        break;

                                }

                            case 4:
                                System.out.println("");
                                System.out.println("Digite su nombre");
                                nombre1 = entrada.nextLine();
                                System.out.println("");
                                System.out.println("Digite su apellido");
                                apellido1 = entrada.nextLine();
                                System.out.println("");
                                System.out.println("Digite su numero DNI");
                                dni1 = Integer.parseInt(entrada.nextLine());
                                System.out.println("");
                                System.out.println("Cargando");
                                Thread.sleep(1000);
                                System.out.println("Sus datos han sido cargados correctamente");
                                System.out.println("Presione cualquier tecla para ver la factura");
                                System.in.read();
                                System.out.println("Cargando");
                                Thread.sleep(1000);
                                System.out.println("");
                                System.out.println("DATOS DE LA COMPRA");
                                System.out.println("");
                                System.out.println("                            Instrucciones de pago");
                                System.out.println("");
                                System.out.println(
                                        "Presenta este cupón en cualquier sucursal Rapipago para realizar el pago.");
                                System.out.println("Su pago será procesado como máximo 1 día hábil después del pago.");
                                System.out.println("Fecha de expiración: 30/04/2022");
                                System.out.println("");
                                System.out.println("Número de pedido                                 84929102");
                                System.out.println("");
                                System.out.println(
                                        "    Valor:                                           ARS $" + (totalmes));
                                System.out.println("");
                                System.out.println(
                                        "    Código manual                                    2123864912859931272");
                                System.out.println("");
                                System.out.println("                          IMPRIMIR TICKET");
                                System.out.println(
                                        "=====================================================================   ");
                                System.out.println(
                                        "              Bienvenido al club la programaneta                        ");
                                System.out.println("");
                                break;

                            case 5:
                                System.out.println("");
                                System.out.println("Inicie sesión en mercado pago");
                                System.out.println("");
                                System.out.println("Escriba nombre de usuario o alias");
                                alias = entrada.nextLine();
                                System.out.println("Ingrese la contraseña");
                                contrasenia = entrada.nextLine();
                                System.out.println("Cargando");
                                Thread.sleep(1000);
                                System.out.println("Sus datos han sido cargados correctamente");
                                System.out.println("Presione cualquier tecla para ver la factura");
                                System.in.read();
                                System.out.println("Cargando");
                                Thread.sleep(1000);
                                System.out.println("");
                                System.out.println(
                                        "MERCADO PAGO                                     COMPROBANTE DE PAGO");
                                System.out.println(
                                        "                                                 2123864912859931272");
                                System.out.println("");
                                System.out.println("                          Pagaste a");
                                System.out.println("                       PAGO DE SERVICIO");
                                System.out.println("                         Total pagado");
                                System.out.println("                           $" + (totalmes));
                                System.out.println("");
                                System.out.println("Detalle de la operación");
                                System.out
                                        .println("Valor de la factura                                   " + (totalmes));
                                System.out.println("");
                                System.out
                                        .println("Total pagado                                          " + (totalmes));
                                System.out.println("");
                                System.out.println("");
                                System.out.println("    Código de barras");
                                System.out.println("    81982655018235610283");
                                System.out.println("");
                                System.out.println("    Número de transaccin");
                                System.out.println("    801237698191298030");
                                System.out.println("");
                                System.out.println("Pagador final                                       Pagó el");
                                System.out.println((alias) + "                                       13/04/2022");
                                System.out.println("");
                                System.out.println("Medio de pago");
                                System.out.println("Mercado pago");
                                System.out.println("");
                                System.out.println("Su núúmero de transacción es: 81982655018235610283");
                                System.out.println("");
                                System.out.println(
                                        "=====================================================================   ");
                                System.out.println(
                                        "              Bienvenido al club la programaneta                        ");
                                System.out.println("");
                                break;
                            default:
                                System.out.println("Opción no válida");

                                break;
                            case 2: {
                                System.out.println("Escriba el nombre del titular de la tarjeta");
                                titular = entrada.nextLine();
                                System.out.println("");
                                System.out.println("Escriba el número del frente de la tarjeta");
                                nume = Integer.parseInt(entrada.nextLine());
                                System.out.println("");
                                System.out.println("Escriba la clave de seguridad de la parte trasera");
                                clave = Integer.parseInt(entrada.nextLine());
                                totalmes = valormes * cantmes;
                                Crédito = (totalmes) + (totalmes * 0.1);
                                System.out.println("Cargando");
                                Thread.sleep(1000);
                                System.out.println("");
                                System.out.println("Presione una tecla para continuar");
                                System.in.read();
                                System.out.println("");
                                System.out.println("Su compra al servicio Programaneta por un monto de $" + (Crédito)
                                        + " fue realizada con éxito");
                                System.out.println("Muchas gracias por usar nuestro servicio.");
                                System.out.println("");
                                System.out.println(
                                        "=====================================================================");
                                System.out.println(
                                        "              Bienvenido al club la programaneta                        ");
                                System.out.println(
                                        "=====================================================================");
                                System.out.println("");
                                // en caso de elegir opcion Débito= completa los datos requeridos = in case of
                                // choosing debit option = complete the required data
                                break;
                            }
                            case 3:
                                System.out.println("Escriba el nombre del titular de la tarjeta");
                                titular = entrada.nextLine();
                                totalmes = valormes * cantmes;
                                Débito = (totalmes) + (totalmes * 0.05);
                                System.out.println("");
                                System.out.println("Escriba el número del frente de la tarjeta");
                                nume = Integer.parseInt(entrada.nextLine());
                                System.out.println("");
                                System.out.println("Escriba la clave de seguridad de la parte trasera");
                                clave = Integer.parseInt(entrada.nextLine());
                                System.out.println("Cargando");
                                Thread.sleep(1 * 1000);
                                System.out.println("");
                                System.out.println("Presione una tecla para continuar");
                                System.in.read();
                                System.out.println("");
                                System.out.println("Su compra al servicio Programaneta por un monto de $" + (Débito)
                                        + " fue realizada con éxito");
                                System.out.println("Muchas gracias por usar nuestro servicio.");
                                System.out.println("");
                                System.out.println(
                                        "=====================================================================   ");
                                System.out.println(
                                        "              Bienvenido al club la programaneta                        ");
                                System.out.println("");
                                System.out.println("");
                                break;
                        }
                        break;

                }
       
        
            case 2:    
            System.out.println("Muchas gracias por visitar nuestra pagina");}
    }
}
