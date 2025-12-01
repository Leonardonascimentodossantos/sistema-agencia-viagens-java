package uc06atividade1;

public class PacoteDeViagem {
    public Transporte transporte;
    public Hospedagem hospedagem;
    public String destino;
    public int dias;

    public PacoteDeViagem(Transporte transporte, Hospedagem hospedagem, String destino, int dias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.dias = dias;
    }
    
    public double calcularValorHospedagem() {
        return dias * hospedagem.valor;
    }
    
    public double calcularValorLucro(double valor, double percentual) {
        return valor + (valor * percentual / 100);
    }
    
    public double calcularValorTotal(double taxas, double percentual) {
        double subtotal = transporte.valor + calcularValorHospedagem() + taxas;
        return calcularValorLucro(subtotal, percentual);
    }
}
