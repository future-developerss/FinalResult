package Final;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class RecommendPoint extends JPanel{
    Font font = new Font("a시네마L", Font.PLAIN, 30);
    Font font1 = new Font("a시네마L", Font.PLAIN, 20);

    public RecommendPoint(String Point, String Activity, String Activity2){
        setLayout(new GridLayout(2, 1, 20,30));

        JPanel p1=new JPanel();
        JLabel recommend=new JLabel(" 장소 추천 Point");
        recommend.setFont(font);
        recommend.setBorder(BorderFactory.createEmptyBorder(2, 0, 5, 0));
        JLabel recommendTxT=new JLabel();
        recommendTxT.setText("<html> "+Point+"</html>");
        recommendTxT.setBorder(BorderFactory.createEmptyBorder(0 , 10 , 0 , 10));
        recommendTxT.setSize(200, 100);
        recommendTxT.setFont(font1);

        //p1.setLayout(new GridLayout(2, 1));
        p1.setLayout(new BorderLayout());
        p1.add(recommend, BorderLayout.NORTH);
        p1.add(recommendTxT, BorderLayout.CENTER);
        p1.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JPanel p2=new JPanel();
        JLabel price=new JLabel(" 추천 활동");
        price.setFont(font);
        JLabel childP=new JLabel("    1) "+Activity);
        childP.setFont(font1);
        JLabel adultP=new JLabel("    2) "+Activity2);
        adultP.setFont(font1);
        p2.setLayout(new GridLayout(3, 1));
        p2.add(price);
        p2.add(childP);
        p2.add(adultP);
        p2.setBorder(BorderFactory.createEmptyBorder(10, 0, 20, 0));

        add(p1);
        add(p2);

    }
}
