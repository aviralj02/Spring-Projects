package ncu.SpringAspect.dao;

import ncu.SpringAspect.entity.Account;

public interface AccountDao {
	
	public void addAccount();
	public void addAccount(Account account);
	public void addAccount(Account account, boolean vipFlag);
	public boolean doStuff();
	public String getAccountName();
	public int getAccountNo();
}
