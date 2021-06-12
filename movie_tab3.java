import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class movie_tab3 extends JPanel{
	JPanel p1;
	int [] fem = {54, 71, 74, 64, 47, 35, 62, 62, 35, 60, 43, 60, 62, 74, 62, 79, 59, 59, 70, 56, 70, 60, 45, 40};
	int [] men = {46, 29, 26, 36, 53, 65, 38, 38, 65, 40, 57, 40, 38, 26, 38, 21, 41, 41, 30, 44, 30, 40, 55, 60};
	int [] ten = {7, 4 , 3, 0, 6, 18, 8, 8, 10, 8, 3, 8, 3, 2, 4, 7, 2, 3, 5, 5, 5, 1, 3, 5};
	int [] two = {63,55, 10, 73, 59, 47, 63, 63, 30, 59, 55, 58, 65, 49, 35, 56, 53, 57, 50, 59, 50, 63, 62, 59};
	int [] three = {17,25, 35, 18, 23, 24, 15, 15, 30, 19, 27, 25, 26, 30, 29, 20, 29, 27, 24, 25, 24, 27, 24, 25};
	int [] four = {10, 10, 45, 9, 9, 6, 11, 20, 20, 9, 11, 7, 5, 16, 27, 11, 11, 9, 16, 8, 16, 4, 9, 8};
	int [] five = {3, 5, 7, 0, 3, 6, 4, 4, 10, 6, 3, 2, 1, 3, 5, 5, 4, 4, 5, 3, 5, 5, 2, 3};
	
	Color color1 = new Color(102, 153, 153);
	Color color2 = new Color(204, 153, 051);
	Color color10 = new Color(153, 204, 000);
	Color color20 = new Color(255, 102, 204);
	Color color30 = new Color(204, 102, 000);
	Color color40 = new Color(102, 153, 051);
	Color color50 = new Color(051, 102, 153);
	static int num1 = culture_q2.Max1();
	public movie_tab3(int num) {
		
	}
	public void paintComponent(Graphics g) {
	
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	
		g2.setColor(color1);
		g2.fill(new Rectangle2D.Float(50, 100, 10, 10));
		g2.drawString("여자", 70, 110);
		g2.fill(new Arc2D.Float(120, 40, 150, 150, 0, (float)3.6 * fem[num1], Arc2D.PIE));
		
		g2.setColor(color2);
		g2.fill(new Rectangle2D.Float(50, 120, 10, 10));
		g2.drawString("남자", 70, 130);
		g2.fill(new Arc2D.Float(120, 40, 150, 150, (float)3.6 * fem[num1], (float)3.6 * men[num1], Arc2D.PIE));
		
		//연령대
		g2.setColor(color10);
		g2.fill(new Rectangle2D.Float(350, 80, 10, 10));
		g2.drawString("10대", 370, 90);
		g2.fill(new Arc2D.Float(500, 40, 150, 150, 0, (float)3.6 * ten[num1], Arc2D.PIE));
		
		g2.setColor(color20);
		g2.fill(new Rectangle2D.Float(350, 100, 10, 10));
		g2.drawString("20대", 370, 110);
		g2.fill(new Arc2D.Float(500, 40, 150, 150, (float)3.6 * ten[num1], (float)3.6 * two[num1], Arc2D.PIE));
		
		g2.setColor(color30);
		g2.fill(new Rectangle2D.Float(350, 120, 10, 10));
		g2.drawString("30대", 370, 130);
		g2.fill(new Arc2D.Float(500, 40, 150, 150, (float)3.6 * ten[num1]+(float)3.6 * two[num1], (float)3.6 * three[num1], Arc2D.PIE));
		
		g2.setColor(color40);
		g2.fill(new Rectangle2D.Float(350, 140, 10, 10));
		g2.drawString("40대", 370, 150);
		g2.fill(new Arc2D.Float(500, 40, 150, 150,
				(float)3.6 * ten[num1] + (float)3.6 * two[num1] + (float)3.6 * three[num1], (float)3.6 * four[num1], Arc2D.PIE));
		
		g2.setColor(color50);
		g2.fill(new Rectangle2D.Float(350, 160, 10, 10));
		g2.drawString("50대 이상", 370, 170);
		g2.fill(new Arc2D.Float(500, 40, 150, 150, 
				(float)3.6 * ten[num1] + (float)3.6 * two[num1] + (float)3.6 * three[num1] + (float)3.6 * four[num1], (float)3.6 * five[num1], Arc2D.PIE));
		
	}
}
