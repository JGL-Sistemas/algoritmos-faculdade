/*
 * Condicionais em Java
 */
package javacaelum;

/**
 *
 * @author Dieisson Martins
 */
public class Condicoes {

    public static void main(String[] args) {

        //IF
        int idade = 17;
        boolean AmigoDoDono = true;

        if (idade >= 18 && AmigoDoDono == true) {

            System.out.println("Pode Entrar.");
        } else if (idade >= 18 && AmigoDoDono == false) {

            System.out.println("Pode Entrar.");
        } else if (AmigoDoDono == true) {

            System.out.println("Pode Entrar.");
        } else {

            System.out.println("Nâo pode Entrar.");
        }
    }
}
