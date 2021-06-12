import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

//import culture_q2.MyActionListener;
public class resultPage_Book extends JFrame {
	JPanel p1, p2, bottom, contentPane;
	RoundButton before, main;
	JLabel title, subtitle, poster;

	JTabbedPane tabpane;
	ImageIcon mainImage;
	String[] book_name = {"아가미","공간의 미래","풀꽃","종의 기원", "아몬드", "보건교사 안은영",
			"미비포유","인간 실격","오베라는 남자", "앵무새 죽이기","리버 보이","렛미인",
			"불편한 편의점","알로하, 나의 엄마들", "칵테일, 러브, 좀비","여름의 빌라","그러라 그래","그곳을 선물합니다",
			"이방인", "프리티 씽", "고도를 기다리며","고백","달과 6펜스","뮤직숍"};
	String username;
	static String bt_back = culture_q2.bt_name4;
	static int[] temp_b1 = culture_q2.temp3_1;
	static int[] temp_b2 = culture_q2.temp3_2;
	static int[] temp_b3 = culture_q2.temp3_3;
	
	public resultPage_Book(int num, String name) {
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
		
		title = new JLabel(name+"이의 오늘은?");
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
		
		mainImage = new ImageIcon("image/book_poster"+ num +".jpg");
		mainImage = imageSize(mainImage, 250,350);
		poster = new JLabel(book_name[num], mainImage, JLabel.CENTER);
		poster.setFont(font2);
		poster.setHorizontalTextPosition(SwingConstants.CENTER);
		poster.setVerticalTextPosition(SwingConstants.BOTTOM);
		poster.setBounds(180, 20, 300, 400);
		p2.add(poster);
	
		book_tab1 boo_1 = new book_tab1(num);
		book_tab2 boo_2 = new book_tab2(num);
		//book_tab3 boo_3 = new book_tab3(num);
		
		tabpane = new JTabbedPane();
		tabpane.addTab("작가", boo_1);
		tabpane.addTab("줄거리", boo_2);
		
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
				new culture_q2(bt_back,username, temp_b1, temp_b2, temp_b3);
				resultPage_Book.this.setVisible(false);
			}	
			else if (b.getText().equals("메인으로")){
				new survey(resultPage_Book.this);
				//resultPage.this.setUndecorated(true);
				//resultPage.this.setBackground(new Color(0, 0, 122));
			}	
		}
	}
}