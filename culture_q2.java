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
	static String[] text= {"��ȭ", "����", "å"};
	//static int[] choice_temp = new int[24];
	static RoundButton[] btn= new RoundButton[4]; 
	//ArrayList<Integer> fifth1Arr = new ArrayList<>();
	//ArrayList<Integer> fourth2Arr = new ArrayList<>();
	String username;
	static String bt_name4 = fourthPageQ3.bt_name2;
	//static int[] temp3_1 = culture_q.temp2_1;
	//static int[] temp3_2 = culture_q.temp2_2;
	//static int[] temp3_3 = culture_q.temp2_3;
	static int[] temp3_1, temp3_2, temp3_3;
	
	public culture_q2(String bt_name, String name, int[] temp1, int[] temp2, int[] temp3) {
		super("Culture Quetion Page");
		username = name;
		bt_name4 = bt_name;
		temp3_1 = temp1;
		temp3_2 = temp2;
		temp3_3 = temp3;
		
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
		
		Font font = new Font("a�ó׸�L", Font.PLAIN, 50);
		Font font1 = new Font("a�ó׸�L", Font.PLAIN, 30);
		
		title = new JLabel(username+"���� ���� ��ȭ��Ȱ�� ��õ�ص帳�ϴ�");
		title.setBorder(BorderFactory.createEmptyBorder(30 , 0 , 0 , 0));
		subtitle = new JLabel("��Ÿ��� ���� �ְ��� ��ȭ��Ȱ ��õ�� ����, ������ ������ �����ּ���!");
		title.setHorizontalAlignment(JLabel.CENTER);
		subtitle.setHorizontalAlignment(JLabel.CENTER);
		p1.add(title);
		p1.add(subtitle);
		title.setFont(font);
		subtitle.setFont(font1);
		contentPane.add("North", p1);
		
		q2 = new JLabel("Q2 ��õ�ް� ���� ��ȭ��Ȱ�� ����ּ���!");
		q2.setFont(font1);
		
		for (int i=0; i < 3; i++) {
			btn[i]=new RoundButton(text[i]);//��ư �ʱ�ȭ
			btn[i].setVisible(true);//���̰�
			btn[i].setFont(font1);//��Ʈ����
			btn[i].addActionListener(new MyActionListener());
			bt_p3.add(btn[i]);
		}
		
		p2.add(q2);		p2.add(bt_p3);
		contentPane.add("Center", p2);
		
		bottom = new JPanel();
		bottom.setLayout(new BorderLayout());
		before = new RoundButton("��������");	before.setBackground(new Color(102, 102, 102));
		before.addActionListener(new MyActionListener());
		
		bottom.add("West",before); 	//bottom.add("West",main);
		bottom.setBorder(BorderFactory.createEmptyBorder(0 , 80 , 50 , 80));
		contentPane.add("South", bottom);
		
		//fifth1Arr.addAll(fifthArr);
		//fourth2Arr.addAll(fifthArr);
		
		setSize(1500,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	 static int Max1() {
		int max = temp3_1[0];
		int maxIndex = 0;
		for (int i=0; i < temp3_1.length; i++) {
			if (temp3_1[i]>max) {
				max = temp3_1[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	static int Max2() {
		int max = temp3_2[0];
		int maxIndex = 0;
		for (int i=0; i < temp3_2.length; i++) {
			if (temp3_2[i]>max) {
				max = temp3_2[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	static int Max3() {
		int max = temp3_3[0];
		int maxIndex = 0;
		for (int i=0; i < temp3_3.length; i++) {
			if (temp3_3[i]>max) {
				max = temp3_3[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	
	private class MyActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			RoundButton b=(RoundButton)e.getSource();
			if (b.getText().equals("��������")){
				//fourth2Arr.remove(fourth2Arr.size()-1);
				if (bt_name4.equals("������ �����ϴ� ������ ��")) {
					for (int i = 0; i <12; i++) {
						temp3_1[i] -= 1;
						temp3_2[i] -= 1;
						temp3_3[i] -= 1;
					} 
				}
				else if (bt_name4.equals("������ �� �𸦹��� ���ο� ��")) {
					for (int i = 12; i < 24; i++) {
						temp3_1[i] += 5;
						temp3_2[i] += 5;
						temp3_3[i] += 5;
					} 
				}
				new culture_q(bt_name4, username, temp3_1, temp3_2, temp3_3);
				culture_q2.this.setVisible(false);
			}	
			else if (b.getText().equals("��ȭ")){
				new resultPage(Max1(), username);
			}
			else if (b.getText().equals("����")){
				new resultPage_music(Max2(), username);
			}
			else if (b.getText().equals("å")){
				new resultPage_Book(Max3(), username);
			}
			culture_q2.this.setVisible(false);
		}
	}
}
