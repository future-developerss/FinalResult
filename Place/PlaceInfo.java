package Final;

import javax.swing.*;
import java.awt.*;

public class PlaceInfo extends JPanel {
    Font font = new Font("a시네마L", Font.PLAIN, 30);
    Font font1 = new Font("a시네마L", Font.PLAIN, 25);

    public PlaceInfo(String week, String weekEnd, String child, String adult) {
        //setLayout(new FlowLayout());
        setLayout(new GridLayout(2, 1, 0,30));

        JPanel p1=new JPanel();
        JLabel time=new JLabel(" 장소 이용 시간");
        time.setFont(font);
        JLabel weekT=new JLabel("    1) 평일: "+week);
        weekT.setFont(font1);
        JLabel weekEndT=new JLabel("    2) 주말: "+weekEnd);
        weekEndT.setFont(font1);
        p1.setLayout(new GridLayout(3, 1));
        p1.add(time);
        p1.add(weekT);
        p1.add(weekEndT);
        p1.setBorder(BorderFactory.createEmptyBorder(20 , 0 , 10 , 0));

        JPanel p2=new JPanel();
        JLabel price=new JLabel(" 장소 사용 요금");
        price.setFont(font);
        JLabel childP=new JLabel("    1) 어린이: "+child+" WON");
        childP.setFont(font1);
        JLabel adultP=new JLabel("    2) 성인: "+adult+" WON");
        adultP.setFont(font1);
        p2.setLayout(new GridLayout(3, 1));
        p2.add(price);
        p2.add(childP);
        p2.add(adultP);
        p2.setBorder(BorderFactory.createEmptyBorder(10 , 0 , 20 , 0));

        add(p1);
        add(p2);
    }
}
