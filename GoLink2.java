import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
public class GoLink2 {
	public GoLink2(int num) {
		String[] urlLink = {"https://youtu.be/l5Rb1pNre40", "https://youtu.be/29ycT6fA-Rs",
				"https://youtu.be/NsY-9MCOIAQ", "https://youtu.be/I-hw1AkqFro", 
				"https://youtu.be/EjHAgoN2KtU", "https://youtu.be/hoLzH1revMg", 
				"https://youtu.be/au2n7VVGv_c", "https://youtu.be/8CEJoCr_9UI", 
				"https://youtu.be/BxuY9FET9Y4", "https://youtu.be/-E-_IRJU5w0",
				"https://youtu.be/vfD96yRT8cs", "https://youtu.be/oygrmJFKYZY",
				"https://youtu.be/kRGMc8NXops", "https://youtu.be/KzHOPckFmwc",
				"https://youtu.be/x1OkjxBqmss", "https://youtu.be/y6tMA7mjFiA",
				"https://youtu.be/woqRmrtVhgM", "https://youtu.be/IqfFZ5cJ-WU",
				"https://youtu.be/UYDnDvkHgP4", "https://youtu.be/PRXtbLqIx04", 
				"https://youtu.be/q0hyYWKXF0Q", "https://youtu.be/b1jVwUJqFJY",
				"https://youtu.be/Bimd2nZirT4", "https://youtu.be/IojGQErD5dQ"
				};
		
		try {
			Desktop.getDesktop().browse(new URI(urlLink[num]));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
	}
}