import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    /* Nombre: Steven Alejandro Alvarez Avendaño
     * Nª Carnet: 2024-1675U
     * Grupo: 1m7-S
     */

    public static void PedirVaLores(int arreglo[]){
        //Se le pide al usuario que ingrese sus valores del arreglo, con sus respectivas excepciones
        Scanner sc= new Scanner(System.in);
        int i=0;
        while (i<arreglo.length) {
            try {
                System.out.print("Ingrese el valor("+(i+1)+"/"+arreglo.length+"): ");
                arreglo[i]=sc.nextInt();
                System.out.println("Valor agregado correctamente....");
                i++;
                } catch (InputMismatchException e) {
                System.out.println("Solo se aceptan valores enteros.....");
                sc.next();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        //Se le pide al usuario que ingrese el tamaño del arreglo, con sus respectivas excepciones
        Scanner sc= new Scanner(System.in);
        try {
            System.out.print("Ingrese el tamaño de tu arreglo: ");
            int arreglo[]=new int[sc.nextInt()];
            if (arreglo.length>1) {
                PedirVaLores(arreglo);
                MotrarValores(arreglo);
                MotrarValoresInvertidos(arreglo);
            } else {
                System.out.println("El tamaño del arreglo tiene que ser mayor a 1");
                main(args);
            }
        } catch (InputMismatchException e) {
            System.out.println("El valor debe ser de tipo entero....");
            main(args);
        }sc.close(); 
    }
    
    public static void MotrarValores(int arreglo[]){
        //Se le muestra al usuario por consola los valores ingresados en orden natural
        System.out.print("\nSus valores ingresados son: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+", ");
        }
    }

    public static void MotrarValoresInvertidos(int arreglo[]){
        //Se le muestra al usuario por consola los valores ingresados en orden inverso
        System.out.print("\nSus valores ingresados de manera inversa son: ");
        for (int i = arreglo.length-1; i>=0; i--) {
            System.out.print(arreglo[i]+", ");
        }
    }
}
