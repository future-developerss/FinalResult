import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

//import culture_q2.MyActionListener;
public class resultPage extends JFrame {
	JPanel p1, p2, bottom, contentPane;
	RoundButton before, main;
	JLabel title, subtitle, poster;
	//static String []tabname = {"출연진/감독", "줄거리", "평점/한줄평", "감상 플랫폼"};
	JTabbedPane tabpane;
	ImageIcon mainImage;
	String[] movie_name = {"너의 결혼식", "벌새", "써니", "내 머리속의 지우개", "끝까지 간다", "살인의 추억", 
							"플립", "월플라워", "화이트칙스", "말할 수 없는 비밀", "매드맥스", "유전", 
							"최악의 하루", "우리들", "개를 훔치는 완벽한 방법", "허스토리", "무뢰한", "비밀은 없다",
							"소울", "보이후드", "레이디스나잇", "디태치먼트", "베이비 드라이버", "후엠아이"};
	
	static String bt_back = culture_q2.bt_name4;
	static int[] temp_b1 = culture_q2.temp3_1;
	static int[] temp_b2 = culture_q2.temp3_2;
	static int[] temp_b3 = culture_q2.temp3_3;
	String username;
	public resultPage(int num, String name) {
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
		
		mainImage = new ImageIcon("image/movie_poster"+ num +".jpg");
		mainImage = imageSize(mainImage, 250,350);
		poster = new JLabel(movie_name[num], mainImage, JLabel.CENTER);
		poster.setFont(font2);
		poster.setHorizontalTextPosition(SwingConstants.CENTER);
		poster.setVerticalTextPosition(SwingConstants.BOTTOM);
		poster.setBounds(180, 20, 300, 400);
		p2.add(poster);
	
		movie_tab1_1 mov_1 = new movie_tab1_1(num);
		movie_tab2 mov_2 = new movie_tab2(num);
		movie_tab3 mov_3 = new movie_tab3(num);
		//movie_tab4 mov_4 = new movie_tab4();
		
		tabpane = new JTabbedPane();
		tabpane.addTab("출연진/감독", mov_1);
		tabpane.addTab("줄거리", mov_2);
		tabpane.addTab("관람 연령/성별 분포", mov_3);
		
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
				resultPage.this.setVisible(false);
			}	
			else if (b.getText().equals("메인으로")){
				new survey(resultPage.this);
				//resultPage.this.setUndecorated(true);
				//resultPage.this.setBackground(new Color(0, 0, 122));
			}	
		}
	}
}
