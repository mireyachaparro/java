import java.util.Scanner;

//capturar numeros positivos y calcular la media
//finaliza cuando se introduce un numero negativo

public class Media {
    public static void main(String[] args) throws Exception{
        int num=0;
        int cantidad = 0;
        int suma=0;
        double media=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("introduce los numeros:");
            num = sc.nextInt();
            suma=suma+num;
            cantidad=cantidad+1;
        }while(num>=0);
        sc.close();
        System.out.println("la cantidad de numeros intrdocudis es de "+cantidad);
        System.out.println("la suma es "+suma);
        // System.out.println("la media de los numeros introducidos es "+media);
    }
}
