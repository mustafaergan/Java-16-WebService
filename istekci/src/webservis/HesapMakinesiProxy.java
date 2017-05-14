package webservis;

public class HesapMakinesiProxy implements webservis.HesapMakinesi {
  private String _endpoint = null;
  private webservis.HesapMakinesi hesapMakinesi = null;
  
  public HesapMakinesiProxy() {
    _initHesapMakinesiProxy();
  }
  
  public HesapMakinesiProxy(String endpoint) {
    _endpoint = endpoint;
    _initHesapMakinesiProxy();
  }
  
  private void _initHesapMakinesiProxy() {
    try {
      hesapMakinesi = (new webservis.HesapMakinesiServiceLocator()).getHesapMakinesi();
      if (hesapMakinesi != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)hesapMakinesi)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)hesapMakinesi)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (hesapMakinesi != null)
      ((javax.xml.rpc.Stub)hesapMakinesi)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservis.HesapMakinesi getHesapMakinesi() {
    if (hesapMakinesi == null)
      _initHesapMakinesiProxy();
    return hesapMakinesi;
  }
  
  public int cikarma(int a, int b) throws java.rmi.RemoteException{
    if (hesapMakinesi == null)
      _initHesapMakinesiProxy();
    return hesapMakinesi.cikarma(a, b);
  }
  
  public double carpma(int a, int b) throws java.rmi.RemoteException{
    if (hesapMakinesi == null)
      _initHesapMakinesiProxy();
    return hesapMakinesi.carpma(a, b);
  }
  
  public int toplama(int a, int b) throws java.rmi.RemoteException{
    if (hesapMakinesi == null)
      _initHesapMakinesiProxy();
    return hesapMakinesi.toplama(a, b);
  }
  
  public double bolme(int a, int b) throws java.rmi.RemoteException{
    if (hesapMakinesi == null)
      _initHesapMakinesiProxy();
    return hesapMakinesi.bolme(a, b);
  }
  
  
}