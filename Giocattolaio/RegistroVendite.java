public abstract RegistroVendite {

        double totaleVendite;
        List <Vendita> registro = new ArrayList<>();


        RegistroVendite(double totaleVendite) { // costruttore
            this.totaleVendite = totaleVendite;
        }

        public void aggiungiVendita(Vendita v) { // aggiunge una vendita al registro
            totaleVendite += v.getPrezzo();
            registro.add(v);
        }

        public void rimuoviVendita(Vendita v) { // rimuove una vendita dal registro
            totaleVendite -= v.getPrezzo();
            registro.remove(v);
        }

        public List<Vendita> getRegistro() { // restituisce il registro
            return registro;
        }

        public double getTotaleVendite() { // restituisce il totale delle vendite
                return totaleVendite;
        }
}