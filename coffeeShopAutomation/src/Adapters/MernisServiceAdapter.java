package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{
	KPSPublicSoapProxy client = new KPSPublicSoapProxy();

	@Override
	public Boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		
		boolean result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalId()),customer.getFirstName().toUpperCase(), customer.getFirstName().toUpperCase(), customer.getDateOfBirth());
		if(result == true)
		{
			System.out.println("Succesful");
			return true;
			
		}else {
			System.out.println("Unseccesfull");
			return false;
		}
		


		
	}

}
