/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presensi_server_160419041;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bodyflicker
 */
public class Presensi_Server_160419041 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws IOException {
		// TODO code application logic here
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));

		// Example input: LOGIN kenneth kenneth -> command = LOGIN, username, password
		String input = reader.readLine();

		// Get data
		String inputArgs[] = input.split(" ");
		String command = inputArgs[0];
		String username = inputArgs[1];
		String password = inputArgs[2];
		String access = "dosen";

		User newUser = new User(username, password, access);

		if(command.equals("REGISTER")) {
			newUser.insert();
			System.out.println("Register success");
		} else if (command.equals("LOGIN")) {
			System.out.println(newUser.login());
		}
	}
}
