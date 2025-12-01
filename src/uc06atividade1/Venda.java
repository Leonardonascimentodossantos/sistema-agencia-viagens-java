package uc06atividade1;

public class Venda {
    public String cliente;
    public String pagamento;
    public PacoteDeViagem pacote;
    public double total;
    public double dolar;

    public Venda(String cliente, String pagamento, PacoteDeViagem pacote, double total, double dolar) {
        this.cliente = cliente;
        this.pagamento = pagamento;
        this.pacote = pacote;
        this.total = total;
        this.dolar = dolar;
    }
    
    public double calcularValorReais(double totalDolares, double cotacao) {
        return totalDolares * cotacao;
    }
    
    public void mostrarValores(double totalDolares, double cotacao){
        System.out.println("Total em dólares: US$ " + totalDolares);
        System.out.println("Total em Reais: R$ " + calcularValorReais(totalDolares, cotacao));
    }
}
