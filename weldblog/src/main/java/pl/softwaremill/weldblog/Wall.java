package pl.softwaremill.weldblog;

import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * @author Pawel Wrzeszcz (pawel . wrzeszcz [at] gmail . com)
 */
@ApplicationScoped
public class Wall implements Serializable {

	private List<String> messages = Arrays.asList("a", "b", "c");

	public List<String> getMessages() {
		return messages;
	}

	public void addMessage(String msg) {
		messages.add(msg);
	}
}
