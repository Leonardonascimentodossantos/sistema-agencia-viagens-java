package uc06atividade1;
/*
- Colocar a quantidade de dias no resumo da venda e na venda;
- Consertar quando se digita uma opção inválida na escolha de destino.*/
import java.util.ArrayList;
import java.util.Scanner;

public class UC06Atividade1 {
    public static void main(String[] args) {
        String opcao, destino, transporte, hospedagem, efetuarVenda;
        Transporte transporteEscolhido = null;
        Hospedagem hospedagemEscolhida = null;
        double dolar;
        
        ArrayList<Venda> vendas = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);
        
        //Valores em dólares (US$). US$ 1,00 = R$ 5,32.
        //Transporte intermunicipal:
        Transporte t11 = new Transporte("Ônibus", 15);
        Transporte t12 = new Transporte("Avião", 30);
        Transporte t13 = new Transporte("Cruzeiro", 240);
        //Transporte interestadual:
        Transporte t21 = new Transporte("Ônibus", 70);
        Transporte t22 = new Transporte("Avião", 250);
        Transporte t23 = new Transporte("Cruzeiro", 1220);
        //Transporte internacional:
        Transporte t31 = new Transporte("Ônibus", 125);
        Transporte t32 = new Transporte("Avião", 740);
        Transporte t33 = new Transporte("Cruzeiro", 1900);
        
        //Hospedagem intermunicipal:
        Hospedagem h11 = new Hospedagem ("Econômica", 15);
        Hospedagem h12 = new Hospedagem ("Conforto", 35);
        Hospedagem h13 = new Hospedagem ("Luxo", 120);
        //Hospedagem interestadual:
        Hospedagem h21 = new Hospedagem ("Econômica", 35);
        Hospedagem h22 = new Hospedagem ("Conforto", 75);
        Hospedagem h23 = new Hospedagem ("Luxo", 180);
        //Hospedagem internacional:
        Hospedagem h31 = new Hospedagem ("Econômica", 50);
        Hospedagem h32 = new Hospedagem ("Conforto", 115);
        Hospedagem h33 = new Hospedagem ("Luxo", 300);
        
        //Ínicio do programa
        do {
            System.out.println("\n---Agência de Viagens---");
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Escolher pacote");
            System.out.println("2 - Mostrar lista de vendas");
            System.out.println("0 - Sair");
            System.out.println("Opção: ");
            opcao = entrada.nextLine();
            //Seleção das opções para montagem do pacote
            if (opcao.equals("1")) {
                System.out.println("Antes de começar, informe a cotação do dólar em relação ao real hoje: ");
                dolar = entrada.nextDouble();
                entrada.nextLine();
                // 🔹 Reinicia as escolhas da venda ANTES de perguntar o destino
                transporteEscolhido = null;
                hospedagemEscolhida = null;
                //Seleção de destino
                System.out.println("\nEscolha o destino: ");
                System.out.println("1 - Intermunicipal");
                System.out.println("2 - Interestadual");
                System.out.println("3 - Internacional");
                System.out.println("Opção de destino: ");
                destino = entrada.nextLine();
                //Seleção de transporte e hospedagem
                switch (destino) {
                    case "1":
                        //Transporte
                        do {
                            System.out.println("\nEscolha o transporte: ");
                            System.out.println("1 - " + t11.tipo + " R$ " + t11.valor * dolar);
                            System.out.println("2 - " + t12.tipo + " R$ " + t12.valor * dolar);
                            System.out.println("3 - " + t13.tipo + " R$ " + t13.valor * dolar);
                            System.out.println("Opção de transporte desejada: ");
                            transporte = entrada.nextLine();
                            if (!transporte.equals("1") && !transporte.equals("2") && !transporte.equals("3")){
                                System.out.println("Opção inválida!");
                            } else {
                                switch (transporte) {
                                    case "1": transporteEscolhido = t11; break;
                                    case "2": transporteEscolhido = t12; break;
                                    case "3": transporteEscolhido = t13; break;
                                }
                            }
                        } while (!transporte.equals("1") && !transporte.equals("2") && !transporte.equals("3"));
                        //Hospedagem
                        do {
                            System.out.println("\nEscolha a hospedagem: ");
                            System.out.println("1 - " + h11.tipo + " R$ " + h11.valor * dolar);
                            System.out.println("2 - " + h12.tipo + " R$ " + h12.valor * dolar);
                            System.out.println("3 - " + h13.tipo + " R$ " + h13.valor * dolar);
                            System.out.println("Opção de hospedagem desejada: ");
                            hospedagem = entrada.nextLine();
                            if (!hospedagem.equals("1") && !hospedagem.equals("2") && !hospedagem.equals("3")){
                                System.out.println("Opção inválida!");
                            } else {
                                switch (hospedagem) {
                                    case "1": hospedagemEscolhida = h11; break;
                                    case "2": hospedagemEscolhida = h12; break;
                                    case "3": hospedagemEscolhida = h13; break;
                                }
                            }
                        } while (!hospedagem.equals("1") && !hospedagem.equals("2") && !hospedagem.equals("3"));
                        break;
                    case "2":
                        do {
                            System.out.println("\nEscolha o transporte: ");
                            System.out.println("1 - " + t21.tipo + " R$ " + t21.valor * dolar);
                            System.out.println("2 - " + t22.tipo + " R$ " + t22.valor * dolar);
                            System.out.println("3 - " + t23.tipo + " R$ " + t23.valor * dolar);
                            System.out.println("Opção de transporte desejada: ");
                            transporte = entrada.nextLine();
                            if (!transporte.equals("1") && !transporte.equals("2") && !transporte.equals("3")){
                                System.out.println("Opção inválida!");
                            } else {
                                switch (transporte) {
                                    case "1": transporteEscolhido = t21; break;
                                    case "2": transporteEscolhido = t22; break;
                                    case "3": transporteEscolhido = t23; break;
                                }
                            }
                        } while (!transporte.equals("1") && !transporte.equals("2") && !transporte.equals("3"));
                        //Hospedagem
                        do {
                            System.out.println("\nEscolha a hospedagem: ");
                            System.out.println("1 - " + h21.tipo + " R$ " + h21.valor * dolar);
                            System.out.println("2 - " + h22.tipo + " R$ " + h22.valor * dolar);
                            System.out.println("3 - " + h23.tipo + " R$ " + h23.valor * dolar);
                            System.out.println("Opção de hospedagem desejada: ");
                            hospedagem = entrada.nextLine();
                            if (!hospedagem.equals("1") && !hospedagem.equals("2") && !hospedagem.equals("3")){
                                System.out.println("Opção inválida!");
                            } else {
                                switch (hospedagem) {
                                    case "1": hospedagemEscolhida = h21; break;
                                    case "2": hospedagemEscolhida = h22; break;
                                    case "3": hospedagemEscolhida = h23; break;
                                }
                            }
                        } while (!hospedagem.equals("1") && !hospedagem.equals("2") && !hospedagem.equals("3"));
                        break;
                    case "3":
                        do {
                            System.out.println("\nEscolha o transporte: ");
                            System.out.println("1 - " + t31.tipo + " R$ " + t31.valor * dolar);
                            System.out.println("2 - " + t32.tipo + " R$ " + t32.valor * dolar);
                            System.out.println("3 - " + t33.tipo + " R$ " + t33.valor * dolar);
                            System.out.println("Opção de transporte desejada: ");
                            transporte = entrada.nextLine();
                            if (!transporte.equals("1") && !transporte.equals("2") && !transporte.equals("3")){
                                System.out.println("Opção inválida!");
                            } else {
                                switch (transporte) {
                                    case "1": transporteEscolhido = t31; break;
                                    case "2": transporteEscolhido = t32; break;
                                    case "3": transporteEscolhido = t33; break;
                                }
                            }
                        } while (!transporte.equals("1") && !transporte.equals("2") && !transporte.equals("3"));
                        //Hospedagem
                        do {
                            System.out.println("\nEscolha a hospedagem: ");
                            System.out.println("1 - " + h31.tipo + " R$ " + h31.valor * dolar);
                            System.out.println("2 - " + h32.tipo + " R$ " + h32.valor * dolar);
                            System.out.println("3 - " + h33.tipo + " R$ " + h33.valor * dolar);
                            System.out.println("Opção de hospedagem desejada: ");
                            hospedagem = entrada.nextLine();
                            if (!hospedagem.equals("1") && !hospedagem.equals("2") && !hospedagem.equals("3")){
                                System.out.println("Opção inválida!");
                            } else {
                                switch (hospedagem) {
                                    case "1": hospedagemEscolhida = h31; break;
                                    case "2": hospedagemEscolhida = h32; break;
                                    case "3": hospedagemEscolhida = h33; break;
                                }
                            }
                        } while (!hospedagem.equals("1") && !hospedagem.equals("2") && !hospedagem.equals("3"));
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                    }
                
                System.out.println("Quantos dias de hospedagem? ");
                int dias = entrada.nextInt();
                
                System.out.println("Informe a margem de lucro (%): ");
                double margem = entrada.nextDouble();
                
                System.out.println("Informe as taxas adicionais (US$): ");
                double taxas = entrada.nextDouble();
                entrada.nextLine();
                
                PacoteDeViagem pacote = new PacoteDeViagem(transporteEscolhido, hospedagemEscolhida, destino, dias);
                double totalPacote = pacote.calcularValorTotal(taxas, margem);
                
                System.out.println("Nome do cliente: ");
                String cliente = entrada.nextLine();
                
                System.out.println("Forma de pagamento: ");
                String pagamento = entrada.nextLine();
                
                Venda venda = new Venda(cliente, pagamento, pacote, totalPacote, dolar);
                
                System.out.println("\n-----RESUMO VENDA-----");
                System.out.println("Cliente: " + venda.cliente);
                System.out.println("Destino: " + pacote.destino);
                System.out.println("Transporte: " + pacote.transporte.tipo);
                System.out.println("Hospedagem: " + pacote.hospedagem.tipo);
                venda.mostrarValores(totalPacote, dolar);
                
                //Opção de salvar a venda
                do {
                    System.out.println("\nDeseja efetuar a venda (s/n)? ");
                    efetuarVenda = entrada.nextLine();
                    if (efetuarVenda.equals("s")) {
                        vendas.add(venda);
                        System.out.println("Venda efetuada com sucesso!");
                    } else if (efetuarVenda.equals("n")) {
                        System.out.println("Venda cancelada!");
                    } else {
                        System.out.println("Opção inválida.");
                    }
                } while (!efetuarVenda.equals("s") && !efetuarVenda.equals("n"));
                
            //Mostrar lista de vendas
            } else if (opcao.equals("2")) {
                if (vendas.isEmpty()) {
                    System.out.println("\nNenhuma venda registrada ainda!");
                } else {
                    System.out.println("\n-----Lista de Vendas-----");
                    for (int i = 0; i < vendas.size(); i++) {
                        Venda v = vendas.get(i);
                        System.out.println("\nVenda " + (i+1));
                        System.out.println("Cliente: " + v.cliente);
                        System.out.println("Destino: " + v.pacote.destino);
                        System.out.println("Transporte: " + v.pacote.transporte.tipo);
                        System.out.println("Hospedagem: " + v.pacote.hospedagem.tipo);
                        System.out.println("Valor em dólares: US$ " + v.total);
                        System.out.println("Valor em reais: R$ " + v.calcularValorReais(v.total, v.dolar));
                        System.out.println("-------------------------");
                    }
                }
                
            } else if (opcao.equals("0")) {
                System.out.println("Saindo do programa...");
            } else {
                System.out.println("Opção Inválida!");
            }
        } while (!opcao.equals("0"));
    }    
}
