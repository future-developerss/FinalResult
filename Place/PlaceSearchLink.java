package Final;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class PlaceSearchLink {

    public PlaceSearchLink(String link){
        String urlLink =link;

        try {
            Desktop.getDesktop().browse(new URI(urlLink));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }
}
