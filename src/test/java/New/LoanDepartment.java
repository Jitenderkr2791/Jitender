package New;
import org.testng.annotations.Test;
public class LoanDepartment
{	
	@Test(enabled=true)
	public void MobileLoginPersonalLoan() {		System.out.println("Mobile Login Personal Loan");		 }

	@Test(enabled =false)
	public void WebLoginPersonalLoan()	 {		System.out.println("Web Login Personal Loan");		 }
		
	@Test(enabled= true)
	public void APILoginPersonalLoan() 	{		System.out.println("API Login Personal Loan");		 }	
		
		
	@Test(enabled=true)
	public void MobileLoginCARLoan()	 {		System.out.println("Mobile Login CAR Loan");		 }
	
	
	@Test(enabled= true)
	public void WebLoginCARLoan()		 {		System.out.println("Mobile Login CAR Loan");		 }
	
	
	@Test(enabled=false)
	public void APILoginCARLoan() 		{		System.out.println("Mobile Login CAR Loan");		 }
	
}
