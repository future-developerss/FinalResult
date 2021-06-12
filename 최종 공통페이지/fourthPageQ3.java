import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.awt.geom.*;
import java.awt.*;

public class fourthPageQ3 extends JFrame {
	JPanel p1, p2,  bt_p5, bottom, contentPane;
	JLabel title, subtitle,q3;
	String username;
	static String bt_name2;
	static String bt_back1 = fourthPageQ1.button_name;
	RoundButton before, main;
	static String[] text= {"혼자서","가족과","연인과", "친구와"};
	//ArrayList<Integer> third1Arr = new ArrayList<>();
	//ArrayList<Integer> sec1Arr = new ArrayList<>();
	static RoundButton[] btn= new RoundButton[4]; 

	//static int [] temp_cq3_1 = fourthPageQ2.temp_cq2_1;
	//static int [] temp_cq3_2 = fourthPageQ2.temp_cq2_2;
	//static int [] temp_cq3_3 = fourthPageQ2.temp_cq2_3;
	int[] temp1_1, temp1_2, temp1_3;

	public fourthPageQ3(String bt_name, String name, int[] temp1, int[] temp2, int[]temp3) {
		bt_name2 = bt_name;
		setTitle("당신의 오늘은?");
		username = name;
		temp1_1 = temp1;
		temp1_2 = temp2;
		temp1_3 = temp3;
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		p1 = new JPanel();
		p1.setLayout(new GridLayout(2,1, 30, 30));
		p2 = new JPanel();
		//p2.setBounds(150, 250, 500, 700);
		p2.setBorder(BorderFactory.createEmptyBorder(0 , 200 , 100 , 200));
		//MouseEv me = new MouseEv();

		p2.setLayout(new GridLayout(6, 1, 10, 10));
		bt_p5 = new JPanel();
		bt_p5.setLayout(new GridLayout(1, 4, 10, 40));

		Font font = new Font("a시네마L", Font.PLAIN, 50);
		Font font1 = new Font("a시네마L", Font.PLAIN, 30);

		title = new JLabel(username+"님의 오늘은?");
		title.setBorder(BorderFactory.createEmptyBorder(30 , 0 , 0 , 0));
		subtitle = new JLabel("당신을 위한 최고의 오늘 하루를 위해, 다음의 질문에 답해주세요!");
		title.setHorizontalAlignment(JLabel.CENTER);
		subtitle.setHorizontalAlignment(JLabel.CENTER);

		p1.add(title);
		p1.add(subtitle);
		title.setFont(font);
		subtitle.setFont(font1);
		contentPane.add("North", p1);

		q3 = new JLabel("Q3 오늘 당신은?");
		q3.setFont(font1);
		for (int i=0; i < 4; i++) {
			btn[i]=new RoundButton(text[i]);//버튼 초기화
			btn[i].setVisible(true);//보이게
			btn[i].setFont(font1);//폰트설정
			btn[i].addActionListener(new MyActionListener());
			bt_p5.add(btn[i]);
		}

		p2.add(q3);		p2.add(bt_p5);
		contentPane.add("Center", p2);

		bottom = new JPanel();
		bottom.setLayout(new BorderLayout());
		before = new RoundButton("다음으로");	before.setBackground(new Color(102, 102, 102));
		main = new RoundButton("이전으로");	main.setBackground(new Color(102, 102, 102));

		before.addActionListener(new MyActionListener());
		main.addActionListener(new MyActionListener());

		bottom.add("West",main);
		bottom.setBorder(BorderFactory.createEmptyBorder(0 , 80 , 50 , 80));
		contentPane.add("South", bottom);
		
		//third1Arr.addAll(thirdArr);
		//sec1Arr.addAll(thirdArr);
		bt_name2 = bt_name;
		setSize(1500,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			RoundButton b=(RoundButton)e.getSource();
			if (b.getText().equals("이전으로"))
			{
				if (bt_name2.equals("기쁨/신남")) {
					temp1_1[0] -= 1;		temp1_1[2] -= 1;
					temp1_1[6] -= 1;		temp1_1[14] -= 1;	
					temp1_1[20] -= 1; 		temp1_1[23] -= 1;
					
					
					temp1_2[0] -= 1;		temp1_2[5] -= 1;
					temp1_2[7] -= 1;		temp1_2[11] -= 1;
					temp1_2[14] -= 1;	temp1_2[21] += 1;
					
					temp1_3[5] -= 1;		temp1_3[6] -= 1;
					temp1_3[8] -= 1;		temp1_3[15] -= 1;
					temp1_3[17] -= 1;	temp1_3[19] -= 1;
				}
				else if (bt_name2.equals("우울/지침")) {
					temp1_1[1] -= 1;		temp1_1[3] -= 1;
					temp1_1[7] -= 1;		temp1_1[19] -= 1;
					temp1_1[21]-= 1;		temp1_1[22] -= 1;
					
					temp1_2[3] -= 1;		temp1_2[4] -= 1;
					temp1_2[8] -= 1;		temp1_2[10]-= 1;
					temp1_2[13] -= 1;	temp1_2[15]-= 1;
					
					temp1_3[0] -= 1;		temp1_3[2] -= 1;
					temp1_3[7] -= 1;		temp1_3[10] -= 1;
					temp1_3[13] -= 1;	temp1_3[22] -= 1;
				}
				else if (bt_name2.equals("심심")) {
					temp1_1[4] -= 1;		temp1_1[5] -= 1;
					temp1_1[9] -= 1;		temp1_1[11] -= 1;
					temp1_1[17] -= 1;	temp1_1[23] -= 1;
					
					temp1_2[1] -= 1;		temp1_2[6] -= 1;
					temp1_2[12] -= 1;	temp1_2[17] -= 1;
					temp1_2[22] -= 1;	temp1_2[23] -= 1;	
					
					temp1_3[1] -= 1;		temp1_3[4] -= 1;
					temp1_3[14] -= 1;	temp1_3[18] -= 1;
					temp1_3[20] -= 1;	temp1_3[23] -= 1; 
				}
				else if (bt_name2.equals("화남")) {
					temp1_1[8] -= 1;		temp1_1[10] -= 1;
					temp1_1[12] -= 1; 		temp1_1[13] -= 1;	
					temp1_1[16] -= 1;		temp1_1[22] -= 1;	
					
					temp1_2[2] -= 1;		temp1_2[9] -= 1;
					temp1_2[16] -= 1;	temp1_2[19] -= 1;
					temp1_2[20] -= 1;	temp1_2[18] -= 1;
					
					temp1_3[3] -= 1;		temp1_3[9] -= 1;
					temp1_3[11] -= 1;	temp1_3[12] -= 1;
					temp1_3[16] -= 1;	temp1_3[21] -= 1; 
				}
				//sec1Arr.remove(sec1Arr.size()-1);
				new fourthPageQ2(bt_back1, username, temp1_1, temp1_2, temp1_3);
				fourthPageQ3.this.setVisible(false);

			}else {
				if (b.getText().equals("혼자서")){
					//third1Arr.add(0);
					
					temp1_1[1] += 1;	temp1_1[7] += 1;
					temp1_1[10] += 1;	temp1_1[12] += 1;	
					temp1_1[14] += 1; 	temp1_1[16] += 1;
					temp1_1[17] += 1; 	temp1_1[21] += 1;
					temp1_1[18] += 1; 	
						
						temp1_2[0] += 1;		temp1_2[1] += 1;
						temp1_2[3] += 1;		temp1_2[6] += 1;	
						temp1_2[8] += 1; 	temp1_2[9] += 1;
						temp1_2[13] += 1; 	temp1_2[15] += 1;
						temp1_2[16] += 1; 	temp1_2[19] += 1;
						temp1_2[12] += 1;	temp1_2[21] += 1;
						
						temp1_3[1] += 1;		temp1_3[4] += 1;
						temp1_3[7] += 1;		temp1_3[9] += 1;
						temp1_3[11] += 1;	temp1_3[16] += 1; 
						
						bt_name2 = "혼자서";
					}
						
				else if (b.getText().equals("가족과")){
					//third1Arr.add(1);
					
					temp1_1[3] += 1;		temp1_1[5] += 1;
					temp1_1[13] += 1;	temp1_1[14] += 1;
					temp1_1[15] += 1;	
					temp1_1[18] += 1;	temp1_1[19] += 1;
						temp1_1[22] += 1;	temp1_1[23] += 1;
						
						temp1_2[3] += 1;		temp1_2[5] += 1;
						temp1_2[14] += 1;	temp1_2[22] += 1;
						temp1_2[23] += 1; 
					
						
						temp1_3[8] += 1;		temp1_3[10] += 1;
						temp1_3[13] += 1;	temp1_3[17] += 1;
						temp1_3[18] += 1;	temp1_3[23] += 1; 
						bt_name2 = "가족과";

				}
				else if (b.getText().equals("연인과")){
					//third1Arr.add(2);
					
					temp1_1[0] += 1;		temp1_1[3] += 1;
					temp1_1[6] += 1;		temp1_1[9] += 1;
					temp1_1[16] += 1;	
					
					temp1_2[1] += 1;		temp1_2[4] += 1;
					temp1_2[5] += 1;		temp1_2[7] += 1;
					temp1_2[17] += 1;	temp1_2[23] += 1;
					
					temp1_3[2] += 1;		temp1_3[6] += 1;
					temp1_3[14] += 1;	temp1_3[19] += 1;
					temp1_3[22] += 1;	temp1_3[0] += 1; 
					bt_name2 = "연인과";

				}
				
				else if (b.getText().equals("친구와")){
					//third1Arr.add(3);
					
					temp1_1[2] += 1;		temp1_1[4] += 1;
					temp1_1[5] += 1;		temp1_1[8] += 1;
					temp1_1[10] += 1;	temp1_1[11] += 1;
					temp1_1[14] += 1;	temp1_1[17] += 1;
					temp1_1[18] += 1;	temp1_1[20] += 1;
					temp1_1[23] += 1;
					
					
					temp1_2[2] += 1;		temp1_2[6] += 1;
					temp1_2[7] += 1;		temp1_2[10] += 1;
					temp1_2[11] += 1;	temp1_2[12] += 1;
					temp1_2[18] += 1;	temp1_2[21] += 1;
					temp1_2[20] += 1;	
					temp1_2[22] += 1;	temp1_2[23] += 1;
					
					temp1_3[3] += 1;		temp1_3[5] += 1;
					temp1_3[12] += 1;	temp1_3[11] += 1;
					temp1_3[15] += 1;	temp1_3[21] += 1;
					temp1_3[21] += 1; 
					bt_name2 = "친구와";
				}
				new culture_q(bt_name2, username, temp1_1, temp1_2, temp1_3 );
				fourthPageQ3.this.setVisible(false);
			}
				
			}
		}
}