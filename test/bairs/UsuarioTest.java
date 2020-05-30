/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bairs;

import java.util.Calendar;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thiago
 */
public class UsuarioTest {
    
    public UsuarioTest() {
    }

    @Test
    public void testCadastrarUsuario() {
        System.out.println("Cadastrar Usuario");
        String nomeCompleto = "Thiago";
        String CPF = "123456";
        Calendar dataNascimento = null;
        String email = "thiagodvieira2@gmail.com";
        String usuario = "Thiago";
        String senha = "1234";
        Usuario user = new Usuario();
        String resultado = user.cadastrarUsuario(nomeCompleto, CPF, dataNascimento, email, usuario, senha);
        String resultadoEsperado ="Usuario{" + "nomeCompleto=" + "Thiago" + ", CPF=" + "123456" + ", dataNascimento=" + null + ", email=" + "thiagodvieira2@gmail.com" + ", usuario=" + "Thiago" + ", senha=" + "1234" + '}';
        assertEquals(resultadoEsperado,resultado);
        
    }

    /**
     * Test of entrar method, of class Usuario.
     */

     @Test
    public void testEntrar() {
        System.out.println("entrar");
        String usuario = "Thiago";
        String senha = "1234";
        Usuario user = new Usuario();
        Boolean resultado = user.entrar(usuario, senha);
        //O método só retornará true caso o usuário e senha estejam corretos
        Boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado,resultado);

    }
    
    /**
     * Test of entrarFacebook method, of class Usuario.
     */
    @Test
    public void testEntrarFacebook() {
        System.out.println("entrarFacebook");
        String email = "thiagodvieira2@hotmail.com";
        String senha = "1234";
        Usuario user = new Usuario();
        Boolean resultado = user.entrar(email, senha);
        //O método só retornará true caso o usuário e senha estejam corretos
        Boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado,resultado);
    }
    
    /**
     * Test of entrarGoogle method, of class Usuario.
     */
    @Test
    public void testEntrarGoogle() {
        System.out.println("entrarGoogle");
        String email = "thiagodvieira2@gmail.com";
        String senha = "4321";
        Usuario user = new Usuario();
        Boolean resultado = user.entrar(email, senha);
        //O método só retornará true caso o usuário e senha estejam corretos
        Boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado,resultado);
    }

    /**
     * Test of excluir method, of class Usuario.
     */
    @Test
    public void testExcluir() throws Exception {
        System.out.println("excluir");
        String CPF = "123";
        Usuario user = new Usuario();
        Boolean resultado = user.excluir(CPF);
        Boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado,resultado);
    }


}
