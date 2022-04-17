public class Televisao {
    
    boolean status_tv = false;
    boolean silenciar_tv = false;
    int vol_tv = 0;
    int num_canal = 0;
    
    public void ligaTV(){     
        
        System.out.println("Ligando a TV...");
        
        status_tv = true;
        vol_tv = 3;
        num_canal = 4;
        
        System.out.println("TV ligada.");
        System.out.println("Canal: " +num_canal);
        System.out.println("Volume: " +vol_tv);
        
    }
    
    public void desligaTV() {
        
     System.out.println("Desligando a TV...");
     
     status_tv = false;
     num_canal=0;
     vol_tv=0;
     
     System.out.println("TV desligada.");
        
    }
    
    public void mute(){
        silenciar_tv = true;
        vol_tv=-1;
        System.out.println("Mute ON.");
    }
    
    public void unmute(){
        silenciar_tv = false;
        vol_tv = 3;
        System.out.println("Mute OFF. \nVolume: " +vol_tv);
    }
    
    public void mudaCanal(int canal){
        
        if (vol_tv==0){
            System.out.println("ERRO: TV desligada.");
        } else {
            if (canal>0 && canal<99) {
                num_canal = canal;
                System.out.println("Canal: "+canal);           
            } else {
               System.out.println("ERRO: Canal inválido."); 
            }
        }
    } 
    
  
    public void canalAnterior(){
        num_canal-=1;
        System.out.println("Canal anterior: " +num_canal);
    }
    
    public void proxCanal(){
        num_canal+=1;
        System.out.println("Próximo canal: "+num_canal);
    }
    
    public void aumentaVolume(){
        
        if (vol_tv != 9){
            vol_tv+=1;
            System.out.println("Volume: " +vol_tv);
        } else {
            System.out.println("Volume máximo.");
        }
        if (vol_tv==0){
        System.out.println("ERRO: TV desligada.");
        }
    
    }
    
    public void diminuiVolume(){
        if (vol_tv != 1){
            vol_tv -=1;
        } else {
            System.out.println("Volume mínimo.");
        }
        if (vol_tv==0){
        System.out.println("ERRO: TV desligada.");
        }
   
    }
    
    public void estadoTV(){
        if (status_tv == true) {
            System.out.println("Estado atual: TV LIGADA!");
        } else {
            System.out.println("Estado atual: TV DESLIGADA!");
        }
    }
             
} 
     
    

