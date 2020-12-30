/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionresourceuniversitaire;
 
import java.util.Set;


/**
 *
 * @author M-D
 */
public class Utilisateur {
    
    private String identifiant;
    private String nom;
    private String prenom;
    private String motDePasse;
    private TypeUtilisateur type;
    private Arbre arbre;
    private Ticket ticketSelectionner = null;
    
    
    public Utilisateur(String identifiant, String nom, String prenom, String motDePasse, TypeUtilisateur type){
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.motDePasse = motDePasse;
        this.type = type;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public TypeUtilisateur getType() {
        return type;
    }
    
    public Arbre getArbre() {
        return arbre;
    }

    public void selectionnerTicket(Ticket ticket){
        this.ticketSelectionner = ticket;
    }
    
    public void creeFilDiscussion(String titre, String message, String nomGroupe){
        Noeud noeud = null;
        Set<Noeud> noeuds = arbre.getNoeuds();
        
        // Recherche le bon noeud associer a l'abre
        for( Noeud n : noeuds ){
            if( nomGroupe.equals( n.getGroupe().getNom() ) ){
                noeud = n;
                break;
            }
        }
        
        if(noeud != null)
            noeud.creeFilDiscussion(titre, new Message(this, message) );
        else
            System.out.println("groupe Inexistant");
    }

    public void ecrireMessage(String message){
        if(ticketSelectionner != null){
            ticketSelectionner.ecrire(this, message);
        }
    }
    
}
