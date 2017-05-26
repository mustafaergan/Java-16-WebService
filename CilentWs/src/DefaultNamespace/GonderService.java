/**
 * GonderService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public interface GonderService extends javax.xml.rpc.Service {
    public java.lang.String getGonderAddress();

    public DefaultNamespace.Gonder getGonder() throws javax.xml.rpc.ServiceException;

    public DefaultNamespace.Gonder getGonder(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
