import java.util.Scanner;
public class Admin extends Utente {

    private String tipo;
    private Inventario inv;

    public Admin(String nome, String cognome, Inventario inv) {
        super(nome, cognome);
        this.tipo = "Admin";
        this.inv = inv;
    }

    public void menu () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Benvenuto " + this.getNome() + " " + this.getCognome());
        System.out.println("--- MENU ---")
        int choice;
        do {
            System.out.println("Scegli una delle seguenti opzioni");
            System.out.println("1. Visualizza inventario");
            System.out.println("2. Visualizza Vendite");
            System.out.println("0. Esci");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    inv.visualizzaInventario();
                    break;
                case 2:
                    inv.visualizzaVendite();
                    break;
                case 0:
                    System.out.println("Arrivederci");
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }

        } while (choice != 0);
        sc.close();
    }

}
