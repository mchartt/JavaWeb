import java.util.Scanner;


public class CLiente {
    String id;
    String nome;
    String cognome;
    String email;
    float credito;


    void compra (Giocattolo g, Inventario inv) { //aggiungere registro vendite
        Scanner sc = new Scanner(System.in);
        Inventario inv = new Inventario();

        if (inv.trovaGiocattolo(g)) { //trovaGiocattolo restituisce true se il giocattolo è disponibile
            System.out.println("Giocattolo disponibile");
            inv.infoGiocattolo(g);
            System.out.println("Vuoi acquistare il giocattolo?");
            System.out.println("1. Si");
            System.out.println("2. No");
            if (sc.nextInt() == 1 && credito >= g.getPrezzo()) {
                confermaAcquisto(g); //effettua l'acquisto
                System.out.println("Giocattolo acquistato");
            }

            else {
                System.out.println("Acquisto annullato");
            }

        } else {
            System.out.println("Giocattolo non disponibile");
        }
    }

    void confermaAcquisto (Giocattolo g, Inventario inv, RegistroVendite rv) { //aggiungere registro vendite
        g.setQuantita(g.getQuantita() - 1);
        if g.getQuantita() == 0 {
            inv.eliminaGiocattolo(g);
            credito -= g.getPrezzo();
            rv.aggiungiVendita(g);
        }
        System.out.println("Acquisto effettuato");
    }


    void visualizzaCatalogo(Inventario inv ) {
        inv.stampaInventario();
    }
}