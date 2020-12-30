/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionresourceuniversitaire;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author M-D
 */
public class Arbre {

    private Set<Noeud> noeuds = new HashSet<>();
    
    public Arbre(){
        //TODO a faire
        
    }
    
    public void addNoeud(Noeud noeud){
        noeuds.add(noeud);
    }
    
    public void removeNoeud(Noeud noeud){
        noeuds.remove(noeud); 
    }

    public Set<Noeud> getNoeuds() {
        return noeuds;
    }
    
}
