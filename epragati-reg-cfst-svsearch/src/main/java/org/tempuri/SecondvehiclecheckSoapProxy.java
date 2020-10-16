package org.tempuri;

public class SecondvehiclecheckSoapProxy implements org.tempuri.SecondvehiclecheckSoap {
  private String _endpoint = null;
  private org.tempuri.SecondvehiclecheckSoap secondvehiclecheckSoap = null;
  
  public SecondvehiclecheckSoapProxy() {
    _initSecondvehiclecheckSoapProxy();
  }
  
  public SecondvehiclecheckSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initSecondvehiclecheckSoapProxy();
  }
  
  private void _initSecondvehiclecheckSoapProxy() {
    try {
      secondvehiclecheckSoap = (new org.tempuri.SecondvehiclecheckLocator()).getSecondvehiclecheckSoap();
      if (secondvehiclecheckSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)secondvehiclecheckSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)secondvehiclecheckSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (secondvehiclecheckSoap != null)
      ((javax.xml.rpc.Stub)secondvehiclecheckSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.SecondvehiclecheckSoap getSecondvehiclecheckSoap() {
    if (secondvehiclecheckSoap == null)
      _initSecondvehiclecheckSoapProxy();
    return secondvehiclecheckSoap;
  }
  
  public java.lang.String getsecondvehiclecheckforotsiDealer(java.lang.String strFName, java.lang.String strFHName, java.lang.String strLName, java.lang.String strDOB) throws java.rmi.RemoteException{
    if (secondvehiclecheckSoap == null)
      _initSecondvehiclecheckSoapProxy();
    return secondvehiclecheckSoap.getsecondvehiclecheckforotsiDealer(strFName, strFHName, strLName, strDOB);
  }
  
  
}