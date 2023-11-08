private class Giocattolo {
    String id_giocattolo;
    String nome;
    float prezzo;
    int quantita
    int etaconsigliata;

    Giocattolo (String ID, String nome, float prezzo, int etaconsigliata) {
        this.id_giocattolo = ID;
        this.nome = nome;
        this.prezzo = prezzo;
        this.etaconsigliata = etaconsigliata;
    }

    getIDGiocattolo() {
        return this.id_giocattolo;
    }

    getNome() {
        return this.nome;
    }

    getPrezzo() {
        return this.prezzo;
    }

    getQuantita() {
        return this.quantita;
    }

    getEtaconsigliata() {
        return this.etaconsigliata;
    }


    setIDGiocattolo(String ID) {
        this.id_giocattolo = id_giocattolo;
    }

    setNome(String nome) {
        this.nome = nome;
    }

    setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    setQuantita(int quantita) {
        this.quantita = quantita;
    }

    setEtaConsigliata(int etaconsigliata) {
        this.etaconsigliata = etaconsigliata;
    }

}