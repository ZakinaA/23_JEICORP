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
public class TypeEngin {
    
    private int Id_typeEngin;
    private String libelle_typeEngin;
    
    private ArrayList<Engin> unEngin; 
    
    public TypeEngin(){   
    }

    public TypeEngin(int Id_typeEngin, String libelle_typeEngin) {
        this.Id_typeEngin = Id_typeEngin;
        this.libelle_typeEngin = libelle_typeEngin;
    }

    public int getId_typeEngin() {
        return Id_typeEngin;
    }

    public void setId_typeEngin(int Id_typeEngin) {
        this.Id_typeEngin = Id_typeEngin;
    }

    public String getLibelle_typeEngin() {
        return libelle_typeEngin;
    }

    public void setLibelle_typeEngin(String libelle_typeEngin) {
        this.libelle_typeEngin = libelle_typeEngin;
    }

    public ArrayList<Engin> getUnEngin() {
        return unEngin;
    }

    public void setUnEngin(ArrayList<Engin> unEngin) {
        this.unEngin = unEngin;
    }
}
