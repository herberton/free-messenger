package pattern.dao;

import java.sql.ResultSet;
import java.util.Collection;
import java.util.Iterator;

import exception.DAOException;

public abstract class ADAO<T> {
	
	// INSERT...
	public abstract void insert(T to) throws DAOException;
	public void insert(Collection<T> collection) throws DAOException{
		Iterator<T> iterator = collection.iterator();
		while(iterator.hasNext()){
			this.insert(iterator.next());
		}
	}
	
	
	// UPDATE...
	public abstract void update(T to) throws DAOException;
	public void update(Collection<T> collection) throws DAOException{
		Iterator<T> iterator = collection.iterator();
		while(iterator.hasNext()){
			this.update(iterator.next());
		}
	}
	
	
	// DELETE...
	public abstract void delete(T to) throws DAOException;
	public void delete(Collection<T> collection) throws DAOException{
		Iterator<T> iterator = collection.iterator();
		while(iterator.hasNext()){
			this.delete(iterator.next());
		}
	}
	
	public abstract void deleteByID(Long id) throws DAOException;
	public void deleteByID(Collection<Long> collection) throws DAOException{
		Iterator<Long> iterator = collection.iterator();
		while(iterator.hasNext()){
			this.deleteByID(iterator.next());
		}
	}
	
	
	// SELECT
	public abstract T select(T to) throws DAOException;
	public abstract T selectByID(Long id) throws DAOException;	
	public abstract Collection<T> selectCollection(T to) throws DAOException;
	public abstract Collection<T> selectCollection(Collection<T> collection) throws DAOException;
	public abstract Collection<T> selectCollectionByID(Collection<Long> collection) throws DAOException;
	
	
	// EXTRACT...
	public abstract T extract(ResultSet resultSet) throws DAOException;
	public abstract Collection<T> extractCollection(ResultSet resultSet) throws DAOException;
}