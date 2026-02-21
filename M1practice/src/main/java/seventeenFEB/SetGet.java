package seventeenFEB;

import java.util.ArrayList;
import java.util.List;

public class SetGet {
	private List<String> l=new ArrayList<>();
	public void setString(List<String> l) {
		this.l=new ArrayList<>(l);
	}
	public List<String> getString(){
		return new ArrayList<>(l);
	}
}
