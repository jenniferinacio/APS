package Modelo;

import static Modelo.Pontos.resultado;

public class Pontos {
     private  int pontos;
     private  String ponto;
     public static int resultado;
     
    public Pontos(String ponto) {
        this.ponto = ponto;
        ConverterPontos();
        calculaPontos();
    }
     
    public void ConverterPontos(){
        
        try
        {
         
          this.pontos=(Integer.parseInt(this.ponto)); 
          
          
        }
        catch (NumberFormatException e)
        {
            throw e;
        }
    }
    public  void calculaPontos()
    {
         resultado += pontos;

    }
}
