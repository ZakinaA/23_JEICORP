/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author eliot.villain
 */
public class Engin {
    
    private int Id_engin;
    private String nom_engin;
    
    private TypeEngin unTypeEngin;
    private Caserne Cas_Engin;
    private Intervention Inter_Engin;
    
    public Engin(){ 
    }

    public Engin(int Id_engin, String nom_engin) {
        this.Id_engin = Id_engin;
        this.nom_engin = nom_engin;
    }

    public int getId_engin() {
        return Id_engin;
    }

    public void setId_engin(int Id_engin) {
        this.Id_engin = Id_engin;
    }

    public String getNom_engin() {
        return nom_engin;
    }

    public void setNom_engin(String nom_engin) {
        this.nom_engin = nom_engin;
    }

    public TypeEngin getUnTypeEngin() {
        return unTypeEngin;
    }

    public void setUnTypeEngin(TypeEngin unTypeEngin) {
        this.unTypeEngin = unTypeEngin;
    }

    public Caserne getCas_Engin() {
        return Cas_Engin;
    }

    public void setCas_Engin(Caserne Cas_Engin) {
        this.Cas_Engin = Cas_Engin;
    }

    public Intervention getInter_Engin() {
        return Inter_Engin;
    }

    public void setInter_Engin(Intervention Inter_Engin) {
        this.Inter_Engin = Inter_Engin;
    }
}
