package org.bellatrix.services.ws.pos;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.15
 * 2020-04-13T08:54:20.365+07:00
 * Generated source version: 2.7.15
 * 
 */
@WebService(targetNamespace = "http://services.bellatrix.org/", name = "Pos")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Pos {

    @WebMethod(action = "posInquiry")
    @WebResult(name = "posInquiryResponse", targetNamespace = "http://services.bellatrix.org/", partName = "posInquiryResponse")
    public PosInquiryResponse posInquiry(
        @WebParam(partName = "headerAuth", mode = WebParam.Mode.INOUT, name = "headerAuth", targetNamespace = "http://services.bellatrix.org/", header = true)
        javax.xml.ws.Holder<Header> headerAuth,
        @WebParam(partName = "posInquiry", name = "posInquiry", targetNamespace = "http://services.bellatrix.org/")
        PosInquiryRequest posInquiry
    ) throws Exception_Exception;

    @WebMethod(action = "posPayment")
    @WebResult(name = "posPaymentResponse", targetNamespace = "http://services.bellatrix.org/", partName = "posPaymentResponse")
    public PosPaymentResponse posPayment(
        @WebParam(partName = "headerAuth", mode = WebParam.Mode.INOUT, name = "headerAuth", targetNamespace = "http://services.bellatrix.org/", header = true)
        javax.xml.ws.Holder<Header> headerAuth,
        @WebParam(partName = "posPayment", name = "posPayment", targetNamespace = "http://services.bellatrix.org/")
        PosPaymentRequest posPayment
    ) throws Exception_Exception;

    @WebMethod(action = "updatePOS")
    public void updatePOS(
        @WebParam(partName = "headerAuth", mode = WebParam.Mode.INOUT, name = "headerAuth", targetNamespace = "http://services.bellatrix.org/", header = true)
        javax.xml.ws.Holder<Header> headerAuth,
        @WebParam(partName = "updatePOS", name = "updatePOS", targetNamespace = "http://services.bellatrix.org/")
        UpdatePOSRequest updatePOS
    ) throws Exception_Exception;

    @WebMethod(action = "registerPOS")
    public void registerPOS(
        @WebParam(partName = "headerAuth", mode = WebParam.Mode.INOUT, name = "headerAuth", targetNamespace = "http://services.bellatrix.org/", header = true)
        javax.xml.ws.Holder<Header> headerAuth,
        @WebParam(partName = "registerPOS", name = "registerPOS", targetNamespace = "http://services.bellatrix.org/")
        RegisterPOSRequest registerPOS
    ) throws Exception_Exception;

    @WebMethod(action = "deletePOS")
    public void deletePOS(
        @WebParam(partName = "headerAuth", mode = WebParam.Mode.INOUT, name = "headerAuth", targetNamespace = "http://services.bellatrix.org/", header = true)
        javax.xml.ws.Holder<Header> headerAuth,
        @WebParam(partName = "deletePOS", name = "deletePOS", targetNamespace = "http://services.bellatrix.org/")
        DeletePOSRequest deletePOS
    ) throws Exception_Exception;

    @WebMethod(action = "posGenerateInvoice")
    @WebResult(name = "posGenerateInvoiceResponse", targetNamespace = "http://services.bellatrix.org/", partName = "posGenerateInvoiceResponse")
    public PosCreateInvoiceResponse posGenerateInvoice(
        @WebParam(partName = "headerAuth", mode = WebParam.Mode.INOUT, name = "headerAuth", targetNamespace = "http://services.bellatrix.org/", header = true)
        javax.xml.ws.Holder<Header> headerAuth,
        @WebParam(partName = "posGenerateInvoice", name = "posGenerateInvoice", targetNamespace = "http://services.bellatrix.org/")
        PosCreateInvoiceRequest posGenerateInvoice
    ) throws Exception_Exception;

    @WebMethod(action = "loadTerminalByID")
    @WebResult(name = "loadTerminalByIDResponse", targetNamespace = "http://services.bellatrix.org/", partName = "loadTerminalByIDResponse")
    public TerminalInquiryResponse loadTerminalByID(
        @WebParam(partName = "headerAuth", mode = WebParam.Mode.INOUT, name = "headerAuth", targetNamespace = "http://services.bellatrix.org/", header = true)
        javax.xml.ws.Holder<Header> headerAuth,
        @WebParam(partName = "loadTerminalByID", name = "loadTerminalByID", targetNamespace = "http://services.bellatrix.org/")
        LoadTerminalByIDRequest loadTerminalByID
    ) throws Exception_Exception;

    @WebMethod(action = "loadTerminalByUsername")
    @WebResult(name = "loadTerminalByUsernameResponse", targetNamespace = "http://services.bellatrix.org/", partName = "loadTerminalByUsernameResponse")
    public TerminalInquiryResponse loadTerminalByUsername(
        @WebParam(partName = "headerAuth", mode = WebParam.Mode.INOUT, name = "headerAuth", targetNamespace = "http://services.bellatrix.org/", header = true)
        javax.xml.ws.Holder<Header> headerAuth,
        @WebParam(partName = "loadTerminalByUsername", name = "loadTerminalByUsername", targetNamespace = "http://services.bellatrix.org/")
        LoadTerminalByUsernameRequest loadTerminalByUsername
    ) throws Exception_Exception;
}
