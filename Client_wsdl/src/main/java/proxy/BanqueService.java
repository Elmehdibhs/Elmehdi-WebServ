
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "CoversionEuroToDH")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CoversionEuroToDH", targetNamespace = "http://ws/", className = "proxy.CoversionEuroToDH")
    @ResponseWrapper(localName = "CoversionEuroToDHResponse", targetNamespace = "http://ws/", className = "proxy.CoversionEuroToDHResponse")
    @Action(input = "http://ws/BanqueService/CoversionEuroToDHRequest", output = "http://ws/BanqueService/CoversionEuroToDHResponse")
    public double coversionEuroToDH(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://ws/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://ws/", className = "proxy.GetCompteResponse")
    @Action(input = "http://ws/BanqueService/getCompteRequest", output = "http://ws/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod(operationName = "ListCompte")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListCompte", targetNamespace = "http://ws/", className = "proxy.ListCompte")
    @ResponseWrapper(localName = "ListCompteResponse", targetNamespace = "http://ws/", className = "proxy.ListCompteResponse")
    @Action(input = "http://ws/BanqueService/ListCompteRequest", output = "http://ws/BanqueService/ListCompteResponse")
    public List<Compte> listCompte();

}