package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public interface ICustomerCheckService {
	
	Boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;

}
