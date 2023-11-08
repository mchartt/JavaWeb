import java.util.*;

public class Inventario{
    Giocattolo v[];
    max_size = 10;
    int count = 0;

    public Inventario(int spazio) {
        v = new Giocattolo[spazio];
    }

    public void aggiungi(Giocattolo g) { //aggiungo il giocattolo
        for (int i = 0; i < v.length; i++) { //controllo che l'inventario non sia pieno
            if (v[i] != null) count++; //conto
        }

        if (count < max_size) { //se l'inventario non è pieno aggiungo il giocattolo
            for (int i = 0; i < v.length; i++) {
                if (v[i] == null) {
                    v[i] = g;
                    break;
                }
            }
        }
        else System.out.println("Inventario pieno");
    }

    public void elimina(String nome, String ID) { //elimino il giocattolo
        check = false;
        for (int i = 0; i < v.length; i++) {
            if (v[i].getNome().isEquals(nome) && v[i].getID().isEquals(ID)) {
                v[i] = null;
                System.out.println("Giocattolo eliminato");
                break;
            }
        }
        if (!check) System.out.println("Giocattolo non trovato");
    }

    public void stampaInventario () { //stampo l'inventario
        System.out.println("----- INVENTARIO -----");
        for (int i = 0; i < v.length; i++) {
            System.out.println("NOME: ");
            System.out.println(v[i].getNome());
            System.out.println("PREZZO: ");
            System.out.println(v[i].getPrezzo());
            System.out.println("QUANTITA: ");
            System.out.println(v[i].getQuantita());
            System.out.println("ID: ");
            System.out.println(v[i].getID());
            System.out.println("ETA CONSIGLIATA: ");
            System.out.println(v[i].getEtaConsigliata());
        }
        System.out.println("----- FINE INVENTARIO -----");
    }

    public void infoGiocattolo (String nome, String ID) { //ricerco il giocattolo
        for (int i = 0; i < v.length; i++) {
            if (v[i].getNome().isEquals(nome) && v[i].getID().isEquals(ID)){
                System.out.println("----- RISULTATO RICERCA -----");
                System.out.println("NOME: ");
                System.out.println(v[i].getNome());
                System.out.println("PREZZO: ");
                System.out.println(v[i].getPrezzo());
                System.out.println("QUANTITA: ");
                System.out.println(v[i].getQuantita());
                System.out.println("ID: ");
                System.out.println(v[i].getID());
                System.out.println("ETA CONSIGLIATA: ");
                System.out.println(v[i].getEtaConsigliata());
                System.out.println("----- FINE RISULTATO RICERCA -----");
                break;
            }
            else print("Nessun giocattolo trovato");
        }
    }

    public int trovaGiocattolo (String nome, String ID) { //ricerco il giocattolo
        for (int i = 0; i < v.length; i++) {
            if (v[i].getNome().isEquals(nome) && v[i].getID().isEquals(ID)) {
                return i;
            }
        }
        return -1;
    }

    public void modificaQuantita(String nome, String ID,int quantita) { //modifico la quantita
    if (trovaGiocattolo(nome, ID) != -1) {
        index = trovaGiocattolo(nome, ID);
        v[index].setQuantita() = quantita;
    } 
    else System.out.println("Giocattolo non trovato");
    }

    public void modificaNome(String nome, String ID, String nome2) { //modifico il nome
        if (trovaGiocattolo(nome, ID) != -1) {
        index = trovaGiocattolo(nome, ID);
        v[i].setNome() = nome2;
        }
        else System.out.println("Giocattolo non trovato");
    }

    public void modificaPrezzo(String nome, String ID, float prezzo) { //modifico il prezzo
        if (trovaGiocattolo(nome, ID) != -1) {
        index = trovaGiocattolo(nome, ID);
        v[i].setPrezzo() = prezzo;
        }
        else System.out.println("Giocattolo non trovato");
    } 

    public void modificaID (String nome, String ID, String nuovoID) { //modifico l'id
        if (trovaGiocattolo(nome, ID) != -1) {
        index = trovaGiocattolo(nome, ID);
        v[i].setID() = nuovoID;
        }
        else System.out.println("Giocattolo non trovato");
    }

    public void modificaEtaConsigliata (String nome, String ID, int etaconsigliata) { //modifico l'eta consigliata
        if (trovaGiocattolo(nome, ID) != -1) {
        index = trovaGiocattolo(nome, ID);
        v[i].setEtaConsigliata() = etaconsigliata;
        }
        else System.out.println("Giocattolo non trovato");
    }

    public void ordinaPerPrezzo () { //ordino l'inventario per prezzo
        Giocattolo temp;
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - 1; j++) {
                if (v[j].prezzo > v[j+1].prezzo) {
                    temp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = temp;
                }
            }
        }
    }


    public void accessoInventario () {

        Inventario inventario = new Inventario(10);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Aggiungi giocattolo");
            System.out.println("2. Elimina giocattolo");
            System.out.println("3. Stampa inventario");
            System.out.println("4. Info giocattolo");
            System.out.println("5. Trova giocattolo");
            System.out.println("6. Ordina per prezzo");
            System.out.println("7. Modifica quantita");
            System.out.println("8. Modifica nome");
            System.out.println("9. Modifica prezzo");
            System.out.println("10. Modifica ID");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Inserisci il nome del giocattolo:");
                    String nome = scanner.next();
                    System.out.println("Inserisci il prezzo del giocattolo:");
                    float prezzo = scanner.nextFloat();
                    System.out.println("Inserisci la quantita del giocattolo:");
                    int quantita = scanner.nextInt();
                    System.out.println("Inserisci l'id del giocattolo:");
                    String id = scanner.next();
                    System.out.println("Inserisci eta consigliata");
                    int etaconsigliata = scanner.nextInt();

                    Giocattolo g = new Giocattolo(nome, prezzo, quantita, id, etaconsigliata);  // Creo un nuovo giocattolo
                    break;

                case 2:
                    System.out.println("Inserisci il nome del giocattolo da eliminare:");
                    String nome_temp = scanner.next();
                    System.out.println("Inserisci l'id del giocattolo da eliminare:");
                    String id_temp = scanner.next();
                    elimina(nome_temp, id_temp);

                    break;
                case 3:
                    stampaInventario();
                    break;
                case 4:
                    System.out.println("Inserisci il nome del giocattolo da cercare:");
                    String nome_temp2 = scanner.next();
                    System.out.println("Inserisci l'id del giocattolo da cercare:");
                    String id_temp2 = scanner.next();
                    infoGiocattolo(nome_temp2, id_temp2);
                    break;
                case 5:
                    System.out.println("Inserisci il nome del giocattolo da cercare:");
                    String nome_temp3 = scanner.next();
                    System.out.println("Inserisci l'id del giocattolo da cercare:");
                    String id_temp3 = scanner.next();
                    System.out.println("Giocattolo trovato, posizione [" + trovaGiocattolo(nome_temp3, id_temp3) + "]: ");
                    break;
                case 6:
                    // Call ordinaPerPrezzo method
                    System.out.println("Inventario ordinato per prezzo. ");
                    ordinaPerPrezzo();
                    break;
                case 7:
                    System.out.println("Inserisci il nome del giocattolo da modificare:");
                    String nome_temp4 = scanner.next();
                    System.out.println("Inserisci l'id del giocattolo da modificare:");
                    String id_temp4 = scanner.next();
                    System.out.println("Inserisci la quantita del giocattolo da modificare:");
                    int quantita_temp = scanner.nextInt();
                    modificaQuantita(nome_temp4, id_temp4, quantita_temp);
                    break;
                case 8:
                    System.out.println("Inserisci il nome del giocattolo da modificare:");
                    String nome_temp5 = scanner.next();
                    System.out.println("Inserisci l'id del giocattolo da modificare:");
                    String id_temp5 = scanner.next();
                    System.out.println("Inserisci il nuovo nome del giocattolo:");
                    String nome_temp6 = scanner.next();
                    modificaNome(nome_temp5, id_temp5, nome_temp6);
                    break;
                case 9:
                    System.out.println("Inserisci il nome del giocattolo da modificare:");
                    String nome_temp7 = scanner.next();
                    System.out.println("Inserisci l'id del giocattolo da modificare:");
                    String id_temp7 = scanner.next();
                    System.out.println("Inserisci il nuovo prezzo del giocattolo:");
                    float prezzo_temp = scanner.nextFloat();
                    modificaPrezzo(nome_temp7, id_temp7, prezzo_temp);
                    break;
                case 10:
                    System.out.println("Inserisci il nome del giocattolo da modificare:");
                    String nome_temp8 = scanner.next();
                    System.out.println("Inserisci l'id del giocattolo da modificare:");
                    String id_temp8 = scanner.next();
                    System.out.println("Inserisci il nuovo id del giocattolo:");
                    String id_temp9 = scanner.next();
                    modificaID(nome_temp8, id_temp8, id_temp9);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        } while (choice != 0);

        scanner.close();
    }
}