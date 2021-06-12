import java.awt.*;
import javax.swing.*;

public class music_tab2 extends JPanel{
	JPanel p1;
	ImageIcon Sim, check;
	JLabel s_name, title, pt1, pt2;

	String[] sim_name = {"������ unlucky", "ũ���� �ڳ��Ƴ�", "�����̽� ASAP", "���̾�Ƽ 5���� ��", "����ȯ �ʿ��ٸ�", 
			"���� ���� ��� ������ �Ұ�������", "����Ʈ ���� psycho", "��ũ ����Ʈ At my worst", "���� Ǫ�� One call awy", 
			"�ڳ� �׷��� Maniac", "Ʈ���� �ù� fools", "�ξ� ���� Don't start now", "���ҳ� ���ҳ�", "92914 okinawa", 
			"��θ��� �־��� ����", "�ڿ츲 ���̴�", "�¿� U R", "�鿹�� Rest", "�̽�Ʈ��Ʈ To find you", "Peach pit Peach pit", 
			"barrie clovers", "the 1975 Somebody else", "���� ���� Groovin"};
	
	String[] point1 = {"�� �� ���� �Ϸ�� �����ٰ� �����ִ� ��", "������ �Ϸ縦 �������ִ� ��", "�������� �߰� �;����� ��", 
			"���� ���� ��� ���� ��", "�̺����� �� �ڵ� ���� ������ ��", "��ŭ�� ������ ��� ���� ��", "������ �������� ��", "�޴��� ��Ҹ��� ���� �� �ִ� ��",
			"��ġ������ ���� �� ��� ��", "������ ���ִ� ��","�������ִ� ��", "���ڸ��� ��������� ��", "��� ���带 ��� ���� ��", "�ڱ� ���� ��� ���� ��",
			"����� ���� ����� ��", "���� �� �������ִ� ��", "�¿��� ��â���� ��� ���� ��", "�� �� ��� ���� ��", "�̷��� �η��� �� ��� ��", "ȥ�� �� �� ��� ��",
			"�߶��� ��� ���尡 ��� ���� ��", "������ ��� ���尡 ��� ���� ��", "ī�信�� �귯���� �� ���� ��"};
	String[] point2 = {"��� ���� �Ϸ縦 �� �����ϰ� ����� �ִ� ��", "�޻� ������ ��� ���� ��", "�ߵ����� ���������� ��", 
			"��ġ������ ��", "���߾￡ ������ �Ǵ� ��", "�ܱ������� �̷� ���̴�", "ī�信 �� �� ���� ��", "���� Ǫ���� �߶��", "�ټ� �� ��Ű�� ���� �� ��� ��",
			"���� ������ ���ϰ� ���� �� ��� ��", "�Ŀ���ŷ �� �� �ְ� ���ִ� ��", "���ο� ��尡 �ñ����� ��", "����� �������ִ� ��", "��θ����� ������ ������ ���� ��", 
			"���� �� �Ⱦ��ִ� ��", "�ܿ� ������ �� ��︮�� ��", "�鿹���� �峭������ ��", "��ȭ�� ���� �;����� ����� ��", "���� �������� ������ִ� ��", "���ο� ��尡 �ñ����� ��", 
			"1975�� ��ǥ ���", "��� �������� ��"};
	
	GridBagLayout Gbag = new GridBagLayout();
	GridBagConstraints gb;
	Font font1 = new Font("a�ó׸�L", Font.BOLD, 20);
	Font font2 = new Font("a�ó׸�L", Font.PLAIN, 18);
	Font font3 = new Font("a�ó׸�L", Font.BOLD, 15);
	public music_tab2(int num) {
		
			super.setLayout(new BorderLayout(0,0));
			p1 = new JPanel();
			p1.setLayout(Gbag);
		
			Sim = new ImageIcon("image/music_sim"+num+".jpg");
			Sim = imageSize(Sim, 150,150);
			
			s_name = new JLabel(sim_name[num], Sim, JLabel.CENTER);
			s_name = setLabel(s_name);
			
			title = new JLabel("��õ ����Ʈ!");
			title.setFont(font1);
			title.setHorizontalAlignment(JLabel.CENTER);
			
			check = new ImageIcon("image/tick.png");
			check = imageSize(check, 30, 30);
			pt1 = new JLabel(point1[num], check, JLabel.LEFT);
			pt1.setFont(font2);
			
			pt2 = new JLabel(point2[num], check, JLabel.LEFT);
			pt2.setFont(font2);
			
			Layout(s_name, 0, 0, 1, 3);
			Layout(title, 1, 0, 2, 1);
			Layout(pt1, 1, 1, 2, 1 );
			Layout(pt2, 1, 2, 2, 1);
				
			add("Center",p1);
		}
		
		JLabel setLabel(JLabel lb) {
			lb.setVerticalTextPosition(SwingConstants.BOTTOM);
			lb.setHorizontalTextPosition(SwingConstants.CENTER);
			lb.setFont(font3);
			return lb;
		}
		JLabel setLabel2(JLabel lb) {
			lb.setVerticalTextPosition(SwingConstants.RIGHT);
			lb.setHorizontalTextPosition(SwingConstants.CENTER);
			lb.setFont(font2);
			return lb;
		}
		
		ImageIcon imageSize(ImageIcon icon, int x, int y) {
			Image ximg = icon.getImage();
			Image yimg = ximg.getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH);
			ImageIcon xyimg = new ImageIcon(yimg);
			return xyimg;
		}
		public void Layout(Component cp, int x, int y, int w, int h) {
			GridBagConstraints gb = new GridBagConstraints();
			gb.fill = GridBagConstraints.BOTH;
			gb.gridx = x;
			gb.gridy = y;
			gb.gridwidth = w;
			gb.gridheight = h;
			gb.insets = new Insets(10, 10, 10, 10);
			
			this.Gbag.setConstraints(cp, gb);
			p1.add(cp);
			p1.updateUI();
		}
	}