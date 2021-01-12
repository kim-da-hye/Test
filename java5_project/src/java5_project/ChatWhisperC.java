package java5_project;

import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class ChatWhisperC extends Frame
     implements ActionListener, KeyListener {	
   TextArea display;
   TextField wtext, ltext;
   Label mlbl, wlbl, loglbl;
   BufferedWriter output;
   BufferedReader input;
   Socket client;
   StringBuffer clientdata;
   String serverdata;
   String ID;
   private static final String SEPARATOR = "|";
   private static final int REQ_LOGON = 1001;
   private static final int REQ_SENDWORDS = 1021;
   private static final int REQ_WISPERSEND = 1022;
	
   public ChatWhisperC() {
      super("클라이언트");

      mlbl = new Label("채팅 상태를 보여줍니다.");
      add(mlbl, BorderLayout.NORTH);

      display = new TextArea("", 0, 0, 
        TextArea.SCROLLBARS_VERTICAL_ONLY);
      display.setEditable(false);
      add(display, BorderLayout.CENTER);

      Panel ptotal = new Panel(new BorderLayout());
      Panel pword = new Panel(new BorderLayout());
      wlbl = new Label("대화말");
      wtext = new TextField(30); //전송할 데이터를 입력하는 필드
      wtext.addKeyListener(this); 
       //입력된 데이터를 송신하기 위한 이벤트 연결
      pword.add(wlbl, BorderLayout.WEST);
      pword.add(wtext, BorderLayout.EAST);
      ptotal.add(pword, BorderLayout.CENTER);

      Panel plabel = new Panel(new BorderLayout());
      loglbl = new Label("로그온");
      ltext = new TextField(30); //전송할 데이터를 입력하는 필드
      ltext.addActionListener(this); 
       //입력된 데이터를 송신하기 위한 이벤트 연결
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
	         client = new Socket(InetAddress.getLocalHost(), 5000);
	         mlbl.setText("연결된 서버이름 : " + 
	           client.getInetAddress().getHostName());
	         input = new BufferedReader(new 
	            InputStreamReader(client.getInputStream()));
	         output = new BufferedWriter(new 
	           OutputStreamWriter(client.getOutputStream()));
	         clientdata = new StringBuffer(2048);
	         mlbl.setText("접속 완료 사용할 아이디를 입력하세요.");

	         while(true) {
	            serverdata = input.readLine();
	            display.append(serverdata+"\r\n");
	            output.flush();
	         }
	      } catch(IOException e) {
	         e.printStackTrace();
	      }
	   }
   public void actionPerformed(ActionEvent ae){
	      if(ID == null) {
	         ID = ltext.getText();
	         mlbl.setText(ID + "(으)로 로그인 하였습니다.");
	         try {
	            clientdata.setLength(0);
	            clientdata.append(REQ_LOGON);
	            clientdata.append(SEPARATOR);
	            clientdata.append(ID);
	            output.write(clientdata.toString()+"\r\n");
	            output.flush();
	            ltext.setVisible(false);
	         } catch(Exception e) {
	            e.printStackTrace();
	         }
	      }
	   }
	 public static void main(String args[]) {
	      ChatWhisperC c = new ChatWhisperC();
	      c.runClient();
	 }
	 class WinListener extends WindowAdapter {
	      public void windowClosing(WindowEvent e){
	         System.exit(0);
	      }
	   }
	   public void keyPressed(KeyEvent ke) {
	      if(ke.getKeyChar() == KeyEvent.VK_ENTER) {
	         String message = wtext.getText();
	         StringTokenizer st = new StringTokenizer(message, " ");
	         if (ID == null) {
	            mlbl.setText("다시 로그인 하세요!!!");
	            wtext.setText("");
	         } else {
	            try {
	               if(st.nextToken().equals("/w")) {
	                  message = message.substring(3); // “/w”를 삭제한다.
	                  String WID = st.nextToken();
	                  String Wmessage = st.nextToken();
	                  while(st.hasMoreTokens()) {
	                     Wmessage = Wmessage + " " + st.nextToken();
	                  }
	                  clientdata.setLength(0);
	                  clientdata.append(REQ_WISPERSEND);
	                  clientdata.append(SEPARATOR);
	                  clientdata.append(ID);
	                  clientdata.append(SEPARATOR);
	                  clientdata.append(WID);
	                  clientdata.append(SEPARATOR);
	                  clientdata.append(Wmessage);
	                  output.write(clientdata.toString()+"\r\n");
	                  output.flush();
	                  wtext.setText("");
	               } else {
	                  clientdata.setLength(0);
	                  clientdata.append(REQ_SENDWORDS);
	                  clientdata.append(SEPARATOR);
	                  clientdata.append(ID);
	                  clientdata.append(SEPARATOR);
	                  clientdata.append(message);
	                  output.write(clientdata.toString()+"\r\n");
	                  output.flush();
	                  wtext.setText("");  }
	            } catch (IOException e) {
	                e.printStackTrace();
	             }
	          }
	       }
	    }

	    public void keyReleased(KeyEvent ke) {
	    }

	    public void keyTyped(KeyEvent ke) {
	    }
	 }