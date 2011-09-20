package web.servlet.async_request_war.ep.mesg;

/**
 *
 * @author evanidul
 */
public class ParsedMessage {
	
	private String originalMessage;
	private String firstWord;
	private String command;
	
	public ParsedMessage(String s){
		this.originalMessage = s;
		this.parseMessage(s);
	}

	private void parseMessage(String s){
		if ( s == null ) return;
		String[] results = s.split(" ");
		this.firstWord = results[0];
		findCommand(this.firstWord);
	}
	
	private String findCommand(String s){
		if ( s == null ) return null;
		if (s.startsWith("/")){
			String command = s.substring(1);
			this.command = command;
			return command;
		} else {
			return null;
		}
	}
	
	public String getOriginalMessage(){
		return this.originalMessage;
	}
	
	public String getCommand(){
		return this.command;
	}
	
	
}
