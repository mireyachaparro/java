import java.util.Scanner;

//1 pan = 1 euros
//si el cliente compra mas de 50 panes, le costará 0.8 euros cada pan
//si el cliente compra mas de 100 panes, le costará 0.5 euros cada pan
//programa para capturar la cantidad de panes que el cliente ha comprado y el total a pagar

public class Panaderia {
    public static void main(String[] args) throws Exception {
        int cantidad=0;
        double pago=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese cuantos panes quiere comprar:");
        cantidad = sc.nextInt();
        if(cantidad>=100){
            pago = cantidad*0.5;
        }else if(cantidad>=50){
            pago=cantidad*0.8;
        }else{
            pago=cantidad*1;
        }
        System.out.println("Cantidad de panes: "+cantidad);
        System.out.println("Precio: "+pago+" euros");
        sc.close();
}
}