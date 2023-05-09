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
public class Situation {
    
    private int id_situation;
    private String libelle_situation;
    
    private ArrayList<Intervention> Inter_Sit;
    
    public Situation(){  
    }

    public Situation(int id_situation, String libelle_situation) {
        this.id_situation = id_situation;
        this.libelle_situation = libelle_situation;
    }

    public int getId_situation() {
        return id_situation;
    }

    public void setId_situation(int id_situation) {
        this.id_situation = id_situation;
    }

    public String getLibelle_situation() {
        return libelle_situation;
    }

    public void setLibelle_situation(String libelle_situation) {
        this.libelle_situation = libelle_situation;
    }

    public ArrayList<Intervention> getInter_Sit() {
        return Inter_Sit;
    }

    public void setInter_Sit(ArrayList<Intervention> Inter_Sit) {
        this.Inter_Sit = Inter_Sit;
    }
}
