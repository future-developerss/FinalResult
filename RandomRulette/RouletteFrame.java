import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class RouletteFrame extends JFrame {
    JPanel p1, p2, p3;
    Font fontTitle = new Font("SansSerif", Font.BOLD, 30);
    JLabel imageLabel1=new JLabel();
    JLabel imageLabel2=new JLabel();
    JLabel imageLabel3=new JLabel();
    JLabel imageLabel4=new JLabel();
    JLabel imageLabel5=new JLabel();

    String username;

    public RouletteFrame(String InputName) {
        this.setLayout(new BorderLayout(5, 10));
        username=InputName;
        setTitle(username+"(이)를 위한 룰렛창");

        p1=new JPanel();
        p1.setLayout(new BorderLayout());
        JLabel guide=new JLabel();
        guide.setText("오늘의 선택을 랜덤으로 추천 받기");
        guide.setFont(fontTitle);
        guide.setHorizontalAlignment(JLabel.CENTER);

        imageLabel1.setIcon(new ImageIcon("images/random_before.png"));
        imageLabel2.setIcon(new ImageIcon("images/random_before.png"));

        p1.add(imageLabel1, "East");
        p1.add(guide, "Center");
        p1.add(imageLabel2, "West");

        p3=new JPanel();
        JLabel timeLabel=new JLabel();

        imageLabel3.setIcon(new ImageIcon("images/arrow_before.png"));
        imageLabel3.setBounds(350, 50, 50, 50);
        add(imageLabel3);
        imageLabel4.setIcon(new ImageIcon("images/arrow_after.png"));
        imageLabel4.setBounds(730, 50, 50, 50);
        add(imageLabel4);
        imageLabel5.setIcon(new ImageIcon("images/arrow_before.png"));
        imageLabel5.setBounds(1110, 50, 50, 50);
        add(imageLabel5);

        timeLabel.setBounds(1000, 40, 300, 50);
        Timer timer=new Timer();
        TimerTask tt=new TimerTask() {
            int counter=1;
            public void run() {
                timeLabel.setText("Running Time:  "+counter+" sec");
                counter++;
                imageLabel3.setBounds(350, 50+(counter*100)%550, 50, 50);
                imageLabel4.setBounds(730, 50+(counter*100)%550, 50, 50);
                imageLabel5.setBounds(1110, 50+(counter*100)%550, 50, 50);
                if (counter%2==0) {
                    imageLabel1.setIcon(new ImageIcon("images/random_after.png"));
                    imageLabel2.setIcon(new ImageIcon("images/random_after.png"));
                }
                else {
                    imageLabel1.setIcon(new ImageIcon("images/random_before.png"));
                    imageLabel2.setIcon(new ImageIcon("images/random_before.png"));
                }
            }
        };
        timer.scheduleAtFixedRate(tt, 0, 1000);
        p3.add(timeLabel);

        this.add( p1, BorderLayout.NORTH);
        this.add( p3, BorderLayout.SOUTH);

        p2=new JPanel();
        p2.setLayout(new GridLayout(1, 4, 35, 10));
        this.setSize(1500,800);
        // 창을 보이게함
        setVisible(true);

        PlaceRoulettePanel place=new PlaceRoulettePanel(username);
        place.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 0));
        p2.add(place);

        DressRoulettePanel dress=new DressRoulettePanel(username);
        dress.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        p2.add(dress);

        FoodRoulettePanel food=new FoodRoulettePanel(username);
        food.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        p2.add(food);

        CultureRoulettePanel culture=new CultureRoulettePanel(username);
        culture.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 15));
        p2.add(culture);

        this.add( p2, BorderLayout.CENTER);
        this.setVisible(true);
    }
}
