/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servertcp;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kenneth
 */
public class HandleSocket extends Thread {

    FormServer parent;
    Socket client;
    DataOutputStream out;
    BufferedReader in;
    public HandleSocket(FormServer _parent, Socket _client) {
        try {
            this.parent = _parent;
            this.client = _client;
            out = new DataOutputStream(client.getOutputStream());
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        } catch (Exception ex) {
            System.out.println("error di hs constructor = " + ex);
        }
    }
    public void run() {
		sendChat("Welcome to this Group Chat");
        while (true) {
            try {
                String msg = in.readLine();//pesan masuk dari client;
                System.out.println("masuk");
				if(msg.contains(";-joins")) {
					parent.broadCastJoin(this, msg);
				} else if(msg.contains(";-login")){
					parent.login(msg);
				} else if(msg.contains(";-register")) {
					parent.register(msg);
				} else {
					parent.showChat(msg);
				}
            } catch (IOException ex) {
                System.out.println("error hs run = "+ex);
            }
        }
    }
    public void sendChat(String msg){
        try {
            out.writeBytes(msg + "\n");
        } catch (IOException ex) {
            System.out.println("error hs sendChat = "+ex);
        }
    }
}
