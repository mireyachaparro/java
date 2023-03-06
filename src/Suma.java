import java.util.Scanner;

//do while
//introducir numeros enteros y sumarlos
//finaliza cuando se introduce un 0

public class Suma {
    public static void main(String[] args) throws Exception{
        Scanner sc= new Scanner(System.in);
        int num=0;
        int suma=0;
        do{
            System.out.println("Introduce los numeros a sumar:");
            num = sc.nextInt();
            suma=suma+num;
        }while(num!=0);
        sc.close();
        System.out.println("la suma es "+suma);
    }
}
