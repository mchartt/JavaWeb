public class Inventario {
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

    public void toString () { //stampo l'inventario
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

    public void trovaGiocattolo (GIocattolo g) { //ricerco il giocattolo
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

    public void modificaPrezzo(GIocattolo g, float prezzo) { //modifico il prezzo
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

}