/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverudp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author bodyflicker
 */
public class ServerUDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println("Server is Running...");
            // defined port socket for server
            DatagramSocket serverSocket = new DatagramSocket(2000);
            
            // defined data byte to send and receive packet to/from server/client
            byte[] receivedData;
            byte[] sendData;
            
            // defined packet to send and receive packet to/from server/client
            DatagramPacket incomingPacket, repliedPacket;
            
            while(true) { // server always run
                // set maximum packet 2kb
                receivedData = new byte[2048];
                sendData = new byte[2048];
                incomingPacket = new DatagramPacket(receivedData, receivedData.length);
                
                // use receive method to get packet from client
                serverSocket.receive(incomingPacket);
                
                // change packet from byte to string
                String received = new String(incomingPacket.getData(), incomingPacket.getOffset(), incomingPacket.getLength());
                System.out.println("Packet from Client: " + received);
                
                // change to capital word
                String send = received.toUpperCase();
                // change packet from string to bytes
                sendData = send.getBytes();
                System.out.println(sendData);
                // get IP and Port address from client
                InetAddress ipClient = incomingPacket.getAddress();
                int portClient = incomingPacket.getPort();
                repliedPacket = new DatagramPacket(sendData, sendData.length, ipClient, portClient);
                
                // send the packet
                serverSocket.send(repliedPacket);
            }
        } catch (Exception ex){
            Logger.getLogger(ServerUDP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
