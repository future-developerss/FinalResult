import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FoodBrand3 extends JPanel {
	JPanel p_tot, p1, p2, p3, p4;
	ImageIcon brand1, brand2;
	JLabel brand1_n, brand2_n, brand1_e, brand2_e, brand1_m, brand2_m;
	
	public FoodBrand3() {
		p_tot = new JPanel();
		p_tot.setLayout(new GridLayout(2,2));
		p1 = new JPanel();
		p1.setLayout(new GridLayout(2,1));
		p2 = new JPanel();
		p3 = new JPanel();
		p3.setLayout(new GridLayout(2,1));
		p4 = new JPanel();
		Font font_15 = new Font("a�ó׸�L", Font.BOLD, 15);
		Font font_13 = new Font("a�ó׸�L", Font.PLAIN, 13);
		
		brand1 = new ImageIcon("images/R3brand1.jpg");
		brand1 = imageSize(brand1, 100,100);
		brand1_e = new JLabel("��ġ �� ��ǥ �޴�",JLabel.LEFT);
		brand1_m = new JLabel("<html>��⵵ ���ֽ� ����1�� 397-4<br>����ʹ�10p(11,000)<br>ȸ���� ��Ʈ(14,000)</html>", JLabel.LEFT);
		p1.add(brand1_e);
		p1.add(brand1_m);

		brand2 = new ImageIcon("images/R3brand2.jpg");
		brand2 = imageSize(brand2, 100,100);
		brand2_e = new JLabel("��ġ �� ��ǥ �޴�", JLabel.LEFT);
		brand2_m = new JLabel("<html>���� ��걸 û�ķ�45�� 16<br>��ġ�ʹ�8p(8,500)<br>�����ʹ�10p(14,000)</html>",JLabel.LEFT);
		p3.add(brand2_e);
		p3.add(brand2_m);
		
		brand1_n = new JLabel("�����ʹ�", brand1, JLabel.RIGHT);
		brand1_n = setLabel(brand1_n);
		brand1_n.setFont(font_13);
		p2.add(brand1_n);
		
		brand2_n = new JLabel("�����ʹ�", brand2, JLabel.RIGHT);
		brand2_n = setLabel(brand2_n);
		brand2_n.setFont(font_13);
		p4.add(brand2_n);
		
		brand1_e.setFont(font_15);
		brand2_e.setFont(font_15);
		brand1_m.setFont(font_13);
		brand2_m.setFont(font_13);
		
		p_tot.add(p1);
		p_tot.add(p2);
		p_tot.add(p3);
		p_tot.add(p4);
		
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
}