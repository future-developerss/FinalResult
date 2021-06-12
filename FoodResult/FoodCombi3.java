import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FoodCombi3 extends JPanel {
	JPanel p_tot, p1, p2, p3, p_mid, p4;
	ImageIcon brand1;
	JLabel combi1, combi2, combi3, combi1_e, combi2_e, combi3_e, graph;
	JButton show;
	
	public FoodCombi3() {
		p_tot = new JPanel();
		p_tot.setLayout(new GridLayout(1,2,10,10));
		p1 = new JPanel();
		p1.setLayout(new GridLayout(2,1));
		p2 = new JPanel();
		p2.setLayout(new GridLayout(2,1));
		p3 = new JPanel();
		p3.setLayout(new GridLayout(2,1));
		p_mid = new JPanel();
		p_mid.setLayout(new GridLayout(3,1));
		p4 = new JPanel();
		Font font_15 = new Font("a�ó׸�L", Font.BOLD, 15);
		Font font_13 = new Font("a�ó׸�L", Font.PLAIN, 13);
		
		combi1 = new JLabel("�� �ø��",JLabel.LEFT);
		combi1_e = new JLabel("<html>�ÿ��Ѱ� ����� �ø��<br><br></html>", JLabel.LEFT);
		p1.add(combi1);
		p1.add(combi1_e);
		combi2 = new JLabel("�� �쵿", JLabel.LEFT);
		combi2_e = new JLabel("<html>�߶��Ѱ� ����� �쵿<br><br></html>",JLabel.LEFT);	
		p3.add(combi2);
		p3.add(combi2_e);
		combi3 = new JLabel("�� ź������",JLabel.LEFT);
		combi3_e = new JLabel("<html>�ÿ��� ź���� ��𿡳� ��������<br><br></html>",JLabel.LEFT);
		p2.add(combi3);
		p2.add(combi3_e);
		
		combi1.setFont(font_15);
		combi2.setFont(font_15);
		combi3.setFont(font_15);
		combi1_e.setFont(font_13);
		combi2_e.setFont(font_13);
		combi3_e.setFont(font_13);
		
		p_mid.add(p1);
		p_mid.add(p3);
		p_mid.add(p2);
		
		//���� �׷��� �ۼ�
		show = new JButton("���� ���� ���� ���� ����");
		show.addActionListener(new ShowListener());
		p4.add(show);
				
		p_tot.add(p_mid);
		p_tot.add(p4);
		add(p_tot);
	}

	ImageIcon imageSize(ImageIcon icon, int x, int y) {
		Image ximg = icon.getImage();
		Image yimg = ximg.getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg);
		return xyimg;
	}
	
	public class ShowListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == show) {
				String[] combi_food = {"�ø��", "�쵿", "ź������"};
				int index = (int) (Math.random() * 3); // �̱⸦ ���� ���� ����
				String computer = combi_food[index];
				JOptionPane.showMessageDialog(null,"=========COMBI FOOD=========\n" + computer+" ��Ű���?");
			}
		}
	}
}