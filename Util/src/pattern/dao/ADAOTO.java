package pattern.dao;

import java.util.Collection;
import java.util.Iterator;

import pattern.to.ITO;
import exception.DAOException;

public abstract class ADAOTO<TO extends ITO> {
	
	// INSERT...
	public abstract void insert(final TO to) throws DAOException;
	public void insert(final Collection<TO> collection) throws DAOException{
		Iterator<TO> iterator = collection.iterator();
		while(iterator.hasNext()){
			this.insert(iterator.next());
		}
	}
	
	
	// UPDATE...
	public abstract void update(final TO to) throws DAOException;
	public void update(final Collection<TO> collection) throws DAOException{
		Iterator<TO> iterator = collection.iterator();
		while(iterator.hasNext()){
			this.update(iterator.next());
		}
	}
	
	
	// DELETE...
	public abstract void delete(final TO to) throws DAOException;
	public void delete(final Collection<TO> collection) throws DAOException{
		Iterator<TO> iterator = collection.iterator();
		while(iterator.hasNext()){
			this.delete(iterator.next());
		}
	}
	
	public abstract void deleteByID(final Long id) throws DAOException;
	public void deleteByID(final Collection<Long> collection) throws DAOException{
		Iterator<Long> iterator = collection.iterator();
		while(iterator.hasNext()){
			this.deleteByID(iterator.next());
		}
	}
	
	
	// SELECT
	public abstract TO select(final TO to) throws DAOException;
	public abstract TO selectByID(final Long id) throws DAOException;	
	public abstract Collection<TO> selectCollection(final TO to) throws DAOException;
	public abstract Collection<TO> selectCollection(final Collection<TO> collection) throws DAOException;
	public abstract Collection<TO> selectCollectionByID(final Collection<Long> collection) throws DAOException;
}