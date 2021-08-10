package coffeeShopAutomation;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager.Save(new Customer(1,"Gökhan","Gök",1999,"123456789"));
		
		BaseCustomerManager customerManager1= new NeroCustomerManager();
		customerManager1.Save(new Customer(2, "Engin ", "Demiroð", 1985, "12312151131"));

		
		
	}

}
