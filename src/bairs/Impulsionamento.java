/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bairs;

/**
 *
 * @author luana
 */
public class Impulsionamento {    
    private String nomenclatura;
    private String duracao;
    private String desconto;
    
    public Impulsionamento basico(){
        Impulsionamento basico = new Impulsionamento();
        basico.nomenclatura = "Básico";
        basico.duracao = "8 dias";
        basico.desconto = "10%";
    
        return basico;   
}

    /**
     * @return the nomenclatura
     */
    public String getNomenclatura() {
        return nomenclatura;
    }

    /**
     * @param nomenclatura the nomenclatura to set
     */
    public void setNomenclatura(String nomenclatura) {
        this.nomenclatura = nomenclatura;
    }

    /**
     * @return the duracao
     */
    public String getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    /**
     * @return the desconto
     */
    public String getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(String desconto) {
        this.desconto = desconto;
    }
    
}

