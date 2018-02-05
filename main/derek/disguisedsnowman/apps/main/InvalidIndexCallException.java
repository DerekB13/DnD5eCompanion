package derek.disguisedsnowman.apps.main;

public class InvalidIndexCallException extends IndexOutOfBoundsException {
	private static final long serialVersionUID = 7502855963212666307L;
	private int index_;
	
	public InvalidIndexCallException(int i) {
		index_ = i;
	}
	
	public int getIndex_() { return index_; }
}
