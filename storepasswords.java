
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aparna
 */
public class storepasswords {
    static private LinkedHashMap<String,String> map=new LinkedHashMap();;
    static public LinkedHashMap getref(){
        map.put("system","root");
        map.put("admin","root");
        return map;
    }   
    static public void dispaly(){
    System.out.print(getref());    
    }
    public static void main(String args[]){
    dispaly();
    } 
}
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    
    public static void save(){
        
    }
    public static void store(String username,String password){
        File file = new File("C:\\Users\\Aparna\\Documents\\NetBeansProjects\\aqua_tica\\src\\login_cred\\newfile.bin");
        byte[] name =username.getBytes();
        byte[] pass=password.getBytes();
        try (FileWriter f = new FileWriter(file, true); 
                BufferedWriter b = new BufferedWriter(f); 
                PrintWriter p = new PrintWriter(b);) 
        { 
            for(byte a:name){
                p.print(a);
            }    
            p.print(":");
            for(byte a:pass){
                p.print(a);
            }
            p.println();
        } catch (IOException i) 
        {System.out.print(i);}
    }
    public static void getUsername(){
            
    }
    public static String getPassword(){
        return "";
    }
    public static void main(String args[]){
        //store("poojith","Poojith_0");
       getUsername();
    }
    
}*/
