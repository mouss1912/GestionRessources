/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionresourceuniversitaire;

/**
 *
 * @author M-D
 */
public class GestionResourceUniversitaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Utilisateur u1 = new Utilisateur("1", "paul", "jean", "111", TypeUtilisateur.USER_CAMPUS);
        Groupe grp1 = new Groupe("nom", TypeUtilisateur.USER_CAMPUS);
        Ticket t1 = new Ticket("tire", new Message(u1, "message"), grp1);
        t1.ecrire(u1, "okkkkkkkkkk");
        t1.affichageMessages();
        
    }
    
}
