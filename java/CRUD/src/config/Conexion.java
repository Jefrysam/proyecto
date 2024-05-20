/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

/* Luis Anibal Delgado
   Programacion Orientada a Objetos
   grupo 52259
Participantes: Anibal Delgado 
Aca 1 final
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con;    
    public Conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios","root","");
        } catch (ClassNotFoundException | SQLException e){
        
        }
        
    }
    public Connection getConnection(){
            return con;
        }
}
