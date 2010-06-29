package pl.softwaremill.weldblog;

import org.apache.wicket.Page;
import org.jboss.weld.wicket.WeldApplication;

/**
 * @author Pawel Wrzeszcz (pawel . wrzeszcz [at] gmail . com)
 */
public class WeldBlogApp extends WeldApplication {
	@Override
	public Class<? extends Page> getHomePage() {
		return HomePage.class;
	}
}
