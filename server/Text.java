import java.io.*;
import java.net.*;
public class Text{
	public static void main(String[] args){
		try{
			Socket s=new Socket("127.0.0.1",12345);
		}
		catch(UnknownHostException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
