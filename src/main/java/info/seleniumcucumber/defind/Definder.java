package info.seleniumcucumber.defind;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Definder {
	private Map<String, String> _pool = new HashMap<String, String>();
	
	public Definder() {
		// TODO Auto-generated constructor stub
		add(new Login());
		add(new Search());
	}
	
	
	public void add(IDefinderElement definderElement) {
		Map<String, String> pool = definderElement.getDefind();
		pool.forEach(new BiConsumer<String, String>() {

			@Override
			public void accept(String t, String u) {
				// TODO Auto-generated method stub
				_pool.put(t, u);
			}
		});
		
	}
	
	public String getElement(String name) {
		if (_pool.get(name) == null) {
			return "";
		}
		return _pool.get(name);
	}
	
	public String getElement(String type, String name) {
		String _name = type+"_"+name;
		if (_pool.get(_name) == null) {
			return "";
		}
		return _pool.get(_name);
	}
}
