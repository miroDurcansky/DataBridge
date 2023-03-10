
package eu.rcware.dev.esgdb;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HistoryDbAccessService", targetNamespace = "http://dev.rcware.eu/esgdb", wsdlLocation = "file:mervisdb_wsdl-2017-07-12.xml")
public class HistoryDbAccessService
    extends Service
{

    private final static URL HISTORYDBACCESSSERVICE_WSDL_LOCATION;
    private final static WebServiceException HISTORYDBACCESSSERVICE_EXCEPTION;
    private final static QName HISTORYDBACCESSSERVICE_QNAME = new QName("http://dev.rcware.eu/esgdb", "HistoryDbAccessService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:mervisdb_wsdl-2017-07-12.xml");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HISTORYDBACCESSSERVICE_WSDL_LOCATION = url;
        HISTORYDBACCESSSERVICE_EXCEPTION = e;
    }

    public HistoryDbAccessService() {
        super(__getWsdlLocation(), HISTORYDBACCESSSERVICE_QNAME);
    }

    public HistoryDbAccessService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HISTORYDBACCESSSERVICE_QNAME, features);
    }

    public HistoryDbAccessService(URL wsdlLocation) {
        super(wsdlLocation, HISTORYDBACCESSSERVICE_QNAME);
    }

    public HistoryDbAccessService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HISTORYDBACCESSSERVICE_QNAME, features);
    }

    public HistoryDbAccessService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HistoryDbAccessService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HistoryDbAccess
     */
    @WebEndpoint(name = "HistoryAccess")
    public HistoryDbAccess getHistoryAccess() {
        return super.getPort(new QName("http://dev.rcware.eu/esgdb", "HistoryAccess"), HistoryDbAccess.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HistoryDbAccess
     */
    @WebEndpoint(name = "HistoryAccess")
    public HistoryDbAccess getHistoryAccess(WebServiceFeature... features) {
        return super.getPort(new QName("http://dev.rcware.eu/esgdb", "HistoryAccess"), HistoryDbAccess.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HISTORYDBACCESSSERVICE_EXCEPTION!= null) {
            throw HISTORYDBACCESSSERVICE_EXCEPTION;
        }
        return HISTORYDBACCESSSERVICE_WSDL_LOCATION;
    }

}
