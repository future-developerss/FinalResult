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
	static String[] text= {"������ �����ϴ� ������ ��","������ �� �𸦹��� ���ο� ��"};
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
		
		q1 = new JLabel("Q1 ����� ��ȣ�ϴ� ����?");
		q1.setFont(font1);
		for (int i=0; i < 2; i++) {
			btn[i]=new RoundButton(text[i]);//��ư �ʱ�ȭ
			btn[i].setVisible(true);//���̰�
			btn[i].setFont(font1);//��Ʈ����
			
			btn[i].addActionListener(new MyActionListener());
			bt_p3.add(btn[i]);
		}
		
		p2.add(q1);		p2.add(bt_p3);
		contentPane.add("Center", p2);
		
		bottom = new JPanel();
		bottom.setLayout(new BorderLayout());
		before = new RoundButton("��������");	before.setBackground(new Color(102, 102, 102));
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
			if (b.getText().equals("������ �����ϴ� ������ ��")){
				//fourth1Arr.add(0);
				
				for (int i = 0; i <12; i++) {
					temp_pq1[i] += 5;
					temp_pq2[i] += 5;
					temp_pq3[i] += 5;
				} 
				new culture_q2(fourth1Arr, username);
				culture_q.this.setVisible(false);
			}	
			else if (b.getText().equals("������ �� �𸦹��� ���ο� ��")){
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
			else if (b.getText().equals("��������")){ 
				
				//third2Arr.remove(third2Arr.size()-1);
				new fourthPageQ3(username);
				culture_q.this.setVisible(false);
			}
		}
	}
}
	


