import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class movie_tab1_1 extends JPanel {
	JPanel p1;
	ImageIcon Director, actor1, actor2, actor3, actor4;
	JLabel d_name, a1_name, a2_name, a3_name, a4_name;
	Font font3 = new Font("a시네마L", Font.PLAIN, 15);
	String[] director_name = {"이석근", "김보라","강형철","이재한", "김성훈", "봉준호", 
			"롭 라이너","스티븐 크보스키", "키넌 웨이언스", "주걸륜", "조지 밀러", "아리 에스터",
			"김종관", "윤가은", "김성호", "민규동", "오승옥", "이경미", "피트 닥터", "루시아 애니엘로", "토니 케이", "에드가 라이트", "바란 보 오다르"};
	
	String[] actor1_name = {"환승희 : 박보영", "은희 : 박지후", "임나미 : 심은경", "철수 : 정우성", "고건수 : 이선균", "박두만 : 송강호", 
			"줄리 : 매들린 캐롤", "샘 : 엠마 왓슨", "케빈 : 숀 웨이언스", "상륜 : 주걸륜", "맥스 : 톰 하디", "애니 : 토니 콜렛",
			"은희 : 한예리", "선 : 최수인", "지소 : 이레", "문정숙 : 김희애", "김혜경 : 전도연", "김연홍 : 손예진", 
			"조 가드너 : 제이미 폭스", "메이슨 : 엘라 콜트레인", "제스 : 스칼렛 요한슨", "헨리 : 애드리언 브로디", "베이비 : 안셀 엘고트", "벤야민 : 톰 쉴링"};
	String[] actor2_name = {"황우영 : 김영광", "영지 : 김새벽", "하춘화 : 강소라", "수진 : 손예진", "박창민 : 조진웅", "서태윤 : 김상경", 
			"브라이스 : 캘런 맥오리피", "찰리 : 로건 레먼", "마커스 : 말론 웨이언스", "샤오위 : 계륜미", "퓨리오사 : 샤를리즈 테론", "찰리 : 밀리 샤피로",
			"료헤이 : 이와세 료", "지아 : 설혜인", "채랑 : 이지원", "배정길 : 김해숙", "정재곤 : 김남길", "김종찬 : 김주혁",
			"22 : 티나 페이", "아빠 : 에단 호크", "케이트 맥키넌", "캐롤 : 마샤 게이 하든", "박사 : 케빈 스페이시", "막스 : 엘리아스 므바렉"};
	String[] actor3_name = {"옥근남 : 강기영", "아빠 : 정인기", "김장미 : 김민영", "서영민 : 백종학", "반장 : 신정근", "조용구 : 김뢰하", 
			"쳇 : 존 마호니", "패트릭 : 에즈라 밀러", "제이미 킹", "청의 : 증개현", "눅스 : 니콜라스 홀트", "스티브 : 가브리엘 번",
			"현오 : 권율", "보라 : 이서연", "지석 : 홍은택", "박순녀 : 예수정", "박준길 : 박성웅", "최미옥 : 김소희",
			"파울 : 다비드 딕스", "엄마 : 패트리샤 아퀘트", "앨리스 : 질리언 벨", "사라 : 크리스티나 헨드릭스", "데보라 : 릴리 제임스", "스테판 : 보탄 모링"};
	String[] actor4_name = {"구공자 : 고규필", "대훈 : 손상연", "황진희 : 박진주", "정안나 : 이선진", "최형사 : 정만식", "반장 : 송재호", 
			"스티븐 : 안소니 에드워즈", "캔디스 : 니나 도브레브", "반장 : 프랭키 페이슨", "샹륜 부 : 황추생", "임모탄 : 휴 키스", "피터 : 일렉스 울프",
			"현경 : 최유화", "윤 : 강민준", "노부인 : 김혜자", "서귀순 : 문숙", "문기범 : 곽도원", "손소라 : 최유화"
			, "사만다 : 로렐라이", "프랭키 : 일래너 글레이저", "닥터 도리스 : 루시 리우", "달링 : 에이사 곤잘레스", "파울 : 안톤 주니어"};
	
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
		
		d_name = new JLabel("감독 "+ director_name[num], Director, JLabel.CENTER);
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