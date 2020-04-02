
package bairs;



import java.util.Random;


public class Solicitacao {
    private Random ID = new Random();
    private String Descricao;
    private String Categoria;

    public Solicitacao(String Descricao, String Categoria) {
        this.Descricao = Descricao;
        this.Categoria = Categoria;
    }   
   
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

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public void fazerSolicitacao(){
        
     
    public void cancelarSolicitacao(){
        
    }

}