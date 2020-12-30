/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionresourceuniversitaire;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 *
 * @author M-D
 */
public class Noeud {
    private Groupe groupe;
    private NavigableSet<Ticket> fils = new TreeSet<>();
    
    public Noeud(Groupe groupe){
        this.groupe = groupe;
    }
    
    public NavigableSet<Ticket> getFils(){
        return fils;
    }

    public Groupe getGroupe() {
        return groupe;
    }
    
    
    // Creation de ticket ( fil de discussion )
    public boolean creeFilDiscussion(String titre, Message message){
        Ticket ticket = new Ticket(titre, message, groupe);
        boolean ticketAjouter = fils.add(ticket);
       
        if( ! ticketAjouter )
            System.out.println("Erreur ce Fil de discussion à deja était crée.");
        
        return ticketAjouter;
    }
    
    
}
