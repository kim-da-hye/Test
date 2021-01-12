package java5_project;

import java.io.*;
import java.net.*;
import java.util.StringTokenizer;
import java.awt.*;
import java.awt.event.*;
 
public class ChatSenderC extends Frame implements ActionListener, KeyListener {
	
   TextArea display;
   TextField wtext, ltext, itext;
   Label mlbl, wlbl, loglbl, ipbl, info;
   BufferedWriter output;
   BufferedReader input;
   Socket client;
   StringBuffer clientdata;
   String serverdata, ID, ServerIP;
   boolean chooseID = false;
	
   private static final String SEPARATOR = "|";
   private static final int REQ_LOGON = 1001;
   private static final int REQ_LOGOUT = 1004;
   private static final int REQ_SENDWORDS = 1021;
	
   public ChatSenderC() {
      super("Ŭ���̾�Ʈ");
 
      mlbl = new Label("ä�� ���¸� �����ݴϴ�.");
      add(mlbl, BorderLayout.NORTH);
 
      display = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
      display.setEditable(false);
      add(display, BorderLayout.CENTER);
      Panel ptotal = new Panel(new BorderLayout());
      
      Panel pword = new Panel(new BorderLayout());
      wlbl = new Label("��ȭ��");
      wtext = new TextField(30); //������ �����͸� �Է��ϴ� �ʵ�
      wtext.addKeyListener(this); //�Էµ� �����͸� �۽��ϱ� ���� �̺�Ʈ ����
      pword.add(wlbl, BorderLayout.WEST);
      pword.add(wtext, BorderLayout.EAST);
      ptotal.add(pword, BorderLayout.NORTH);

      Panel pdata = new Panel(new BorderLayout());
      ipbl = new Label("IP �ּ�");
      itext = new TextField(30); //������ �����͸� �Է��ϴ� �ʵ�
      itext.addActionListener(this); //�Էµ� �����͸� �۽��ϱ� ���� �̺�Ʈ ����
      pdata.add(ipbl, BorderLayout.WEST);
      pdata.add(itext, BorderLayout.EAST);
      ptotal.add(pdata, BorderLayout.CENTER);
      Panel plabel = new Panel(new BorderLayout());
      loglbl = new Label("�г���");
      ltext = new TextField(30); //������ �����͸� �Է��ϴ� �ʵ�
      ltext.addActionListener(this); //�Էµ� �����͸� �۽��ϱ� ���� �̺�Ʈ ����
      plabel.add(loglbl, BorderLayout.WEST);
      plabel.add(ltext, BorderLayout.EAST);
      ptotal.add(plabel, BorderLayout.SOUTH);
 
      add(ptotal, BorderLayout.SOUTH);
 
      addWindowListener(new WinListener());
      setSize(300,250);
      setVisible(true);
   }
 
   public void runClient() {
      try {
         client = new Socket(ServerIP, 5000);
         input = new BufferedReader(new InputStreamReader(client.getInputStream()));
         output = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
		 clientdata = new StringBuffer(2048);
         mlbl.setText("���� �Ϸ� ����� ���̵� �Է��ϼ���.");
		 
	/* Thread �͸� Ŭ���� ��� ����
	new Thread() {
		public void run() {
			try {
				while(true) {
					serverdata = input.readLine();
				 	display.append(serverdata+"\r\n");
				}
			} catch (IOException e) { e.printStackTrace(); }
		}
	}.start(); */
       //Thread ���ٽ� ��� ����
     	new Thread(() -> {
     		try {
     			while(true) {
     				serverdata = input.readLine();
     				display.append(serverdata+"\r\n");
     				}
     			} catch (IOException e) { e.printStackTrace(); } }).start();
      
           } catch(IOException e) { e.printStackTrace(); }
        }
        public void actionPerformed(ActionEvent ae) {
     	   if (itext.getText().equals("")) {
              mlbl.setText("IP�ּҸ� �Է��ϼ���.");
              wtext.setText("");
     	   } else if(ltext.getText().equals("")) {
              mlbl.setText("�г����� �Է��ϼ���.");
              wtext.setText("");
     	  } else {
              ID = ltext.getText();
     		 ServerIP = itext.getText();
              try {
     			this.runClient();
     			mlbl.setText(ID + "(��)�� �α��� �Ͽ����ϴ�.");
     			chooseID = true;
                 ltext.setVisible(false);
     			itext.setVisible(false);
     			ipbl.setVisible(false);
     			loglbl.setVisible(false);
     			setSize(330,260);
     			
                 clientdata.setLength(0);
                 clientdata.append(REQ_LOGON);
                 clientdata.append(SEPARATOR);
                 clientdata.append(ID);
                 output.write(clientdata.toString()+"\r\n");
                 output.flush();
              } catch(NullPointerException e) {	//UnknownHostException, ConnectException �� ����.
      			mlbl.setText("IP �ּҰ� �߸��Ǿ����ϴ�."); 
      			ltext.setVisible(true);
      			itext.setVisible(true);
      			ipbl.setVisible(true);
      			loglbl.setVisible(true);
                  itext.setText("");
      			setSize(300,250);
      			ID = null;	ServerIP = null;
      		 } catch(Exception e) {
                  e.printStackTrace();
               }
            }
         }
         public static void main(String args[]) {
            ChatSenderC c = new ChatSenderC();
         }
         class WinListener extends WindowAdapter {
             public void windowClosing(WindowEvent e) {
       		  if(chooseID) {
       			clientdata.setLength(0);
       			clientdata.append(REQ_LOGOUT);
       			clientdata.append(SEPARATOR);
       			clientdata.append(ID);
       			try {
       				output.write(clientdata.toString()+"\r\n");
       				output.flush();
       			} catch (IOException ie) { }
       		  }
       		  
       		  System.exit(0);
             }
          }
         public void keyPressed(KeyEvent ke) {
             if(ke.getKeyChar() == KeyEvent.VK_ENTER) {
                String message = new String();
                message = wtext.getText();
       		 try {
                      clientdata.setLength(0);
                      clientdata.append(REQ_SENDWORDS);
                      clientdata.append(SEPARATOR);
                      clientdata.append(ID);
                      clientdata.append(SEPARATOR);
                      clientdata.append(message);
                      output.write(clientdata.toString()+"\r\n");
                      output.flush();
                      wtext.setText("");
       		 } catch (IOException e) {
       			 e.printStackTrace();
       		 }
             }
          }
         public void keyReleased(KeyEvent ke) { }
         public void keyTyped(KeyEvent ke) { }
      }
