/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bairs;

import java.util.Calendar;

/**
 *
 * @author Thiago
 */
public class Usuario {
    private String nomeCompleto;
    private String CPF;
    private Calendar dataNascimento;
    private String email;
    private String usuario;
    private String senha;
    private Double codigoVerificacao;

    public Usuario(String nomeCompleto, String CPF, Calendar dataNascimento, String email, String usuario, String senha) {
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Usuario(){
        
    }
    
    
    
     public String cadastrarUsuario(String nomeCompleto, String CPF, Calendar dataNascimento, String email, String usuario, String senha) {
         
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
        Usuario cadastro = new Usuario(nomeCompleto,CPF, dataNascimento,email,usuario,senha);
        return cadastro.toString();

    }

    @Override
    public String toString() {
        return "Usuario{" + "nomeCompleto=" + nomeCompleto + ", CPF=" + CPF + ", dataNascimento=" + dataNascimento + ", email=" + email + ", usuario=" + usuario + ", senha=" + senha + '}';
    }
    
     public Boolean entrar(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha; 
        if(this.usuario.equals(usuario) && this.senha.equals(senha))
            return true;
        else
            return false;
    }
     public Boolean entrarFacebook(String email, String senha){
         this.email = email;
         this.senha = senha;
        if(this.email.equals(email) && this.senha.equals(senha))
            return true;
        else
            return false;
    }
     public Boolean entrarGoogle(String email, String senha){
         this.email = email;
         this.senha = senha;
        if(this.email.equals(email) && this.senha.equals(senha))
            return true;
        else
            return false;
    }
     public Boolean excluir(String CPF) throws Exception{
        this.CPF = CPF;
       int uPosicao= 1;
        int p = 1;
      //  if (uPosicao == -1){
       //     throw new Exception ("Lista Vazia");
            
        for (int i=0;i<=uPosicao;++i){
            if (this.CPF.equals(CPF)){
                p=i;
                return true;
            }
        }
        return false;
        //if (p==-1)
          //  throw new Exception("Elemento não encontrado");   
        //--uPosicao;
        
         } 
}

