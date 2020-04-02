
package bairs;

import java.util.List;
import java.util.logging.Logger;


public class Solicitacao {
    private String Descricao;
    private List <String> Categoria;
   
    public String getDescricao() {
        return Descricao;
    }

       public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public List <String> getCategoria() {
        return Categoria;
    }

    public void setCategoria(List <String> Categoria) {
        this.Categoria = Categoria;
    }

    public void fazerSolicitacao(){
        Solicitacao pedido = new Solicitacao();
        pedido.setDescricao(Descricao);
        pedido.setCategoria(Categoria);
    }
 
    
    
    
    
}
