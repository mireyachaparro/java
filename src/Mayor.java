import java.util.Scanner;

//ingresar 5 numeros y nos dice cual es el mayor

public class Mayor {
    public static void main(String[] args) throws Exception {
        int numeros[] = new int[5];
        int mayor=numeros[0];
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese los 5 numeros: ");
        for(int i=0;i<numeros.length;i++){
            System.out.println("numero "+(i+1));
            numeros[i]=sc.nextInt();
            if(numeros[i]>mayor){
                mayor=numeros[i];
            }
        }
        sc.close();
        System.out.println("el  numero mayor es el "+mayor);
}
}