import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class PlaceRoulettePanel extends JPanel {
    JTextField[] box=new JTextField[5];
    Font font1 = new Font("SansSerif", Font.BOLD, 20);
    int clicked=0;
    String username;
    JLabel imageLabel;

    public PlaceRoulettePanel(String InputName) {
        //setSize(400, 600);
        //setLocation(100, 50);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.fill=GridBagConstraints.BOTH;
        username=InputName;

        gbc.gridx=0;
        gbc.gridy=0;
        gbc.weighty=0.5;
        gbc.weightx=0.5;

        JPanel boxP = new JPanel();
        boxP.setLayout(new GridLayout(5, 1));

        for (int i = 0; i < 5; i++) {
            box[i] = new JTextField(15);
            box[i].setFont(font1);
            box[i].setHorizontalAlignment(JLabel.CENTER);
            box[i].setForeground(new Color(128, 128, 128));
            box[i].setBackground(new Color(245, 248, 226));
            box[i].setBorder(new LineBorder(new Color(172, 197, 136), 1));

            if (i == 2) {
                box[i].setForeground(Color.black);
                box[i].setBackground(new Color(203, 229, 167));
                box[i].setBorder(new LineBorder(new Color(172, 197, 136), 3));
            }
            box[i].setEditable(false);
            boxP.add(box[i]);
        }
        boxP.setBounds(50, 100, 600, 400);
        boxP.setBackground(new Color(245, 248, 226));
        add(boxP, gbc);

        JButton start = new JButton("start");
        JButton stop = new JButton("stop");
        start.setBackground(new Color(206, 180, 153));
        stop.setBackground(new Color(206, 180, 153));
        start.setFont(font1);
        stop.setFont(font1);
        start.setBorder(null);
        stop.setBorder(null);

        PlaceQueue q1 = new PlaceQueue(12);  // all data
        PlaceQueue q2 = new PlaceQueue(5);   // data displayed

        q1.enqueue("아쿠아리움 ");
        q1.enqueue("롯데 타워 ");
        q1.enqueue("경복궁 ");
        q1.enqueue("한강 공원 ");

        q1.enqueue("아쿠아플라넷 일산");
        q1.enqueue("방탈출 카페 ");
        q1.enqueue("행주 산성 ");
        q1.enqueue("에버랜드 ");

        q1.enqueue("국립중앙과학관 ");
        q1.enqueue("한밭 수목원 ");
        q1.enqueue("에당호 출렁다리 ");
        q1.enqueue("전주 한옥마을 ");

        for (int i = 0; i < q2.max; i++) {
            String r = q1.dequeue();    // delete data in queue
            q2.enqueue(r);              // insert data (in queue)
        }
        String[] qdata = q2.pass();    // send data in queue
        for (int j = 0; j < 5; j++)
            box[j].setText(qdata[4 - j]);

        start.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                RulletThread rt=new RulletThread();
                clicked=0;
                rt.start();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
            }
        });
        stop.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                RulletThread rt=new RulletThread();
                clicked=1;
                new newWindow();
                //rt.start();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
            }
        });

        gbc.gridx=0;
        gbc.gridy=4;
        gbc.weighty=0.1;
        gbc.weightx=0.1;
        JPanel bp = new JPanel();
        bp.setBounds(0, 600, 700, 70);
        GridLayout grid=new GridLayout(1, 2);
        grid.setHgap(3);
        bp.setLayout(grid);
        bp.add(start);
        bp.add(stop);
        add(bp, gbc);
        setVisible(true);

    }

    public class RulletThread extends Thread{
        public RulletThread() {

        }
        public void run() {
            PlaceQueue q1 = new PlaceQueue(12);  // all data
            PlaceQueue q2 = new PlaceQueue(5);   // data displayed

            q1.enqueue("코엑스 아쿠아리움");
            q1.enqueue("롯데월드타워");
            q1.enqueue("경복궁");
            q1.enqueue("여의도 한강공원");

            q1.enqueue("아쿠아플라넷 일산");
            q1.enqueue("방탈출 카페");
            q1.enqueue("행주산성");
            q1.enqueue("에버랜드");

            q1.enqueue("국립중앙과학관");
            q1.enqueue("한밭 수목원");
            q1.enqueue("에당호 출렁다리");
            q1.enqueue("전주 한옥마을");

            for(int i=0; i<q2.max; i++) {
                String r=q1.dequeue();
                q2.enqueue(r);
            }
            while(clicked==0) {
                try {
                    Thread.sleep(50); // 0.01초부터 (0.1x)초로 서서히 딜레이
                    String[] qdata=q2.pass();
                    for(int j=0; j<5; j++)
                        box[j].setText(qdata[4-j]);
                }
                catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                }
                String r=q2.dequeue();
                q1.enqueue(r);
                String r2=q1.dequeue();
                q2.enqueue(r2);
            }
        }
    }
    class newWindow extends JFrame{
        newWindow() {
            setBackground(Color.WHITE);
            setTitle("Rullet Result");
            JPanel NewWindowContainer = new JPanel();
            setContentPane(NewWindowContainer);
            NewWindowContainer.setLayout(new GridLayout(2, 1));

            JButton resB=new JButton();
            resB.setText(box[1].getText());
            resB.setHorizontalAlignment(JLabel.CENTER);
            resB.setFont(font1);
            ArrayList<Integer> resLi=new ArrayList<>();
            resB.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    JButton btn=(JButton) e.getSource();

                    if (btn.getText().equals("코엑스 아쿠아리움")){
                        resLi.add(0);
                        resLi.add(0);
                        resLi.add(0);
                    } else if (btn.getText().equals("롯데월드타워")) {
                        resLi.add(0);
                        resLi.add(1);
                        resLi.add(0);
                    }else if (btn.getText().equals("경복궁")){
                        resLi.add(2);
                        resLi.add(0);
                        resLi.add(0);
                    } else if (btn.getText().equals("여의도 한강공원")){
                        resLi.add(2);
                        resLi.add(1);
                        resLi.add(0);

                    } else if (btn.getText().equals("국립중앙과학관")) {
                        resLi.add(0);
                        resLi.add(0);
                        resLi.add(4);
                    } else if (btn.getText().equals("방탈출 카페")) {
                        resLi.add(0);
                        resLi.add(1);
                        resLi.add(4);
                    } else if (btn.getText().equals("행주산성")) {
                        resLi.add(2);
                        resLi.add(0);
                        resLi.add(4);
                    } else if (btn.getText().equals("에버랜드")) {
                        resLi.add(2);
                        resLi.add(1);
                        resLi.add(4);

                    } else if (btn.getText().equals("국립중앙과학관")) {
                        resLi.add(8);
                        resLi.add(0);
                        resLi.add(8);
                    } else if (btn.getText().equals("한밭 수목원")) {
                        resLi.add(0);
                        resLi.add(1);
                        resLi.add(8);
                    } else if (btn.getText().equals("에당호 출렁다리")) {
                        resLi.add(2);
                        resLi.add(0);
                        resLi.add(8);
                    } else if (btn.getText().equals("전주 한옥마을")) {
                        resLi.add(2);
                        resLi.add(1);
                        resLi.add(8);
                    }
                    dispose();
                    new PracFrame(resLi, username);
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    super.mouseEntered(e);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    super.mouseExited(e);
                }
            });

            JLabel newL = new JLabel("<Place Rullet Result>");
            newL.setHorizontalAlignment(JLabel.CENTER);
            newL.setFont(new Font("SansSerif", Font.BOLD, 25));

            NewWindowContainer.add(newL);
            NewWindowContainer.add(resB);

            setSize(400,200);
            setResizable(false);
            setVisible(true);
        }
    }
}
