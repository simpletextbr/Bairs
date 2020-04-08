/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bairs;

/**
 *
 * @author Bruno & Lud
 */
public class Anuncio {
    
     private String name;
     private String description;
     private Double price;
     private String category;
     
     public Anuncio(String name, String description, Double price, String category) {
        setName(name);
        setDescription(description);
        setPrice(price);
        setCategory(category);
    }
     
     public String Anunciar() {
        String status = "";
        String name = getName();
        String description = getDescription();
        Double price = getPrice();
        String category = getCategory();

        if (!name.equals("") && !description.equals("") && price >= 0 && !category.equals("")) {
            status = ("Sucefull");
        } else {
            status = ("Failed");
        }
        return status;
    }
     
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }
    
}