import com.kranti.di.injectors.CardServiceInjector;
import com.kranti.di.injectors.MasterCardInjector;
import com.kranti.di.injectors.VisaCardInjector;

public class CardServiceDITest {

	public static void main(String[] args) {
		CardServiceInjector injector;
		injector = new  MasterCardInjector();
		injector.getServiceInjector().issueCard();
		
		injector = new VisaCardInjector();
		injector.getServiceInjector().issueCard();
	}
}
