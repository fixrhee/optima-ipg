package org.bellatrix.services.ws.message;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.15
 * 2020-05-15T10:35:32.054+07:00
 * Generated source version: 2.7.15
 * 
 */
@WebService(targetNamespace = "http://services.bellatrix.org/", name = "Message")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Message {

    @WebMethod(action = "loadMessageByID")
    @WebResult(name = "loadMessageByIDResponse", targetNamespace = "http://services.bellatrix.org/", partName = "loadMessageByIDResponse")
    public LoadMessageResponse loadMessageByID(
        @WebParam(partName = "headerAuth", mode = WebParam.Mode.INOUT, name = "headerAuth", targetNamespace = "http://services.bellatrix.org/", header = true)
        javax.xml.ws.Holder<Header> headerAuth,
        @WebParam(partName = "loadMessageByID", name = "loadMessageByID", targetNamespace = "http://services.bellatrix.org/")
        LoadMessageByIDRequest loadMessageByID
    );

    @WebMethod(action = "deleteMessage")
    public void deleteMessage(
        @WebParam(partName = "headerAuth", mode = WebParam.Mode.INOUT, name = "headerAuth", targetNamespace = "http://services.bellatrix.org/", header = true)
        javax.xml.ws.Holder<Header> headerAuth,
        @WebParam(partName = "deleteMessage", name = "deleteMessage", targetNamespace = "http://services.bellatrix.org/")
        MessageRequest deleteMessage
    ) throws Exception_Exception;

    @WebMethod(action = "sendMessage")
    public void sendMessage(
        @WebParam(partName = "headerAuth", mode = WebParam.Mode.INOUT, name = "headerAuth", targetNamespace = "http://services.bellatrix.org/", header = true)
        javax.xml.ws.Holder<Header> headerAuth,
        @WebParam(partName = "sendMessage", name = "sendMessage", targetNamespace = "http://services.bellatrix.org/")
        SendMessageRequest sendMessage
    ) throws Exception_Exception;

    @WebMethod(action = "countUnreadMessage")
    @WebResult(name = "countUnreadMessageResponse", targetNamespace = "http://services.bellatrix.org/", partName = "countUnreadMessageResponse")
    public UnreadMessage countUnreadMessage(
        @WebParam(partName = "headerAuth", mode = WebParam.Mode.INOUT, name = "headerAuth", targetNamespace = "http://services.bellatrix.org/", header = true)
        javax.xml.ws.Holder<Header> headerAuth,
        @WebParam(partName = "countUnreadMessage", name = "countUnreadMessage", targetNamespace = "http://services.bellatrix.org/")
        LoadMessageByUsernameRequest countUnreadMessage
    );

    @WebMethod(action = "flagMessageReadByID")
    public void flagMessageReadByID(
        @WebParam(partName = "headerAuth", mode = WebParam.Mode.INOUT, name = "headerAuth", targetNamespace = "http://services.bellatrix.org/", header = true)
        javax.xml.ws.Holder<Header> headerAuth,
        @WebParam(partName = "flagMessageReadByID", name = "flagMessageReadByID", targetNamespace = "http://services.bellatrix.org/")
        MessageRequest flagMessageReadByID
    ) throws Exception_Exception;

    @WebMethod(action = "loadMessageByUsername")
    @WebResult(name = "loadMessageByUsernameResponse", targetNamespace = "http://services.bellatrix.org/", partName = "loadMessageByUsernameResponse")
    public LoadMessageResponse loadMessageByUsername(
        @WebParam(partName = "headerAuth", mode = WebParam.Mode.INOUT, name = "headerAuth", targetNamespace = "http://services.bellatrix.org/", header = true)
        javax.xml.ws.Holder<Header> headerAuth,
        @WebParam(partName = "loadMessageByUsername", name = "loadMessageByUsername", targetNamespace = "http://services.bellatrix.org/")
        LoadMessageByUsernameRequest loadMessageByUsername
    );
}
