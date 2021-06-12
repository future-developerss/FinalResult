import java.awt.*;
import javax.swing.*;

public class music_tab2 extends JPanel{
	JPanel p1;
	ImageIcon Sim, check;
	JLabel s_name, title, pt1, pt2;

	String[] sim_name = {"아이유 unlucky", "크러쉬 자나꺠나", "스테이시 ASAP", "자이언티 5월의 밤", "정승환 너였다면", 
			"조이 좋은 사람 있으면 소개시켜줘", "포스트 말론 psycho", "핑크 스웨트 At my worst", "찰리 푸스 One call awy", 
			"코난 그레이 Maniac", "트로이 시반 fools", "두아 리파 Don't start now", "새소년 새소년", "92914 okinawa", 
			"멜로망스 멀어진 이유", "자우림 샤이닝", "태연 U R", "백예린 Rest", "싱스트리트 To find you", "Peach pit Peach pit", 
			"barrie clovers", "the 1975 Somebody else", "제프 버넷 Groovin"};
	
	String[] point1 = {"별 거 없는 하루라도 괜찮다고 말해주는 곡", "지루한 하루를 위로해주는 곡", "내적댄스가 추고 싶어지는 곡", 
			"늦은 저녁 듣기 좋은 곡", "이별했을 때 자동 눈물 나오는 곡", "상큼한 음색을 듣기 좋은 곡", "저절로 힙해지는 곡", "달달한 목소리를 들을 수 있는 곡",
			"센치해지고 싶을 때 듣는 곡", "힘나게 해주는 곡","위로해주는 곡", "듣자마자 당당해지는 곡", "밴드 사운드를 듣고 싶을 떄", "자기 전에 듣기 좋은 곡",
			"사랑에 대한 담백한 곡", "힘들 때 위로해주는 곡", "태연의 가창력을 듣고 싶을 떄", "쉴 떄 듣기 좋은 곡", "미래가 두려울 때 듣는 곡", "혼자 쉴 때 듣는 곡",
			"발랄한 밴드 사운드가 듣고 싶을 떄", "강렬한 밴드 사운드가 듣고 싶을 때", "카페에서 흘러나올 것 같은 곡"};
	String[] point2 = {"기분 좋은 하루를 더 상쾌하게 만들어 주는 곡", "햇살 맞으며 듣기 좋은 곡", "중독성에 빠져버리는 곡", 
			"센치해지는 곡", "옛추억에 빠지게 되는 곡", "외극힙합이 이런 것이다", "카페에 온 것 같은 곡", "찰리 푸스의 발라드", "텐션 업 시키고 싶을 때 듣는 곡",
			"새벽 감성에 취하고 싶을 때 듣는 곡", "파워워킹 할 수 있게 해주는 곡", "새로운 밴드가 궁금해질 떄", "담담히 위로해주는 곡", "멜로망스의 감성을 느끼고 싶을 떄", 
			"나를 꼭 안아주는 곡", "겨울 감성에 잘 어울리는 곡", "백예린의 장난스러운 곡", "영화를 보고 싶어지게 만드는 곡", "새벽 감성으로 만들어주는 곡", "새로운 밴드가 궁금해질 떄", 
			"1975의 대표 명곡", "기분 종아지는 곡"};
	
	GridBagLayout Gbag = new GridBagLayout();
	GridBagConstraints gb;
	Font font1 = new Font("a시네마L", Font.BOLD, 20);
	Font font2 = new Font("a시네마L", Font.PLAIN, 18);
	Font font3 = new Font("a시네마L", Font.BOLD, 15);
	public music_tab2(int num) {
		
			super.setLayout(new BorderLayout(0,0));
			p1 = new JPanel();
			p1.setLayout(Gbag);
		
			Sim = new ImageIcon("image/music_sim"+num+".jpg");
			Sim = imageSize(Sim, 150,150);
			
			s_name = new JLabel(sim_name[num], Sim, JLabel.CENTER);
			s_name = setLabel(s_name);
			
			title = new JLabel("추천 포인트!");
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