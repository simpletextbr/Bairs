
package bairs;

import java.util.List;
import java.util.Random;


public class Solicitacao {
    private Random ID = new Random();
    private String Descricao;
    private List <String> Categoria;
    
    public Random getID() {
         ID.nextInt(100);
        return ID;
    }

    public void setID(Random ID) {
        this.ID = ID;
    }
    
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
        pedido.setID(ID);
        pedido.setDescricao(Descricao);
        pedido.setCategoria(Categoria);
    }
 
    public void cancelarSolicitacao(){
        
    }

    
    
}
