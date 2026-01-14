package chapter09;

public class HttpServletMain_03 {
	
	public static void Http(HttpServlet H) {
		H.service();
		
	}

	public static void main(String[] args) {
		Http(new LoginService());
		Http(new FilleDownloadService());

	}

}
