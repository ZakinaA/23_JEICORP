/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author eliot.villain
 */
public class Intervention {
    
    private int id_intervention;
    private String lieu_intervention;
    private String date_intervention;
    private String heurAppel_intervention;
    private String duree_intervention;
    private String heureArrive_intervention;
    
    public Intervention(){
    }

    public Intervention(int id_intervention, String lieu_intervention, String date_intervention, String heurAppel_intervention, String duree_intervention, String heureArrive_intervention) {
        this.id_intervention = id_intervention;
        this.lieu_intervention = lieu_intervention;
        this.date_intervention = date_intervention;
        this.heurAppel_intervention = heurAppel_intervention;
        this.duree_intervention = duree_intervention;
        this.heureArrive_intervention = heureArrive_intervention;
    }

    public int getId_intervention() {
        return id_intervention;
    }

    public void setId_intervention(int id_intervention) {
        this.id_intervention = id_intervention;
    }

    public String getLieu_intervention() {
        return lieu_intervention;
    }

    public void setLieu_intervention(String lieu_intervention) {
        this.lieu_intervention = lieu_intervention;
    }

    public String getDate_intervention() {
        return date_intervention;
    }

    public void setDate_intervention(String date_intervention) {
        this.date_intervention = date_intervention;
    }

    public String getHeurAppel_intervention() {
        return heurAppel_intervention;
    }

    public void setHeurAppel_intervention(String heurAppel_intervention) {
        this.heurAppel_intervention = heurAppel_intervention;
    }

    public String getDuree_intervention() {
        return duree_intervention;
    }

    public void setDuree_intervention(String duree_intervention) {
        this.duree_intervention = duree_intervention;
    }

    public String getHeureArrive_intervention() {
        return heureArrive_intervention;
    }

    public void setHeureArrive_intervention(String heureArrive_intervention) {
        this.heureArrive_intervention = heureArrive_intervention;
    }
}
