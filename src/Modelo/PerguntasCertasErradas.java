package Modelo;

public class PerguntasCertasErradas {
    
    public static int respostasResultado;
    private String acertosErros;
    private int respostaAcertosErros;

    public PerguntasCertasErradas(String acertosErros) {
        this.acertosErros = acertosErros;
        ConverterResposta();
        calculaRespostas();
    }
    public void ConverterResposta(){
        try
        {
          this.respostaAcertosErros=(Integer.parseInt(this.acertosErros)); 
        }
        catch (NumberFormatException e)
        {
             throw e;
        }
    }
    public  void calculaRespostas()
    {
        respostasResultado += respostaAcertosErros;
        
    }
}
