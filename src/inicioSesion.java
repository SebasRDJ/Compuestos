import java.util.Scanner;

public class inicioSesion{
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String nombreUsuario;                                                                                         

        System.out.println("Ingresa tu nombre de usuario:");
        nombreUsuario = sc.nextLine();

        String claveUsuario;

        System.out.println("Ingresa tu clave:");
        claveUsuario = sc.nextLine();

        if (nombreUsuario.equals("admin") && claveUsuario.equals("123")) {

            System.out.println("Bienvenido!!!!!");
            
        } else {

            System.out.println("Datos incorrectos.");
        }

        sc.close();
        



       




    
    }
}
