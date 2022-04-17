import java.util.ArrayList;

public class Casa {
    
    ArrayList<String> coresCasa = new ArrayList();
    ArrayList<Porta> portasCasa = new ArrayList();

    public void addPorta(Porta porta){
        portasCasa.add(porta);
    }

    public void pintaCasa(String cor){
        coresCasa.add(cor);
    }
    public void imprimeCoresCasa(){
        System.out.println(coresCasa);
    }
    
     /*public void quantasPortasEstaoAbertas(){
        int portaAberta = 0;
        //arrumar metodo...........
     }*/
   
}
