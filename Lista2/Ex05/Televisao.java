public class Televisao {
    
    boolean status_tv = false;
    boolean silenciar_tv = false;
    int vol_tv = 0;
    int num_canal = 0;
    
    public void ligaTV(){     
        
        System.out.println("Ligando TV......");
        
        status_tv = true;
        vol_tv = 3;
        num_canal = 4;
        
        System.out.println("TV ligada!!!");
        System.out.println("Canal: " +num_canal);
        System.out.println("Volume: " +vol_tv);
        
    }
    
    public void desligaTV() {
        
     System.out.println("Desigando TV......");
     
     status_tv = false;
     num_canal=0;
     vol_tv=0;
     
     System.out.println("TV desligada!!!");
        
    }
    
    public void mute(){
        silenciar_tv = true;
        vol_tv=-1;
        System.out.println("TV MUTADA!");
    }
    
    public void unmute(){
        silenciar_tv = false;
        vol_tv = 3;
        System.out.println("UNMUTE! Volume: " +vol_tv);
    }
    
    public void mudaCanal(int canal){
        
        if (vol_tv==0){
            System.out.println("ERRO! TV ta desligada. Ligue primeiro.");
        } else {
            if (canal>0 && canal<99) {
                num_canal = canal;
                System.out.println("Canal: "+canal);           
            } else {
               System.out.println("Erro... canal invalido"); 
            }
        }
    } 
    
  
    public void canalAnterior(){
        num_canal-=1;
        System.out.println("Canal anterior:" +num_canal);
    }
    
    public void proxCanal(){
        num_canal+=1;
        System.out.println("Proximo canal: "+num_canal);
    }
    
    public void aumentaVolume(){
        
        if (vol_tv != 9){
            vol_tv+=1;
            System.out.println("Volume: " +vol_tv);
        } else {
            System.out.println("Volume maximo!");
        }
        if (vol_tv==0){
        System.out.println("ERRO! TV ta desligada.");
        }
    
    }
    
    public void diminuiVolume(){
        if (vol_tv != 1){
            vol_tv -=1;
        } else {
            System.out.println("Volume minimo!");
        }
        if (vol_tv==0){
        System.out.println("ERRO! TV ta desligada.");
        }
   
    }
    
    public void estadoTV(){
        if (status_tv == true) {
            System.out.println("Estado: TV LIGADA!");
        } else {
            System.out.println("Estado: TV DESLIGADA!");
        }
    }
             
} 
     
    

