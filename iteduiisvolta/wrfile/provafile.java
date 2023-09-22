package iteduiisvolta.wrfile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter; // serve per la scrittura
import java.io.IOException; // serve per la scrittura
import java.util.Scanner; // Ctrl+Shift+o per inserire automaticamente l'import


/**
 * Primo file scritto per scopo didattico come esempio pe rla scrittura su file 
 * relativo alla tematica del Database.
 */ 
public class provafile {
    public static void main(String[] args) {
        
        // SCRITTURA SU UN FILE
        // try {
        // FileWriter fw=new FileWriter("prodotti.txt"); // crea un file di nome prodotti.txt
        //     fw.write("Pane\n"); // scrive una riga nel file
        //     fw.write("Pasta\n");
        //     fw.write("Biscotti\n");
        //     fw.write("Salame\n");
        //     fw.close(); // è importante chiudere il file altrimenti diventa inutilizzabile
        //     System.out.println("File correttamente creato");
        // } catch (IOException e) {
        //     System.out.println("Si ; verificato un errore in fase di creazione del file");
        //     e.printStackTrace();
        // }        
        
        // LETTURA DA UN FILE
        File f=new File("prodotti.txt");
        try {  
            Scanner sc=new Scanner(f); //questo scanner non legge dalla tastiera (system.in) , bensì dal file f
            String riga;
            while (sc.hasNextLine()) { // ripeti finchè ci sono righe da leggere
                riga=sc.nextLine(); // Leggi una riga dal file
                System.out.println("Trovato prodotto: "+riga);
            }
            sc.close(); // chiudi il file
            System.out.println("Lettura terminata\n");
        } catch (FileNotFoundException e) {
            System.out.println("Si è verificato un errore in fase di lettura!");
            e.printStackTrace();
        }        
    }
}