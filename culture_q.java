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
	static String bt_name3 = fourthPageQ2.bt_name1;
	//static int[] temp2_1 = fourthPageQ3.temp_cq3_1;
	//static int[] temp2_2 = fourthPageQ3.temp_cq3_2;
	//static int[] temp2_3 = fourthPageQ3.temp_cq3_3;
	static RoundButton[] btn= new RoundButton[4]; 
	int[] temp2_1, temp2_2, temp2_3;
	String username;
	
	public culture_q(String bt_name, String name, int [] temp1, int[]temp2, int[] temp3) {
		super("Culture Quetion Page");
		username = name;
		bt_name3 = bt_name;
		temp2_1 = temp1;
		temp2_2 = temp2;
		temp2_3 = temp3;
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
					temp2_1[i] += 5;
					temp2_2[i] += 5;
					temp2_3[i] += 5;
				} 
				bt_name3 = "누구나 좋아하는 유명한 것";
				new culture_q2(bt_name3, username, temp2_1, temp2_2, temp2_3);
				culture_q.this.setVisible(false);
			}	
			else if (b.getText().equals("남들이 잘 모를법한 새로운 것")){
				//fourth1Arr.add(1);
				
				for (int i = 12; i < 24; i++) {
					temp2_1[i] += 5;
					temp2_2[i] += 5;
					temp2_3[i] += 5;
				} 
				bt_name3 = "남들이 잘 모를법한 새로운 것";
				new culture_q2(bt_name3,username,temp2_1, temp2_2, temp2_3);
			
				culture_q.this.setVisible(false);
			}
			else if (b.getText().equals("이전으로")){ 
				if (bt_name3 == "혼자서"){
					//third1Arr.add(0);
					
						temp2_1[1] -= 1;	temp2_1[7] -= 1;
						temp2_1[10] -= 1;	temp2_1[12] -= 1;	
						temp2_1[14] -= 1; 	temp2_1[16] -= 1;
						temp2_1[17] -= 1; 	temp2_1[21] -= 1;
						temp2_1[18] -= 1; 	
						
						temp2_2[0] -= 1;		temp2_2[1] -= 1;
						temp2_2[3] -= 1;		temp2_2[6] -= 1;	
						temp2_2[8] -= 1; 		temp2_2[9] -= 1;
						temp2_2[13]-= 1; 		temp2_2[15] -= 1;
						temp2_2[16] -= 1; 		temp2_2[19] -= 1;
						temp2_2[12] -= 1;		temp2_2[21] -= 1;
						
						temp2_3[1] -= 1;		temp2_3[4] -= 1;
						temp2_3[7] -= 1;		temp2_3[9] -= 1;
						temp2_3[11] -= 1;		temp2_3[16] -= 1; 
							
						//bt_name3 = "혼자서";
					}
						
				else if (bt_name3 == "가족과"){
					//third1Arr.add(1);
					
					temp2_1[3] -= 1;		temp2_1[5] -= 1;
					temp2_1[13] -= 1;		temp2_1[14] -= 1;
					temp2_1[15] -= 1;	
					temp2_1[18] -= 1;		temp2_1[19] -= 1;
					temp2_1[22] -= 1;		temp2_1[23] -= 1;
						
					temp2_2[3] -= 1;		temp2_2[5] -= 1;
					temp2_2[14] -= 1;	temp2_2[22] -= 1;
					temp2_2[23] -= 1; 
					
						
					temp2_3[8] -= 1;		temp2_3[10] -= 1;
					temp2_3[13] -= 1;	temp2_3[17] -= 1;
					temp2_3[18] -= 1;	temp2_3[23] -= 1; 
						//bt_name3 = "가족과";

				}
				else if (bt_name3 == "연인과"){
					//third1Arr.add(2);
					
					temp2_1[0] -= 1;		temp2_1[3] -= 1;
					temp2_1[6] -= 1;		temp2_1[9] -= 1;
					temp2_1[16]-= 1;	
					
					temp2_2[1] -= 1;		temp2_2[4] -= 1;
					temp2_2[5] -= 1;		temp2_2[7] -= 1;
					temp2_2[17] -= 1;		temp2_2[23] -= 1;
					
					temp2_3[2] -= 1;		temp2_3[6] -= 1;
					temp2_3[14] -= 1;		temp2_3[19] -= 1;
					temp2_3[22] -= 1;		temp2_3[0] -= 1; 
					//bt_name3 = "연인과";

				}
				
				else if (bt_name3 == "친구와"){
					//third1Arr.add(3);
					
					temp2_1[2] -= 1;		temp2_1[4] -= 1;
					temp2_1[5] -= 1;		temp2_1[8] -= 1;
					temp2_1[10]-= 1;		temp2_1[11] -= 1;
					temp2_1[14] -= 1;		temp2_1[17]-= 1;
					temp2_1[18] -= 1;		temp2_1[20] -= 1;
					temp2_1[23] -= 1;
					
					
					temp2_2[2] -= 1;	temp2_2[6] -= 1;
					temp2_2[7] -= 1;	temp2_2[10] -= 1;
					temp2_2[11]-= 1;	temp2_2[12] -= 1;
					temp2_2[18] -= 1;	temp2_2[21] -= 1;
					temp2_2[20] -= 1;	
					temp2_2[22] -= 1;	temp2_2[23] -= 1;
					
					temp2_3[3] -= 1;	temp2_3[5] -= 1;
					temp2_3[12] -= 1;	temp2_3[11] -= 1;
					temp2_3[15] -= 1;	temp2_3[21] -= 1;
					temp2_3[21] -= 1; 
					//bt_name3 = "친구와";
				}
				new fourthPageQ3(bt_name3,username, temp2_1, temp2_2, temp2_3);
				culture_q.this.setVisible(false);
			}
		}
	}
}
	


