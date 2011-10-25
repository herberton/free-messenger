package pattern.dao;

import java.sql.ResultSet;
import java.util.Collection;

import exception.DAOException;

public interface IDAOJDBC<T> {
	// EXTRACT TO...
	abstract T extract(final ResultSet resultSet) throws DAOException;
	abstract Collection<T> extractCollection(final ResultSet resultSet) throws DAOException;
}
