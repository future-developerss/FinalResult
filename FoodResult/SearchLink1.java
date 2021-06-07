import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
public class SearchLink1 {
	public SearchLink1() {
		String urlLink = "https://map.naver.com/v5/?c=14259115.1864402,4320239.9204572,15,0,0,0,dh/";
		
		try {
			Desktop.getDesktop().browse(new URI(urlLink));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
	}
}