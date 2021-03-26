/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presensi_server_160419041;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author bodyflicker
 */
public class Presensi_Server_160419041 {
	/**
	 * @param args the command line arguments
	 * @throws java.io.IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO code application logic here
		
		// Variable storing message from client
		String message; 
		// Server Socket
		ServerSocket socket= new ServerSocket(6000);
		// Client socket
		Socket incoming = socket.accept();
		
		// Get message from client
		BufferedReader clientMessage = new BufferedReader(new InputStreamReader(incoming.getInputStream()));
		DataOutputStream serverMessage = new DataOutputStream(incoming.getOutputStream());
		message = clientMessage.readLine();

		// Get data
		String inputArgs[] = message.split(" ");
		String command = inputArgs[0];
		String username = inputArgs[1];
		String password = inputArgs[2];
		String access = "dosen";

		User newUser = new User(username, password, access);

		if (command.equals("REGISTER")) {
			newUser.insert();
			serverMessage.writeBytes("Register success");
		} else if (command.equals("LOGIN")) {
			boolean success = newUser.login();
			if (success) {
				serverMessage.writeBytes("SUCCESS" + "\n");
			} else {
				serverMessage.writeBytes("FAIL" + "\n");
			}
		} else if (command.equals("GETACCESS")) {
			serverMessage.writeBytes(newUser.getAccess());
		}
	}
}
