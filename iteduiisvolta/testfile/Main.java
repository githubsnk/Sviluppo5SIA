package iteduiisvolta.testfile;

import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String risp;
        Negozio n=new Negozio();
        Portfolio pf=new Portfolio();

        do {
            System.out.println("\n \n \n \n \n \n \n");
            System.out.println("Gestione Prodotti\n");
            System.out.println("1 - Visualizza prodotti");
            System.out.println("2 - carica prodotti");
            System.out.println("3 - salva prodotti");
            System.out.println("4 - aggiungi prodotto");
            System.out.println("5 - Visualizza clienti");
            System.out.println("6 - carica clienti");
            System.out.println("7 - salva cliente");
            System.out.println("8 - aggiungi cliente");
            System.out.println("\n - esci");
            System.out.println("inserisci la tua scelta: ");
            risp=sc.nextLine();
            switch (risp) {
                case "1":
                    for (Prodotto p : n.elencoProdotti()) {
                        System.out.println("prodotto: "+p.getDescrizione());
                        System.out.println("prezzo: "+p.getPrezzo());
                        System.out.println("Quantità: "+p.getQuantità()+"\n");
                        // n.elencoProdotti=null; // non si può fare!! perchè gestita come Iterable nella classe Negozio
                    }
                    break;
                case "2":
                    n.carica("prodotti.csv");
                    break;
                case "3":
                    n.salva("prodotti.csv");
                    break;
                case "4":
                    Prodotto nuovoProd=new Prodotto();
                    System.out.println("Inserire nome : ");
                    nuovoProd.setDescrizione(sc.nextLine());
                    System.out.println("inserisci il prezzo: ");
                    nuovoProd.setPrezzo(Double.parseDouble(sc.nextLine()));
                    System.out.println("inserisci la quantità: ");
                    nuovoProd.setQuantità(Integer.parseInt(sc.nextLine()));
                    n.aggiungiProdotto(nuovoProd);
                    break;
                case "5":
                    for (Clienti c : pf.elencoClienti()) {
                        System.out.println("numero: "+c.getNumero());
                        System.out.println("nome: "+c.getNome());
                        System.out.println("cognome: "+c.getCognome()+"\n");
                        // p.elencoClienti=null; // non si può fare!! perchè gestita come Iterable nella classe Portfolio
                    }
                    break;
                case "6":
                    pf.carica("Clienti.csv");
                    break;
                case "7":
                     pf.salva("Clienti.csv");
                    break;
                case "8":
                    Clienti nuovoCliente=new Clienti();
                    System.out.println("Inserire numero cliente: ");
                    nuovoCliente.setNumero(Integer.parseInt(sc.nextLine()));
                    System.out.println("inserisci nome: ");
                    nuovoCliente.setNome(sc.nextLine());
                    System.out.println("inserisci cognome: ");
                    nuovoCliente.setCognome(sc.nextLine());
                    pf.aggiungiCliente(nuovoCliente);
                    break;
                case "9":
                    System.out.println("Arrivederci!");
                    break;
                default:
                    System.err.println("Scelta non valida, riprovare.");
                    System.out.println("premi enter per continuare...");
                    sc.nextLine();
            }
        } while (!risp.equals("9"));
    }
    
}