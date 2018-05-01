package info.seleniumcucumber.defind;

import java.util.HashMap;
import java.util.Map;

public class Search implements IDefinderElement  {
	public final String page_home = "https://www.lazada.vn/";
	public final String input_search = "//input[@type='search']";
	public final String button_search = "//button[contains(@class, 'search')]";
	public final String a_history_first = "//div[contains(@class, 'history__')]/child::a[1]";
	public final String a_autocomplete_first = "//div[contains(@class,'search-box')]//child::a[1]";
	public final String button_clear_history = "//div[contains(@class, 'history__action')]";
	public final String container_history = "//div[contains(@class, 'history')]";

	@Override
	public Map<String, String> getDefind() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("page_home", page_home);
		map.put("button_search", button_search);
		map.put("input_search", input_search);
		map.put("a_history_first", a_history_first);
		map.put("a_autocomplete_first", a_autocomplete_first);
		map.put("button_clear_history", a_autocomplete_first);
		map.put("container_history", a_autocomplete_first);
		
		return map;	}
	
}
