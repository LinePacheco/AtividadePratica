import java.util.ArrayList; 
public class GerenciarVeiculo {     
    public static void main(String[] args) {
                
        ArrayList<Veiculo> automotores = new ArrayList<> (); 
        
    public void addVeiculo(Veiculo veiculo){
    automotores.add(veiculo); }

    public boolean contains(String elemento){
         for (String placa : a) { 
             automotores.remove(veiculo);
             if(placa==elemento){ 
                 return true; }
                 } 
                 return false; } 

    public boolean add(Placa obj) {
      try {
          list.add(obj);
      } catch (OutOfMemoryException e) {
          return false;
      } 
      return true;
   }

    public boolean buscarPorPlaca(Placa obj) {
        if (list.contains(obj)) {
        return true;
    }
    list.add(obj);
    return null;
 }  
 
    public String listarVeiculos(){
    return veiculos.size()+"";
}

    public String retornaLista (){
    return (automotores) ;
}

    public double calcularImposto (String Placa){
    if (i > 1) {
        placa = Double.perseDouble(dados.get(i - 2).toString());
    }
    return imposto;

     if (i < 1){
         return -1;
     }        
  }   
  public String listarCombustivel(String Combustivel){
    return combustivel.size()+"";
 } 
} 
      