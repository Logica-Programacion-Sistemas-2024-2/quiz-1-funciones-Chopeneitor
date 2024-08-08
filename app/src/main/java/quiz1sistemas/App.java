
package quiz1sistemas;

public class App {
    public static void main(String[] args) {
        
        // Logica de solucion
        
    }
public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenido al cine");

            System.out.println("Por favor ingresar que tipo de boleta va a comprar (G o V):");
            String tipoBoleta = sc.nextLine();

            System.out.println("¿Cuantas boletas desea comprar?");
            int cantidadBoletas = sc.nextInt();

            int valorBoletas;

            if (tipoBoleta == "G") {

                valorBoletas = 10000*cantidadBoletas;
                
            }else{

                valorBoletas = 15000*cantidadBoletas;

            }

            System.out.println("Que combo desea comprar (1, 2, 3)");
            int tipoCombo = sc.nextInt();

            System.out.println("Cuantos combos desea comprar");
            int cantidadCombos = sc.nextInt();

            int valorCombo;
            int valorCombo1 = 40000;
            int valorCombo2 = 30000;
            int valorCombo3 = 42000;


            switch (tipoCombo) {
                case 1:
                    valorCombo = valorCombo1 * cantidadCombos;
                    break;
                case 2:
                    valorCombo = valorCombo2 * cantidadCombos;
                    break;
                case 3:
                    valorCombo = valorCombo3 * cantidadCombos;
                    break;
                default:
                    valorCombo=0;
                    break;
            }

            System.out.println("El valor total de los combos es: " + valorCombo);

            double descuento;
            

            if (tipoBoleta == "V"){
                switch (tipoCombo) {
                    case 1:
                        descuento = (double) (valorCombo * 0.5);
                        break;
                    case 2:
                        descuento = (double) (valorCombo * 0.6);
                        break;
                    case 3:
                        descuento = (double) (valorCombo * 0.3);
                        break;
                    default:
                        descuento = 0;
                        break;
                }
            }
            else{
                descuento = 0;
            }

            double valorTotal= valorBoletas + valorCombo - descuento;

            System.out.println("Factura");

            System.out.println("Asiento: " + (tipoBoleta == "G" || tipoBoleta == "V" ? "General" : "VIP"));
            System.out.println("Cantidad de boletas: " + cantidadBoletas);
            System.out.println("Valor boletas: " + valorBoletas);
            System.out.println("Combos: " + cantidadCombos + " valor de los combos: " + valorCombo);
            System.out.println("El descuento fue: " + descuento);
            System.out.println("El valor total de la factura es: " + valorTotal);
            

            
           
            

        } catch (Exception e) {
            // TODO: handle exception
        }
    /*  Implemente una funcion llamada calcularValorBoleta que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa el tipo de silla comprada (V ó G)
            - Un entero que representa la cantidad de boletas compradas
        * Retorna:
            - Un entero representando el valor total de las boletas
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularValorNetoCombo que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el numero de combo selecciondo
            - Un entero representando la cantidad de combos comprados
        * Retorna:
            - Un entero representando el valor neto del combo
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularDescuentoCombo que cumpla con las siguientes caracteristicas
        * Recibe:
            - Una cadena de caracteres que representa el tipo de silla comprada (V ó G)
            - Un entero representando el valor neto del combo
        * Retorna:
            - Un entero representando el valor del descuento
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularValorFactura que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el valor neto del combo
            - Un entero representando el valor de las boletas
            - Un entero representando el valor del descuento del combo
        * Retorna:
            - Un entero representando el valor total de la factura
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------
}
