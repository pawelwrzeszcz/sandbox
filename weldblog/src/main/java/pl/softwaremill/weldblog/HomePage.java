package pl.softwaremill.weldblog;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;

import javax.inject.Inject;
import java.util.List;

public class HomePage extends WebPage
{
	@Inject
	Wall wall;

	public HomePage() {
		final List<String> list =  wall.getMessages();
		ListView listview = new ListView("messages", list) {
			protected void populateItem(ListItem item) {
				item.add(new Label("label", item.getModel()));
			}
		};
		add(listview);
	}
}
