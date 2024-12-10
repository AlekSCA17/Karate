package com.mycompany.karate;

/**
 *
 * @author Alexander
 */
public class Karate {
  
    public static void main(String[] args) {
        //Llamando clases 
        
       // Crear una instancia de la clase Login
        Login login = new Login();
        
        // Intentar iniciar sesión
        if (login.iniciarsesion()) {
            // Si el inicio de sesión es exitoso, llamar a la clase Menu
            Menu menu = new Menu();
            menu.mostrarMenu();

        }
    }
}