/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;
import javax.swing.JOptionPane;
/**
 *
 * @author Teemo
 */
public class Exerciciorepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int n, s = 0;
    int p = 0;
    int imp = 0;
    int mediana = 0;
    int cienes = 0;

        do {
    n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um numero: <em>(valor 0 interrompe)</em> </html>"));
    //*******
     s += n;
    //*******
    if (n % 2 == 0) {
     p += 1;
    } else {
     imp += 1;
    }
    //*******
    if (n > 100) {
     cienes += 1;
    }
    //*******
        } while (n != 0);
    
    p = p - 1; // correcao pq o 0 que é usado na hora de fechar o programa é considerado um numero par pelo mesmo.
        
    
    JOptionPane.showMessageDialog(null, "<html>Resultado Final <hr>" +
                "<br>Somatorio vale " + s +
                "<br>Numero de pares: " + p + 
                "<br>Numero de impares: " + imp + 
                "<br>Numeros maior a cem " + cienes + "</html>");
    }
}


         