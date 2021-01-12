package java3_project;

import java.awt.*;
import java.applet.*;

public class ColorFont extends Applet  {
   // 폰트를 객체를 만들고 폰트를 설정한다.
   Font fntPlain = new Font("TimesRoman", Font.PLAIN, 18);
   Font fntBold = new Font("TimesRoman", Font.BOLD, 18);
   Font fntItalic = new Font("TimesRoman", Font.ITALIC, 18);
   Font fntBoldItalic 
        = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 18);

   public void init()  {
       // 애플릿 크기를 가로 300 세로 150으로 설정
       resize(300, 150);
    }

   public void paint(Graphics g)  {
      g.setColor(Color.red);	// 빨간색으로 설정
      g.setFont(fntPlain);	// 폰트를 fntPlain으로 설정
      g.drawString("This style is a plain font", 20, 25);
		      		// 문자열 출력

      g.setColor(Color.blue);	// 파란색으로 설정
      g.setFont(fntBold);	// 폰트를 fntBold로 설정
      g.drawString("This style is a bold font", 20, 50);
		      		// 문자열 출력

      g.setColor(new Color(255,0,0));	// 빨간색으로 설정
      g.setFont(fntItalic);	// 폰트를 fntItalic으로 설정
      g.drawString("This style is an italic font", 20, 75);
		      		// 문자열 출력

      g.setColor(new Color(0,0,255));	// 파란색으로 설정
      g.setFont(fntBoldItalic);	// 폰트를 BoldItalic으로 설정
      g.drawString("this style is a bold italic fond", 20, 100);
		      		// 문자열 출력
    }
}