/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bairs.modelo;

import java.util.Calendar;

/**
 *
 * @author CLIENTE
 */
public class Usuario {
    private String nomeCompleto;
    private Double CPF;
    private Calendar dataNascimento;
    private String email;
    private String usuario;
    private String senha;
    private Double codigoVerificacao;

    public void cadastrarUsuario(String nomeCompleto, Double CPF, Calendar dataNascimento, String email, String usuario, String senha) {
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
    }
    public String entrar(String usuario, String senha)
  {
        if(this.usuario.equals(usuario) && this.senha.equals(senha))
            return "Sucesso";
        else
            return "Usuario ou senha incorretos";
    }
     public String entrarFacebook(String email, String senha){
        if(this.email.equals(email) && this.senha.equals(senha))
            return "Sucesso";
        else
            return "Usuario ou senha incorretos";
    }
     public String entrarGoogle(String email, String senha){
        if(this.email.equals(email) && this.senha.equals(senha))
            return "Sucesso";
        else
            return "Usuario ou senha incorretos";
    }
}

 

