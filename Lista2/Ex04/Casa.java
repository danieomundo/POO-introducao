import java.util.ArrayList;

public class Casa {
    
    ArrayList<String> coresCasa = new ArrayList();
    ArrayList<Porta> portasCasa = new ArrayList();

    public void addPorta(Porta porta) {
        portasCasa.add(porta);
        System.out.println("Colocando uma porta na casa...Porta adicionada.");
    }

    public void pintaCasa(String cor){
        coresCasa.add(cor);
    }
    
     public void quantasPortasEstaoAbertas(){
       
        int portaAberta = 0;

        for(Porta porta : portasCasa){
            if(porta.estadoPorta == true){
                portaAberta++;
            }
        }
        System.out.println("Quantidade de portas abertas: " + portaAberta);
     }  
}
