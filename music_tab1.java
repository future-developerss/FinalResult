import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class music_tab1 extends JPanel {
	JPanel p1;
	ImageIcon Singer;
	JLabel s_name, info, finfo,sinfo;
	String[] Singer_name = {"아이유", "크러쉬", "에스파", "악동뮤지션", "폴킴", "조정석", 
			"포스트 말론", "앤 마리", "Lauv", "크리스토퍼", "트로이 시반", "Doja cat",
			"새소년", "헤르쯔 아날로그", "케빈 오", "김윤아", "태연", "백예린",
			"싱스트리트", "Peach pit", "Lorde", "Barrie", "The 1975", " Mac Ayres"};
	String[] info1 = {"Palette[2017.04.21]", "나빠(NAPPA)[2019.08.28]", "Next Level[2021.05.17]", "너를 만나[2018.10.29]",
			"아로하[2020.03.27]", "Sunflower[2018.12.14]", "Speak your mind[2018.08.03]", "I met you when I was 18"," ","",
			"Blue Neighborhood", "Hot Pink[2019.11.07]", "긴 꿈[2017.06.20]", "어서오세요 여름밤[2014.06.26]", "Baby Blue[2016.05.14]",
			"315360[2010.04.26]", "Purpose[2019.10.28]", "Every Letter I sent to you", "Sing Street[2016.04.18]", "Being So normal",
			"Royals[2014.03.31","Happy to be here[2019.05.03]", "Sincerity is scary[2018.11.30]", "Drive Slow[2019.02.12]"
			
			};
	String[] info2 = {"작곡 제휘 작사 아이유", "작곡 크러쉬 작사 크러쉬", "작곡 Mario 작사 유영진", "작곡 이찬혁 작사 이찬혁", "작곡 폴킴 작사 폴킴",
			"작곡 위종수 작사 김태훈", "", "", "", "", "", "","작곡 황소윤 작사 황소윤", "작곡 주하 작사 주하", "작곡 최인희 작사 케빈오", "작곡 김윤아 작사 김윤아", 
			"작곡 Lance 작사 제이큐", "작곡 백예린 작사 백예린", "", "", "","", "", ""};
	
	String[] song_info = {"<html>화려한 코드진행이 돋보이는 기분 좋은 팝재즈 트랙으로 <br>"
			+ "\"밤편지\", \"마음\" 등 수 차례 '아이유'와 멋진 호흡을 보여준 '김제휘'가 작곡을, '아이유'가 작사를 맡았다.<br> "
			+ "깜짝 놀랄 만큼 빛이 나고 아름다운 건 다른 어느 것도 아닌<br> "
			+ "바로 지금, 여기, 우리라는 메시지가 사랑스럽게 다가오는 곡이다.</html>", 
			"<html>바빠서 미안.<br>"
			+ "나빠서 미안.<br>"
			+ "미안하단 말이 입에 붙어서 미안.<br>"
			+ "맘 아프게 해서 미안.</html>",
			"<html>신곡 ‘Next Level’은 영화 ‘분노의 질주: 홉스&쇼 (Fast & Furious: Hobbs & Shaw)’의 OST <br>"
			+ "‘Next Level’을 aespa만의 색깔로 리메이크, 그루비한 랩과 에너지 넘치는 베이스리프가 돋보이는 <br>"
			+ "힙합 댄스곡으로 재탄생했으며, aespa 멤버들의 파워풀한 보이스와 버라이어티한 곡 진행이 돋보인다.</html>",
			"<html>정규앨범 3집 [항해] 앨범명에는 여러 가지 함축적인 의미가 담겨있는데, <br>"
			+ "그중 프로듀서 이찬혁의 의도가 가장 잘 담긴 키워드는 ‘떠나다’이다.<br>"
			+ "지난 앨범까지는 온전히 홀로서기를 할 수 없던 아이와 청소년이었다면, <br>"
			+ "[항해] 앨범 속 ‘AKMU’는 나를 지켜주던 보금자리를 떠나 <br>"
			+ "사회로 첫발을 내디딘 사회초년생의 모습에 가깝다고 볼 수 있을 것이다.</html>",
			"<html>지금 옆에 있는 누군가가 당신이 오랫동안 기다려온 완벽한 사랑이길 바라면서...</html>",
			"<html>‘아로하’는 지난 2001년 발표된 혼성그룹 쿨의 대표곡 중 하나로, <br>"
			+ "당시에도 사랑스러운 고백송으로 세대를 뛰어 넘은 큰 사랑을 받은 곡이다.<br>"
			+ "특히 이번에 ‘슬기로운 의사생활’의 러브송으로 새롭게 탄생된 ‘아로하’는<br>"
			+ " 극중 의대 5인방 중 자칭 ‘인싸’로 불리는 이익준 역의 조정석이 직접 가창에 참여해 의미를 더했다.</html>",	
			"<html>2018년 애니메이션 영화 《스파이더맨: 뉴 유니버스》의 주제곡이다. <br>"
			+ "빌보드 핫 100 1위와 영국 싱글 차트 1위를 한 곡이다. <br>"
			+ "미국 음반 산업 협회(RIAA) 인증 트리플 플래티넘 등급을 받은 곡이다. <br>"
			+ "제62회 그래미상 올해의 레코드 부문 후보에 올랐다.</html>",
			"<html>절친인 Ed Sheeran과 공동 작업하고 Julia Michaels도 참여한 <br>"
			+ "’2002‘는 17개의 트랙에서 특히 주목해야 할 넘버. <br>"
			+ "2018 BRIT Awards에서 베스트 브리티쉬 프로듀서로 호명된<br>"
			+ "Steve Mac, 작곡가 Emily Warren, Ina Wroldsen 등 실력파 뮤지션이 힘을 합쳐 <br>"
			+ "영국의 새로운 히트메이커를 알리는 앨범.<br>", 
			"<html>\"[I met you when I was 18]은 곡과 이야기에 대한 모음집입니다. <br>"
			+ "18살에 처음 뉴욕으로 와서 첫사랑에 빠진 이야기예요. 자신의 정체성을 찾고자 하는 이야기이고, <br>"
			+ "동시에 누군가와의 인터뷰를 하기도 하죠. 2015년 저의 첫 곡 'The Other'를 발매한 이후의 이야기입니다.<br>"
			+ " 지금 보면 좀 제멋대로인 듯한 곡이죠. <br>"
			+ "조각된 기억의 파편들로 추억에 잠기게 되는데 이제 그런 곡들을 모두 모으게 되었습니다. <br>"
			+ "[I met you when I was 18]은 앨범이 아닙니다. <br>"
			+ "그렇지만 저의 작업의 결과물은 틀림없어요. 여러분도 즐겨 주시길 바랍니다.</html>"	,
			"정보 없음","정보 없음", "정보 없음",
			"<html>\"후렴의 가사를 보면 굉장히 유치한데요. 터무니 없이 보드라워져 터뜨리는 마음을 이야기하고 싶었어요. <br>"
			+ "더불어 '나는 당신과 함께면 세상을 바꿀 수 있어. (I can change the world to be with you.)<br>'"
			+ "라는 구절을 통해 사회 속에서 부정 당하는 존재들의 이야기임을 전하고 싶었습니다.\" (황소윤)</html>",
			"<html>새 멤버 주하의 곡으로, 작곡부터 편곡까지 모두 담당했다. <br>"
			+ "하모니카와 피아노, 기타의 단출한 세팅으로 전개되며 서정적인 곡의 분위기가 일품이다. <br>"
			+ "'하늘엔 식은 공기', '그늘이란 없는 따가운 햇살 같던 나의 일상' 등 <br>"
			+ "감성 깊은 노랫말에 어우러지는 주하의 깨끗한 음색이 앨범의 대미를 장식한다.</html>", 

			"<html>어쿠스틱 기타를 3핑거 주법(쓰리핑거 주법)으로 연주하여 빈티지한 사운드를 연출해냈으며, <br>"
			+ "여기에 '케빈 오'의 세련된 보컬이 더해져 아스라한 청춘의 느낌이 물씬 풍기는 곡으로 완성되었다. <br>"
			+ "'디마프'가 청년부터 중장년 세대의 이야기들이 골고루 담겨있는만큼, <br>"
			+ "\"베이비 블루(Baby Blue)\" 역시 세대와 시대를 넘어 사랑 받고 있는 포크 장르를 채택,<br>"
			+ " 전 세대들에게 공감의 메시지를 건넬 예정이다.</html>",
			"<html>김윤아의 3집 [315360]속에는 그녀 개인의, 그녀를 둘러싼 사람들의, <br>"
			+ "그녀를 행복하게 하고 절망케 하는 사회에 대한 시선이 포괄적으로 담겨져 있다. <br>"
			+ "그래서 이번 김윤아의 앨범은 결코 하나의 음악적 카테고리에 머물지 않고 <br>"
			+ "그녀의 몸과 마음이 바라보고 머무르는 곳의 이미지를 오선지 위에 그려내었다. <br>"
			+ "이 음반을 듣는 이가 여자라면 그 진솔함에 깜짝 놀랄 것이며, <br>"
			+ "그 솔직함을 홀로 듣는 자신을 자랑스러워 할 정도로 김윤아의 일상을 함께 공유하는 뿌듯함마저 생길 것이다. </html>", 
			"<html>이번 앨범에는 타이틀 곡 ‘불티 (Spark)’를 비롯한 신곡 10곡과 <br>"
			+ "음반에만 추가 수록되는 싱글 발표곡 ‘사계 (Four Seasons)’, ‘Blue’까지 총 12곡이 수록되어 있으며, <br>"
			+ "앨범명 ‘Purpose’는 태연에게 음악이 가장 중요한 삶의 방향성이자 목표 중 하나라는 의미를 담아, <br>"
			+ "태연의 깊은 음악 감성과 풍성한 보컬 매력을 만나기에 충분하다.</html>",
			"<html>이번 앨범은 19살부터 23살까지 제 생각과 고민, 추억들이 담겨있어요. <br>"
			+ "정확한 주소가 있진 않았지만 꾸준히 제 마음을 곡에 담아 부치곤 했는데, <br>"
			+ "이제 여러분들에게 정말로 보낼 수 있게 되어 기쁘네요! <br>"
			+ "그 동안 저의 성장을 지켜봐 주시고 애정해주신 분들께 감사하는 마음을 담았습니다.<br>"
			+ "사랑을 담아, 예린 올림.</html>",
			"<html>2016 선댄스(Sundance) 영화제 개봉작<br>"
			+ "80년대를 배경으로 한 아일랜드 소년들의 음악 성장기<br>"
			+ "'듀란 듀란', '홀 앤 오츠', '더 큐어', '더 잼' 등 80년대를 풍미한 록 밴드들의 향연</html>",
			"<html>2016 데뷔 EP [Sweet FA]를 발매한 캐나다 밴쿠버 출신의 인디 밴드 피치 핏은 <br>"
			+ "베이시스트 피터 윌튼(Peter Wilton), 기타리스트 크리스토퍼 밴더쿠이(Chris Vanderkooy), <br>"
			+ "드러머 마이키 파스쿠찌(Mikey Pascuzzi), <br>"
			+ "그리고 보컬이자 기타리트스 네일 스미스(Neil Smith)로 구성된 실력파 인디 밴드다.</html>",
			"정보 없음", "<html>뉴욕 브루클린을 거점으로 활동하고 있는 드림 팝 밴드 배리(Barrie)는 <br>"
					+ "밴드의 보컬이자 홍일점 배리 린제이(BarrieLindsay)를 중심으로 <br>"
					+ "볼티모어, 보스턴, 런던, 그리고 브라질 등 다양한 출신지의 멤버들로 구성되어 있다.<br>"
					+ "감미로운 여성 보컬에 멜랑꼴리한 멜로디, 일본의 시티팝과 80년대의 레트로 사운드를 곁들인 인디 팝 사운드로 음악 씬에 신선한 바람을 일으키고 있다. </html>",
			 "정보 없음",
			"<html>90년대 R&B를 연상시키는 달달한 멜로디와 J Dilla의 영향이 담긴 소울풀한 그루브로 채워진 <br>"
			+ "본 EP [Drive Slow]는 Billboard가 선정한 올해의 R&B 앨범 리스트에 이름을 올리며 <br>"
			+ "Mac Ayres의 화려한 데뷔를 알리기도 했다. <br>"
			+ "국내 아티스트들의 커버로 화제가 됐던 첫 타이틀곡 “Easy”를 포함하여 “Calvin’s Joint”와 <br>"
			+ "“Slow Down” 등의 트랙에서 느껴지는 감미로운 바이브를 타보는 것도 그의 감각을 고스란히 느낄 수 있는 방법.</html>"
			};
	GridBagLayout Gbag = new GridBagLayout();
	GridBagConstraints gb;
	Font font1 = new Font("a시네마L", Font.BOLD, 20);
	Font font2 = new Font("a시네마L", Font.BOLD, 18);
	Font font3 = new Font("a시네마L", Font.PLAIN, 15);
	
	public music_tab1(int num) {
		super.setLayout(new BorderLayout(0,0));
		p1 = new JPanel();
		p1.setLayout(Gbag);
	
		Singer = new ImageIcon("image/music_singer"+num+".jpg");
		Singer = imageSize(Singer, 100,150);
		
		s_name = new JLabel(Singer_name[num], Singer, JLabel.CENTER);
		s_name = setLabel(s_name);
		finfo = new JLabel(info1[num]);
		finfo.setFont(font1);
		finfo.setHorizontalAlignment(JLabel.CENTER);
		sinfo = new JLabel(info2[num]);
		sinfo.setFont(font2);
		sinfo.setHorizontalAlignment(JLabel.CENTER);
		info = new JLabel(song_info[num]);
		info.setFont(font3);
		
		Layout(s_name, 0, 0, 1, 3);
		Layout(finfo, 1, 0, 2, 1);
		Layout(sinfo, 1, 1, 2, 1 );
		Layout(info, 1, 2, 2, 1);
			
		add("Center",p1);
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