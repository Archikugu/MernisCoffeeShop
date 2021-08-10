package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService customerCheckService;	
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	
	}
	
	
	@Override
	public void Save(Customer customer) throws NumberFormatException, RemoteException {

		if (customerCheckService.CheckIfRealPerson(customer)) {
			
			System.out.println("Valid a person. " + customer.getFirstName());
			super.Save(customer);
			
		} else {
			System.out.println("Not a valid a person :  " + customer.getFirstName());

		}
	}



	
	
	

}
