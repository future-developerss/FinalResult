import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FoodCombi2 extends JPanel {
	JPanel p_tot, p1, p2, p3, p_mid, p4;
	ImageIcon brand1;
	JLabel combi1, combi2, combi3, combi1_e, combi2_e, combi3_e, graph;
	JButton show;
	
	public FoodCombi2() {
		p_tot = new JPanel();
		p_tot.setLayout(new GridLayout(1,2,30,30));
		p1 = new JPanel();
		p1.setLayout(new GridLayout(2,1));
		p2 = new JPanel();
		p2.setLayout(new GridLayout(2,1));
		p3 = new JPanel();
		p3.setLayout(new GridLayout(2,1));
		p_mid = new JPanel();
		p_mid.setLayout(new GridLayout(3,1));
		p4 = new JPanel();
		Font font_15 = new Font("a시네마L", Font.BOLD, 15);
		Font font_13 = new Font("a시네마L", Font.PLAIN, 13);
		
		combi1 = new JLabel("· 된장찌개",JLabel.LEFT);
		combi1_e = new JLabel("<html>흰 쌀밥 + 간장게장 + 구수한 된장찌개 = 천국!<br><br></html>", JLabel.LEFT);
		p1.add(combi1);
		p1.add(combi1_e);
		combi2 = new JLabel("· 계란말이", JLabel.LEFT);
		combi2_e = new JLabel("<html>한식에 빠질 수 없는 계란말이<br><br></html>",JLabel.LEFT);	
		p3.add(combi2);
		p3.add(combi2_e);
		combi3 = new JLabel("· 탄산음료",JLabel.LEFT);
		combi3_e = new JLabel("<html>시원한 탄산은 어디에나 찰떡궁합<br><br></html>",JLabel.LEFT);
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
		
		//막대 그래프 작성
		show = new JButton("같이 먹을 궁합 음식 고르기");
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
				String[] combi_food = {"된장찌개", "계란말이", "탄산음료"};
				int index = (int) (Math.random() * 3); // 뽑기를 위한 난수 생성
				String computer = combi_food[index];
				JOptionPane.showMessageDialog(null,"=========COMBI FOOD=========\n" + computer+" 어떠신가요?");
			}
		}
	}
}