/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progstringhe;

/**
 *
 * @author gabriel.ricaldone
 */
import java.util.Scanner;
public class ProgStringhe {
    
    /*- Permettere all'utente di inserire una stringa contenente un testo e un'altra stringa contenente
    altro testo da cercare.
    Trovare tutte le occorrenze della seconda stringa nella prima stringa e collocarle in un array
    di interi dove venga indicata la posizione in cui è stata trovata.
    - Permettere all'utente di inserire 10 testi in un array di stringhe e visualizzare quella di lunghezza maggiore. */
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int posizione[],i = 0,posTemp = 0;
        posizione = new int[500];
        
        Scanner input = new Scanner(System.in);
        String str1, str2,strTemp;
        
        System.out.println("Mi dia la prima stringa");
        str1 = input.nextLine();
        System.out.println("Mi dia la seconda stringa");
        str2 = input.nextLine();

        do {
            strTemp = str1.substring(posTemp); //staffa raffa willy  CIAO
            posizione[i] = strTemp.indexOf(str2); //0
            posTemp = posizione[i] + str2.length();  // PosTemp = 0 + 4
            i++;
        } while (strTemp.contains(str2));
        
    }
    
    
    
    
    
    
    
    
    
}
