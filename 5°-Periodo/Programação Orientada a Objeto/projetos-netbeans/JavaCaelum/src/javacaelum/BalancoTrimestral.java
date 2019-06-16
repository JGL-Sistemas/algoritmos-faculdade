/*
 * Programa calcula gasto trimestral e imprime valor
 */
package javacaelum;

/**
 *
 * @author Dieisson Martins
 */
public class BalancoTrimestral {

    public static void main(String[] args) {

        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        float gastosMedia = (gastosJaneiro + gastosFevereiro + gastosMarco) / 3;

        System.out.println("Total de gastos foi: " + gastosTrimestre);

        System.out.println("Media de gastos foi: " + gastosMedia);
    }
}
