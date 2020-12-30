/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionresourceuniversitaire;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Ticket ou fil de discussion
 * @author M-D
 */
public class Ticket {
    private String titre;
    private Message premierMessage;
    private Groupe groupeDestiner;
    private List<Message> messages = new LinkedList<>();
    
    public Ticket(String titre, Message message, Groupe groupeDestiner){
        this.titre = titre;
        this.premierMessage = message;
        this.groupeDestiner = groupeDestiner;
        messages.add(message);
    }
    
    public Groupe getGroupeDestiner() {
        return groupeDestiner;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public Message getPremierMessage() {
        return premierMessage;
    }

    public String getTitre() {
        return titre;
    }

    public void ecrire(Utilisateur emetteur, String text){
    	Message message = new Message(emetteur, text);
    	messages.add(message);
    }
    
    public void affichageMessages(){
        messages.forEach(Message::affichage);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.titre);
        hash = 59 * hash + Objects.hashCode(this.groupeDestiner);
        return hash;
    }

    @Override
    public boolean equals(Object ob){
        if(ob instanceof Ticket){
            Ticket ticket = (Ticket) ob;
            return this.groupeDestiner.equals( ticket.getGroupeDestiner() ) && this.titre.equals( ticket.getTitre() );
        }
        return false;
    }
    
    
    
}
