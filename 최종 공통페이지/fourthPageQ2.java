import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.awt.geom.*;
import java.awt.*;

public class fourthPageQ2 extends JFrame {
	JPanel p1, p2, bt_p4, bottom, contentPane;
	JLabel title, subtitle, q2;
	String username;
	RoundButton before, main;
	static String[] text= {"기쁨/신남","우울/지침","심심", "화남"};
	//ArrayList<Integer> sec1Arr = new ArrayList<>();
	static RoundButton[] btn= new RoundButton[4]; 
	//static int [] temp_cq2_1 = fourthPageQ1.choice_temp1;
	//static int [] temp_cq2_2 = fourthPageQ1.choice_temp2;
	//static int [] temp_cq2_3 = fourthPageQ1.choice_temp3;
	int [] temp_1, temp_2, temp_3;
	static String bt_name1;
	
	public fourthPageQ2(String bt_name, String name, int[] temp1, int[] temp2, int[]temp3) {
		bt_name1 = bt_name; 
		setTitle("당신의 오늘은?");
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		
		temp_1 = temp1;
		temp_2 = temp2;
		temp_3 = temp3;
		p1 = new JPanel();
		p1.setLayout(new GridLayout(2,1, 30, 30));
		p2 = new JPanel();
		//p2.setBounds(150, 250, 500, 700);
		p2.setBorder(BorderFactory.createEmptyBorder(0 , 200 , 100 , 200));
		//MouseEv me = new MouseEv();

		p2.setLayout(new GridLayout(6, 1, 10, 10));
		bt_p4 = new JPanel();
		bt_p4.setLayout(new GridLayout(1, 4, 10, 40));


		Font font = new Font("a시네마L", Font.PLAIN, 50);
		Font font1 = new Font("a시네마L", Font.PLAIN, 30);

		title = new JLabel("이의 오늘은?");
		title.setBorder(BorderFactory.createEmptyBorder(30 , 0 , 0 , 0));
		subtitle = new JLabel("당신을 위한 최고의 오늘 하루를 위해, 다음의 질문에 답해주세요!");
		title.setHorizontalAlignment(JLabel.CENTER);
		subtitle.setHorizontalAlignment(JLabel.CENTER);

		p1.add(title);
		p1.add(subtitle);
		title.setFont(font);
		subtitle.setFont(font1);
		contentPane.add("North", p1);

		q2 = new JLabel("Q2 오늘의 기분은 어떤가요?");
		q2.setFont(font1);

		for (int i=0; i < 4; i++) {
			btn[i]=new RoundButton(text[i]);//버튼 초기화
			btn[i].setVisible(true);//보이게
			btn[i].setFont(font1);//폰트설정
			btn[i].addActionListener(new MyActionListener());
			bt_p4.add(btn[i]);
		}

		p2.add(q2);		p2.add(bt_p4);

		contentPane.add("Center", p2);
		//sec1Arr.addAll(secArr);
		bottom = new JPanel();
		bottom.setLayout(new BorderLayout());

		main = new RoundButton("이전으로");	main.setBackground(new Color(102, 102, 102));
		main.addActionListener(new MyActionListener());

		bottom.add("West",main);
		bottom.setBorder(BorderFactory.createEmptyBorder(0 , 80 , 50 , 80));
		contentPane.add("South", bottom);

		setSize(1500,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JButton b=(JButton)e.getSource();
			if (b.getText().equals("이전으로"))
			{
				
				if (bt_name1.equals("더움")){
					//firArr.add(0);
					
						temp_1[0] -= 1;		temp_1[1] -= 1;
						temp_1[10] -= 1;	temp_1[20] -= 1;	
				
						temp_2[0] -= 1;		temp_2[2] -= 1;
						temp_2[5] -= 1;		temp_2[6] -= 1;
						temp_2[9] -= 1;		temp_2[11] -= 1;
						
						temp_3[1] -= 1;		temp_3[5] -= 1;
						temp_3[6] -= 1;		temp_3[12] -= 1;
						temp_3[15] -= 1;	temp_3[22] -= 1; 
						
					}
				else if (bt_name1.equals("맑음/선선함")) {
					temp_1[2] -= 1;		temp_1[6] -= 1;
					temp_1[8] -= 1;		temp_1[12] -= 1;	
					temp_1[13] -= 1; 		temp_1[14] -= 1;
					temp_1[14] -= 1;		temp_1[18] -= 1;	
					temp_1[19] -= 1; 		temp_1[22] -= 1;
					
					temp_2[1] -= 1;		temp_2[3] -= 1;
					temp_2[7] -= 1;		temp_2[12] -= 1;
					temp_2[13] -= 1;		temp_2[21] -= 1;
					
					temp_3[2] -= 1;		temp_3[8] -= 1;
					temp_3[13] -= 1;	temp_3[16] -= 1;
					temp_3[17] -= 1;	temp_3[19] -= 1; 
					
				}
				else if (bt_name1.equals("비가 옴")) {
					temp_1[4] -= 1;		temp_1[5] -= 1;
					temp_1[11] -= 1;	temp_1[15] -= 1;	
					temp_1[16] -= 1; 		
					
					temp_2[4] -= 1;		temp_2[8] -= 1;
					temp_2[18] -= 1;		temp_2[19] -= 1;
					temp_2[20] -= 1;		temp_2[23] -= 1;	
					
					temp_3[0] -= 1;		temp_3[3] -= 1;
					temp_3[7] -= 1;		temp_3[10] -= 1;
					temp_3[18] -= 1;	temp_3[23] -= 1; 
					
				}
				else if (bt_name1.equals("쌀쌀함/추움")) {
					temp_1[3] -= 1;		temp_1[7] -= 1;
					temp_1[9] -= 1;		temp_1[17] -= 1;	
					temp_1[21] -= 1; 	temp_1[23] -= 1;	
					
					temp_2[10] -= 1;		temp_2[15] -= 1;
					temp_2[16] -= 1;		temp_2[17] -= 1;
					temp_2[20] -= 1;		temp_2[22] -= 1;
					
					temp_3[4] -= 1;		temp_3[9] -= 1;
					temp_3[11] -= 1;	temp_3[20] -= 1;
					temp_3[14] -= 1;	temp_3[21] -= 1; 
				}
				//System.out.print(temp_cq2_3[3]
				new fourthPageQ1(username);
				fourthPageQ2.this.setVisible(false);
			}
			else {
				System.out.println(bt_name1);
				if (b.getText().equals("기쁨/신남")){
					//sec1Arr.add(0);
					
						temp_1[0] += 1;		temp_1[2] += 1;
						temp_1[6] += 1;		temp_1[14] += 1;	
						temp_1[20] += 1; 	temp_1[23] += 1;
						
						
						temp_2[0] += 1;		temp_2[5] += 1;
						temp_2[7] += 1;		temp_2[11] += 1;
						temp_2[14] += 1;	temp_2[21] += 1;
						
						temp_3[5] += 1;		temp_3[6] += 1;
						temp_3[8] += 1;		temp_3[15] += 1;
						temp_3[17] += 1;	temp_3[19] += 1;
						bt_name1 = "기쁨/신남";
						
					}
						
				else if (b.getText().equals("우울/지침")){
					//sec1Arr.add(1);
					
						temp_1[1] += 1;		temp_1[3] += 1;
						temp_1[7] += 1;		temp_1[19] += 1;
						temp_1[21] += 1;	temp_1[22] += 1;
						
						temp_2[3] += 1;		temp_2[4] += 1;
						temp_2[8] += 1;		temp_2[10] += 1;
						temp_2[13] += 1;	temp_2[15] += 1;
						
						temp_3[0] += 1;		temp_3[2] += 1;
						temp_3[7] += 1;		temp_3[10] += 1;
						temp_3[13] += 1;	temp_3[22] += 1;
						bt_name1 = "우울/지침";

				}
				else if (b.getText().equals("심심")){
					//sec1Arr.add(2);
					
					temp_1[4] += 1;		temp_1[5] += 1;
					temp_1[9] += 1;		temp_1[11] += 1;
					temp_1[17] += 1;	temp_1[23] += 1;
					
					temp_2[1] += 1;		temp_2[6] += 1;
					temp_2[12] += 1;	temp_2[17] += 1;
					temp_2[22] += 1;	temp_2[23] += 1;	
					
					temp_3[1] += 1;		temp_3[4] += 1;
					temp_3[14] += 1;	temp_3[18] += 1;
					temp_3[20] += 1;	temp_3[23] += 1; 
					bt_name1 = "심심";
				}
				
				else if (b.getText().equals("화남")){
					//sec1Arr.add(3);
					
					temp_1[8] += 1;		temp_1[10] += 1;
					temp_1[12] += 1; 	temp_1[13] += 1;	
					temp_1[16] += 1;	temp_1[22] += 1;	
					
					temp_2[2] += 1;		temp_2[9] += 1;
					temp_2[16] += 1;	temp_2[19] += 1;
					temp_2[20] += 1;	temp_2[18] += 1;
					
					temp_3[3] += 1;		temp_3[9] += 1;
					temp_3[11] += 1;	temp_3[12] += 1;
					temp_3[16] += 1;	temp_3[21] += 1; 
					bt_name1 = "화남";
				}
				new fourthPageQ3(bt_name1,username, temp_1, temp_2, temp_3);
				fourthPageQ2.this.setVisible(false);
			}
			}
		}
	}
	
