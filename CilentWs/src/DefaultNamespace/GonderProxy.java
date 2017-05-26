package DefaultNamespace;

public class GonderProxy implements DefaultNamespace.Gonder {
  private String _endpoint = null;
  private DefaultNamespace.Gonder gonder = null;
  
  public GonderProxy() {
    _initGonderProxy();
  }
  
  public GonderProxy(String endpoint) {
    _endpoint = endpoint;
    _initGonderProxy();
  }
  
  private void _initGonderProxy() {
    try {
      gonder = (new DefaultNamespace.GonderServiceLocator()).getGonder();
      if (gonder != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)gonder)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)gonder)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (gonder != null)
      ((javax.xml.rpc.Stub)gonder)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.Gonder getGonder() {
    if (gonder == null)
      _initGonderProxy();
    return gonder;
  }
  
  public java.lang.String guzelestir(java.lang.String veri) throws java.rmi.RemoteException{
    if (gonder == null)
      _initGonderProxy();
    return gonder.guzelestir(veri);
  }
  
  
}