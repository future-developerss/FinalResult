import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.*;

public class FoodDessert2 extends JPanel {
	JPanel p_tot, p1, p3, p5, p_mid;
	ImageIcon brand1, brand2;
	JLabel brand1_e, brand2_e, brand1_m, brand2_m;
	JButton btn1, btn2;

	public FoodDessert2() {
		p_tot = new JPanel();
		p_tot.setLayout(new GridLayout(1, 2, 50,50));
		p1 = new JPanel();
		p1.setLayout(new GridLayout(3, 1));
		p3 = new JPanel();
		p3.setLayout(new GridLayout(3, 1));
		p_mid = new JPanel();
		p_mid.setLayout(new GridLayout(2,2));
		Font font_15 = new Font("a시네마L", Font.BOLD, 15);
		Font font_13 = new Font("a시네마L", Font.PLAIN, 13);

		brand1 = new ImageIcon("images/R1dessert1.jpg");
		brand1 = imageSize(brand1, 100, 100);
		brand1_e = new JLabel("올모스트홈카페", JLabel.LEFT);
		brand1_m = new JLabel("<html>목련꽃차(5,000)<br>흑임자 아이스크림 모나카(6,000)<br><br></html>", JLabel.LEFT);
		btn1 = new JButton("위치 보기");
		
		btn1.addActionListener(new LinkListener());
		p1.add(brand1_e);
		p1.add(brand1_m);
		p1.add(btn1);

		brand2 = new ImageIcon("images/R1dessert2.jpg");
		brand2 = imageSize(brand2, 100, 100);
		brand2_e = new JLabel("김씨부인", JLabel.LEFT);
		brand2_m = new JLabel("<html>아담(떡, 한과, 정과 16,000)<br>밤라떼(8,500)<br><br></html>", JLabel.LEFT);
		btn2 = new JButton("위치 보기");
		btn2.addActionListener(new LinkListener());
		p3.add(brand2_e);
		p3.add(brand2_m);
		p3.add(btn2);
		
		//p5 = new JPanel();
		//link = new JButton("주변 매장 검색");
		//link.addActionListener(new LinkListener());
		//p5.add(link);

		brand1_e.setFont(font_15);
		brand2_e.setFont(font_15);
		brand1_m.setFont(font_13);
		brand2_m.setFont(font_13);

		//p_mid.add(p1);
		//p_mid.add(p3);
		p_tot.add(p1);
		p_tot.add(p3);
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
			if(e.getSource() == btn1) {
				String urlLink = "https://map.naver.com/v5/entry/place/1859131133?c=14135555.0155712,4520189.9212696,13,0,0,0,dh&placePath=%2Fhome%3Fentry=plt";
				try {
					Desktop.getDesktop().browse(new URI(urlLink));
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (URISyntaxException e2) {
					e2.printStackTrace();
				}
			}
			if(e.getSource() == btn2) {
				String urlLink = "https://map.naver.com/v5/search/%EA%B9%80%EC%94%A8%EB%B6%80%EC%9D%B8/place/1190246958?c=14135575.4760936,4508904.9558603,13,0,0,0,dh";
				try {
					Desktop.getDesktop().browse(new URI(urlLink));
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (URISyntaxException e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}