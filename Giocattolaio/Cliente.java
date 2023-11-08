import java.util.Scanner;


private class Cliente extends Persona {
    String id;
    String email;
    float credito;

    public Cliente(String id, String nome, String cognome, String email, float credito) {
        super(nome, cognome);
        this.id = id;
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

    void menu() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("--- Menu ---");
            System.out.println("1. Visualizza catalogo");
            System.out.println("2. Acquista");
            System.out.println("3. Esci");

            switch (sc.nextInt()) {
                case 1:
                    visualizzaCatalogo();
                    break;
                case 2:
                    compra();
                    break;
                case 3:
                    System.out.println("Arrivederci");
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }
        while(sc.nextInt() != 3);
        sc.close();
    }

    void compra (String nomeGioco, String ID, Inventario inv, RegistroVendite rv) { //aggiungere registro vendite
        Scanner sc = new Scanner(System.in);
        Inventario inv = new Inventario();

        if (inv.trovaGiocattolo(nomeGioco, ID)!= -1) { //trovaGiocattolo restituisce true se il giocattolo è disponibile
            System.out.println("Giocattolo disponibile");
            index = inv.trovaGiocattolo(nomeGioco, ID);
            inv.infoGiocattolo(nomeGioco, ID);
            System.out.println("Vuoi acquistare il giocattolo?");
            System.out.println("1. Si");
            System.out.println("2. No");
            if (sc.nextInt() == 1 && credito >= inv.v[i].getPrezzo()) {
                confermaAcquisto(inv.v[index], inv, rv); //effettua l'acquisto
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