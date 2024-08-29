/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_entrada._datos;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA1_5_ENTRADA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARAR VARIABLES
        String marca;
        String modelo;
        int year;
        double precio;
        //¿como se captura?
        //SCANNER
        //Herramienta --> Clase: nose proporcian de muchas herramientas
        Scanner captura;// declaramos la herramienta, previamente
                        //hay que importarla (hacer un import)
        captura = new Scanner (System.in); // creamos la herramienta
        
        //HAY QUE INDICARLE AL USUARIO QUE CAPTURAR
         System.out.println("introduce la marca del vehiculo");
         //capturamos--> una asignacion
         marca = captura.nextLine(); //les regresa todo el texto hasta cuando
                                     // se presiona la tecla "enter"
         
        System.out.println("introduce el modelo del vehiculo");
         modelo = captura.nextLine();
        System.out.println("ano del modelo");
         year = captura.nextInt();
         System.out.println("introduce el precio");
         precio = captura.nextDouble();
        
        System.out.println("DATOS CAPTURADOS-------------");
        System.out.println(marca);
        System.out.println(precio);
        System.out.println(modelo);
        System.out.println(year);
        
        
    }
    
}
