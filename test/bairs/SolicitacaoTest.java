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
 * @author wesleypraca
 */
public class SolicitacaoTest {
    
    public SolicitacaoTest() {
    }

    @Test
    public void Solicitacao() {     
       Solicitacao s = new Solicitacao();
        Integer ID = s.setID();
        String Name = "Jao";
        s.setName(Name);
        String Description = "Laptop";
        s.setDescription(Description);
        String Category = "PC";
        s.setCategory(Category);
        System.out.println(s.DoSolicitation());

        String result = s.DoSolicitation();
        String expResult ="Solicitacao: { " + "ID da Solicitação: " + ID + ", Nome da Solicitaçao: " + "Jao" +  ", Descrição da Solicitaçao: " + "Laptop" + ", Categoria da Solicitação: " + "PC" + '}';;
        assertEquals(expResult, result);
    }
} 
    