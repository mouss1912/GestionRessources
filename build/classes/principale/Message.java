/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionresourceuniversitaire;

import java.awt.Color;
import java.util.Date;
import java.time.LocalDate;

/**
 *
 * @author M-D
 */
public class Message {

    private Date date;
    private Color  couleur;
    private String text;
    private Utilisateur emetteur;
    private Statut statut;
    
    public Message(Utilisateur emetteur, String text){
        this.emetteur = emetteur;
        this.text = text;

        // Aplique la date d'emission du message
        LocalDate localDate = LocalDate.now();
        this.date = new Date(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth() );  

        changeCouleur(Couleur.GRIS);
    }

    public Date getDate(){
        return date;
    }

    public Utilisateur getEmetteur(){
        return emetteur;
    }

    public String getText() {
        return text;
    }

    public Statut getStatut() {
        return statut;
    }
    
    public void setStatut(Statut statut){
        this.statut = statut;
    }

    public void changeCouleur(Couleur couleur){
        switch(couleur){
            case ORANGE:{
                this.couleur = new Color(255, 203, 96);
                break;
            }
            case VERT:{
                this.couleur = new Color(58, 242, 75);
                break;
            }
            case ROUGE:{
                this.couleur = new Color(255, 9, 33);
                break;
            }
            default :{// Gris
                this.couleur = new Color(204, 204, 255);
            }
        }
    }

    public void changeStatut(Statut statut){
        //TODO  ()
    }
    
    public void affichage(){
        System.out.println(emetteur.getNom() + " " + emetteur.getPrenom() + "\n" + text);
    }
    
}
