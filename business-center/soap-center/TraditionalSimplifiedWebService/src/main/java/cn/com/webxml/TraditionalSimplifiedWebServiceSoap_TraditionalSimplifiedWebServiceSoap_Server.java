
package cn.com.webxml;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.2.12
 * Wed Nov 28 11:56:24 GMT+08:00 2018
 * Generated source version: 2.2.12
 * 
 */
 
public class TraditionalSimplifiedWebServiceSoap_TraditionalSimplifiedWebServiceSoap_Server{

    protected TraditionalSimplifiedWebServiceSoap_TraditionalSimplifiedWebServiceSoap_Server() throws Exception {
        System.out.println("Starting Server");
        Object implementor = new TraditionalSimplifiedWebServiceHttpPostImpl();
        String address = "http://www.webxml.com.cn/WebServices/TraditionalSimplifiedWebService.asmx";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws Exception { 
        new TraditionalSimplifiedWebServiceSoap_TraditionalSimplifiedWebServiceSoap_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}