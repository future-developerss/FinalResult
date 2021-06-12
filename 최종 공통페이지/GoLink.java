import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
public class GoLink {
	public GoLink(int num) {
		String[] urlLink = {"https://youtu.be/8ykMyNHAdKk", "https://youtu.be/OoMIAo0a2TA", 
				"https://youtu.be/4TWR90KJl84", "https://youtu.be/cgo6YcqPfno", 
				"https://youtu.be/YBzJ0jmHv-4", "https://youtu.be/3DOkxQ3HDXE", 
				"https://youtu.be/ApXoWvfEYVU", "https://youtu.be/Il-an3K9pjg", 
				"https://youtu.be/kOCkne-Bku4", "https://youtu.be/p9SbODULyxU",
				"https://youtu.be/XYAghEq5Lfw", "https://youtu.be/uAYG46w1SCA",
				"https://youtu.be/tzL4A8hyXc8", "https://youtu.be/lyC8GPwHPtU",
				"https://youtu.be/d3MoxJv6rMI", "https://youtu.be/gR4_uoJdOr0",
				"https://youtu.be/0hNde677fAE", "https://youtu.be/JNz5RmBNOfY", 
				"https://youtu.be/E9S3kSeAK0M", "https://youtu.be/iMUbmiXlHww", 
				"https://youtu.be/nlcIKh6sBtc", "https://youtu.be/uXdO9Lqy94Y",
				"https://youtu.be/1K93ioXL63c", "https://youtu.be/PWK8EuUSMSI"
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