import org.sms.jfreesms.SMS;
import org.sms.jfreesms.exception.NotAuthenticatedException;
import org.sms.jfreesms.sms160by2.SMS160by2;
import org.sms.jfreesms.way2sms.Way2SMS;


public class Main {

	public static void main(String[] args) {
		SMS sms = new SMS160by2();
		sms.login("123123", "123123");
		System.out.println(sms.isAuthenticated());
		try {
		    sms.send("123123", "hi Sushnat!");
		    //sms.send("123123123", "hello!!");
		} catch (NotAuthenticatedException ex) {
		    ex.printStackTrace();
		}
	}
}
