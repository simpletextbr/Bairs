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
 * @author luana
 */
public class ImpulsionamentoTest {
    
    public ImpulsionamentoTest() {       
    }
    
    @Test
    public void ImpulsinamentoBasico() {
        Impulsionamento impul = new Impulsionamento();
        System.out.println(impul.basico());
        
     
}
    @Test
    public void ImpulsinamentoPremium() {
        Impulsionamento impul = new Impulsionamento();
        System.out.println(impul.premium());
        
            
}
    
    
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
