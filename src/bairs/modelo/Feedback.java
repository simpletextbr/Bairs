/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bairs.modelo;

import java.util.Objects;

/**
 *
 * @author Dênis
 */
public class Feedback {

    private String titulo;
    private String comentario;

    //Metodo construtor
    public Feedback(String titulo, String comentario) {
        this.titulo = titulo;
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Feedback{" + "titulo=" + titulo + ", comentario=" + comentario + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.titulo);
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
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
        this.comentario = comentario;
    }

    public void aplicarFeedback(String feedback) {
        String guardaFeedback = feedback;
    }
}
