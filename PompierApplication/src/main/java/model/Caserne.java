/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author eliot.villain
 */
public class Caserne {
    
    private int id_caserne;
    private String nom_caserne;
    private String rue_caserne;
    private String ville_caserne;
    private String codePostal_caserne;
    
    private ArrayList<Pompier> lesPompiers;
    private ArrayList<Engin> Engin_Cas;
    
    public Caserne(){
        
    }
    
    public Caserne(int id_caserne, String nom_caserne, String rue_caserne, String ville_caserne, String codePostal_caserne) {
        this.id_caserne = id_caserne;
        this.nom_caserne = nom_caserne;
        this.rue_caserne = rue_caserne;
        this.ville_caserne = ville_caserne;
        this.codePostal_caserne = codePostal_caserne;
    }

    public int getId_caserne() {
        return id_caserne;
    }

    public void setId_caserne(int id_caserne) {
        this.id_caserne = id_caserne;
    }

    public String getNom_caserne() {
        return nom_caserne;
    }

    public void setNom_caserne(String nom_caserne) {
        this.nom_caserne = nom_caserne;
    }

    public String getRue_caserne() {
        return rue_caserne;
    }

    public void setRue_caserne(String rue_caserne) {
        this.rue_caserne = rue_caserne;
    }

    public String getVille_caserne() {
        return ville_caserne;
    }

    public void setVille_caserne(String ville_caserne) {
        this.ville_caserne = ville_caserne;
    }

    public String getCodePostal_caserne() {
        return codePostal_caserne;
    }

    public void setCodePostal_caserne(String codePostal_caserne) {
        this.codePostal_caserne = codePostal_caserne;
    }

    public ArrayList<Pompier> getLesPompiers() {
        return lesPompiers;
    }

    public void setLesPompiers(ArrayList<Pompier> lesPompiers) {
        this.lesPompiers = lesPompiers;
    }
    
    public void addUnPompier(Pompier pUnPompier){
        if(lesPompiers == null){
            lesPompiers = new ArrayList<Pompier>();
        }
        lesPompiers.add(pUnPompier);
    }

    public ArrayList<Engin> getEngin_Cas() {
        return Engin_Cas;
    }

    public void setEngin_Cas(ArrayList<Engin> Engin_Cas) {
        this.Engin_Cas = Engin_Cas;
    }
}
