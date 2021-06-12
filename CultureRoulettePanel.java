import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CultureRoulettePanel extends JPanel{
    JTextField[] box=new JTextField[5];
    Font font1 = new Font("SansSerif", Font.BOLD, 20);
    int clicked=0;
    String username;
    JLabel imageLabel;

    public CultureRoulettePanel(String InputName) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.fill=GridBagConstraints.BOTH;
        username = InputName;

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

        CultureQueue q1 = new CultureQueue(12);  // all data
        CultureQueue q2 = new CultureQueue(5);   // data displayed

        q1.enqueue("소울 ");
        q1.enqueue("조정석 - 아로하 ");
        q1.enqueue("너의 결혼식 ");
        q1.enqueue("아이유 - 이 지금 ");
        q1.enqueue("크러쉬 - 나빠 ");
        q1.enqueue("포스트말론 - sunflower ");
        q1.enqueue("구병모 - 아가미 ");
        q1.enqueue("유현준 - 공간의 미래 ");
        q1.enqueue("나태주 - 풀꽃 ");
        q1.enqueue("미비포유 ");
        q1.enqueue("아이유 이 지금 ");
        q1.enqueue("크러쉬 나빠 ");

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
            CultureQueue q1 = new CultureQueue(12);  // all data
            CultureQueue q2 = new CultureQueue(5);   // data displayed

            q1.enqueue("소울 ");
            q1.enqueue("조정석 - 아로하 ");
            q1.enqueue("너의 결혼식 ");
            q1.enqueue("아이유 - 이 지금 ");
            q1.enqueue("크러쉬 - 나빠 ");
            q1.enqueue("포스트말론 - sunflower ");
            q1.enqueue("구병모 - 아가미 ");
            q1.enqueue("유현준 - 공간의 미래 ");
            q1.enqueue("나태주 - 풀꽃 ");
            q1.enqueue("미비포유 ");
            q1.enqueue("아이유 이 지금 ");
            q1.enqueue("크러쉬 나빠 ");

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
            setTitle("문화생활 Rullet Result");
            JPanel NewWindowContainer = new JPanel();
            setContentPane(NewWindowContainer);
            NewWindowContainer.setLayout(new GridLayout(2, 1));

            JButton resB=new JButton();
            resB.setText(box[1].getText()+" ");
            resB.setHorizontalAlignment(JLabel.CENTER);
            resB.setFont(font1);
            resB.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    JButton btn = (JButton) e.getSource();
                    if (resB.getText().equals("소울 ")){
                    	new resultPage(18 ,CultureRoulettePanel.this.username);
        			}else if (resB.getText().equals("조정석 - 아로하 ")){
        				new resultPage_music(5,CultureRoulettePanel.this.username);
        			}
        			else if (resB.getText().equals("너의 결혼식 ")){
        				new resultPage(0, CultureRoulettePanel.this.username);
        			}
        			else if (resB.getText().equals("아이유 - 이 지금 ")){
        				new resultPage_music(0,CultureRoulettePanel.this.username);
        			}
        			else if (resB.getText().equals("크러쉬 - 나빠 ")){
        				new resultPage_music(1,CultureRoulettePanel.this.username);
        			}
        			else if (resB.getText().equals("포스트말론 - sunflower ")){
        				new resultPage_music(6, CultureRoulettePanel.this.username);
        			}
        			else if (resB.getText().equals("구병모 - 아가미 ")){
        				new resultPage_Book(0, CultureRoulettePanel.this.username);
        			}
        			else if (resB.getText().equals("유현준 - 공간의 미래 ")){
        				new resultPage_Book(1, CultureRoulettePanel.this.username);
        			}
        			else if (resB.getText().equals("나태주 - 풀꽃 ")){
        				new resultPage_Book(2, CultureRoulettePanel.this.username);
        			}
        			else if (resB.getText().equals("미비포유 ")){
        				new resultPage_Book(6, CultureRoulettePanel.this.username);
        			}
        			
                    dispose();
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

            JLabel newL = new JLabel("<문화생활 Rullet Result>");
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