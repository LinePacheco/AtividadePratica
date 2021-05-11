import java.util.ArrayList; 
public class GerenciarVeiculo {
    public static void main(String[] args){

        ArrayList<String> automotores = new ArrayList<> ();

public void addVeiculo(String modelo; String marca; String tipodecombustivel; String placa; int anodefabricação; double valordemercado; double calcularimposto; double valor; int n){
    Veiculo veiculo = new Veiculo(modelo,marca,tipodecombustivel,placa,anodefabricação,valordemercado,calcularimposto,valor,n);
    automotores.add(veiculo); }

public void addVeiculo(Veiculo veiculo){
    automotores.add(veiculo);}

public void remover(String placa){
    for (int i = 0; i < automotores.size(); i++) {
      if (automotores.get(i).getPlaca().equals(placa)) {
        automotores.remove(i); 
      } 
   } 
}
