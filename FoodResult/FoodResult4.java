import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
public class FoodResult4 extends JFrame {
	JPanel tot_panel, title_panel, img_panel, btn_panel;
	RoundButton before, main, cal;
	JLabel title, subtitle, result_img;
	JTabbedPane tab_panel;
	ImageIcon mainImage;
	public String name;
	public FoodResult4(String msg) {
		name=msg;
		setTitle(name+"을 위한 추천");
		tot_panel = new JPanel();
		tot_panel.setLayout(new BorderLayout(0,0));
		setContentPane(tot_panel);
		title_panel = new JPanel();
		title_panel.setLayout(new GridLayout(2,1, 30, 5));
		
		Font font_45 = new Font("a시네마L", Font.PLAIN, 45);
		Font font_25 = new Font("a시네마L", Font.PLAIN, 25);
		Font font_15 = new Font("a시네마L", Font.PLAIN, 15);
		
		title = new JLabel(name+"의 오늘 음식을 추천해드립니다.");
		title.setBorder(BorderFactory.createEmptyBorder(10 , 0 , 0 , 0));
		subtitle = new JLabel("당신을 위한, 오늘 최적의 추천 메뉴는 다음과 같습니다.");
		title.setHorizontalAlignment(JLabel.CENTER);
		subtitle.setHorizontalAlignment(JLabel.CENTER);
		title.setFont(font_45);
		subtitle.setFont(font_25);
		title_panel.add(title);
		title_panel.add(subtitle);
		
		tot_panel.add("North", title_panel);
		
		img_panel = new JPanel();
		img_panel.setLayout(new FlowLayout());
		img_panel.setLayout(null);
		
		mainImage = new ImageIcon("images/food_result4.jpg");
		mainImage = imageSize(mainImage, 250,130);
		result_img = new JLabel("돈까스", mainImage, JLabel.CENTER);
		result_img.setFont(font_15);
		result_img.setHorizontalTextPosition(SwingConstants.CENTER);
		result_img.setVerticalTextPosition(SwingConstants.BOTTOM);
		result_img.setBounds(440, 0, 300, 150);
		img_panel.add(result_img);
	
		FoodBrand4 R1brand = new FoodBrand4();
		FoodCombi4 R1combi = new FoodCombi4();
		FoodDessert4 R1dessert = new FoodDessert4();
		
		tab_panel = new JTabbedPane();
		tab_panel.addTab("판매 브랜드", R1brand);
		tab_panel.addTab("음식 궁합", R1combi);
		tab_panel.addTab("어울리는 디저트", R1dessert);
		tab_panel.setFont(font_15);
		img_panel.add(tab_panel);
		tab_panel.setBounds(300, 170, 600, 310);
		tot_panel.add("Center", img_panel);
		
		btn_panel = new JPanel();
		btn_panel.setLayout(new GridLayout(1,3,400,10));
		before = new RoundButton("이전으로");	before.setBackground(new Color(102, 102, 102));
		cal = new RoundButton("계산기"); cal.setBackground(new Color(102, 102, 102));
		main = new RoundButton("메인으로");	main.setBackground(new Color(102, 102, 102));
		
		before.addActionListener(new MyActionListener());
		main.addActionListener(new MyActionListener());
		cal.addActionListener(new MyActionListener());
		
		btn_panel.add(before);
		btn_panel.add(cal);
		btn_panel.add(main);
		btn_panel.setBorder(BorderFactory.createEmptyBorder(0 , 80 , 50 , 80));
		tot_panel.add("South", btn_panel);
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
        g.drawLine(100, 170, 1300, 170);
    }
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			if (b.getText().equals("이전으로")) {
				new FoodQuestion3_2(FoodResult4.this.name);
				FoodResult4.this.setVisible(false);
			} else if (b.getText().equals("메인으로")) {
				new survey();
				FoodResult4.this.setVisible(false);
			}
			else if (b.getText().equals("계산기")) {
				new Calculater("음식 계산기");
				//FoodResult1.this.setVisible(false);
			}
		}
	}
}