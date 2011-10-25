package example;

import example.ClienteTO;
import java.util.Collection;
import pattern.dao.ADAOTO;
import exception.DAOException;


public class ClienteDAO extends ADAOTO<ClienteTO> {
	
	// INSERT...
	@Override
	public void insert(ClienteTO to) throws DAOException {
		
	}
	
	
	// UPDATE...
	@Override
	public void update(ClienteTO to) throws DAOException {
		
	}
	
	
	// DELETE...
	@Override
	public void delete(ClienteTO to) throws DAOException {
		
	}

	@Override
	public void deleteByID(Long id) throws DAOException {
		
	}
	
	
	// SELECT...
	@Override
	public ClienteTO select(ClienteTO to) throws DAOException {
		System.out.println(to.getID());
		return null;
	}

	@Override
	public ClienteTO selectByID(Long id) throws DAOException {
		return null;
	}

	@Override
	public Collection<ClienteTO> selectCollection(ClienteTO to) throws DAOException {
		return null;
	}

	@Override
	public Collection<ClienteTO> selectCollection(Collection<ClienteTO> collection) throws DAOException {
		return null;
	}

	@Override
	public Collection<ClienteTO> selectCollectionByID(Collection<Long> collection) throws DAOException {
		return null;
	}
}
