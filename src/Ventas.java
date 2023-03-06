import java.util.Scanner;

//programa en el que almacenemos en un array las 7 ventas de una semana y nos va a decir cuales y cuantas ventas de ese mes superaron los 2.000 euros

public class Ventas {
    public static void main(String[] args) throws Exception {
        double ventas[]=new double[7];
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese las 30 ventas del mes: ");
        for (int i=0;i<ventas.length;i++){
            System.out.println("Venta "+(i+1));
            ventas[i]=sc.nextDouble();
        }
        int k=0;
        int count=0;
        while(k<7){
            if(ventas[k]>=2000){
                System.out.println("la venta "+(k+1)+" fue de "+ventas[k]+" euros");
                count++;
            }
            k++;
        }
        sc.close();
        System.out.println("el total de ventas mayor a 2000 es "+ count);
    }
}
