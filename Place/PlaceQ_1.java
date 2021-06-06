package Final;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

public class PlaceQ_1 extends JFrame{
    JPanel p1, p2, bt_p3, bottom, contentPane;
    JLabel title, subtitle, q1;
    String username;
    RoundButton main;
    static String[] text= {"실내","실외"};
    static RoundButton[] btn= new RoundButton[2];
    ArrayList<Integer> oneLi=new ArrayList<>();

    public PlaceQ_1(String InputName){
        username=InputName;
        setTitle(username+"의 선택은?");
        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout(0,0));
        setContentPane(contentPane);
        p1 = new JPanel();
        p1.setLayout(new GridLayout(2,1, 30, 30));
        p2 = new JPanel();
        p2.setBorder(BorderFactory.createEmptyBorder(0 , 200 , 100 , 200));
        MouseEv me = new MouseEv();

        p2.setLayout(new GridLayout(6, 1, 10, 10));
        bt_p3 = new JPanel();
        bt_p3.setLayout(new GridLayout(1, 2, 10, 40));

        Font font = new Font("a시네마L", Font.PLAIN, 50);
        Font font1 = new Font("a시네마L", Font.PLAIN, 30);

        title = new JLabel(username+"의 오늘의 장소를 추천해드립니다");
        title.setBorder(BorderFactory.createEmptyBorder(30 , 0 , 0 , 0));
        subtitle = new JLabel("당신을 위한 최고의 장소 추천을 위해, 다음의 질문에 답해주세요!");
        title.setHorizontalAlignment(JLabel.CENTER);
        subtitle.setHorizontalAlignment(JLabel.CENTER);

        p1.add(title);
        p1.add(subtitle);
        title.setFont(font);
        subtitle.setFont(font1);
        contentPane.add("North", p1);

        q1 = new JLabel("Q1 당신이 선호하는 활동 장소는 어디인가요?");
        q1.setFont(font1);
        for (int i=0; i < 2; i++) {
            btn[i]=new RoundButton(text[i]);//버튼 초기화
            btn[i].setVisible(true);//보이게
            btn[i].setFont(font1);//폰트설정
            btn[i].addMouseListener(me);
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
                //이전페이지로 이동
                new thirdPage(username);
                PlaceQ_1.this.setVisible(false);
            }
            else {
                if (b.getText().equals("실내")){
                    oneLi.add(0);
                }
                else if (b.getText().equals("실외")){
                    oneLi.add(2);
                }
                PlaceQ_1.this.setVisible(false);
                new PlaceQ_2(oneLi, username);
            }
        }
    }

}
