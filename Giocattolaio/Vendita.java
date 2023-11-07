public class Vendita extends Giocattolo  {
    Cliente cliente; 

    Vendita(String ID, String nome, double prezzo, int etaminima, Cliente cliente) {
        super(ID, nome,  prezzo, etaminima);
        this.cliente = cliente;
    }

}