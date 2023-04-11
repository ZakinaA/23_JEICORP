/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import bddCnx.ConnexionBdd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Caserne;
import model.Pompier;

/**
 *
 * @author ts1sio
 */
public class compteDAO {
    
    Connection connection = null;
    static PreparedStatement requete = null;
    static ResultSet result = null;
    
    public static Pompier getPompier(Connection connection, String login, String mdp){
        
        try{
            //preparation de la requête
            requete = connection.prepareStatement("SELECT * FROM pompier WHERE numeorBip_pompier = ? AND mdp_pompier = ?");
            requete.setString(1, login);
            requete.setString(2, mdp);
            
            result = requete.executeQuery();
            
            Pompier unPompier = new Pompier();
            
            if(result.next()){
                unPompier.setId_Pompier(result.getInt("Id_Pompier"));
                unPompier.setNom_pompier(result.getString("nom_pompier"));
                unPompier.setPrenom_pompier(result.getString("prenom_pompier"));
                unPompier.setDateNaissance_pompier(result.getString("dateNaissance_pompier"));
                unPompier.setNumeroBip_pompier(result.getString("numeroBip_pompier"));
                unPompier.setMdp_pompier(result.getString("mdp_pompier"));
                unPompier.setTel_pompier(result.getString("tel_pompier"));
                unPompier.setSexe_pompier(result.getString("sexe_pompier"));
                
                Caserne uneCaserne = new Caserne();
                uneCaserne.setId_caserne(result.getInt("Id_caserne"));
                
                unPompier.setUneCaserne(uneCaserne);
                ConnexionBdd.fermerConnexion(result);
                ConnexionBdd.fermerConnexion(requete);
                return unPompier;
            } else {
                return null;
            }
        } catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
