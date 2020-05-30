package bairs;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Deniboy
 */
public class FeedbackTest {
    
    public FeedbackTest() {
    }
    
    @Test
    public void Feedback() {

        Feedback f = new Feedback();
   
        Integer avaliacao = 5;
        f.setAvaliacao(avaliacao);
        String comentario = "Teste do Deniboy";
        f.setComentario(comentario);
        
        String resultado = f.aplicarFeedback(avaliacao, comentario);
        
        String resultadoEsperado ="Feedback{" + "ID=" + f.getID() + ", avaliacao=" + 5 + ", comentario=" + "Teste do Deniboy" + '}';
        assertEquals(resultadoEsperado,resultado);

    }
}
