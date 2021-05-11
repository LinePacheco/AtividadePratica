import java.util.Scanner;

public class veiculo{

   Scanner entrada = new Scanner(System.in);


    private String modelo;
    private String marca;
    private String tipodecombustivel;
    private String placa;
    private int anodefabricação;
    private double valordemercado;
    private double calcularimposto; 
    private double valor;
    int n;

         public String getModelo(){
        return (modelo);
     }
     public String getMarca(){
        return (marca);
     }
     public String getTipodecombustivel(){
      return (tipodecombustivel);
     }
    public String getPlaca(){
      return (placa);
     }
    public int getAnodeFabricação(){
     return (anodefabricação);
     }
     public double getCalcularimposto(){
      return (calcularimposto);
     }
    public void setValordeMercado(double valordemercado){
        this.valor = valordemercado;
    }

    public void exibir(int n){
     System.out.println("Digite o modelo do seu carro:");
     modelo = entrada.nextLine();

     System.out.println("Digite a marca do seu carro:");
     marca = entrada.nextLine();

     System.out.println("Digite a placa do seu carro:");
     placa = entrada.nextLine();

     System.out.println("Digite ano de fabricação do seu carro:");
     anodefabricação = entrada.nextInt(); 

     if(anodefabricação <= 2001)
     { 
      System.out.println("Você está insento do Imposto!!!");
     }
     else{
     System.out.println("Digite o tipo de combustivel do seu carro:");
     tipodecombustivel = entrada.nextLine();

    n = 0;
    System.out.println("Você deve pagar:" + n*4/100);

    System.out.println("Digite o valor de mercado: R$");
    valordemercado = entrada.nextDouble();
    }
   }
}
