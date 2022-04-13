public class BoloRetangular {
    
    float peso;
    String sabor;
    String cobertura;
    
    public void decorar(){
        System.out.print("Bolo decorado\n");
    }  
    
    public void comer(float pesoComido){
        peso -= pesoComido; // peso = peso - pesoComido;
    }
    
    
}
