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
	String[] book_name = {"�ư���","������ �̷�","Ǯ��","���� ���", "�Ƹ��", "���Ǳ��� ������",
			"�̺�����","�ΰ� �ǰ�","������� ����", "�޹��� ���̱�","���� ����","������",
			"������ ������","�˷���, ���� ������", "Ĭ����, ����, ����","������ ����","�׷��� �׷�","�װ��� �����մϴ�",
			"�̹���", "����Ƽ ��", "���� ��ٸ���","���","�ް� 6�潺","������"};
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
		
		Font font = new Font("a�ó׸�L", Font.PLAIN, 50);
		Font font1 = new Font("a�ó׸�L", Font.PLAIN, 30);
		Font font2 = new Font("a�ó׸�L", Font.BOLD, 20);
		Font font3 = new Font("a�ó׸�L", Font.PLAIN, 15);
		
		title = new JLabel(name+"���� ������?");
		title.setBorder(BorderFactory.createEmptyBorder(30 , 0 , 0 , 0));
		subtitle = new JLabel("����� ����, ���� ������ ��ȭ ��Ȱ ��õ�� ������ �����ϴ�.");
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
		tabpane.addTab("�۰�", boo_1);
		tabpane.addTab("�ٰŸ�", boo_2);
		
		tabpane.setFont(font3);
		p2.add(tabpane);
		tabpane.setBounds(550, 50, 800, 300);
		contentPane.add("Center", p2);
		
		bottom = new JPanel();
		bottom.setLayout(new BorderLayout());
		before = new RoundButton("��������");	before.setBackground(new Color(102, 102, 102));
		main = new RoundButton("��������");	main.setBackground(new Color(102, 102, 102));
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
			if (b.getText().equals("��������")){
				new culture_q2(bt_back,username, temp_b1, temp_b2, temp_b3);
				resultPage_Book.this.setVisible(false);
			}	
			else if (b.getText().equals("��������")){
				new survey(resultPage_Book.this);
				//resultPage.this.setUndecorated(true);
				//resultPage.this.setBackground(new Color(0, 0, 122));
			}	
		}
	}
}