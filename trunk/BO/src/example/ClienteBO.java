package example;

import example.ClienteDAO;
import example.ClienteTO;
import pattern.bo.ABOTO;
import pattern.dao.ADAOTO;
import pattern.singleton.SingletonFactory;
import exception.SingletonException;


public class ClienteBO extends ABOTO<ClienteTO> {

	@Override
	protected ADAOTO<ClienteTO> getDAO() throws SingletonException {
		return 
			SingletonFactory
				.getSingletonFactory()
					.getInstance(ClienteDAO.class)
						.getSingleton();
	}
	
}
