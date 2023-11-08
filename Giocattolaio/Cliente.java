import java.util.Scanner;


private class Cliente {
    String id;
    String nome;
    String cognome;
    String email;
    float credito;

    public Cliente(String id, String nome, String cognome, String email, float credito) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.credito = credito;
    }


    String getID() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    String getCognome() {
        return cognome;
    }

    void setCognome(String cognome) {
        this.cognome = cognome;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    float getCredito() {
        return credito;
    }

    void setCredito(float credito) {
        this.credito = credito;
    }
    void compra (Giocattolo g, Inventario inv, RegistroVendite rv) { //aggiungere registro vendite
        Scanner sc = new Scanner(System.in);
        Inventario inv = new Inventario();

        if (inv.trovaGiocattolo(g)) { //trovaGiocattolo restituisce true se il giocattolo è disponibile
            System.out.println("Giocattolo disponibile");
            inv.infoGiocattolo(g);
            System.out.println("Vuoi acquistare il giocattolo?");
            System.out.println("1. Si");
            System.out.println("2. No");
            if (sc.nextInt() == 1 && credito >= g.getPrezzo()) {
                confermaAcquisto(g, inv, rv); //effettua l'acquisto
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