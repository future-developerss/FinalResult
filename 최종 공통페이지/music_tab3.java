import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class music_tab3 extends JPanel{
	JPanel p1;
	JButton play1, play2;
	JLabel go1, go2, lyric;
	String[] lyrics = {"\"�� ���� �������� ����\"", "\"�ƹ� �� �� �ص� �� �˰� �ִٰ�\"", "\"����� ���� ����\"","\"�Ŵ��� ���� �ӿ� ���̳� ���� �̼�\"",
			"\"�ʸ� ���� �� �ູ�߾�\"", "\"�� ���� �� �Ҵ´뵵 ��ȸ���� �ʾ�\"", "\"You don't wanna be alone\"","\"Singing love is forever and ever\"",
			"\"We could go anywhere we could do\"", "\"My youth my youth is yours\"", "\"Let me check my chest\"", "\"������ ���� �Ϸ縦 �������\"",
			"\"�̴߰� �ش� ����\"", "\"In my dreams underneath the stars\"", "\"���� ���� ���� ���� ������\"", "\"��Ȳ�ϴ� �� �����ϰ� �̲� ��\"", 
			"\"�׿� ���� �ڿ� �� ������ ���� �о�\"", "\"but you don't wanna reach the end\"", "\"Did you see me feeding\"", "\"We aren't caught up in your love affair\"",
			"\"You try and mask your pain\"", "\"Feeling like I'm runnin' away\""};
	static int num1 = culture_q2.Max2();
	Font font1 = new Font("a�ó׸�L", Font.BOLD, 20);
	Font font2 = new Font("a�ó׸�L", Font.ITALIC, 20);
	//Font font3 = new Font("a�ó׸�L", Font.BOLD, 12);
	
	GridBagLayout Gbag = new GridBagLayout();
	GridBagConstraints gb;
	
	public music_tab3(int num) {
		
			super.setLayout(new BorderLayout(0,0));
			p1 = new JPanel();
			p1.setLayout(Gbag);
			
			play1 = new JButton(new ImageIcon("image/play.png"));
			play1.setBorderPainted(false);
			play1.setFocusPainted(false);
			play1.setContentAreaFilled(false);
			play1.addActionListener(new LinkListener());
			
			play2 = new JButton(new ImageIcon("image/play.png"));
			play2.setBorderPainted(false);
			play2.setFocusPainted(false);
			play2.setContentAreaFilled(false);
			play2.addActionListener(new LinkListener());
			
			//play = imageSize(play, 50, 50);
			
			go1 = new JLabel("��õ�� ������ ����");
			go1 = setLabel(go1);
			
			go2 = new JLabel("����� ������ ����");
			go2 = setLabel(go2);
			
			lyric = new JLabel(lyrics[num]);
			lyric.setFont(font2);
			lyric.setHorizontalAlignment(JLabel.CENTER);
			Layout(play1, 0, 0, 1, 1);
			Layout(play2, 1, 0, 1, 1);
			Layout(go1, 0, 1, 1, 1);
			Layout(go2, 1, 1, 1, 1);
			Layout(lyric, 0, 2, 2, 1 );
				
			add("Center",p1);
		}
		
		JLabel setLabel(JLabel lb) {
			lb.setVerticalTextPosition(SwingConstants.BOTTOM);
			lb.setHorizontalTextPosition(SwingConstants.CENTER);
			lb.setFont(font1);
			return lb;
		}
		
		ImageIcon imageSize(ImageIcon icon, int x, int y) {
			Image ximg = icon.getImage();
			Image yimg = ximg.getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH);
			ImageIcon xyimg = new ImageIcon(yimg);
			return xyimg;
		}
		public void Layout(Component cp, int x, int y, int w, int h) {
			GridBagConstraints gb = new GridBagConstraints();
			gb.fill = GridBagConstraints.BOTH;
			gb.gridx = x;
			gb.gridy = y;
			gb.gridwidth = w;
			gb.gridheight = h;
			gb.insets = new Insets(10, 50, 10, 50);
			
			this.Gbag.setConstraints(cp, gb);
			p1.add(cp);
			p1.updateUI();
		}
		class LinkListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == play1) {
					new GoLink(num1);
				}
				else if (e.getSource()== play2) {
					new GoLink2(num1);
				}
			}
		}
}