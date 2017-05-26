package gel;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import DefaultNamespace.GonderServiceLocator;

public class Islem {
	
	public static void main(String[] args) {
		
		GonderServiceLocator loc = new GonderServiceLocator();
		
		String veri ="";
		try {
			veri = loc.getGonder().guzelestir("mustafa");
		} catch (RemoteException | ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(veri);
	}

}
