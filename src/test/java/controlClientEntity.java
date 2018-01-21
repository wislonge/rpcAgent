


import java.net.URL;
import org.apache.xmlrpc.XmlRpcException;  
import org.apache.xmlrpc.client.XmlRpcClient;  
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;  
public class controlClientEntity {  
        public static void main(String[] args) {  
            
            try {  
  
                XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();  
                config.setServerURL(new URL("http://127.0.0.1:9091/XML_RPC_Server/service"));  
  
                XmlRpcClient client = new XmlRpcClient();  
                client.setConfig(config);  
                Object[] params={"ps aux"};
                //Object[] params = new Object[]{new Integer(31), new Integer(9)};  
               // String result = (String) client.execute("MyCalculator.sayhello", params);  
                //String result = (String) client.execute("systembase.list", params);  
                String result = (String) client.execute("systembase.exeCmd", params); 
                System.out.println(result);  
  
            } catch (XmlRpcException e) {  
                e.printStackTrace();  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
  
        }  
    }  