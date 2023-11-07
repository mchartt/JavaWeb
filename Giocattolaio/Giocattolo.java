private class Giocattolo {
    String ID;
    String nome;
    float prezzo;
    int etaconsigliata;

    Giocattolo (String ID, String nome, float prezzo, int etaconsigliata) {
        this.ID = ID;
        this.nome = nome;
        this.prezzo = prezzo;
        this.etaconsigliata = etaconsigliata;
    }

    getID() {
        return this.ID;
    }

    getNome() {
        return this.nome;
    }

    getPrezzo() {
        return this.prezzo;
    }

    getEtaconsigliata() {
        return this.etaconsigliata;
    }

    setID(String ID) {
        this.ID = ID;
    }

    setNome(String nome) {
        this.nome = nome;
    }

    setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    setEtaconsigliata(int etaconsigliata) {
        this.etaconsigliata = etaconsigliata;
    }
}