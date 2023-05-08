package jana60.bank;

import java.util.Random;

public class Conto {
    private final int numeroConto;
    private String nomeProprietario;
    private double saldo;

    public Conto(String nomeProprietario) {
        this.numeroConto = new Random().nextInt(1000) + 1;
        this.nomeProprietario = nomeProprietario;
        this.saldo = 0;
    }

    public int getNumeroConto() {
        return this.numeroConto;
    }

    public String getNomeProprietario() {
        return this.nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean versa(double importo) {
        if (importo > 0) {
            this.saldo += importo;
            return true;
        } else {
            return false;
        }
    }

    public boolean preleva(double importo) {
        if (importo > 0 && this.saldo - importo >= 0) {
            this.saldo -= importo;
            return true;
        } else {
            return false;
        }
    }

    public String getInfoConto() {
        return "Numero conto: " + this.numeroConto + ", Proprietario: " + this.nomeProprietario;
    }

    public String getSaldoFormattato() {
        return String.format("%.2f", this.saldo) + "€";
    }
}
