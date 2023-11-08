public Main {
    public static void main(String[] args) {
        RegistroVendite rv = new RegistroVendite();
        Giocattolo g1 = new Giocattolaio("01", "Giocattolo 1", 23.50, 10, 12);
        Giocattolo g2 = new Giocattolaio("02", "Giocattolo 2", 25.50, 10, 12);
        Cliente c1 = new Cliente("01", "Michael", "Jordan", "nome.cognome@gmail.com", 110);
        Cliente c2 = new Cliente("02", "Lebron", "James", "nome.cognome2@gmail.com", 150);

        Inventario inv = new Inventario();
        inv.aggiungi(g1);
        inv.aggiungi(g2);

        inv.stampaInventario();
        inv.ordinaPerPrezzo();

        c1.acquista(g1, inv, rv);
        c1.acquista(g2, inv, rv);

        List <Vendita> vendite = rv.getRegistro();

        for (Vendita v : vendite) {
            System.out.println("NOME: ");
            System.out.println(v.getNome());
            System.out.println("PREZZO: ");
            System.out.println(v.getPrezzo());
            System.out.println("ID Giocattolo: ");
            System.out.println(v.getIDGiocattolo());
            System.out.println("ID Cliente: ");
            System.out.println(v.getIDCliente());
            System.out.println("Email: ");
            System.out.println(v.getEmailCliente());
            System.out.println("Quantita: ");
            System.out.println(v.getQuantita());

        }
    }
}