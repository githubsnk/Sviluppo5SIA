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
        
        //SCRITTURA SU UN FILE
        try {
        FileWriter fw=new FileWriter("prodotti.csv"); // crea un file di nome prodotti.txt
            fw.write("Pane;3.5;20\n"); // scrive una riga nel file
            fw.write("Pasta;1.60;45\n");
            fw.write("Biscotti;4.70;80\n");
            fw.write("Salame;35;37\n");
            fw.close(); // è importante chiudere il file altrimenti diventa inutilizzabile
            System.out.println("File correttamente creato");
        } catch (IOException e) {
            System.out.println("Si ; verificato un errore in fase di creazione del file");
            e.printStackTrace();
        }        
        
        // LETTURA DA UN FILE
        File f=new File("prodotti.txt");
        String[] dati;
        try {  
            Scanner sc=new Scanner(f); //questo scanner non legge dalla tastiera (system.in) , bensì dal file f
            String riga;
            while (sc.hasNextLine()) { // ripeti finchè ci sono righe da leggere
                riga=sc.nextLine(); // Leggi una riga dal file
                dati=riga.split(";");// divide la stringa in più pezzi usando il  carattere ";" come separatore
                System.out.println("Trovato prodotto: ");
                System.out.println("Nome: "+dati[0]);
                System.out.println("Prezzo: "+dati[1]);
                System.out.println("Quantità "+dati[2]);
                System.out.println("\n");
            }
            sc.close(); // chiudi il file
            System.out.println("Lettura terminata\n");
        } catch (FileNotFoundException e) {
            System.out.println("Si è verificato un errore in fase di lettura!");
            e.printStackTrace();
        }        
    }
}