package web.servlet.async_request_war.ep.mesg;

/**
 *
 * @author evanidul
 */
public class ParsedMessage {
	
	private String originalMessage;
	private String firstWord;
	private String command;
	private String messageWithoutCommand;
	
	public ParsedMessage(String s){
		this.originalMessage = s;
		this.parseMessage(s);
	}

	private void parseMessage(String s){
		if ( s == null ) return;
		String[] results = s.split(" ");
		this.firstWord = results[0];
		if (findCommand(this.firstWord) != null){
			this.messageWithoutCommand = findMessageWithoutCommand(s);
		} else {
			this.messageWithoutCommand = s;
		}
	}
	
	private String findCommand(String s){
		if ( s == null ) return null;
		if (s.startsWith("/")){
			System.out.println(s);
			String command = s.substring(1);
			this.command = command;
			return command;
		} else {
			return null;
		}
	}
	
	private String findMessageWithoutCommand(String s){
		if ( s == null ) return null;
		String[] results = s.split(" ");
		if (findCommand(results[0]) != null){
			StringBuffer sb = new StringBuffer();
			sb.append(" ");  // the first space which got split off
			for(int i=1 ; i< results.length; i++ ){  // i starts at one so we can drop the command
				sb.append(results[i]);
				sb.append(" ");
			}
			return sb.toString();
		} else {
			return s;
		}
	}
	
	
	public String getOriginalMessage(){
		return this.originalMessage;
	}
	
	public String getCommand(){
		return this.command;
	}
	
	public String getMessageWithoutCommand(){
		return this.messageWithoutCommand;
	}
	
}
