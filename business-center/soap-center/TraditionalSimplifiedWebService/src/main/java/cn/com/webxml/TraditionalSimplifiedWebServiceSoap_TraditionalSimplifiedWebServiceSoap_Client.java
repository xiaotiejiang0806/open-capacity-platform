
package cn.com.webxml;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.12
 * Wed Nov 28 11:56:24 GMT+08:00 2018
 * Generated source version: 2.2.12
 * 
 */

public final class TraditionalSimplifiedWebServiceSoap_TraditionalSimplifiedWebServiceSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://webxml.com.cn/", "TraditionalSimplifiedWebService");

    private TraditionalSimplifiedWebServiceSoap_TraditionalSimplifiedWebServiceSoap_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = TraditionalSimplifiedWebService.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        TraditionalSimplifiedWebService ss = new TraditionalSimplifiedWebService(wsdlURL, SERVICE_NAME);
        TraditionalSimplifiedWebServiceSoap port = ss.getTraditionalSimplifiedWebServiceSoap();  
        
        {
        System.out.println("Invoking toTraditionalChinese...");
        java.lang.String _toTraditionalChinese_sText = "学";
        java.lang.String _toTraditionalChinese__return = port.toTraditionalChinese(_toTraditionalChinese_sText);
        System.out.println("toTraditionalChinese.result=" + _toTraditionalChinese__return);


        }
        {
        System.out.println("Invoking toSimplifiedChinese...");
        java.lang.String _toSimplifiedChinese_sText = "学";
        java.lang.String _toSimplifiedChinese__return = port.toSimplifiedChinese(_toSimplifiedChinese_sText);
        System.out.println("toSimplifiedChinese.result=" + _toSimplifiedChinese__return);


        }

        System.exit(0);
    }

}
