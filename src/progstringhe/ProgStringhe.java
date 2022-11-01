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
        strTemp = str1.toLowerCase();
        System.out.println("Mi dia la seconda stringa");
        str2 = input.nextLine();
        str2 = str2.toLowerCase();

        //Il gatto sopra il gatto salta sul cane che mangia un cane.
        //+ (str1.length()-strTemp.length() )
        do {
            posizione[i] = (strTemp.indexOf(str2)) + (str1.length()-strTemp.length() ); //0
            posTemp = strTemp.indexOf(str2) + str2.length();  // PosTemp = 0 + 4
            strTemp = strTemp.substring(posTemp); //staffa raffa willy  CIAO
            i++;
        } while (strTemp.contains(str2));
        
        System.out.println("La parola: " + str2 + " è stata individuata nei punti: ");
        for (int j = 0; j < i; j++) {
            System.out.print(posizione[j] + " ");
        }
        //**************************************************************************
        String strArray[];
        strArray = new String[10];
        int max = -2,posI = 0;
        for (i=0; i < 10; i++) {
            System.out.println("Dammi stringa n." + (i + 1));
            strArray[i] = input.nextLine();
        }
        for (i=0; i < 10; i++) {
            if (strArray[i].length() > max) {
                max = strArray[i].length();
                posI = i;
            }
        }
        
        System.out.println("La stringa più lunga è " + strArray[posI] + " Lunga: " + max);
        //Permettere all'utente di inserire 10 testi in un array 
        //di stringhe e visualizzare quella di lunghezza maggiore
    }
    
    
    
    
    
    
    
    
    
}
