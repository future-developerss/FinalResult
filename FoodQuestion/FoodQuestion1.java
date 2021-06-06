import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.geom.*;
import java.awt.*;

public class FoodQuestion1 extends JFrame {
	JPanel p1, p2, bt_p3, bottom, contentPane;
	JLabel title, subtitle, q1;
	String username;
	RoundButton main;
	static String[] text = { "분위기 있는", "편안한" };
	static RoundButton[] btn = new RoundButton[2];
	public String name;
    public FoodQuestion1(String msg) {
		name=msg;
		setTitle(name+"의 오늘은?");
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		p1 = new JPanel();
		p1.setLayout(new GridLayout(2, 1, 30, 30));
		p2 = new JPanel();
		// p2.setBounds(150, 250, 500, 700);
		p2.setBorder(BorderFactory.createEmptyBorder(0, 200, 100, 200));
		MouseEv me = new MouseEv();

		p2.setLayout(new GridLayout(6, 1, 10, 10));
		bt_p3 = new JPanel();
		bt_p3.setLayout(new GridLayout(1, 4, 10, 40));

		Font font = new Font("a시네마L", Font.PLAIN, 50);
		Font font1 = new Font("a시네마L", Font.PLAIN, 30);

		title = new JLabel(name+"이의 오늘은?");
		title.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0));
		subtitle = new JLabel("당신을 위한 최고의 오늘 하루를 위해, 다음의 질문에 답해주세요!");
		title.setHorizontalAlignment(JLabel.CENTER);
		subtitle.setHorizontalAlignment(JLabel.CENTER);

		p1.add(title);
		p1.add(subtitle);
		title.setFont(font);
		subtitle.setFont(font1);
		contentPane.add("North", p1);

		q1 = new JLabel("Q1 어떤 식사를 원하시나요?");
		q1.setFont(font1);
		for (int i = 0; i < 2; i++) {
			btn[i] = new RoundButton(text[i]);// 버튼 초기화
			btn[i].setVisible(true);// 보이게
			btn[i].setFont(font1);// 폰트설정
			btn[i].addMouseListener(me);
			btn[i].addActionListener(new MyActionListener_R());
			bt_p3.add(btn[i]);
		}

		p2.add(q1);
		p2.add(bt_p3);
		contentPane.add("Center", p2);

		bottom = new JPanel();
		bottom.setLayout(new BorderLayout());

		main = new RoundButton("이전으로");
		main.setBackground(new Color(102, 102, 102));
		main.addActionListener(new MyActionListener());

		bottom.add("West", main);
		bottom.setBorder(BorderFactory.createEmptyBorder(0, 80, 50, 80));
		contentPane.add("South", bottom);

		setSize(1500, 800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			if (b.getText().equals("이전으로")) {
				// 이전페이지로 이동
				//new FoodQuestion2();
				FoodQuestion1.this.setVisible(false);
			}
		}
	}

	private class MyActionListener_R implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			if (b.getText().equals("분위기 있는")) {
				new FoodQuestion2(FoodQuestion1.this.name);
				FoodQuestion1.this.setVisible(false);
			} else if (b.getText().equals("편안한")) {
				new FoodQuestion2(FoodQuestion1.this.name);
				FoodQuestion1.this.setVisible(false);
			}
		}
	}
}