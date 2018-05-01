package info.seleniumcucumber.defind;

import java.util.HashMap;
import java.util.Map;

public class Login implements IDefinderElement {
	public final String page_login = "https://member.lazada.vn/user/login";
	public final String btn_login = "//button[@type='submit']";
	public final String span_msg_email= "//div[contains(@class,'mod-login-input-email')]//ancestor::span";
	public final String span_msg_password = "//div[contains(@class,'mod-login-input-password')]//ancestor::span";
	public final String input_email = "//div[contains(@class,'mod-login-input-email')]/child::input";
	public final String input_password = "//div[contains(@class,'mod-login-input-password')]/child::input";
	public final String div_feedback_content = "//div[@class='next-feedback-content']";
	
	public final String button_clear_input_email = "//div[contains(@class,'mod-login-input-email')]//child::div";
	public final String button_clear_input_password = "//div[contains(@class,'mod-login-input-password')]//child::div[2]";
	public final String button_show_input_password = "//div[contains(@class,'mod-login-input-password')]//child::div[1]";
	
	public final String input_password_as_text = "//div[contains(@class,'mod-input-password')]//child::input[@type='text']";
	
	@Override
	public Map<String, String> getDefind() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("page_login", page_login);
		map.put("span_msg_email", span_msg_email);
		map.put("span_msg_password", span_msg_password);
		map.put("button_login", btn_login); 
		map.put("input_email", input_email);
		map.put("input_password", input_password);
		map.put("div_feedback_content", div_feedback_content);
		map.put("button_clear_input_email", button_clear_input_email);
		map.put("button_clear_input_password", button_clear_input_password);
		map.put("button_show_input_password", button_show_input_password);
		map.put("input_password_as_text", input_password_as_text);
		
		return map;
	}
}
