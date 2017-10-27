/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.SQLException;

/**
 *
 * @author formation
 */
interface DAOInterface<T0, T1> {
 

    DAOInterface(Data entity) throws SQLException;
    
    delete(Data entity) throws SQLException;
    
    deleteOneById(Data entity) throws SQLException;

    DataDAO findOneById(int id) throws SQLException;



}
