package Final;

import javax.swing.*;
import java.awt.*;

public class OtherRecommend extends JPanel {
    Font font = new Font("a시네마L", Font.PLAIN, 30);
    Font font1 = new Font("a시네마L", Font.PLAIN, 25);

    public OtherRecommend(String Other1, String Other2, String Other3) {
        setLayout(new GridLayout(3, 1, 0,30));

        JPanel p1=new JPanel();
        JLabel one=new JLabel(" 추천 1: 동일 지역 장소");
        one.setFont(font);
        JLabel one_reco=new JLabel("    "+Other1);
        one_reco.setFont(font1);
        p1.setLayout(new GridLayout(2, 1));
        p1.add(one);
        p1.add(one_reco);

        JPanel p2=new JPanel();
        JLabel two=new JLabel(" 추천 2: 다른 지역 장소");
        two.setFont(font);
        JLabel two_reco=new JLabel("    "+Other2);
        two_reco.setFont(font1);
        p2.setLayout(new GridLayout(2, 1));
        p2.add(two);
        p2.add(two_reco);

        JPanel p3=new JPanel();
        JLabel three=new JLabel(" 추천 3: 다른 지역 장소");
        three.setFont(font);
        JLabel three_reco=new JLabel("    "+Other3);
        three_reco.setFont(font1);
        p3.setLayout(new GridLayout(2, 1));
        p3.add(three);
        p3.add(three_reco);


        add(p1);
        add(p2);
        add(p3);

    }
}
