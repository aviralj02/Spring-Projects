package ncu.SpringAspect.dao;

import org.springframework.stereotype.Repository;

import ncu.SpringAspect.entity.Account;

@Repository
public class AccountDaoImpl implements AccountDao {

	@Override
	public void addAccount() {
		System.out.println(this.getClass() + " - Account added to the database!\n");

	}

	@Override
	public void addAccount(Account account) {
		System.out.println(this.getClass() + " - Account added for the given entity!\n");
	}

	@Override
	public void addAccount(Account account, boolean vipFlag) {
		System.out.println(this.getClass() + " - VIP account added for the given entity!\n");
	}

	@Override
	public boolean doStuff() {
		System.out.println(this.getClass() + " - doing some stuff..\n");
		return true;
	}

	@Override
	public String getAccountName() {
		System.out.println(this.getClass() + " - get account name!\n");
		return "John";
	}

	@Override
	public int getAccountNo() {
		int number = 123;
		System.out.println(this.getClass() + " - get account number!\n");
		return number;
	}

}
