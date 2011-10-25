package pattern.bo;

import java.util.Collection;

import pattern.dao.ADAOTO;
import pattern.to.ITO;
import exception.BOException;
import exception.DAOException;
import exception.SingletonException;

public abstract class ABOTO<TO extends ITO> {
	
	// VARIABLES...
	@SuppressWarnings("unused")
	private ADAOTO<TO> DAO = null;
	
	//GETTERS...
	protected abstract ADAOTO<TO> getDAO() throws SingletonException;
	
	// INSERT...
	public void insert(final TO to) throws BOException {
		try {
			this.getDAO().insert(to);
		} catch (DAOException e) {
			e.printStackTrace();
			throw new BOException(e);
		} catch (SingletonException e) {
			e.printStackTrace();
			throw new BOException(e);
		}	
	}
	public void insert(final Collection<TO> collection) throws BOException{
		try {
			this.getDAO().insert(collection);
		} catch (DAOException e) {
			e.printStackTrace();
			throw new BOException(e);
		} catch (SingletonException e) {
			e.printStackTrace();
			throw new BOException(e);
		}	
	}
	
	
	// UPDATE...
	public void update(final TO to) throws BOException {
		try {
			this.getDAO().update(to);
		} catch (DAOException e) {
			e.printStackTrace();
			throw new BOException(e);
		} catch (SingletonException e) {
			e.printStackTrace();
			throw new BOException(e);
		}	
	}
	public void update(final Collection<TO> collection) throws BOException {
		try {
			this.getDAO().update(collection);
		} catch (DAOException e) {
			e.printStackTrace();
			throw new BOException(e);
		} catch (SingletonException e) {
			e.printStackTrace();
			throw new BOException(e);
		}	
	}
	
	
	// DELETE...
	public void delete(final TO to) throws BOException {
		try {
			this.getDAO().delete(to);
		} catch (DAOException e) {
			e.printStackTrace();
			throw new BOException(e);
		} catch (SingletonException e) {
			e.printStackTrace();
			throw new BOException(e);
		}
	}
	public void delete(final Collection<TO> collection) throws BOException{
		try {
			this.getDAO().delete(collection);
		} catch (DAOException e) {
			e.printStackTrace();
			throw new BOException(e);
		} catch (SingletonException e) {
			e.printStackTrace();
			throw new BOException(e);
		}
	}
	
	public void deleteByID(final Long id) throws BOException {
		try {
			this.getDAO().deleteByID(id);
		} catch (DAOException e) {
			e.printStackTrace();
			throw new BOException(e);
		} catch (SingletonException e) {
			e.printStackTrace();
			throw new BOException(e);
		}
	}
	public void deleteByID(final Collection<Long> collection) throws BOException {
		try {
			this.getDAO().deleteByID(collection);
		} catch (DAOException e) {
			e.printStackTrace();
			throw new BOException(e);
		} catch (SingletonException e) {
			e.printStackTrace();
			throw new BOException(e);
		}
	}
	
	
	// SELECT
	public TO select(final TO to) throws BOException {
		TO result = null;
		try {
			result = this.getDAO().select(to);
		} catch (DAOException e) {
			e.printStackTrace();
			throw new BOException(e);
		} catch (SingletonException e) {
			e.printStackTrace();
			throw new BOException(e);
		}
		return result;
	}
	public TO selectByID(final Long id) throws BOException {
		TO result = null;
		try {
			result = this.getDAO().selectByID(id);
		} catch (DAOException e) {
			e.printStackTrace();
			throw new BOException(e);
		} catch (SingletonException e) {
			e.printStackTrace();
			throw new BOException(e);
		}
		return result;
	}
	public Collection<TO> selectCollection(final TO to) throws BOException {
		Collection<TO> result = null;
		try {
			result = this.getDAO().selectCollection(to);
		} catch (DAOException e) {
			e.printStackTrace();
			throw new BOException(e);
		} catch (SingletonException e) {
			e.printStackTrace();
			throw new BOException(e);
		}
		return result;
	}
	public Collection<TO> selectCollection(final Collection<TO> collection) throws BOException {
		Collection<TO> result = null;
		try {
			result = this.getDAO().selectCollection(collection);
		} catch (DAOException e) {
			e.printStackTrace();
			throw new BOException(e);
		} catch (SingletonException e) {
			e.printStackTrace();
			throw new BOException(e);
		}
		return result;
	}
	public Collection<TO> selectCollectionByID(final Collection<Long> collection) throws BOException {
		Collection<TO> result = null;
		try {
			result = this.getDAO().selectCollectionByID(collection);
		} catch (DAOException e) {
			e.printStackTrace();
			throw new BOException(e);
		} catch (SingletonException e) {
			e.printStackTrace();
			throw new BOException(e);
		}
		return result;
	}
}
