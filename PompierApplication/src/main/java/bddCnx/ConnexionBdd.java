/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bddCnx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ts1sio
 */
public class ConnexionBdd {
    
    public static Connection connection = null;
    public static Statement statement = null;
    public static ResultSet result = null;
    
    //Méthode de création et d'ouverture de la connexion à la base de données 
    public static Connection ouvrirConnexion(){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Pilote MARIADB JDBC chargé");
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            //obtention de la connexion
            connection = DriverManager.getConnection("jdbc:mariadb://172.20.177.77:3306/23JEICORP", "ADM_JEICOROP", "mpEijcorp");
            System.out.println("Connexion OK");
        } catch(SQLException e){
            e.printStackTrace();
        }
        return connection;
    }
    
    //méthode de fermeture du ResultSet
    public static void fermerConnexion(ResultSet result){
        if(result != null){
            try{
                result.close();
            } catch(Exception e){
                System.out.println("Erreur lors de la fermeture d’une connexion dans fermerConnexion(ResultSet result)");
            }
        }
    }
    
    //Méthode de fermeture de la statement
    public static void fermerConnexion(Statement statement){
        if(statement != null){
            try{
                statement.close();
            } catch(Exception e){
                System.out.println("Erreur lors de la fermeture d’une connexion dans fermerConnexion(Statement statement)");
            }
        }
    }
    
    public static void fermerConnexion(Connection connection){
        if(connection != null){
            try{
                connection.close();
                System.out.println("Fermeture Connexion OK");
            } catch(Exception e){
                System.out.println("Erreur lors de la fermeture d’une connexion dans fermerConnexion(Connection connection)");
            }
        }
    }
}
