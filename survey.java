import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class survey extends JDialog{
	JPanel p1, p2, contentpane, p3,p4, p5;
	JLabel main, l1,l2;
	JRadioButton bt1, bt2, bt3, bt4, bt5;
	RoundButton ok;
	public String name;
	public survey(String msg) {
		name=msg;
		setTitle(name+"에게 묻는 설문지");
		contentpane = new JPanel(new BorderLayout(0,0));
		setContentPane(contentpane);
		super.setLayout(new GridLayout(4, 1, 30, 30));
		
		Font font1 = new Font("a시네마L", Font.BOLD, 30);
		Font font2 = new Font("a시네마L", Font.PLAIN, 20);
		Font font3 = new Font("a시네마L", Font.PLAIN, 15);
		
		main = new JLabel(name+"님, 어떠셨나요?", JLabel.CENTER);
		l1 = new JLabel(name+"님에게 어울리는 결과가 나왔나요?",JLabel.CENTER);
		l2 = new JLabel("더 나은 서비스 제공을 위해 설문에 참여해주세요.",JLabel.CENTER);
		main.setFont(font1);	l1.setFont(font2); l2.setFont(font2);
		p3=new JPanel(); p3.add(l1);
		p4=new JPanel(); p4.add(l1);

		p1 = new JPanel(new GridLayout(1, 5, 20, 20));
		bt1 = new JRadioButton("매우 만족");
		bt2 = new JRadioButton("만족");
		bt3 = new JRadioButton("보통");
		bt4 = new JRadioButton("불만족");
		bt5 = new JRadioButton("매우 불만족");
		bt1.setFont(font3); 	bt2.setFont(font3);
		bt3.setFont(font3);		bt4.setFont(font3);
		bt5.setFont(font3);
		
		
		p1.add(bt1);	p1.add(bt2);
		p1.add(bt3);	p1.add(bt4);	p1.add(bt5);
		
		p2 = new JPanel(new FlowLayout());
		ok = new RoundButton("OK");

		
		ok.addActionListener(new MyActionListener());

		
		p2.add(ok); 
		p5=new JPanel(); 
		p5.add("North", main);
		p5.add("Center", p3);
		p5.add("South", p4);
		contentpane.add("North",p5);
		contentpane.add("Center",p1);
		contentpane.add("South", p2);
		setSize(600, 500);
		setVisible(true);
	}
	
	
	
	private class MyActionListener implements ActionListener{
			
			public void actionPerformed(ActionEvent e){
				RoundButton b=(RoundButton)e.getSource();
				if (b.getText().equals("OK")){
					new firstPage();
					setVisible(false);
				}
			}
	}
}
