import static org.junit.Assert.*;

import org.junit.Test;

import com.fdmgroup.tradingplatform.model.Broker;
import com.fdmgroup.tradingplatform.model.Company;

public class TestModel {

	@Test
	public void testBrokerObjectCreation() {
		Broker broker = new Broker();
		Company company = new Company();
		broker.setBrokerID(2);
		broker.setFirstName("Will");
		broker.setLastName("Pabs");
		broker.setCompany(company);
		
		System.out.println(broker);
	}
	
	@Test
	public void testCompanyObjectCreation() {
		
	}
	
	@Test
	public void testShareholderObjectCreation() {
		
	}
	
	@Test
	public void testStockObjectCreation() {
		
	}
	
	@Test
	public void testSystemAdminObjectCreation() {
		
	}
	
	@Test
	public void testTradeObjectCreation() {
		
	}

}
