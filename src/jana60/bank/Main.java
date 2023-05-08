package jana60.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        Conto conto = new Conto(nome);

        while (true) {
            System.out.println("1. Versa una somma");
            System.out.println("2. Preleva una somma");
            System.out.println("3. Exit");

            System.out.print("Cosa vuoi fare? ");
            int scelta = scanner.nextInt();

            if (scelta == 1) {
                System.out.print("Quanto vuoi versare? ");
                double importo = scanner.nextDouble();

                if (conto.versa(importo)) {
                    System.out.println("Operazione effettuata con successo.");
                } else {
                    System.out.println("Operazione non valida.");
                }

                System.out.println("Saldo attuale: " + conto.getSaldoFormattato());
            } else if (scelta == 2) {
                System.out.print("Quanto vuoi prelevare? ");
                double importo = scanner.nextDouble();

                if (conto.preleva(importo)) {
                    System.out.println("Operazione effettuata con successo.");
                } else {
                    System.out.println("Operazione non valida.");
                }

                System.out.println("Saldo attuale: " + conto.getSaldoFormattato());
            } else if (scelta == 3) {
            	System.out.println("Arriverderci e scappa.");
                break;
            } else {
                System.out.println("Scelta non valida.");
            }
        }

        scanner.close();
    }
}
