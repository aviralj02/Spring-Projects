package ncu.SpringAspect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ncu.SpringAspect.dao.AccountDao;
import ncu.SpringAspect.dao.AccountDaoImpl;
import ncu.SpringAspect.dao.MembershipDao;
import ncu.SpringAspect.entity.Account;

public class App {
	public static void main(String[] args) {
		// Initializing the spring container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		// request the spring bean from container
		AccountDao dao = context.getBean("accountDaoImpl", AccountDaoImpl.class);

		// request the membership bean from spring container
		MembershipDao memDao = context.getBean("membershipDao", MembershipDao.class);

		Account account = context.getBean("accountBean", Account.class);

		// call the membership method
		memDao.addAccount();

		memDao.addMember();

		memDao.addSillyMember();

		memDao.deleteMember();

		// call the target method
		dao.addAccount(account, true);

		dao.doStuff();

		dao.getAccountName();

		dao.getAccountNo();

		// close the context
		context.close();
	}
}
