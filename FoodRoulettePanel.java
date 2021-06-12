import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FoodRoulettePanel extends JPanel {
    JTextField[] box=new JTextField[5];
    Font font1 = new Font("SansSerif", Font.BOLD, 20);
    int clicked=0;
    JLabel imageLabel;
    public String name;
    public FoodRoulettePanel(String msg) {
    	name=msg;
        //setSize(400, 600);
        //setLocation(100, 50);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.fill=GridBagConstraints.BOTH;

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

        FoodQueue q1 = new FoodQueue(6);  // all data
        FoodQueue q2 = new FoodQueue(5);   // data displayed

        q1.enqueue("¶±ººÀÌ ");
        q1.enqueue("°£Àå°ÔÀå ");
        q1.enqueue("ÃÊ¹ä ");
        q1.enqueue("µ·±î½º ");
        q1.enqueue("½ºÅ×ÀÌÅ© ");
        q1.enqueue("»ø·¯µå ");

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
            FoodQueue q1 = new FoodQueue(6);  // all data
            FoodQueue q2 = new FoodQueue(5);   // data displayed

            q1.enqueue("¶±ººÀÌ ");
            q1.enqueue("°£Àå°ÔÀå ");
            q1.enqueue("ÃÊ¹ä ");
            q1.enqueue("µ·±î½º ");
            q1.enqueue("½ºÅ×ÀÌÅ© ");
            q1.enqueue("»ø·¯µå ");

            for(int i=0; i<q2.max; i++) {
                String r=q1.dequeue();
                q2.enqueue(r);
            }
            while(clicked==0) {
                try {
                    Thread.sleep(50); // 0.01ÃÊºÎÅÍ (0.1x)ÃÊ·Î ¼­¼­È÷ µô·¹ÀÌ
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
            setTitle("À½½Ä Rullet Result");
            JPanel NewWindowContainer = new JPanel();
            setContentPane(NewWindowContainer);
            NewWindowContainer.setLayout(new GridLayout(2, 1));

            JButton resB=new JButton();
            resB.setText(box[1].getText());
            resB.setHorizontalAlignment(JLabel.CENTER);
            resB.setFont(font1);
            resB.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    JButton btn =(JButton) e.getSource();
                    if (resB.getText().equals("¶±ººÀÌ ")){
                    	new FoodResult1(FoodRoulettePanel.this.name);
        			}else if (resB.getText().equals("°£Àå°ÔÀå ")){
        				new FoodResult2(FoodRoulettePanel.this.name);
        			}
        			else if (resB.getText().equals("ÃÊ¹ä ")){
        				new FoodResult3(FoodRoulettePanel.this.name);
        			}
        			else if (resB.getText().equals("µ·±î½º ")){
        				new FoodResult4(FoodRoulettePanel.this.name);
        			}
        			else if (resB.getText().equals("½ºÅ×ÀÌÅ© ")){
        				new FoodResult5(FoodRoulettePanel.this.name);
        			}
        			else if (resB.getText().equals("»ø·¯µå ")){
        				new FoodResult6(FoodRoulettePanel.this.name);
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

            JLabel newL = new JLabel("<À½½Ä Rullet Result>");
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