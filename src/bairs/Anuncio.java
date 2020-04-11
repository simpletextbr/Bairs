/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bairs;

import java.util.Objects;

/**
 *
 * @author Gabriel Bryan
 */
public class Anuncio {

    private Usuario user;
    private String name;
    private String description;
    private Double price;
    private String category;
    private Impulsionamento boost;
    private Chat chat;

    public Anuncio(String name, String description, Double price, String category) {
        setName(name);
        setDescription(description);
        setPrice(price);
        setCategory(category);
        boost = new Impulsionamento();
    }

    public String impulsionar(String opt) {
        String response = "";
        if (opt.equals("b")) {
            response = boost.basico().toString();
        }
        if (opt.equals("p")) {
            response = boost.premium().toString();
        }
        return response;
    }

    public String anunciar() {
        String status = "";
        String name = getName();
        String description = getDescription();
        Double price = getPrice();
        String category = getCategory();

        if (!name.equals("") && !description.equals("") && price >= 0 && !category.equals("")) {
            Anuncio newa = new Anuncio(name, description, price, category);
            String response = newa.toString();
            status = ("Sucefull " + response);
        }
        return status;
    }

    public void negociar() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Anuncio other = (Anuncio) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Anuncio{" + "name=" + name + ", description=" + description + ", price=" + price + ", category=" + category + '}';
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
        if (name.trim().equals("") || name.equals("")) {
            throw new IllegalArgumentException("You must enter a name");
        }
        if (name.length() < 5) {
            throw new IllegalArgumentException("That name is small");
        }
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
        if (description.trim().length() > 500) {
            throw new IndexOutOfBoundsException("caracters limit is 500");
        }
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
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Negative value is not accepted");
        }
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
