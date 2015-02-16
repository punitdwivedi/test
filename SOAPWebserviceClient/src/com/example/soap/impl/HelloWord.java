
package com.example.soap.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.example.soap.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWord", targetNamespace = "http://soap.example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWord {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "helloWord", targetNamespace = "http://soap.example.com/", className = "com.example.soap.HelloWord")
    @ResponseWrapper(localName = "helloWordResponse", targetNamespace = "http://soap.example.com/", className = "com.example.soap.HelloWordResponse")
    @Action(input = "http://soap.example.com/HelloWord/helloWordRequest", output = "http://soap.example.com/HelloWord/helloWordResponse")
    public String helloWord(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
