package example;
import pattern.to.ITO;


public class ClienteTO implements ITO{
	
	private Long ID = null;
	
	@Override
	public Long getID() {
		return this.ID;
	}

	@Override
	public void setID(Long id) {
		this.ID = id;
	}

}
