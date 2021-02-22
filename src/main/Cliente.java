package main;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		try {
			
			Socket socket = new Socket("127.0.0.1", 5000);
			
			OutputStream out = socket.getOutputStream();
			BufferedWriter bwriter = new BufferedWriter(new OutputStreamWriter(out));
			
			Scanner scan = new Scanner(System.in); 
			
			while(true) {
				
				String line = scan.nextLine() + "\n";
				bwriter.write(line);
				bwriter.flush();
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
