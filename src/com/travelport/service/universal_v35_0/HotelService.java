package com.travelport.service.universal_v35_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-05-15T12:42:02.349-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebServiceClient(name = "HotelService", 
                  wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/universal_v35_0/UniversalRecord.wsdl",
                  targetNamespace = "http://www.travelport.com/service/universal_v35_0") 
public class HotelService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/universal_v35_0", "HotelService");
    public final static QName HotelReservationServicePort = new QName("http://www.travelport.com/service/universal_v35_0", "HotelReservationServicePort");
    public final static QName HotelCancelServicePort = new QName("http://www.travelport.com/service/universal_v35_0", "HotelCancelServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/universal_v35_0/UniversalRecord.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HotelService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/universal_v35_0/UniversalRecord.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HotelService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HotelService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HotelService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public HotelService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HotelService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HotelService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns HotelReservationServicePortType
     */
    @WebEndpoint(name = "HotelReservationServicePort")
    public HotelReservationServicePortType getHotelReservationServicePort() {
        return super.getPort(HotelReservationServicePort, HotelReservationServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelReservationServicePortType
     */
    @WebEndpoint(name = "HotelReservationServicePort")
    public HotelReservationServicePortType getHotelReservationServicePort(WebServiceFeature... features) {
        return super.getPort(HotelReservationServicePort, HotelReservationServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns HotelCancelServicePortType
     */
    @WebEndpoint(name = "HotelCancelServicePort")
    public HotelCancelServicePortType getHotelCancelServicePort() {
        return super.getPort(HotelCancelServicePort, HotelCancelServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelCancelServicePortType
     */
    @WebEndpoint(name = "HotelCancelServicePort")
    public HotelCancelServicePortType getHotelCancelServicePort(WebServiceFeature... features) {
        return super.getPort(HotelCancelServicePort, HotelCancelServicePortType.class, features);
    }

}