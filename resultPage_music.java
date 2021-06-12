import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

//import culture_q2.MyActionListener;
public class resultPage_music extends JFrame {
	JPanel p1, p2, bottom, contentPane;
	RoundButton before, main;
	JLabel title, subtitle, poster;
	//static String []tabname = {"출연진/감독", "줄거리", "평점/한줄평", "감상 플랫폼"};
	JTabbedPane tabpane;
	ImageIcon mainImage;
	String username;
	static String bt_back = culture_q2.bt_name4;
	static int[] temp_b1 = culture_q2.temp3_1;
	static int[] temp_b2 = culture_q2.temp3_2;
	static int[] temp_b3 = culture_q2.temp3_3;
	String[] movie_name = {
			"이지금","나빠","Next Level","달","너를 만나","아로하","Sunflower","2002","Paris in the rain","Bad","Youth",
			"We don’t talk anymore","긴 꿈","여름밤","Baby blue","Going home","Gravity","Datoom",
			"Up","Tommy’s party","Royals","Geology","Me&you together song","Easy"
};
	public resultPage_music(int num, String name) {
		super("Common Page");
		username = name;
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		p1 = new JPanel();
		p1.setLayout(new GridLayout(2,1, 30, 30));
		
		Font font = new Font("a시네마L", Font.PLAIN, 50);
		Font font1 = new Font("a시네마L", Font.PLAIN, 30);
		Font font2 = new Font("a시네마L", Font.BOLD, 20);
		Font font3 = new Font("a시네마L", Font.PLAIN, 15);
		
		title = new JLabel(username+"님의 오늘은?");
		title.setBorder(BorderFactory.createEmptyBorder(30 , 0 , 0 , 0));
		subtitle = new JLabel("당신을 위한, 오늘 최적의 문화 생활 추천은 다음과 같습니다.");
		title.setHorizontalAlignment(JLabel.CENTER);
		subtitle.setHorizontalAlignment(JLabel.CENTER);
		title.setFont(font);
		subtitle.setFont(font1);
		p1.add(title);
		p1.add(subtitle);
		
		contentPane.add("North", p1);
		
		p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		p2.setLayout(null);
		
		mainImage = new ImageIcon("image/music_poster"+ num +".jpg");
		mainImage = imageSize(mainImage, 300,300);
		poster = new JLabel(movie_name[num], mainImage, JLabel.CENTER);
		poster.setFont(font2);
		poster.setHorizontalTextPosition(SwingConstants.CENTER);
		poster.setVerticalTextPosition(SwingConstants.BOTTOM);
		poster.setBounds(180, 20, 300, 400);
		p2.add(poster);
	
		music_tab1 mus_1 = new music_tab1(num);
		music_tab2 mus_2 = new music_tab2(num);
		music_tab3 mus_3 = new music_tab3(num);
		//movie_tab4 mov_4 = new movie_tab4();
		
		tabpane = new JTabbedPane();
		tabpane.addTab("가수/곡소개", mus_1);
		tabpane.addTab("유사곡 추천", mus_2);
		tabpane.addTab("감상", mus_3);
		
		tabpane.setFont(font3);
		p2.add(tabpane);
		tabpane.setBounds(550, 50, 800, 300);
		contentPane.add("Center", p2);
		
		bottom = new JPanel();
		bottom.setLayout(new BorderLayout());
		before = new RoundButton("이전으로");	before.setBackground(new Color(102, 102, 102));
		main = new RoundButton("메인으로");	main.setBackground(new Color(102, 102, 102));
		before.addActionListener(new MyActionListener());
		main.addActionListener(new MyActionListener());
		
		bottom.add("West",before); 	bottom.add("East",main);
		bottom.setBorder(BorderFactory.createEmptyBorder(0 , 80 , 50 , 80));
		contentPane.add("South", bottom);
		
		setSize(1500,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public ImageIcon imageSize(ImageIcon icon, int x, int y) {
		Image ximg = icon.getImage();
		Image yimg = ximg.getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg);
		return xyimg;
	}
		
	public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(150, 230, 1350, 230);
    }
	
	private class MyActionListener implements ActionListener{		
		public void actionPerformed(ActionEvent e){
			RoundButton b=(RoundButton)e.getSource();
			if (b.getText().equals("이전으로")){
				new culture_q2(bt_back, username, temp_b1, temp_b2, temp_b3);
				resultPage_music.this.setVisible(false);
			}	
			else if (b.getText().equals("메인으로")){
				new survey(resultPage_music.this);
				
			}	
		}
	}
}