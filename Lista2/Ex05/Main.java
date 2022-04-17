
/*

ENUNCIADO:

Escreva uma classe Televisao sabendo que o estado de uma televisão se caracteriza por estar ligada ou desligada, 
pelo volume (que está entre 0 e 10), pelo canal (que está entre 0 e 99) e pelo fato de estar em modo silencioso 
ou não. Crie métodos para ligar/desligar a televisão, mudar o canal (canal específico, canal anterior, próximo canal) 
e silenciar a televisão. Instancie um objeto dessa classe, utilize seus métodos para mudar de canal, ligar e desligar 
a TV, silenciar ou dessilenciar a TV e, por último, imprima o estado da TV.

*/

public class Main {
    
    public static void main(String[] args) {
        
        Televisao tv = new Televisao();
                
        tv.ligaTV();
        tv.mudaCanal(35);
        tv.mudaCanal(37);
        tv.proxCanal();
        tv.proxCanal();
        tv.proxCanal();
        tv.canalAnterior();
        tv.aumentaVolume();
        tv.diminuiVolume();
        tv.diminuiVolume();
        tv.diminuiVolume();
        tv.diminuiVolume();
        tv.mute();
        tv.unmute();
        tv.aumentaVolume();
        tv.aumentaVolume();                
        tv.aumentaVolume();
        tv.aumentaVolume();
        tv.aumentaVolume();
        tv.aumentaVolume();
        tv.aumentaVolume();
        tv.desligaTV();
        tv.estadoTV();
             
    }
        
}
