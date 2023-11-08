public class Vendita extends Giocattolo  {
    Cliente cliente; 
    int quantitaRichiesta;

    Vendita(String ID, String nome, double prezzo, int etaminima, Cliente cliente, int quantitaRichiesta) {
        super(ID, nome,  prezzo, etaminima);
        this.cliente = cliente;
        this.quantitaRichiesta = quantitaRichiesta;
    }

    getIDCliente() {
        return this.cliente.getID();
    }

    getNomeCliente() {
        return this.cliente.getNome();
    }

    getEmailCliente() {
        return this.cliente.getEmail();
    }

    getQuantitaRichiesta() {
        return this.quantitaRichiesta;
    }

    setQuantitaRichiesta(int quantitaRichiesta) {
        this.quantitaRichiesta = quantitaRichiesta;
    }

}