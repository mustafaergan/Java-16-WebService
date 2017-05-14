package karsilayici;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import webservis.HesapMakinesiServiceLocator;

public class Matematik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HesapMakinesiServiceLocator hs = new HesapMakinesiServiceLocator();
		
		try {
			int deger = hs.getHesapMakinesi().toplama(5, 6);
			
			System.out.println("*****toplama******");
			System.out.println(deger);
			
			System.out.println("******çýkarma*******");
			
			int cik = hs.getHesapMakinesi().cikarma(10, 4);
			System.out.println(cik);
			
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
