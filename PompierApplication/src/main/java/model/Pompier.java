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
public class Pompier {
    
    private int id_Pompier;
    private String nom_pompier;
    private String prenom_pompier;
    private String dateNaissance_pompier;
    private String numeroBip_pompier;
    private String mdp_pompier;
    private String tel_pompier;
    private String sexe_pompier;
    private String role_pompier;
    
    private Caserne uneCaserne;
    private ArrayList<Intervenir> uneIntervention;
    
    public Pompier(){
        
    }

    public Pompier(int id_Pompier, String nom_pompier, String prenom_pompier, String dateNaissance_pompier, String numeroBip_pompier, String mdp_pompier, String tel_pompier, String sexe_pompier, String role_pompier) {
        this.id_Pompier = id_Pompier;
        this.nom_pompier = nom_pompier;
        this.prenom_pompier = prenom_pompier;
        this.dateNaissance_pompier = dateNaissance_pompier;
        this.numeroBip_pompier = numeroBip_pompier;
        this.mdp_pompier = mdp_pompier;
        this.tel_pompier = tel_pompier;
        this.sexe_pompier = sexe_pompier;
        this.role_pompier = role_pompier;
    }

    
    public int getId_Pompier() {
        return id_Pompier;
    }

    public void setId_Pompier(int id_Pompier) {
        this.id_Pompier = id_Pompier;
    }

    public String getNom_pompier() {
        return nom_pompier;
    }

    public void setNom_pompier(String nom_pompier) {
        this.nom_pompier = nom_pompier;
    }

    public String getPrenom_pompier() {
        return prenom_pompier;
    }

    public void setPrenom_pompier(String prenom_pompier) {
        this.prenom_pompier = prenom_pompier;
    }

    public String getDateNaissance_pompier() {
        return dateNaissance_pompier;
    }

    public void setDateNaissance_pompier(String dateNaissance_pompier) {
        this.dateNaissance_pompier = dateNaissance_pompier;
    }

    public String getNumeroBip_pompier() {
        return numeroBip_pompier;
    }

    public void setNumeroBip_pompier(String numeroBip_pompier) {
        this.numeroBip_pompier = numeroBip_pompier;
    }

    public String getMdp_pompier() {
        return mdp_pompier;
    }

    public void setMdp_pompier(String mdp_pompier) {
        this.mdp_pompier = mdp_pompier;
    }
    
    public String getTel_pompier() {
        return tel_pompier;
    }

    public void setTel_pompier(String tel_pompier) {
        this.tel_pompier = tel_pompier;
    }

    public String getSexe_pompier() {
        return sexe_pompier;
    }

    public void setSexe_pompier(String sexe_pompier) {
        this.sexe_pompier = sexe_pompier;
    }
    
    public String getRole_pompier() {
        return role_pompier;
    }
    
    public void setRole_pompier(String role_pompier) {
        this.role_pompier = role_pompier;
    }

    public Caserne getUneCaserne() {
        return uneCaserne;
    }

    public void setUneCaserne(Caserne uneCaserne) {
        this.uneCaserne = uneCaserne;
    }

    public ArrayList<Intervenir> getUneIntervention() {
        return uneIntervention;
    }

    public void setUneIntervention(ArrayList<Intervenir> uneIntervention) {
        this.uneIntervention = uneIntervention;
    } 

    
}
