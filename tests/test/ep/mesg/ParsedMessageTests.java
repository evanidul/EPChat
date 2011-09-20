package test.ep.mesg;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import web.servlet.async_request_war.ep.mesg.ParsedMessage;
import static org.junit.Assert.*;

/**
 *
 * @author evanidul
 */
public class ParsedMessageTests {
	
	public ParsedMessageTests() {
	}

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}
	// TODO add test methods here.
	// The methods must be annotated with annotation @Test. For example:
	//
	// @Test
	// public void hello() {}
	
	@Test
	public void testParsedMessageConstructor(){
		String commandEscape = "/";
		String command = "2";
		String messageWithoutCommand = " hello!";
		String s = commandEscape + command + messageWithoutCommand;
		ParsedMessage m = new ParsedMessage(s);
		Assert.assertEquals(s, m.getOriginalMessage());
		Assert.assertEquals(command, m.getCommand());
		System.out.println(messageWithoutCommand);
		System.out.println(m.getMessageWithoutCommand());
		Assert.assertEquals(messageWithoutCommand, m.getMessageWithoutCommand());
	}
}
