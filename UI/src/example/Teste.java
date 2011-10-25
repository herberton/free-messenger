package example;
import example.ClienteTO;
import exception.BOException;
import exception.SingletonException;
import pattern.singleton.SingletonFactory;


public class Teste {
	
	public static void main(String[] args) {
		ClienteBO bo1 = null;
		ClienteBO bo2 = null;
		
		try {
			bo1 =
				SingletonFactory
					.getSingletonFactory()
						.getInstance(ClienteBO.class)
							.getSingleton();
			
			
			bo2 =
				SingletonFactory
					.getSingletonFactory()
						.getInstance(ClienteBO.class)
							.getSingleton();
			
			System.out.println("Os objetos BO est�o no mesmo endere�o de mem�ria? " + (bo1 == bo2));
			
		} catch (SingletonException e) {
			e.printStackTrace();
		}
		
		ClienteTO to = new ClienteTO();
		to.setID((long) 1234567890);
		
		try {
			
			bo1.select(to);
			bo2.select(to);
			
			System.out.println("Os objetos DAO est�o no mesmo endere�o de mem�ria? " + (bo1.getDAO() == bo2.getDAO())); 
			
		} catch (BOException e) {
			e.printStackTrace();
		} catch (SingletonException e) {
			e.printStackTrace();
		}
	}
}
