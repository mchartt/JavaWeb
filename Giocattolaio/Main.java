public Main {
    public static void main(String[] args) {
        Giocattolo g1 = new Giocattolaio("01", "Giocattolo 1", 23.50, 12);
        Giocattolo g2 = new Giocattolaio("02", "Giocattolo 2", 25.50, 12);
        Cliente c1 = new Cliente("01", "Michael", "Jordan", "nome.cognome@gmail.com", 110);
        Cliente c2 = new Cliente("02", "Lebron", "James", "nome.cognome2@gmail.com", 150);

        Inventario inv = new Inventario();
        inv.aggiungi(g1);
        inv.aggiungi(g2);

    }
}