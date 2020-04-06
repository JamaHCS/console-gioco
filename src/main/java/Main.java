import com.gioco.view.Login;


/**
 * Clase main, que es la iniciadora del programa.
 * El proyecto fue realizado intentando seguir una arquitectura MVC.
 * Teniendo el paquete Modell, View y Controller.
 *
 * @author Jama
 * @author Mariana
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        login.show();
    }
}
