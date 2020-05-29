/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bairs;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabriel
 */
public class AnuncioTest {
    
    public AnuncioTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void Anuncio(){
     String name = "Computador";
     String description = "Computador bem velho para retirada de peças";
     Double price = 150.00;
     String category = "Informatica";
        Anuncio PC = new Anuncio(name, description, price, category);
        String resultado = PC.anunciar();
        String esperado = "Sucefull " + "Anuncio{" + "name=" + name + ", description=" + description + ", price=" + price + ", category=" + category + '}';
        assertEquals(esperado, resultado );
        
    }
}
