import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String value = sc.nextLine();
        sc.close();
        
        System.out.println("hola "+value);
    }
}
