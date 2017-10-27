/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author formation
 */
class DataDAO implements DAOInterface<Data, DataDAO>{
      private Connection dbconnection;

    private PreparedStatement pStatement;

    private ResultSet resultSet;
    
    
    public DataDAO(Connection dbconnection) {
        this.dbconnection = dbconnection;
      
        
        
        return ;
        
    }
     private int insert(Data entity) throws SQLException {
        String sql = "INSERT INTO Data (id, tache, categorie) values(?,?,?)";
        pStatement = dbconnection.prepareCall(sql);
        PreparedStatement setString;
        pStatement.setInt(1, getId());
        pStatement.setString(2, entity.getCategorie());
        pStatement.setString(3, String.valueOf(entity.getCategorie()));

        return pStatement.executeUpdate();
    }

    private int delete(Data entity) throws SQLException {
        String sql = "DELETE Data SET tache = ?, categorie = ?, WHERE id = ?";
        pStatement = dbconnection.prepareCall(sql);
        pStatement.setString(1, entity.getTache());
        pStatement.setString(2, entity.getCategorie());
        pStatement.setInt(3, getId());

        return pStatement.executeUpdate();
    }

    /**
     * suppression d'une entité en fonction de son identification
     *
     * @param entity
     */

    public void deleteOneById(Data entity) throws SQLException {
        if (entity.getId() != null) {
            String sql = "DELETE FROM Data WHERE id = ?";
            pStatement = dbconnection.prepareCall(sql);
            pStatement.setInt(1, getId());
            pStatement.executeUpdate();
        }
    }

    public DataDAO findOneById(int id) throws SQLException {

        String sql = "SELECT * FROM student WHERE id = ?";
        pStatement = dbconnection.prepareCall(sql);
        pStatement.setInt(1, id);
        resultSet = pStatement.executeQuery();

        return this;
    }

    private int getId() {
        throw new UnsupportedOperationException("Not supported yet."); 
    
    }

    
    
    
    

    

   

   
   
}///fin de class


