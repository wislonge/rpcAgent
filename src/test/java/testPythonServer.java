/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author william
 */



import java.net.URL;
import org.apache.xmlrpc.XmlRpcException;  
import org.apache.xmlrpc.client.XmlRpcClient;  
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;  
public class testPythonServer {  
        public static void main(String[] args) {  
            
            try {  
  
                XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();  
                config.setServerURL(new URL("http://127.0.0.1:8000"));  
  
                XmlRpcClient client = new XmlRpcClient();  
                client.setConfig(config);  
                Object[] params={};
                String result=client.execute("today", params).toString();
                System.out.println(result);  
  
            } catch (XmlRpcException e) {  
                e.printStackTrace();  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
  
        }  
    }  
