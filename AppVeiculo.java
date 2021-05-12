import java.util.Scanner;

public class AppVeiculo {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        GerenciarVeiculos gerencia = new GerenciarVeiculos();
        int menu,Anodefabricacao;
        String Modelo,Marca,Placa,Tipodecombustivel;
        double Valordemercado;

        /*Veiculo v = new Veiculo("marca00", "modelo00","placa00","combustivel00", 2021, 9999);*/
   
        do {
            System.out.println("1-Adicionar Veículo");
            System.out.println("2-Remover Veículo");
            System.out.println("3-Buscar Veículo pela placa");
            System.out.println("4-Lista de Veiculos");
            System.out.println("5-Obter Valor do Imposto");
            System.out.println("6-listar Carros por combustivel");
            System.out.println("7-Finalizar");
                menu = Integer.parseInt(entrada.nextLine());

            switch (menu) {
                case 1:
                    System.out.println("Qual o Modelo do Carro?");
                    Modelo = entrada.nextLine();
                    System.out.println("Qual a Marca do Carro?");
                    Marca = entrada.nextLine();
                    System.out.println("Qual a Placa do Carro?");
                    Placa = entrada.nextLine();
                    System.out.println("Qual o tipo de Combustivel do Carro?");
                    Tipodecombustivel = entrada.nextLine();
                    System.out.println("Qual o Ano de Fabricaçâo do Carro");
                    Anodefabricacao = Integer.parseInt(entrada.nextLine());
                    System.out.println("Qual o Valor de Mercado do Carro?");
                    Valordemercado = Double.parseDouble(entrada.nextLine());
                    gerencia.adicionarVeiculo(Modelo, Marca, Placa, Tipodecombustivel, Anodefabricacao, Valordemercado);
                    
                    break;
            
                case 2:
            
                    System.out.println("Qual a Placa do Veículo a ser Removido?");
                    Placa = entrada.nextLine();
                    gerencia.remover(Placa);
                    break;
            
                case 3:
                    System.out.println("Qual a Placa do Veículo a ser encontrado?");
                    Placa = entrada.nextLine();
                    System.out.println(gerencia.buscarPorPlaca(Placa));
                    break;
            
                case 4:
                    System.out.println(gerencia.listarVeiculos());    
                
                    
                    
                    break;
            
                case 5:
                    
                    break;
            
                case 6:
                    

                    break;
                case 7:
                    
                    break;  

                default:
                    System.out.println("Opção Invalida!\n");
                    break;
            }
        } while (menu != 7);


        entrada.close();
    }
}
