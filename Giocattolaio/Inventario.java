public class Inventario{
    Giocattolo v[];
    max_size = 10;

    public Inventario(int spazio) {
        v = new Giocattolo[spazio];
    }

    public void aggiungi(Giocattolo g) {

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

    public void elimina(Giocattolo g) { //elimino il giocattolo
        for (int i = 0; i < v.length; i++) {
            if (v[i] == g) {
                v[i] = null;
                break;
            }
        }
    }

    public void stampaInventario () { //stampo l'inventario
        System.out.println("----- INVENTARIO -----");
        for (int i = 0; i < v.length; i++) {
            System.out.println("NOME: ");
            System.out.println(v[i].nome);
            System.out.println("PREZZO: ");
            System.out.println(v[i].prezzo);
            System.out.println("QUANTITA: ");
            System.out.println(v[i].quantita);
        }
    }

    public void infoGiocattolo (GIocattolo g) { //ricerco il giocattolo
        for (int i = 0; i < v.length; i++) {
            if (v[i] == g) {
                System.out.println("----- RISULTATO RICERCA -----");
                System.out.println("NOME: ");
                System.out.println(v[i].nome);
                System.out.println("PREZZO: ");
                System.out.println(v[i].prezzo);
                System.out.println("QUANTITA: ");
                System.out.println(v[i].quantita);
                break;
            }

            else print("Nessun giocattolo trovato");
        }
    }

    public boolean trovaGiocattolo (GIocattolo g) { //ricerco il giocattolo
        for (int i = 0; i < v.length; i++) {
            if (v[i] == g) {
                return true;
            }
        }
        return false;
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

    public void modificaQuantita(GIocattolo g, int quantita) { //modifico la quantita
        for (int i = 0; i < v.length; i++) {
            if (v[i] == g) {
                v[i].quantita = quantita;
                break;
            }
        }
    }

    public void modificaNome(GIocattolo g, String nome) { //modifico il nome
        for (int i = 0; i < v.length; i++) {
            if (v[i] == g) {
                v[i].nome = nome;
                break;
            }
        }
    }

    public void modificaPrezzo(Giocattolo g, float prezzo) { //modifico il prezzo
        for (int i = 0; i < v.length; i++) {
            if (v[i] == g) {
                v[i].prezzo = prezzo;
                break;
            }
        }
    }

    public void modificaID (GIocattolo g, String id) { //modifico l'id
        for (int i = 0; i < v.length; i++) {
            if (v[i] == g) {
                v[i].id = id;
                break;
            }
        }
    }


    public menu () {

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
                    
                    break;
                case 3:
                    inventario.stampaInventario();
                    break;
                case 4:
                    // Call infoGiocattolo method
                    break;
                case 5:
                    // Call trovaGiocattolo method
                    break;
                case 6:
                    inventario.ordinaPerPrezzo();
                    break;
                case 7:
                    // Call modificaQuantita method
                    break;
                case 8:
                    // Call modificaNome method
                    break;
                case 9:
                    // Call modificaPrezzo method
                    break;
                case 10:
                    // Call modificaID method
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 0 and 10.");
            }
        } while (choice != 0);

        scanner.close();
    }

    }

}