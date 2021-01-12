package java3_project;

import java.awt.*;
import java.applet.*;

public class ColorFont extends Applet  {
   // ��Ʈ�� ��ü�� ����� ��Ʈ�� �����Ѵ�.
   Font fntPlain = new Font("TimesRoman", Font.PLAIN, 18);
   Font fntBold = new Font("TimesRoman", Font.BOLD, 18);
   Font fntItalic = new Font("TimesRoman", Font.ITALIC, 18);
   Font fntBoldItalic 
        = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 18);

   public void init()  {
       // ���ø� ũ�⸦ ���� 300 ���� 150���� ����
       resize(300, 150);
    }

   public void paint(Graphics g)  {
      g.setColor(Color.red);	// ���������� ����
      g.setFont(fntPlain);	// ��Ʈ�� fntPlain���� ����
      g.drawString("This style is a plain font", 20, 25);
		      		// ���ڿ� ���

      g.setColor(Color.blue);	// �Ķ������� ����
      g.setFont(fntBold);	// ��Ʈ�� fntBold�� ����
      g.drawString("This style is a bold font", 20, 50);
		      		// ���ڿ� ���

      g.setColor(new Color(255,0,0));	// ���������� ����
      g.setFont(fntItalic);	// ��Ʈ�� fntItalic���� ����
      g.drawString("This style is an italic font", 20, 75);
		      		// ���ڿ� ���

      g.setColor(new Color(0,0,255));	// �Ķ������� ����
      g.setFont(fntBoldItalic);	// ��Ʈ�� BoldItalic���� ����
      g.drawString("this style is a bold italic fond", 20, 100);
		      		// ���ڿ� ���
    }
}