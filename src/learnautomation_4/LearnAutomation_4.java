/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnautomation_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author tusshar
 */
public class LearnAutomation_4 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File file1 = new File("C:\\Users\\tusshar\\Documents\\NetBeansProjects\\LearnAutomation_4\\src\\learnautomation_4\\config.properties");
        FileInputStream fis= new FileInputStream (file1);
        
        Properties pro = new Properties();
        pro.load(fis);
        String urldemo=pro.getProperty("URL");
        System.out.println(urldemo);
        String uname=pro.getProperty("Username");
        System.out.println(uname);
        String pwd=pro.getProperty("Password");
        System.out.println(pwd);
        
        
        
        
    }
    
}
