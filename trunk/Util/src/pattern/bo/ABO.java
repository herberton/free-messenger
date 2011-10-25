package pattern.bo;

import java.util.Collection;

import pattern.dao.ADAO;
import exception.BOException;
import exception.DAOException;
import exception.SingletonException;

public abstract class ABO<T> {
	// VARIABLES...
	@SuppressWarnings("unused")
	private ADAO<T> DAO = null;
	
	//GETTERS...
	protected abstract ADAO<T> getDAO() throws SingletonException;
	
	// INSERT...
	public void insert(final T to) throws BOException {
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
	public void insert(final Collection<T> collection) throws BOException{
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
	public void update(final T to) throws BOException {
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
	public void update(final Collection<T> collection) throws BOException {
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
	public void delete(final T to) throws BOException {
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
	public void delete(final Collection<T> collection) throws BOException{
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
	public T select(final T to) throws BOException {
		T result = null;
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
	public T selectByID(final Long id) throws BOException {
		T result = null;
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
	public Collection<T> selectCollection(final T to) throws BOException {
		Collection<T> result = null;
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
	public Collection<T> selectCollection(final Collection<T> collection) throws BOException {
		Collection<T> result = null;
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
	public Collection<T> selectCollectionByID(final Collection<Long> collection) throws BOException {
		Collection<T> result = null;
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
