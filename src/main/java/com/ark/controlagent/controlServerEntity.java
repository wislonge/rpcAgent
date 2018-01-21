package com.ark.controlagent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.apache.xmlrpc.server.PropertyHandlerMapping;  
import org.apache.xmlrpc.server.XmlRpcServer;  
import org.apache.xmlrpc.server.XmlRpcServerConfigImpl;  
import org.apache.xmlrpc.webserver.WebServer; 
import org.slf4j.ILoggerFactory;

/**
 *
 * @author william
 */
public class controlServerEntity {
     private static final int port = 9091;  
  
    public static void main(String[] args) throws Exception {  
        WebServer webServer = new WebServer(port);  
  
        XmlRpcServer xmlRpcServer = webServer.getXmlRpcServer();  
  
        PropertyHandlerMapping phm = new PropertyHandlerMapping();  
        phm.load(Thread.currentThread().getContextClassLoader(), "oracleDB.properties");  
        xmlRpcServer.setHandlerMapping(phm);  
        XmlRpcServerConfigImpl serverConfig = (XmlRpcServerConfigImpl) xmlRpcServer.getConfig();  
        serverConfig.setEnabledForExtensions(true);  
        serverConfig.setContentLengthOptional(false);  
  
        webServer.start();  
    }  
}
