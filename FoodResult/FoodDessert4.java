import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FoodDessert4 extends JPanel {
	JPanel p_tot, p1, p2, p3, p4, p5, p_mid;
	ImageIcon brand1, brand2;
	JLabel brand1_n, brand2_n, brand1_e, brand2_e, brand1_m, brand2_m;
	JButton link;

	public FoodDessert4() {
		p_tot = new JPanel();
		p_tot.setLayout(new GridLayout(1, 2));
		p1 = new JPanel();
		p1.setLayout(new GridLayout(2, 1));
		p2 = new JPanel();
		p3 = new JPanel();
		p3.setLayout(new GridLayout(2, 1));
		p4 = new JPanel();
		p_mid = new JPanel();
		p_mid.setLayout(new GridLayout(2,2));
		Font font_15 = new Font("a½Ã³×¸¶L", Font.BOLD, 15);
		Font font_13 = new Font("a½Ã³×¸¶L", Font.PLAIN, 13);

		brand1 = new ImageIcon("images/R4dessert1.png");
		brand1 = imageSize(brand1, 100, 100);
		brand1_e = new JLabel("¸¶Ä«·Õ", JLabel.LEFT);
		brand1_m = new JLabel("<html>ÇÑÀÔ¸¶Ä«·Õ<br>ºô¸®¿£Á©</html>", JLabel.LEFT);
		p1.add(brand1_e);
		p1.add(brand1_m);

		brand2 = new ImageIcon("images/R1dessert2.jpg");
		brand2 = imageSize(brand2, 100, 100);
		brand2_e = new JLabel("ºù¼ö", JLabel.LEFT);
		brand2_m = new JLabel("<html>µµÄìºù¼ö<br>¼³ºù<br>³ª¶Ñ·ç</html>", JLabel.LEFT);
		p3.add(brand2_e);
		p3.add(brand2_m);

		brand1_n = new JLabel("¸¶Ä«·Õ", brand1, JLabel.RIGHT);
		brand1_n = setLabel(brand1_n);
		brand1_n.setFont(font_13);
		p2.add(brand1_n);

		brand2_n = new JLabel("ºù¼ö", brand2, JLabel.RIGHT);
		brand2_n = setLabel(brand2_n);
		brand2_n.setFont(font_13);
		p4.add(brand2_n);
		
		p5 = new JPanel();
		link = new JButton("ÁÖº¯ ¸ÅÀå °Ë»ö");
		link.addActionListener(new LinkListener());
		p5.add(link);

		brand1_e.setFont(font_15);
		brand2_e.setFont(font_15);
		brand1_m.setFont(font_13);
		brand2_m.setFont(font_13);

		p_mid.add(p1);
		p_mid.add(p2);
		p_mid.add(p3);
		p_mid.add(p4);
		p_tot.add(p_mid);
		p_tot.add(p5);
		add(p_tot);
	}

	JLabel setLabel(JLabel lb) {
		lb.setVerticalTextPosition(SwingConstants.BOTTOM);
		lb.setHorizontalTextPosition(SwingConstants.CENTER);
		return lb;
	}

	ImageIcon imageSize(ImageIcon icon, int x, int y) {
		Image ximg = icon.getImage();
		Image yimg = ximg.getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg);
		return xyimg;
	}

	class LinkListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == link) {
				new SearchLink1();
			}
		}
	}
}