import java.util.ArrayList;

public class GerenciarVeiculos {
    private ArrayList <Veiculo> automotores;
    

    public GerenciarVeiculos(){
        automotores = new ArrayList<>();
    }
    public void adicionarVeiculo(String Modelo,String Marca,String Placa,String Tipodecombustivel,
    int Anodefabricacao, double Valordemercado ){
        
        automotores.add( new Veiculo(Modelo, Marca, Placa, Tipodecombustivel, Anodefabricacao, Valordemercado));

    }
    public boolean remover(String Placa){
        for (Veiculo elementos : automotores) {
            if(elementos.getPlaca().equalsIgnoreCase(Placa)){
                automotores.remove(elementos);
                return true;
            }else{
            break;
            }
        }
        return false;
    }
    public Veiculo buscarPorPlaca (String placa){

    }
    public String listarVeiculos(){

    }
    public double obeterValorImposto(String placa){

    }
    public String listarVeiculoPorCombustivel(String combustivel){

    }
}
