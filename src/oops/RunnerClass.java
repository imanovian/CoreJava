package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees E1 = new Employees();
		E1.Name = "Mike";
		E1.EmpId = 1000;
		E1.Department = "HR";
		E1.Display();
		Employees E2 = new Employees("Jack", 1001, "Finance");
		E2.Display();
		
		Bank B = new Bank();
		B.DisplayBalance();
		int Bal = B.GetBalance();
		System.out.println(" The Balance is "+ Bal);
		
		BOAbank B1 = new BOAbank();
		B1.CCBalance();
		B1.DisplayBalance();
		
       OverloadingExample obj =new OverloadingExample();
		
		int RecArea = obj.GetArea(3, 4);
		
		int SqArea = obj.GetArea(4);
		
		System.out.println(RecArea);
		
		B1.CloseAccount(123456);
		
		Chrome Ch = new Chrome();
		Ch.OpenBrowser();
		Ch.CloseBrowser();
		
		Browser Br = new Chrome();
		Br.OpenBrowser();
		Br.CloseBrowser();
		Br.DisplayName();
		
		EncapsulationEx En = new EncapsulationEx();
		En.setBalance(3000);
		System.out.println(En.getBalance());

	}
		

	}





