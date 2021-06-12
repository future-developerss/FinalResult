import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.awt.geom.*;
import java.awt.*;
public class culture_q2 extends JFrame {
	JPanel p1, p2, bt_p3, bottom, contentPane;
	JLabel title, subtitle, q1, q2;
	RoundButton before;
	static String[] text= {"영화", "음악", "책"};
	//static int[] choice_temp = new int[24];
	static RoundButton[] btn= new RoundButton[4]; 
	ArrayList<Integer> fifth1Arr = new ArrayList<>();
	ArrayList<Integer> fourth2Arr = new ArrayList<>();
	String username;
	//static int[] fintemp1 = culture_q.temp_pq1;
	//static int[] fintemp2 = culture_q.temp_pq2;
	//static int[] fintemp3 = culture_q.temp_pq3;
	
	public culture_q2(ArrayList<Integer> fifthArr, String name) {
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
		
		q2 = new JLabel("Q2 추천받고 싶은 문화생활을 골라주세요!");
		q2.setFont(font1);
		
		for (int i=0; i < 3; i++) {
			btn[i]=new RoundButton(text[i]);//버튼 초기화
			btn[i].setVisible(true);//보이게
			btn[i].setFont(font1);//폰트설정
			btn[i].addActionListener(new MyActionListener());
			bt_p3.add(btn[i]);
		}
		
		p2.add(q2);		p2.add(bt_p3);
		contentPane.add("Center", p2);
		
		bottom = new JPanel();
		bottom.setLayout(new BorderLayout());
		before = new RoundButton("이전으로");	before.setBackground(new Color(102, 102, 102));
		before.addActionListener(new MyActionListener());
		
		bottom.add("West",before); 	//bottom.add("West",main);
		bottom.setBorder(BorderFactory.createEmptyBorder(0 , 80 , 50 , 80));
		contentPane.add("South", bottom);
		
		fifth1Arr.addAll(fifthArr);
		fourth2Arr.addAll(fifthArr);
		
		setSize(1500,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	/*
	static int Max1() {
		int max = fintemp1[0];
		int maxIndex = 0;
		for (int i=0; i < fintemp1.length; i++) {
			if (fintemp1[i]>max) {
				max = fintemp1[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	static int Max2() {
		int max = fintemp2[0];
		int maxIndex = 0;
		for (int i=0; i < fintemp2.length; i++) {
			if (fintemp2[i]>max) {
				max = fintemp2[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	static int Max3() {
		int max = fintemp3[0];
		int maxIndex = 0;
		for (int i=0; i < fintemp3.length; i++) {
			if (fintemp3[i]>max) {
				max = fintemp3[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	*/
	private class MyActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			RoundButton b=(RoundButton)e.getSource();
			if (b.getText().equals("이전으로")){
				fourth2Arr.remove(fourth2Arr.size()-1);
				new culture_q(fourth2Arr, username);
				culture_q2.this.setVisible(false);
			}	
			else if (b.getText().equals("영화")){
				new resultPage(Max1());
			}
			else if (b.getText().equals("음악")){
				new resultPage_music(Max2());
			}
			else if (b.getText().equals("책")){
				new resultPage_Book(Max3());
			}
			culture_q2.this.setVisible(false);
		}
	}
}
