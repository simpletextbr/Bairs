
package bairs;



import java.util.Random;


public class Solicitacao{
    private Random r = new Random();
    private Integer ID;
    private String Name;
    private String Description;
    private String Category;

    public Solicitacao(Integer ID, String Name ,String Description, String Category) {
        this.ID = ID;
        this.Name = Name;
        this.Description = Description;
        this.Category = Category;
    }
    
    public Solicitacao() {
    }
    
 
    /**
     * @return the ID
     */
    public Integer getID() {
        return ID;
    }

    /**
     * 
     */
    public Integer setID() {
        ID = r.nextInt(100);
        return ID;
    }

    @Override
    public String toString() {
        return "Solicitacao: { " + "ID da Solicitação: " + ID + ", Nome da Solicitaçao: " + Name +  ", Descrição da Solicitaçao: " + Description + ", Categoria da Solicitação: " + Category + '}';
    }
    
    
    /**
     * @return the name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }
    

    public String getDescription() {
        return Description;
    }

       public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String DoSolicitation(){
            Integer ID = getID();
            String Name = getName();
            String Description = getDescription();
            String Category = getCategory();
            String status = "";
            
            Solicitacao pedido = new Solicitacao(ID, Name, Description, Category);
      if(Description.equals("".trim()) || Category.equals("".trim()) || Name.equals("".trim())){
          System.out.println("Você precisa preencher todos os campos");
          status="Failed";
          return status;
        }
      
        status=pedido.toString();
     
      return status;

  }     
    public void DoCancel(){
        
    }


    
}