
package com.mycompany.karate;

import java.util.Scanner;

public class Login {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    public boolean iniciarsesion() {
        Scanner scanner = new Scanner(System.in);
        boolean autenticado = false;

        System.out.println("----Cobra Kai---- ");

        while (!autenticado) {
            System.out.print("Ingrese su usuario: ");
            String usuario = scanner.nextLine();

            System.out.print("Ingrese su contraseña: ");
            String contrasena = scanner.nextLine();

            if (verificarCredenciales(usuario, contrasena)) {
                System.out.println("¡Inicio de sesión exitoso!");
                autenticado = true;
            } else {
                System.out.println("Usuario o contraseña incorrectos. Intente de nuevo.");
            }
        }

        return autenticado;
    }

    private boolean verificarCredenciales(String usuario, String contrasena) {
        return USERNAME.equals(usuario) && PASSWORD.equals(contrasena);
    }
}
