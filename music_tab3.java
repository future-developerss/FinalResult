import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class music_tab3 extends JPanel{
	JPanel p1;
	JButton play1, play2;
	JLabel go1, go2, lyric;
	String[] lyrics = {"\"난 나의 보폭으로 갈게\"", "\"아무 말 안 해도 다 알고 있다고\"", "\"결속은 나의 무기\"","\"거대한 원형 속에 보이네 너의 미소\"",
			"\"너를 만나 참 행복했어\"", "\"내 모든걸 다 잃는대도 후회하지 않아\"", "\"You don't wanna be alone\"","\"Singing love is forever and ever\"",
			"\"We could go anywhere we could do\"", "\"My youth my youth is yours\"", "\"Let me check my chest\"", "\"거짓말 같은 하루를 흘려내고\"",
			"\"뜨겁던 해는 지고\"", "\"In my dreams underneath the stars\"", "\"그저 너의 등을 감싸 안으며\"", "\"방황하던 날 강렬하게 이끈 힘\"", 
			"\"그와 다툰 뒤엔 난 시집을 꺼내 읽어\"", "\"but you don't wanna reach the end\"", "\"Did you see me feeding\"", "\"We aren't caught up in your love affair\"",
			"\"You try and mask your pain\"", "\"Feeling like I'm runnin' away\""};
	static int num1 = culture_q2.Max2();
	Font font1 = new Font("a시네마L", Font.BOLD, 20);
	Font font2 = new Font("a시네마L", Font.ITALIC, 20);
	//Font font3 = new Font("a시네마L", Font.BOLD, 12);
	
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
			
			go1 = new JLabel("추천곡 들으러 가기");
			go1 = setLabel(go1);
			
			go2 = new JLabel("유사곡 들으러 가기");
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