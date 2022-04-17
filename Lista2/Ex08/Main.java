/*

ENUNCIADO:

Faça uma classe celular em que cada celular contém uma bateria, cada bateria 
é caracterizada pela capacidade de carga (medida em unidades u inteiras) e 
pelo nível de carga. Com o seu celular você pode enviar mensagens de texto e 
fazer ligações mas, obviamente, ambas as funções afetam o nível da bateria: 
uma mensagem de texto consome uma unidade de carga e uma chamada consome uma 
unidade de carga a cada 5 segundos. Também é possível saber o nível de carga 
do celular. Implemente as classes com todos os métodos que julgar apropriados 
para simular objetos reais e, em seguida, instancie os objetos e faça alguns 
testes.
 
 */
  
public class Main {
    public static void main(String[] args) {
    
        Celular celular = new Celular();
        
        celular.capacidade_carga(100);
        celular.enviaMensagem();
        celular.enviaMensagem();
        celular.enviaMensagem();
        celular.fazLigaçao(120);
        celular.nivel_carga();
   
    }
}
