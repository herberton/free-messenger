package example;
import pattern.to.ITO;


public class ClienteTO implements ITO{
	
	// VARIABLES...
	private Long ID = null;
	
	// GETTERS...
	@Override
	public Long getID() {
		return this.ID;
	}
	
	// SETTERS...
	@Override
	public void setID(Long id) {
		this.ID = id;
	}
}
