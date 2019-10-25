package com.hcl.bank;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class AccountsTestCase {
	
	@Test
	public void testWithdrawAccount(){
		assertEquals("Amount Debited", AccountBAL.withdrawAccountBal(3, 3000));
		assertEquals("Insufficient fund", AccountBAL.withdrawAccountBal(3, 300000));
		assertEquals("Account No not found", AccountBAL.withdrawAccountBal(-3, 300000));
		assertEquals("Account Closed", AccountBAL.withdrawAccountBal(1, 300));
	}
	
	@Test
	public void testDepositAccount(){
		assertEquals("Amount Credited", AccountBAL.depositAccountBal(3, 3000));
		assertEquals("Account No not found", AccountBAL.depositAccountBal(-3, 3000));
		assertEquals("Account Closed", AccountBAL.depositAccountBal(1,3000));
	}
	
	@Test
	public void testCloseAccount(){
		assertEquals("Account Closed", AccountBAL.closeAccountBal(4));
		assertEquals("Account No not found", AccountBAL.closeAccountBal(-4));
	}
	
	@Test
	public void testUpdateAccount(){
		assertEquals("Account Updated", AccountBAL.updateAccountBal(2, "Chennai", "TN"));
		assertEquals("Account No not found", AccountBAL.updateAccountBal(-2, "Chennai", "TN"));
		assertEquals("Account Closed Already", AccountBAL.updateAccountBal(1, "Chennai", "TN"));
	}
	
	@Test
	public void testSearchAccount(){
		assertNotNull(AccountBAL.searchAccountsBal(1));
		assertNull(AccountBAL.searchAccountsBal(-1));
	}
	
	@Test
	public void testCreateAccount(){
		Accounts objAccounts=new Accounts();
		int accno=AccountBAL.generateAccountBal();
		objAccounts.setAccountNo(accno);
		objAccounts.setFirstName("Nivetha");
		objAccounts.setLastName("Jayakumar");
		objAccounts.setCity("Chennai");
		objAccounts.setState("TN");
		objAccounts.setAmount(5646);
		objAccounts.setCheqFacil("Yes");
		objAccounts.setAccountType("Savings");
		assertEquals("Account Created Successfully", AccountBAL.createAccountBal(objAccounts));
	}
	
	@Test
	public void testDaoConnection(){
		assertNotNull(DaoConnection.getConnection());
	}
	
	@Test
	public void testGenerateAccountNo(){
		int accno=0;
		Connection con=DaoConnection.getConnection();
		String cmd="select max(accountNo)+1 accno from Accounts";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			accno=rs.getInt("accno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(accno, AccountBAL.generateAccountBal());
	}

	@Test
	public void testGettersandSetters() {
		Accounts objAccounts=new Accounts();
		objAccounts.setAccountNo(1);
		objAccounts.setFirstName("Hema");
		objAccounts.setLastName("Jayakumar");
		objAccounts.setCity("Chennai");
		objAccounts.setState("TamilNadu");
		objAccounts.setAmount(6345);
		objAccounts.setCheqFacil("Yes");
		objAccounts.setAccountType("Savings");
		objAccounts.setStatus("Active");
		
		
		assertEquals(1, objAccounts.getAccountNo());
		assertEquals("Hema", objAccounts.getFirstName());
		assertEquals("Jayakumar", objAccounts.getLastName());
		assertEquals("Chennai", objAccounts.getCity());
		assertEquals("TamilNadu", objAccounts.getState());
		assertEquals(6345, objAccounts.getAmount());
		assertEquals("Yes", objAccounts.getCheqFacil());
		assertEquals("Savings", objAccounts.getAccountType());
		assertEquals("Active", objAccounts.getStatus());
		
	}

}
