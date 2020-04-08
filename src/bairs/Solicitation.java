
package bairs;



import java.util.Random;


public class Solicitation{
    private Random ID = new Random();
    private String Description;
    private String Category;

    public Solicitation(String Descricao, String Categoria) {
        this.Description = Description;
        this.Category = Category;
    }   

    private Solicitation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public Random getID() {
         ID.nextInt(100);
        return ID;
    }

    public void setID(Random ID) {
        this.ID = ID;
    }
    
    public String getDescription() {
        return Description;
    }

       public void setDescription(String Descricao) {
        this.Description = Description;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Categoria) {
        this.Category = Category;
    }

    public void doSolicitation(){
        Solicitation pedido = new Solicitation();
        pedido.setID(ID);
        pedido.setDescription(Description);
        pedido.setCategory(Category);
        
        if(Description.equals("") || Category.equals("")){
            System.out.println("Você precisa preencher todos os campos");
        }
    }
    public void doCancel(){
        
    }
    
}