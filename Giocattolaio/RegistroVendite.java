public abstract RegistroVendite {

        double totaleVendite;
        List <Giocattolo> registro = new ArrayList<>();


        RegistroVendite(double totaleVendite) { // costruttore
            this.totaleVendite = totaleVendite;
        }

        public void aggiungiVendita(Giocattolo g) { // aggiunge una vendita al registro
            totaleVendite += g.getPrezzo();
            registro.add(g);
        }

        public void rimuoviVendita(Giocattolo g) { // rimuove una vendita dal registro
            totaleVendite -= g.getPrezzo();
            registro.remove(g);
        }

        public List<Giocattolo> getRegistro() { // restituisce il registro
            return registro;
        }

        public double getTotaleVendite() { // restituisce il totale delle vendite
                return totaleVendite;
        }
}