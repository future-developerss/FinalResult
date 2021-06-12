import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.awt.geom.*;
import java.awt.*;

public class fourthPageQ1 extends JFrame {
	JPanel p1, p2, bt_p3, bottom, contentPane;
	JLabel title, subtitle, q1;
	String username;
	RoundButton main;
	static String[] text= {"더움","맑음/선선함","비가 옴", "쌀쌀함/추움"};
	//ArrayList <Integer> firArr = new ArrayList<>();
	static int[] choice_temp1 = new int[24];
	static int[] choice_temp2 = new int[24];
	static int[] choice_temp3 = new int[24];
	static RoundButton[] btn= new RoundButton[4]; 
	String button_name;

	public fourthPageQ1(String name) {
		super("당신의 오늘은?");
		username = name;
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
		bt_p3 = new JPanel();
		bt_p3.setLayout(new GridLayout(1, 4, 10, 40));

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

		q1 = new JLabel("Q1 오늘의 날씨는 어떤가요?");
		q1.setFont(font1);
		for (int i=0; i < 4; i++) {
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
			if (b.getText().equals("이전으로")){
				new thirdPage();
				fourthPageQ1.this.setVisible(false);
			}
			else {
				if (b.getText().equals("더움")){
					//firArr.add(0);
					
						choice_temp1[0] += 1;		choice_temp1[1] += 1;
						choice_temp1[10] += 1;		choice_temp1[20] += 1;	
				
						choice_temp2[0] += 1;		choice_temp2[2] += 1;
						choice_temp2[5] += 1;		choice_temp2[6] += 1;
						choice_temp2[9] += 1;		choice_temp2[11] += 1;
						
						choice_temp3[1] += 1;		choice_temp3[5] += 1;
						choice_temp3[6] += 1;		choice_temp3[12] += 1;
						choice_temp3[15] += 1;		choice_temp3[22] += 1; 
						
						button_name = "더움";
					}
						
				else if (b.getText().equals("맑음/선선함")){
					//firArr.add(1);
					
						choice_temp1[2] += 1;		choice_temp1[6] += 1;
						choice_temp1[8] += 1;		choice_temp1[12] += 1;	
						choice_temp1[13] += 1; 		choice_temp1[14] += 1;
						choice_temp1[14] += 1;		choice_temp1[18] += 1;	
						choice_temp1[19] += 1; 		choice_temp1[22] += 1;
						
						choice_temp2[1] += 1;		choice_temp2[3] += 1;
						choice_temp2[7] += 1;		choice_temp2[12] += 1;
						choice_temp2[13] += 1;		choice_temp2[21] += 1;
						
						choice_temp3[2] += 1;		choice_temp3[8] += 1;
						choice_temp3[13] += 1;		choice_temp3[16] += 1;
						choice_temp3[17] += 1;		choice_temp3[19] += 1; 
						
						button_name = "맑음/선선함";

				}
				else if (b.getText().equals("비가 옴")){
					//firArr.add(2);
					
					choice_temp1[4] += 1;		choice_temp1[5] += 1;
					choice_temp1[11] += 1;		choice_temp1[15] += 1;	
					choice_temp1[16] += 1; 		
					
					choice_temp2[4] += 1;		choice_temp2[8] += 1;
					choice_temp2[18] += 1;		choice_temp2[19] += 1;
					choice_temp2[20] += 1;		choice_temp2[23] += 1;	
					
					choice_temp3[0] += 1;		choice_temp3[3] += 1;
					choice_temp3[7] += 1;		choice_temp3[10] += 1;
					choice_temp3[18] += 1;		choice_temp3[23] += 1; 
					
					button_name = "비가 옴";
					
				}
				
				else if (b.getText().equals("쌀쌀함/추움")){
					//firArr.add(3);
					
					choice_temp1[3] += 1;		choice_temp1[7] += 1;
					choice_temp1[9] += 1;		choice_temp1[17] += 1;	
					choice_temp1[21] += 1; 		choice_temp1[23] += 1;	
					
					choice_temp2[10] += 1;		choice_temp2[15] += 1;
					choice_temp2[16] += 1;		choice_temp2[17] += 1;
					choice_temp2[20] += 1;		choice_temp2[22] += 1;
					
					choice_temp3[4] += 1;		choice_temp3[9] += 1;
					choice_temp3[11] += 1;		choice_temp3[20] += 1;
					choice_temp3[14] += 1;		choice_temp3[21] += 1; 
					
					button_name = "쌀쌀함/추움";

				}
				new fourthPageQ2(button_name, username);
				fourthPageQ1.this.setVisible(false);
			}
			}
		}
	}
	
		
			
		
