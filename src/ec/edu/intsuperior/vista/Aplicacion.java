
package ec.edu.intsuperior.vista;
import ec.edu.intsuperior.modelo.Automovil;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Aplicacion {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Automovil au1=new Automovil();
        Automovil au2=new Automovil("PZA-2708",Automovil.TipoMarca.CHEVROLET,1992,Automovil.TipoColor.CONCHEVINO);
        
        System.out.print("Ingrese la placa del Auto1: ");
        au1.setPlaca(leer.nextLine());
        au1.setMarca(Automovil.TipoMarca.LAMBORGHINI);
        System.out.print("Ingrese el año:");
        au1.setAnio(leer.nextInt());
        System.out.print("Ingrese el color: ");
        au1.setColor(Automovil.TipoColor.ROJO);
        System.out.println("\n\n\n");
        System.out.println(au1.toString());
        System.out.println("\n\n\n");
        System.out.println(au2.toString());
        
        System.out.println("Realizado por DQ");
        
    }
}
