import java.awt.*;
import javax.swing.*;

public class book_tab2 extends JPanel{
	JPanel p1, p2;
	JLabel title, content, empty;
	String[] summary = {
					"<html><br><br>���ư��̡��� ������ ���ο��� �ư��̸� ���� �� �ҳ��� ���� ����� �׷��� �Ƹ��ٿ� ��Ȥ��ȭ�̴�. <br>"
					+ "�ư��̷� ���� ���� ���ν� ����� ��¦�̸� ���� Ǫ�� ȣ�� ���� ���ġ�� ��. <br>"
					+ "�ڽ��� ��ü�� ����� ����� ������ ä ��ư��� �ҳ��� ���ӿ�����ŭ�� �Ѿ��� ������ ������. <br>"
					+ "�￡�� ���ο� �̸��� ���� �ǳ��� ����, ���� �������� ����� ���� �ط�. <br>"
					+ "���̶�� ���ֹ��� ���ӿ���, ���õ� �׸��� ���ϵ� ������ �� ���� ����,<br>"
					+ " �������κ��� �����ް� �ҿܵ� �̵��� �̾߱Ⱑ �ź�Ӱ��� �Ƹ���� ��������.</html>",
					"<html><br><br>�츮�� ��� ������ �� �ȿ� ��� �ΰ��� ��ȭ�� ���� �Բ� ��ȭ�� �Դ�. <br>"
					+ "�׷��� �ڷγ�19�� �츮�� �ϻ��� �ٲ�鼭 ������ ��ȭ �ӵ��� ��������<br>"
					+"���ư��� ���⵵ ���� Ʋ������. <br>"
					+ "�� å�� ��, ȸ��, �б�, ��� �ü�, ����, ���� ����, ���� �ͳ� �� �츮�� ��Ȱ�ϰ� �ְų�<br>"
					+ "�츮 ��Ȱ�� ������ ������ ����� �̷��� ���캻��.</html>",
					"<html><br><br>���ڼ��� ���ƾ�/ ���ڴ�// ���� ���ƾ�/ ���������// �ʵ� �׷���.�� ������ �ڹۿ� ���� �ʴ� ������ ���Դϴ�. <br>"
					+ "�׷��� �� �ð� ���ڵ��� ������ �� ���� �ǰ� �Ǽ��� �ǰ� ������ �� ���Դϴ�. <br>"
					+ "�׾߸��� �����ϱ� ¦�� ���� ���Դϴ�. <br>"
					+ "�� ���� ��Ǯ�ɡ��� �ٷ� �� ��Ǯ�ɡ� ���� ������ ����ϰ� �⻵�ϱ� ���ؼ� ���� ������ ������ å�Դϴ�.</html>", 
					"<html><br><br>��ǰ �ȿ��� �� �㸦 ��� ������ �����ߴ� �۰����, �̹� ��ǰ���� �������� ������ ���� �ٸ� ���⿡�� ���� ���Ѵ�. <br>"
					+ "������ ���谡 �ƴ� �ΰ�, �� ���� ������ ������ ���ڵ��� �ʴ��ϰ� �ִ� ���̴�.<br>"
					+ "���ݲ� ���ǡ��� ���� �ü��� �����ϰ� �����ؿ� �۰��� �̹� ���� ������ ������� �̸��� ���ǡ� �� ��ü�� �Ǿ���. <br>"
					+ "�׸��Ͽ� �� ������ ���� �� ���� ���������� �������� ��Ÿ�Ϸ� ���ǡ��� ���� ���� �� ���õǰ� ���� �ִ� ������ �����δ�.</html>", 
					"<html><br><br>���Ƹ�塻�� ���ΰ� �����硯�� ������ ������ �� ������� �޴� ��Ư�� ĳ���ʹ�.<br>"
					+ " �ٸ� ����� ���� �ൿ�� �̸��� �о� ���� ���ϰ� <br>"
					+ "������ �г뵵 �� ������ ���ϴ� ����� ������ϰԡ� ��ư����� ����� ���� ���� �ִ�. <br>"
					+ "�������Լ� ���� ������ ���� ����, ȣ�Ǹ� ���̸� �����ٰ� ���ϴ� ���� �����Խġ� ���� ������ �ޱ⵵ �Ѵ�. <br>"
					+ "������ ���̰��θ� ���� ����, <br>"
					+ "���������̶�� �հ������޴� ����� ��� �� ������� ����� �¾� ������ �Ұ� �Ǹ鼭 �� ���� Ȧ�� ���´�.</html>",
					"<html><br><br>�� �տ� ��Ÿ���� ������ ������, �л��鿡�� ���̴� �̽��͸��� �����, �б� ������ ���� ������ ���顦�� <br>"
					+ "�縳 M������ � ����� �ִ� ���ϱ�. �������� �������� ȫ��ǥ�� ��(some)�� ��� �������ɱ�?</html>", 
					"<html><br><br>2009�� ������ ���� �ð� ����, �������� ���� �����ڴ� ������ �ϳ��ۿ� ���� ī�信�� 6��° ����Ʈ������ ���ϰ� �ִ�. <br>"
					+ "�׷��� ��� �� ���ڱ� ī�� ���� �ݴ´ٴ� �Ϲ����� �뺸�� �ް� ������ �Ҵ´�. <br>"
					+ "�Ϸ��Ϸ� ����μ��� � ������ġ�� �׳࿡�� ���������� �־��� ��ȸ�� ����������ȯ���� 6���� �ӽ� �����Ρ�.<br>"
					+ " �׳�� �����ӱ��� �ξ� ������ �ñ��� �ޱ� ���� ��� ���� �Ա�� ���������μ��� ���� �����Ѵ�.</html>",
					"<html><br><br>�ΰ��� �������� Ź���ϰ� �����ϴ� ������ ���繫�� ��ǰ�� ���Ӱ� �д´�. <br>"
					+ "�����ϰ� ���� �ɼ��� �����̰� �ΰ� ��ȸ�� ������ ��Ȥ���� �ߵ��� ���ϰ� �ĸ�Ǿ� ���� ������ �׸� �Ҽ���,<br>"
					+ " ��� ���迡�� ������ ���� ä �ΰ� �ǰ��ڷ� ������ ���ΰ��� ������ ġ���� �ɸ������ ����Ͽ���. <br>"
					+ "������ ��ǰ ���� Ÿ���� �ڱ��ı��� ������ ��2�� ����������� �и��� �� ��Ȳ���¿� ���� �Ϻ� �����̵��� �ǽ��� �ݿ��ϰ� �ִ�.</html>",
					"<html><br><br>�̿����� �̻� �� ���̻��ѡ� ������ ������ �ڻ쵵 ������� ���ϴ� ����. <br>"
					+ "���� �״� ������ �̿���� ������ �������� ���õ���� ���ذ���, <br>"
					+ "�������� �κ� �Ͼ� �������� ������ ����ġ�� ������ �Ƴ� ������ �� �� ������? <br>"
					+ "�ƴϸ� �ڽ��� �ϻ� ����� ������ �տ��� �޾Ƶ��̰�, �Ͼ� ������κ��� ��׸� ���ѳ� �� ������?</html>",
					"<html><br><br>���޹��� ���̱⡻�� 1930��� ���Ȳ�� ���ķ� �������� �̱��� ����� ��ȸ���� ��, <br>"
					+ "���� ���� ÷���� �븳�� �������� �쿩�� ��ǰ�̴�. ȣ�� ���� �����ι���, <br>"
					+ "�츮�� ��� ������ ������� ��Ƴ� ���ٰ� �����ϴ� �̿��� ���� ����,<br>"
					+ " �Ű����� �����ϰ� ��ƴ��� ���� ������ ���� ������ ������ ����� �̲���� ���� �幮 �����̴�. <br>"
					+ "Ư�� ���� �ְ� �ٷ� ������ �α� ������ ���ǿ� ���,<br>"
					+ " ���� �ų��� �������� ���� �� ���ư� ��ȸ�� �Ͽ��� �ڹ��� ��ȸ�� ������ ���̴�.</html>",
					" <html><br><br>�� å�� ������� ������ �� �Ŀ� ã�ƿ��� ���� �������� ���ؼ� �̾߱��Ѵ�. <br>"
					+ "���� ���� ������ �ٸ� �� ���� ������ ��ó��, <br>"
					+ "�� ��ÿ��� ������ �ĺ� �Ĵ� ��ó�� �������� �� ������ ������ ��������� ����<br>"
					+ " �Ǵٽ� �λ��� �غ��ص� �ٸ� ������ �߰��� �� �ִٴ� ������ �ʹ� ��������, <br>"
					+ "�ʹ� �������� �ʰ� �ʴ��� �����̿� ���� Ź���ϰ� Ǯ��´�.</html>",
					"<html><br><br>���� �� �ҳ�� �����̾� �ҳ��� ������ �׸� �Ƹ��ٿ� ��ȭ �������Ρ��� ���ۼҼ�. <br>"
					+ "��õ ��Ÿ��ƽ ��ȭ������ �������� �����ϸ鼭 �Կ��� ������ ������ ���� ���� ���ϾƵ��� ����ϰ�<br>"
					+ " ��а����� ������ ���� �ٷ� �� ��ȭ�� �����̴�. ��ȭ�� ������ ���븸 �������� �츰 �� ���� ���̿��ٸ�, <br>"
					+ "�Ҽ� �������Ρ��� ������ ������ ���� �������� �����̴�. <br>"
					+ "�������ٵ�, ��ȭ�� �Ͻ������θ� ����ϰ� ������ �͵鿡 ���� ����� ������ �ƶ��� ���캼 �� �ִ�.</html>", 
					"<html><br><br>���￪���� ����� ��Ȱ�� �ϴ� ������� ���ڰ� ��� �� 70�� ������ ������ �ֿ��� �ο�����<br>"
					+ " �׳డ ��ϴ� ���������� �߰� �˹ٸ� �ϸ鼭 �̾߱Ⱑ ���۵ȴ�. <br>"
					+ "��ġ�� �� ���� �� �系�� ���ڿü� ġ�ŷ� ���Ÿ� ������� ���ϴ� ���� <br>"
					+ "���� ��ϰ� �ൿ�� ���� ���� �մ��� ����� ����� �� ������ �Ǳ����� ���� �ϴµ� ����, <br>"
					+ "�ǿܷ� �״� ���� �� ���س� �� �ƴ϶� �ֺ� ������� ���ϰ� ��������鼭 �������� ���� ��Ű�� ����� �ϲ��� �Ǿ��.</html>",
					"<html><br><br>���˷���, ���� �����须�� ���� �� �忡 ����� ����� �ɰ� �Ͽ��̷� ���� ������ �� ���ΰ� ����� ģ������ ���� �׷ȴ�. <br>"
					+ "���� ������ �ô��� �Ͽ��̶�� �ż��ϰ� ���ο� ������ �������, <br>"
					+ "�̹� 1���� ��ܵ����� ȥ���� �ø��� ��Ȱ�� �ٷ� ���� �����ϰ� ���� ���� �������� Ư���� �̾߱��̴�. <br>"
					+ "���θ� �����ϰ� �Ƹ��ٿ� �Ÿ��� �����ϸ� ����� �ִ� ģ������ ������ �Ǿ� �ִ� �� ���� ���ΰ� <br>"
					+ "����, ȫ��, ��ȭ�� �ô븦 �ռ� �� ���ο� ����, ���� ����ü�� ��� �Ƹ���� ���� ���δ�.</html>",
					"<html><br><br>�̹������� �и��� ������ ������ �Դ� ���� ������ ź���� �׸� ���ʴ롹, <br>"
					+ "���ͽŰ� ���ͽ� ������ ��������� �̲����� ���� �������� �����,<br>"
					+ "���� ���Ӹ� ���� ���������� �̸��� �鿩�ٺ��� ����Ʈ ���� ��Ĭ����, ����, ����, <br>"
					+ "��2ȸ Ȳ�ݰ��� Ÿ�Ӹ��� ���������� ������� ������ �������� ������, �������� �� �� ��ǰ�� �����Ͽ���.</html>",
					"<html><br><br>���ӹ��Ÿ��鼭, �����ϸ� ���ư��� ���� �� ������ �� �ۿ��� �Ƹ��ٿ��� ���⸦�� �ٶ�� ������ �� ������ ����, <br>"
					+ "������� �̵��� ����ϰ�, �׵��� ������ ��ƶ�� �������� �ֿ������� ����� �ǡ��⸦ �ٶ��� <br>"
					+ "�������� ������ ���踦 �������� ǰ�� ä �������� ���󡻿� �絵�� �۰���<br>"
					+ " ���� �������� �Ǵ��� ������ ä ���� �ȿ��� �������� ��ǵ��� �����ϰ� ������ ��ϡ�(���۰��� ����)�ϱ⸦ �Ҹ��Ѵ�. </html>",
					"<html><br><br>������ ��� �뷡, �ϻ��� ������ �������� ��ġ ���� ģ���� �翬�� �����ϵ� �����ϰ� ���� �ְ� ��Ҵ�. <br>"
					+ "���׷��� �׷���, ���׷� �� �־ � �ٽɵ� �� �о������ �������� ��ó��, <br>"
					+ "�� å���� ������ ���� �λ��� ������ �� ��ƺ��� �Ͱ� ����� ��ƶ�� �������� ��� �ִ�. <br>"
					+ "�����ϴ� �� �ϰ�, �����ϴ� ����� �ΰ� ����� ��ư��� �������� �λ� �̾߱⸦ ���Ѵ�.</html>",
					"<html><br><br>���װ��� �����մϴ١��� ���ڰ� ������ ������ �����ϸ� ���� ���� ��ȭ�� ���� �����̴�. <br>"
					+ "20����� ���� �ϻ󿡼� ����⸦ �����ߴ� ���ڴ�, �ð��� �Ǵ� �� �ѽõ� ���� �ʰ� �׻� ������ �ߴ�.<br>"
					+ " �� �������� ���麸�� ���� �� ���� ���⸦ �ޱ⵵ �ϰ� ����� �δ�ġ�⵵ ������, <br>"
					+ "�װ͵��� �ݵ�� �ذ�ȴٴ� ��� ���� �˰� �Ǿ���. ��, ������ ���� �λ��� ����ٰ� �ص� ������ �ƴ� ���̴�. <br>"
					+ "���ڴ� 'ȥ�� ������ ����'�� �� �� �־�� �Ѵٰ� �����Ѵ�. </html>",
					"<html><br><br>���� �ι��� ��â���� �������� ���� ������ ���ܿ� '�̹���'ó�� ��Ÿ�� �Ҽ�. <br>"
					+ "���� ���� �۰����� �˺��� ī������ ������ ������ �Ȱ��� �� ��ǰ�� ���ǿ��� �ҿܵǾ� <br>"
					+ "�̹������� ��ư��� �������� ������ �յΰ� ��μ� �����ϴ� ������ ü���� �����ϰ� �׸���. <br>"
					+ "ī���� '�������� �µ��� ������ �����鼭 ������ ���ؼ��� ������ �������� �ʴ�' <br>"
					+ "�����Ҷ�� �ι��� ���� ������ ������ ��Ģ���� ��� ���ο� �ΰ����� �����Ѵ�.</html>",
					"<html><br><br>�������̺��� �ٳ׻�� �ϳ�, �� ��� ������ ���Ű� ���� ������ ����� ������ ���̴�. <br>"
					+ "������ ��ó�� ��� ���̿��� �ϳ��� ������ Ÿ���� �ٳ׻�� ���Ѵ�. <br>"
					+ "�׸��� ��Ŭ���� �Բ� ���ο� �ź����� ������ �ٳ׻��� �ŷڸ� ��� ���� �۾��� �����Ѵ�. <br>"
					+ "������ Ÿȣ ȣ�������� �ϳ�, �ٳ׻�, ��Ŭ��, �� ����� �λ��� �浹�Ѵ�. <br>"
					+ "�ο� ���, ������ �г�, ����� ��� ���̿��� �ٴٸ����ϵ� ���ǰ� ������ �ھ�Ų��. <br>"
					+ "������ ���� ��ö�� �̵��� ����� ���� ��� �� ���ΰ�?</html>",
					"<html><br><br>������� �帧�� �ٲپ���� �۰� �繫�� ����Ʈ�� ��ǥ������ ������ ������ ����, �뺧 ���л� ������. <br>"
					+ "���� �ʴ� ������ ��ٸ��� �� ���ΰ��� �ǹ̾��� ��ȭ�� �������� ������ �ҿܵ� ���� ��¡�Ѵ�.<br>"
					+ " ����� ������ ��ٸ��°�. �׸��� ���� ����� ������ ���ϰ� �ִ°�. <br>"
					+ "��ٷ��� ���� �ʴ� �� ������ ���� ������ �׸����� ������ ���� ���������� �����̴�.</html>",
					"<html><br><br>���� ������ ������ �����须�� ���� ���� ���� ����� �ٷ� �츮 �ݿ� �ֽ��ϴ١���� ������� ����� �Բ�<br>"
					+ " ������ ���� ���� ���л��鿡�� ���� �� ���� ��Ȥ�� ������ �����ϴ� ��� �������� �̾߱⸦ ���� �Ҽ��̴�. <br>"
					+ "�˹��ҳ� ����, ��ź�, �յ�, ��������, ������, ��ȥ��, ���ӻ��� �� <br>"
					+ "��� ��ǰ���� ������� ȭ�η� �Ⱓ ��� �߰ſ� ������ �ҷ� �����װ�, �������� ȭ���� ������ �ɸ�����, <br>"
					+ "��û�� ���Ե��� �ӵ����� �ڶ��ϸ� ���� �̽��͸� ��Ʈ�� ����, ���ݱ����� ������ ���ڵ��� ����� �ް� �ִ�.</html>",
					"<html><br><br>ȭ�� �� ������ ���� �������� �Ҽ��� �ű� �����ϰ� ��������� �̾߱�. <br>"
					+ "������ ������� �� ��ȥ�� �Ǹ��� ������ ���� ������ �� ���ڸ��� ��ĥ�� ���δ� Ÿ��Ƽ�� �¾纵ó�� ���������� ĥ���� �ִ�. <br>"
					+ "�� ȭ���� ����� �׷����� ���ÿ� ���ÿ��� ������ ���� ��ȸ�� �������� ����� ���� ������ ��Ұ� ���� ���� �����ν� <br>"
					+ "������ ������ ������ �˸��ٴ� �� ȯ������ �߻��� <br>"
					+ "���̹��� ���� ���� �� ��ǰ���� �ڸ��ű��ϰ� ����� �� ���ڶ��� ���� �ٰ��̱⵵ �ϴ�.</html>",
					"<html><br><br>�� �Ҽ��� ������ ������ ���������� ���� �ִ�. ǳ���� ���� �̾߱�� ���Ҿ� ������ ��ġ�� �ι����� ��췯�� ��ġ�� <br>"
					+ "������ ������ ������ ������ �Բ��Ѵ�. ������ �غ��ϱ� ���� ���� �翬�� ���� �ι����� ����� ȸ���� �����ϰ� �׷�����,<br>"
					+ " �������� ����� ���Ĺ����� ��� ������� �̷��� ���� ���ư��� ���� �־��� �׵��� ����� ������ �ھƳ���.</html>"
					
			}; 
	GridBagLayout Gbag = new GridBagLayout();
	GridBagConstraints gb;
	public book_tab2(int num) {
		super.setLayout(new BorderLayout(0,0));
		p1 = new JPanel();
		p1.setLayout(Gbag);
		
		Font font1 = new Font("a�ó׸�L", Font.BOLD, 20);
		Font font2 = new Font("a�ó׸�L", Font.PLAIN, 15);
		
		title = new JLabel("�ٰŸ�", JLabel.CENTER);
		title.setFont(font1);
		
		content = new JLabel(summary[num], JLabel.CENTER);
		content.setFont(font2);
		content.setVerticalAlignment(JLabel.CENTER);
		
		Layout(title, 0, 0, 1, 1);
		Layout(content, 0, 1, 3, 1);
		add("Center",p1);

	}
	/*public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(70, 80, 700, 80);
    }
    */
	public void Layout(Component cp, int x, int y, int w, int h) {
		GridBagConstraints gb = new GridBagConstraints();
		gb.fill = GridBagConstraints.BOTH;
		gb.gridx = x;
		gb.gridy = y;
		gb.gridwidth = w;
		gb.gridheight = h;
		gb.insets = new Insets(0, 5, 0, 10);
		
		this.Gbag.setConstraints(cp, gb);
		p1.add(cp);
		p1.updateUI();
	}

}