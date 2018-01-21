/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ark.controlagent;
import java.io.BufferedReader;  
import java.io.InputStreamReader; 
/**
 *
 * @author william
 */
public class systembase {
    
   public String exeCmd(String commandStr) {  
        BufferedReader br = null;
        String ret=null;
        try {  
            Process p = Runtime.getRuntime().exec(commandStr);  
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));  
            String line = null;  
            StringBuilder sb = new StringBuilder();  
            while ((line = br.readLine()) != null) {  
                sb.append(line + "\n");  
            }  
            ret=sb.toString();
            System.out.println(ret);  
            
        } catch (Exception e) {  
            e.printStackTrace();  
        }   
        finally  
        {  
            if (br != null)  
            {  
                try {  
                    br.close();  
                } catch (Exception e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
        return ret;
    }  
}
