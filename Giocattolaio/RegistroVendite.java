import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class RegistroVendite {

        double totaleVendite;
        List <Vendita> registro = new ArrayList<>();


        RegistroVendite(double totaleVendite) { // costruttore
            this.totaleVendite = totaleVendite;
        }

        public void aggiungiVendita(Vendita v) { // aggiunge una vendita al registro
            totaleVendite += v.getPrezzo();
            registro.add(v);
        }


        /* --------------------------------
            Rimuovi Vendita
            -nome
            -id
            -vendita
        ---------------------------------*/

        public void rimuoviVendita(Vendita v) { // rimuove una vendita dal registro
            totaleVendite -= v.getPrezzo();
            registro.remove(v);
        }

        public void rimuoviVendita(String nome) { // rimuove una vendita dal registro da nome
            totaleVendite -= v.getPrezzo();

            for (Vendita vendita : registro) {
                if (vendita.getNome().equals(nome) {
                    registro.remove(vendita);
                    break;
                }
            }
        }

        public void rimuoviVendita(String ID) { // rimuove una vendita dal registro da id
            totaleVendite -= v.getPrezzo();

            for (Vendita vendita : registro) {
                if (vendita.getIDGiocattolo().equals(ID) {
                    registro.remove(vendita);
                    break;
                }
            }
        }


        //RITORNA IL REGISTRO
        public List<Vendita> getRegistro() { // restituisce il registro
            return registro;
        }

        public double getTotaleVendite() { // restituisce il totale delle vendite
                return totaleVendite;
        }

        public void visualizza () {
            System.out.println("Visualizza:  ");
                int i = 0;
                for (Vendita v : registro) {
                    System.out.println("Vendita [" + i++ + "]: ");
                    System.out.println("Nome: ");
                    System.out.println(v.getNome());
                    System.out.println("Prezzo: ");
                    System.out.println(v.getPrezzo());
                    System.out.println("Quantità: ");
                    System.out.println(v.getQuantita());
                    System.out.println("Eta consigliata: ");
                    System.out.println(v.getEtaConsigliata());
                    System.out.println("ID Giocattolo: ");
                    System.out.println(v.getIDGiocattolo());
                    System.out.println("Nome cliente: ");
                    System.out.println(v.getNomeCliente());
                    System.out.println("Cognome cliente: ");
                    System.out.println(v.getCognomeCliente());
                    System.out.println("Email: ");
                    System.out.println(v.getEmail());
                    System.out.println("Credito: ");
                    System.out.println(v.getCredito());
                }
        }


        public void accessoRegistroVendite () {
            Scanner input = new Scanner(System.in);
            System.out.println("----     Benvenuto       ----");
            System.out.println("----PANNELLO DI CONTROLLO----")
            System.out.println("Totale vendite: " + totaleVendite);
            System.out.println("1. Visualizza");
            System.out.println("2. Aggiungi Vendita");
            System.out.println("3. Rimuovi Vendita");
            System.out.println("4. Esci");
            int scelta = input.nextInt();

            switch (scelta ) {
                case 1:
                    visualizza();
                    break;
                case 2:
                    System.out.println("ID prodotto: ");
                    String id_giocattolo = input.nextLine();
                    System.out.println("Nome prodotto: ");
                    String nome = input.nextLine();
                    System.out.println("Prezzo: ");
                    double prezzo = input.nextDouble();
                    System.out.println("Quantità: ");
                    int quantita = input.nextInt();
                    System.out.println("Eta consigliata: ");
                    int eta = input.nextInt();
                    System.out.println("Nome Cliente: ");
                    String nomeC = input.nextLine();
                    System.out.println("Cognome Cliente: ");
                    String cognomeC = input.nextLine();
                    System.out.println("ID cliente: ");
                    String idC = input.nextLine();
                    System.out.println("Saldo Cliente: ");
                    double saldoC = input.nextDouble();
                    Cliente c = new Cliente(idC, nomeC, cognome);

                    Vendita v = new Vendita(id_giocattolo, nome, prezzo, quantita);

                    aggiungiVendita(v);
                    break;
                case 3:
                    System.out.println("Scegli il parametro per la rimozione: ");
                    System.out.println("1. ID");
                    System.out.println("2. Nome");
                    if (input.nextInt() == 1) {
                        System.out.println("ID vendita del prodotto da rimuovere: ");
                        String temp_id = input.nextLine();
                        rimuoviVendita(temp_id);
                    } else if (input.nextInt() == 2) {
                        System.out.println("Nome vendita del prodotto da rimuovere: ");
                        String temp_nome = input.nextLine();
                        rimuoviVendita(temp_nome);
                    } else {
                        System.out.println("Scelta non valida");
                    }
                    break;
                case 4:
                    System.out.println("Arrivederci");
                    break;

                case default:
                    System.out.println("Scelta non valida");
                    break;
            }

            scanner.close();
        }
}