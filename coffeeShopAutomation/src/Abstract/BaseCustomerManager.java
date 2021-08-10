package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void Save(Customer customer) throws NumberFormatException, RemoteException {
		
         System.out.println("Saved to database " + customer.getFirstName());		
	}



}
