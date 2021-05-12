

public class Veiculo {
    


    //atributos
private String Modelo, Marca, Placa, Tipodecombustivel;
private double Valordemercado;
private int Anodefabricacao;

    //contrutor
public Veiculo(String Modelo,String Marca,String Placa,String Tipodecombustivel,
int Anodefabricacao, double Valordemercado){
    this.Modelo = Modelo;
    this.Marca = Marca;
    this.Placa = Placa;
    this.Tipodecombustivel = Tipodecombustivel;
    this.Anodefabricacao = Anodefabricacao;
    this.Valordemercado = Valordemercado;

}

    //metodos get e set

public String getModelo(){
    return Modelo;
}
public String getMarca(){
    return Marca;
}
public String getPlaca(){
    return Placa;
}
public String getTipodecombustivel(){
    return Tipodecombustivel;
}
public int getAnodefabricação(){
    return Anodefabricacao;
}
public void setValordemercado(double Valordemercado){
    this.Valordemercado = Valordemercado;
}

    //metodos solicitados
public double calcularImposto(){
    double imposto;
    if(Anodefabricacao <= 2001){
        return (0);
    }else{ //gasolina, diesel, flex e outros 
        switch (Tipodecombustivel) {
            
            case "gasolina":
                imposto = (Valordemercado * 0.04);
                break;
            case "diesel":
                imposto = (Valordemercado * 0.04);
                break;
            case "flex":
                imposto = (Valordemercado * 0.04);
                break;
            default: 
                imposto = (Valordemercado * 0.03);
                break;
        }
        return imposto;
    }
    
}
public String imprimir(){
    return ("Modelo: " + Modelo + "\nMarca: " + Marca + "\nPlaca: " + Placa + 
    "\nTipo de Combustivel: " + Tipodecombustivel + "\nAno de Fabricação: " + 
    Anodefabricacao + "\nValor de Mercado: " + Valordemercado);
}
}