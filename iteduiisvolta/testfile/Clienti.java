package iteduiisvolta.testfile;
// import java.util.Objects;

// Partendo dall'applicazione vista in classe, creare una classe Cliente contenente i seguenti attributi:
// numero: intero
// nome: stringa
// cognome: stringa
// Creare anche una classe Portfolio contenente un elenco di clienti e i vari metodi carica/salva/aggiungi/elenco

// Nella classe Main aggiungere le voci di menu per gestire i clienti

public class Clienti {
    private int numero;
    private String nome;
    private String cognome;

    public Clienti() {
        super();
    }

    public Clienti(int numero, String nome, String cognome) {
        this.numero = numero;
        this.nome = nome;
        this.cognome = cognome;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Clienti numero(int numero) {
        setNumero(numero);
        return this;
    }

    public Clienti nome(String nome) {
        setNome(nome);
        return this;
    }

    public Clienti cognome(String cognome) {
        setCognome(cognome);
        return this;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if (o == this)
    //         return true;
    //     if (!(o instanceof Clienti)) {
    //         return false;
    //     }
    //     Clienti clienti = (Clienti) o;
    //     return numero == clienti.numero && Objects.equals(nome, clienti.nome) && Objects.equals(cognome, clienti.cognome);
    // }

    // @Override
    // public int hashCode() {
    //     return Objects.hash(numero, nome, cognome);
    // }

    // @Override
    // public String toString() {
    //     return "{" +
    //         " numero='" + getNumero() + "'" +
    //         ", nome='" + getNome() + "'" +
    //         ", cognome='" + getCognome() + "'" +
    //         "}";
    // }
    
}
