/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 *
 * @author wataru
 */
public class Database {
    private Database(){
        
    }
    public static Properties getProperties(String dbname){
        
        String filename = dbname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch(IOException e){
            System.out.println("Warning; " + filename + " is not found.");
        }
        return prop;
    }
}
