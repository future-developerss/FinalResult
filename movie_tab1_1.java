import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class movie_tab1_1 extends JPanel {
	JPanel p1;
	ImageIcon Director, actor1, actor2, actor3, actor4;
	JLabel d_name, a1_name, a2_name, a3_name, a4_name;
	Font font3 = new Font("a�ó׸�L", Font.PLAIN, 15);
	String[] director_name = {"�̼���", "�躸��","����ö","������", "�輺��", "����ȣ", 
			"�� ���̳�","��Ƽ�� ũ����Ű", "Ű�� ���̾�", "�ְɷ�", "���� �з�", "�Ƹ� ������",
			"������", "������", "�輺ȣ", "�αԵ�", "���¿�", "�̰��", "��Ʈ ����", "��þ� �ִϿ���", "��� ����", "���尡 ����Ʈ", "�ٶ� �� ���ٸ�"};
	
	String[] actor1_name = {"ȯ���� : �ں���", "���� : ������", "�ӳ��� : ������", "ö�� : ���켺", "��Ǽ� : �̼���", "�ڵθ� : �۰�ȣ", 
			"�ٸ� : �ŵ鸰 ĳ��", "�� : ���� �ӽ�", "�ɺ� : �� ���̾�", "��� : �ְɷ�", "�ƽ� : �� �ϵ�", "�ִ� : ��� �ݷ�",
			"���� : �ѿ���", "�� : �ּ���", "���� : �̷�", "������ : �����", "������ : ������", "�迬ȫ : �տ���", 
			"�� ����� : ���̹� ����", "���̽� : ���� ��Ʈ����", "���� : ��Į�� ���ѽ�", "� : �ֵ帮�� ��ε�", "���̺� : �ȼ� ����Ʈ", "���߹� : �� ����"};
	String[] actor2_name = {"Ȳ�쿵 : �迵��", "���� : �����", "����ȭ : ���Ҷ�", "���� : �տ���", "��â�� : ������", "������ : ����", 
			"����̽� : Ķ�� �ƿ�����", "���� : �ΰ� ����", "��Ŀ�� : ���� ���̾�", "������ : �����", "ǻ������ : �������� �׷�", "���� : �и� ���Ƿ�",
			"������ : �̿ͼ� ��", "���� : ������", "ä�� : ������", "������ : ���ؼ�", "����� : �賲��", "������ : ������",
			"22 : Ƽ�� ����", "�ƺ� : ���� ȣũ", "����Ʈ ��Ű��", "ĳ�� : ���� ���� �ϵ�", "�ڻ� : �ɺ� �����̽�", "���� : �����ƽ� �ǹٷ�"};
	String[] actor3_name = {"���ٳ� : ���⿵", "�ƺ� : ���α�", "����� : ��ο�", "������ : ������", "���� : ������", "���뱸 : �����", 
			"�� : �� ��ȣ��", "��Ʈ�� : ����� �з�", "���̹� ŷ", "û�� : ������", "���� : ���ݶ� ȦƮ", "��Ƽ�� : ���긮�� ��",
			"���� : ����", "���� : �̼���", "���� : ȫ����", "�ڼ��� : ������", "���ر� : �ڼ���", "�ֹ̿� : �����",
			"�Ŀ� : �ٺ�� ��", "���� : ��Ʈ���� ����Ʈ", "�ٸ��� : ������ ��", "��� : ũ����Ƽ�� ��帯��", "������ : ���� ���ӽ�", "������ : ��ź ��"};
	String[] actor4_name = {"������ : �����", "���� : �ջ�", "Ȳ���� : ������", "���ȳ� : �̼���", "������ : ������", "���� : ����ȣ", 
			"��Ƽ�� : �ȼҴ� �������", "ĵ�� : �ϳ� ���극��", "���� : ����Ű ���̽�", "���� �� : Ȳ�߻�", "�Ӹ�ź : �� Ű��", "���� : �Ϸ��� ����",
			"���� : ����ȭ", "�� : ������", "����� : ������", "���ͼ� : ����", "����� : ������", "�ռҶ� : ����ȭ"
			, "�縸�� : �η�����", "����Ű : �Ϸ��� �۷�����", "���� ������ : ��� ����", "�޸� : ���̻� ���߷���", "�Ŀ� : ���� �ִϾ�"};
	
	public movie_tab1_1(int num) {
		super.setLayout(new BorderLayout(0,0));
		p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 5, 40, 40));
		Director = new ImageIcon("image/movie_director"+num+".jpg");
		Director = imageSize(Director, 100,150);
		
		actor1 = new ImageIcon("image/movie_actor"+num+"-1.jpg");
		actor1 = imageSize(actor1, 100,150);
		actor2 = new ImageIcon("image/movie_actor"+num+"-2.jpg");
		actor2 = imageSize(actor2, 100,150);
		actor3 = new ImageIcon("image/movie_actor"+num+"-3.jpg");
		actor3 = imageSize(actor3, 100,150);
		actor4 = new ImageIcon("image/movie_actor"+num+"-4.jpg");
		actor4 = imageSize(actor4, 100,150);
		
		d_name = new JLabel("���� "+ director_name[num], Director, JLabel.CENTER);
		d_name = setLabel(d_name);
		
		a1_name = new JLabel(actor1_name[num], actor1, JLabel.CENTER);
		a1_name = setLabel(a1_name);
		
		a2_name = new JLabel(actor2_name[num], actor2, JLabel.CENTER);
		a2_name = setLabel(a2_name);
		
		a3_name = new JLabel(actor3_name[num], actor3, JLabel.CENTER);
		a3_name = setLabel(a3_name);
		
		a4_name = new JLabel(actor4_name[num], actor4, JLabel.CENTER);
		a4_name = setLabel(a4_name);
		
		p1.add(d_name);		p1.add(a1_name);
		p1.add(a2_name);	p1.add(a3_name);
		p1.add(a4_name);
		
		add("Center", p1);
	}
	
	JLabel setLabel(JLabel lb) {
		lb.setVerticalTextPosition(SwingConstants.BOTTOM);
		lb.setHorizontalTextPosition(SwingConstants.CENTER);
		lb.setFont(font3);
		return lb;
	}
	
	ImageIcon imageSize(ImageIcon icon, int x, int y) {
		Image ximg = icon.getImage();
		Image yimg = ximg.getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg);
		return xyimg;
	}

}