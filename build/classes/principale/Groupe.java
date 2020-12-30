/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionresourceuniversitaire;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author M-D
 */
public class Groupe {
    private List<Utilisateur> utilisateurs = new ArrayList();
    private String nom;
    private int nbUtilisateurs = 0;
    private TypeUtilisateur type;

    public Groupe(String nom, TypeUtilisateur type){
    	this.nom = nom;
    	this.type = type;
    }
    
    public void addUser(Utilisateur utilisateur){
        //TODO
    }

    public int getNbUtilisateurs() {
        return nbUtilisateurs;
    }

    public String getNom() {
        return nom;
    }

    public TypeUtilisateur getType() {
        return type;
    }

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }
    
    @Override
    public boolean equals(Object ob){
        if(ob instanceof Groupe){
            Groupe groupe = (Groupe) ob;
            return this.nom.equals(groupe.getNom()) && this.type.equals(groupe.getType());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nom);
        hash = 37 * hash + Objects.hashCode(this.type);
        return hash;
    }
            
            
}
