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
          System.out.println("CompteADO=");
        try{
            //preparation de la requête
            requete = connection.prepareStatement("SELECT * FROM pompier p, caserne c WHERE p.Id_caserne = c.Id_caserne AND p.numeroBip_pompier = ? AND p.mdp_pompier = ?");
            
            requete.setString(1, login);
            requete.setString(2, mdp);
            System.out.println("avant execute query="); 
            result = requete.executeQuery();
            //Erreur lors de l'éxecution de la Query
            //Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException
            //Erreur depuis que l'on essaie d'afficher la Caserne du pompier dans Frm_Connexion.java
            System.out.println("requeteSQL=" + requete);
            
            Pompier unPompier = new Pompier();
            
            if (result.next())
            {
                System.out.println("ddans rsnext");
                unPompier.setId_Pompier(result.getInt("Id_Pompier"));
                unPompier.setNom_pompier(result.getString("nom_pompier"));
                unPompier.setPrenom_pompier(result.getString("prenom_pompier"));
                unPompier.setDateNaissance_pompier(result.getString("dateNaissance_pompier"));
                unPompier.setNumeroBip_pompier(result.getString("numeroBip_pompier"));
                unPompier.setMdp_pompier(result.getString("mdp_pompier"));
                unPompier.setTel_pompier(result.getString("tel_pompier"));
                unPompier.setSexe_pompier(result.getString("sexe_pompier"));
                unPompier.setRole_pompier(result.getString("role_pompier"));
                             
                Caserne uneCaserne = new Caserne();
                uneCaserne.setId_caserne(result.getInt("Id_caserne"));
                uneCaserne.setNom_caserne(result.getString("nom_caserne"));
                uneCaserne.setRue_caserne(result.getString("rue_caserne"));
                uneCaserne.setVille_caserne(result.getString("ville_caserne"));
                uneCaserne.setCodePostal_caserne(result.getString("codePostal_caserne"));
                
                unPompier.setUneCaserne(uneCaserne);
                
                System.out.println("dao" + unPompier.getNom_pompier());
              
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
