import java.net.*;
public class Url{
	public static void main(String[] args) {
		try{
			URL url=new URL("https://www.smartyou.com/java-Code");
			System.out.println("Protocol :"+ url.getProtocol());
			System.out.println("hostname :"+ url.getHost());
			System.out.println("File-name :"+ url.getFile());
			System.out.println("Port Name :"+ url.getPort());
		} catch(Exception e){System.out.println(e);}
	}
}