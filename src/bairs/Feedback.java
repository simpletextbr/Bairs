/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bairs;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Dênis
 */
public class Feedback {
    
    private Random ID = new Random();
    private Integer avaliacao;
    private String comentario;

    //Metodo construtor
    public Feedback(Integer avaliacao, String comentario) {
        getID();
        setAvaliacao(avaliacao);
        setComentario(comentario);
        
    }
    
    public Random getID() {
         ID.nextInt(100);
        return ID;
    }

    @Override
    public String toString() {
        return "Feedback{" + "comentario=" + comentario + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.comentario);
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
        final Feedback other = (Feedback) obj;
        if (!Objects.equals(this.comentario, other.comentario)) {
            return false;
        }
        return true;
    }
    
    /**
     * @return the avaliacao
     */
    public Integer getAvaliacao() {
        return avaliacao;
    }

    /**
     * @param avaliacao the avaliacao to set
     */
    public void setAvaliacao(Integer avaliacao) {
        
        if (avaliacao < 1 || avaliacao > 5 ) {
            throw new IndexOutOfBoundsException("Avaliação permitida: 1 a 5");
        }
        this.avaliacao = avaliacao;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        
        if (comentario.trim().length() <5) {
            throw new IndexOutOfBoundsException("Digite pelo menos 5 caracteres");
        }
        
        if (comentario.trim().length() > 500) {
            throw new IndexOutOfBoundsException("Limite de 500 caracteres");
        }
        this.comentario = comentario;
    }

    public void aplicarFeedback(Integer avaliacao, String comentario ) {
        
        Feedback aplicaFeedback = new Feedback(avaliacao,comentario);
        
    }
}
