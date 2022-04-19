public class Main {
    
    public static void main(String[] args) {
            
        BoloRetangular boloChocolate = new BoloRetangular();
        
        boloChocolate.peso = 3;
        boloChocolate.sabor = "Chocolate";
        boloChocolate.cobertura = "Morango";
        
        imprimir(boloChocolate);
        
       // System.out.println("Peso: " + boloChocolate.peso);
       // System.out.println("Sabor: " + boloChocolate.sabor);
       // System.out.println("Cobertura: " + boloChocolate.cobertura);
        
        boloChocolate.comer(1);
        System.out.println("Depois de comer:");
        imprimir(boloChocolate);
    
        boloChocolate.decorar();   
        
        BoloRetangular boloMorango = new BoloRetangular();
        boloMorango.peso = 5;
        boloMorango.sabor = "Morango";
        boloMorango.cobertura = "Chantilly";
        
        imprimir(boloMorango);
        
        boloMorango.comer(2);
        System.out.println("Depois de comer:");
        imprimir(boloMorango);
        
    }
    
    static void imprimir(BoloRetangular bolo) {
      
        System.out.println("Peso: " + bolo.peso);
        System.out.println("Sabor: " + bolo.sabor);
        System.out.println("Cobertura: " + bolo.cobertura);
      
    }
       
}
