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
     public String entrar(String usuario, String senha){
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
     public void excluir(Double CPF) throws Exception{
       int uPosicao= -1;
        int p = -1;
        if (uPosicao == -1)
            throw new Exception ("Lista Vazia");
        for (int i=0;i<=uPosicao;++i){
            if (this.CPF == CPF){
                p=i;
                break;
            }
        }
        if (p==-1)
            throw new Exception("Elemento não encontrado");   
        --uPosicao;
         } 
}

