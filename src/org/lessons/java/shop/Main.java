package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto("Maglietta", "Polo di colore Antonio", 100, 22);

        System.out.println("Codice: " + prodotto.getCodice());
        System.out.println("Nome: " + prodotto.getNome());
        System.out.println("Descrizione: " + prodotto.getDescrizione());
        System.out.println("Prezzo base: " + prodotto.getPrezzoBase());
        System.out.println("Prezzo ivato: " + prodotto.getPrezzoIvato());
        System.out.println("Nome esteso: " + prodotto.getNomeEsteso());
        System.out.println("Codice padded: " + prodotto.getCodicePadded());

        prodotto.setNome("Prodotto di esempio (modificato)");
        prodotto.setPrezzo(150.0);

        System.out.println("Nome (dopo la modifica): " + prodotto.getNome());
        System.out.println("Prezzo base (dopo la modifica): " + prodotto.getPrezzoBase());
        System.out.println("Prezzo ivato (dopo la modifica): " + prodotto.getPrezzoIvato());
    }
}
