package iteduiisvolta.testfile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Portfolio {
    private ArrayList <Clienti> elencoClienti=new ArrayList<Clienti>();

    public void aggiungiCliente(Clienti c) {		
			elencoClienti.add(c);
	}

    public void salva(String nomeFile) {
		//*****  SCRITTURA SU UN FILE *****
		try {
			FileWriter fw=new FileWriter(nomeFile);	//crea un file di nome clienti.txt
			for(Clienti c:elencoClienti)
				fw.write(	//scrivo una riga di clienti per ogni elemento della lista
					c.getNumero()+";"+
					c.getNome()+";"+
					c.getCognome()+"\n"
					);			
			fw.close();					//chiude il file	
			System.out.println("File correttamente creato");
		} catch (IOException e) {
			System.out.println("Si è verificato un errore in fase di creazione file!");
			e.printStackTrace();
		}
	}

    public void carica(String nomeFile) {
		//*****  LETTURA DA UN FILE *****
		File f=new File(nomeFile);
		String[] dati;
		try {
			Scanner sc=new Scanner(f);		//questo scanner non legge dalla tastiera, bensì dal file f
			String riga;
			while (sc.hasNextLine()) { //ripeti finché ci sono righe da leggere
				riga=sc.nextLine();		//leggi una riga dal file
				dati=riga.split(";");	//divide la stringa in più pezzi usando il carattere ";" come separatore
				Clienti c=new Clienti();
				c.setNumero(Integer.parseInt(dati[0]));
				c.setNome((dati[1]));
				c.setCognome((dati[2]));
				elencoClienti.add(c);		//aggiungo il cliente alla lista
			}
			sc.close();  //chiudi il file
			System.out.println("\n\nLettura terminata.");
		} catch (FileNotFoundException e) {
			System.out.println("Si è verificato un errore in fase di lettura!"); 
			e.printStackTrace();
		}
	}

    public Iterable<Clienti> elencoClienti (){ // restituisce una versione in sola lettura (Iterable) della lista
		return this.elencoClienti;
	}

}
