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
import java.sql.SQLException;
import java.util.Arrays;

/**
 *
 * @author bodyflicker
 */
public class Presensi_Server_160419041 {
	/**
	 * @param args the command line arguments
	 * @throws java.io.IOException
	 * @throws java.sql.SQLException
	 */
	public static void main(String[] args) throws IOException, SQLException {
		// Server Socket
		ServerSocket socket= new ServerSocket(6000);
		// Client socket
		Socket incoming = socket.accept(); // wait till client open connection
		
		// Get message from client
		
		while(true) {
			BufferedReader clientMessage = new BufferedReader(new InputStreamReader(incoming.getInputStream()));
			DataOutputStream serverMessage = new DataOutputStream(incoming.getOutputStream());
			String message = clientMessage.readLine();
			System.out.println(message);
			
			String arrayInput[] = message.split(" ");
			System.out.println(arrayInput.length);
			System.out.println(Arrays.toString(arrayInput));
			String command = arrayInput[0];
			String username = arrayInput[1];
			String password = arrayInput[2];

			User newUser = new User(username, password);

			if (command.equals("REGISTER")) {
				newUser.insert();
				serverMessage.writeBytes("Register success" + "\n"); // back to loop
			} else if (command.equals("LOGIN")) {
				boolean success = newUser.login();
				if (success) {
					serverMessage.writeBytes("SUCCESS" + "\n"); // back to loop
				} else {
					serverMessage.writeBytes("FAIL" + "\n"); // back to loop
				}
			} else if (command.equals("GETACCESS")) {
				serverMessage.writeBytes(newUser.getAccess() + "\n"); // back to loop
			}
		}
	}
}
