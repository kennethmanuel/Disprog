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
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Miftah + Kenneth
 */
public class FormServer extends javax.swing.JFrame implements Runnable {

    String chatClient, chatServer;
    Socket incoming;
    ServerSocket s;
    Thread t;
    ArrayList<HandleSocket> clients = new ArrayList<HandleSocket>();
	HistoryLogin hist;
	Chat chat;
    
    public FormServer() {     
        initComponents();
        setLocationRelativeTo(null);
        try {
            s = new ServerSocket(6000);
            if (t == null) {
                t = new Thread(this, "Simple Chat");
                t.start();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "error koneksi " + ex);
        }
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                incoming = s.accept();
                HandleSocket hs = new HandleSocket(this, incoming);//sampai sini..
                hs.start();
                clients.add(hs);
            } catch (IOException ex) {
                System.out.println("formserver run = " + ex);
            }
        }
    }
    public void showChat(String msg) {
		String msgSplit[] = msg.split(":");
		String username = msgSplit[0];
		String content = msgSplit[1];
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		
		chat = new Chat(content, dateTime, username);
		chat.insert();
		if(content.equals("-removechat-")) {
			chat.remove();
		} else {
			txtChat.append(msg + "\n");
			broadCast(msg);
		}
    }
    
    public void broadCast(String msg) {
        for (HandleSocket hs : clients) {
            hs.sendChat(msg); 
        }
    }
	
	public void broadCastJoin(HandleSocket _hsclient, String msg) {
		String msgSplit[] = msg.split(";-");
		String username = msgSplit[0];
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		
		hist = new HistoryLogin(username, dateTime);
		hist.insert();
		msg = "-- " + username + " has joined to the group chat --";
		
		txtChat.append(msg + "\n");
		for (HandleSocket hs : clients) {
			if(hs != _hsclient) {
				hs.sendChat(msg);
			}
		}
	}
	
	public void login(String msg) {
		String msgSplit[] = msg.split(":-");
		String username = msgSplit[0];
		String password = msgSplit[1];
		
		User user = new User(username, password);
		// Beritahu ke client apakah login berhasil ato tidak
		// Isi username dengan user.username
	}
	
	public void register(String msg) {
		String msgSplit[] = msg.split(":-");
		String username = msgSplit[0];
		String password = msgSplit[1];
		
		User user = new User(username, password);
		user.insert(); // Insert
		// Beritahu ke client apakah register berhasil ato tidak
		
	}
		
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPesan = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtChat = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Server");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Pesan");

        txtPesan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSend.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        txtChat.setColumns(20);
        txtChat.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txtChat.setRows(5);
        jScrollPane1.setViewportView(txtChat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(56, 56, 56)
                                .addComponent(txtPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSend))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        showChat("Server: " + txtPesan.getText());
    }//GEN-LAST:event_btnSendActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormServer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormServer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormServer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormServer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormServer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtChat;
    private javax.swing.JTextField txtPesan;
    // End of variables declaration//GEN-END:variables

}
