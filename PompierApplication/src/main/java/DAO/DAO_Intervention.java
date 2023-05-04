/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Intervention;

/**
 *
 * @author eliot.villain
 */
public class DAO_Intervention {
    
    Connection connection = null;
    static PreparedStatement requete = null;
    static ResultSet rs = null;
    
    public static Intervention getInterventionById_intervention(Connection connection, int Id_intervention){
        Intervention uneIntervention = new Intervention();
        try
        {
            requete = connection.prepareStatement("SELECT Id_intervention, lieu_intervention, date_intervention, heurAppel_intervention, duree_intervention, heureArrive_intervention, Id_engin, Id_situation FROM intervention WHERE Id_intervention = ?");
            requete.setInt(1, Id_intervention);
            rs = requete.executeQuery();
            if(rs.next()){
                
                uneIntervention.setId_intervention(rs.getInt("Id_intervention"));
                uneIntervention.setLieu_intervention(rs.getString("lieu_intervention"));
                uneIntervention.setDate_intervention(rs.getString("date_intervention"));
                uneIntervention.setHeurAppel_intervention(rs.getString("heureAppel_intervention"));
                uneIntervention.setDuree_intervention(rs.getString("duree_intervention"));
                uneIntervention.setHeureArrive_intervention(rs.getString("heureArrive_intervention"));
                uneIntervention.setId_engin(rs.getInt("Id_engin"));
                uneIntervention.setId_situation(rs.getInt("Id_situation"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return uneIntervention;
    }
}


