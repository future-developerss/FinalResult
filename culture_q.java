import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.awt.geom.*;
import java.awt.*;
public class culture_q extends JFrame {
	JPanel p1, p2, bt_p3, bt_p4, bt_p5, bottom, contentPane;
	JLabel title, subtitle, q1;
	RoundButton before;
	ArrayList<Integer> fourth1Arr = new ArrayList<>();
	ArrayList<Integer> third2Arr = new ArrayList<>();
	static String[] text= {"누구나 좋아하는 유명한 것","남들이 잘 모를법한 새로운 것"};
	String button_name;
	static int[] temp_pq1 = fourthPageQ3.temp_cq3_1;
	static int[] temp_pq2 = fourthPageQ3.temp_cq3_2;
	static int[] temp_pq3 = fourthPageQ3.temp_cq3_3;
	static RoundButton[] btn= new RoundButton[4]; 
	String button_name;
	String username;
	
	public culture_q(String name) {
		super("Culture Quetion Page");
		username = name;
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		p1 = new JPanel();
		p1.setLayout(new GridLayout(2,1, 30, 30));
		p2 = new JPanel();
		//p2.setBounds(150, 250, 500, 700);
		p2.setBorder(BorderFactory.createEmptyBorder(0 , 200 , 100 , 200));
		
		p2.setLayout(new GridLayout(4, 1, 10, 10));
		bt_p3 = new JPanel();
		bt_p3.setLayout(new GridLayout(1, 2, 10, 40));
		bt_p4 = new JPanel();
		bt_p4.setLayout(new GridLayout(1, 3, 10, 40));
		
		Font font = new Font("a시네마L", Font.PLAIN, 50);
		Font font1 = new Font("a시네마L", Font.PLAIN, 30);
		
		title = new JLabel(username+"님의 오늘 문화생활을 추천해드립니다");
		title.setBorder(BorderFactory.createEmptyBorder(30 , 0 , 0 , 0));
		subtitle = new JLabel("당신만을 위한 최고의 문화생활 추천을 위해, 다음의 질문에 답해주세요!");
		title.setHorizontalAlignment(JLabel.CENTER);
		subtitle.setHorizontalAlignment(JLabel.CENTER);
		p1.add(title);
		p1.add(subtitle);
		title.setFont(font);
		subtitle.setFont(font1);
		contentPane.add("North", p1);
		
		q1 = new JLabel("Q1 당신이 선호하는 것은?");
		q1.setFont(font1);
		for (int i=0; i < 2; i++) {
			btn[i]=new RoundButton(text[i]);//버튼 초기화
			btn[i].setVisible(true);//보이게
			btn[i].setFont(font1);//폰트설정
			
			btn[i].addActionListener(new MyActionListener());
			bt_p3.add(btn[i]);
		}
		
		p2.add(q1);		p2.add(bt_p3);
		contentPane.add("Center", p2);
		
		bottom = new JPanel();
		bottom.setLayout(new BorderLayout());
		before = new RoundButton("이전으로");	before.setBackground(new Color(102, 102, 102));
		before.addActionListener(new MyActionListener());
		
		bottom.add("West",before); 
		bottom.setBorder(BorderFactory.createEmptyBorder(0 , 80 , 50 , 80));
		contentPane.add("South", bottom);
		
		//fourth1Arr.addAll(fourthArr);
		//third2Arr.addAll(fourthArr);
		setSize(1500,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			RoundButton b=(RoundButton)e.getSource();
			if (b.getText().equals("누구나 좋아하는 유명한 것")){
				//fourth1Arr.add(0);
				
				for (int i = 0; i <12; i++) {
					temp_pq1[i] += 5;
					temp_pq2[i] += 5;
					temp_pq3[i] += 5;
				} 
				new culture_q2(fourth1Arr, username);
				culture_q.this.setVisible(false);
			}	
			else if (b.getText().equals("남들이 잘 모를법한 새로운 것")){
				fourth1Arr.add(1);
				/*
				for (int i = 12; i < 24; i++) {
					temp_pq1[i] += 5;
					temp_pq2[i] += 5;
					temp_pq3[i] += 5;
				} */
				new culture_q2(fourth1Arr, username);
				culture_q.this.setVisible(false);
			}
			else if (b.getText().equals("이전으로")){ 
				
				//third2Arr.remove(third2Arr.size()-1);
				new fourthPageQ3(username);
				culture_q.this.setVisible(false);
			}
		}
	}
}
	


