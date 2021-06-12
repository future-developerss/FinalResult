import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Dictionary;

public class PracFrame extends JFrame {
    JPanel p1, p2, bottom, contentPane;
    RoundButton calculatorB, before, main;
    JButton mapB;
    JLabel location, title, subtitle;
    JTabbedPane tab;
    private Image placeImage;

    ArrayList<ResultList> resultList=new ArrayList<>();
    ArrayList<RecommendList> recoList=new ArrayList<>();
    ArrayList<PlaceLinkList> linkList=new ArrayList<>();
    ArrayList<Integer> finalLi=new ArrayList<>();
    Font fontName = new Font("a시네마L", Font.PLAIN, 25);

    Font font = new Font("a시네마L", Font.PLAIN, 45);
    Font font1 = new Font("a시네마L", Font.PLAIN, 25);
    Font fontLocation = new Font("a시네마L", Font.PLAIN, 15);

    String PlaceName, TimeWeek, TimeWeekEnd, PriceChild, PriceAdult, Location, imageString;
    String Point, Activity, Activity2, Other1, Other2, Other3;
    String Link;
    String username;

    int page_index=0;

    public PracFrame(ArrayList<Integer> threeLi, String InputName)
    {
        username=InputName;
        setTitle(username+"를 위한 추천.");
        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout(0,0));
        setContentPane(contentPane);

        p1 = new JPanel();
        p1.setLayout(new GridLayout(2,1, 10, 7));

        title = new JLabel(username+"의 오늘의 장소를 추천해드립니다.");
        title.setBorder(BorderFactory.createEmptyBorder(30 , 0 , 0 , 0));
        subtitle = new JLabel("당신을 위한, 오늘의 최적 장소 추천은 다음과 같습니다.");
        title.setHorizontalAlignment(JLabel.CENTER);
        subtitle.setHorizontalAlignment(JLabel.CENTER);
        p1.add(title);
        p1.add(subtitle);
        title.setFont(font);
        subtitle.setFont(font1);
        contentPane.add("North", p1);

        int i;
        for (i=0; i<3; i++){
            page_index=page_index+threeLi.get(i);
        }
        resultList.add(new ResultList("코엑스 아쿠아리움","images/place_aqua.jpg", "10:00 A.M.", "6:00 P.M.", "22,000", "28,000", "서울특별시 강남구 영동대로 513 코엑스 아쿠아리움"));
        resultList.add(new ResultList("롯데월드타워","images/lotte_after.jpg", "11:00 A.M.", "22:00 P.M.", "24,000", "27,000", "서울특별시 송파구 잠실6동 올림픽로 300"));
        resultList.add(new ResultList("경복궁","images/palace.png", "9:00 A.M.", "6:00 P.M.", "1,500", "3,000", "대한민국 서울특별시 종로구 사직로 161"));
        resultList.add(new ResultList("여의도 한강공원","images/lake.png", "12:00 A.M.", "12:00 A.M.", "0", "0", "서울특별시 영등포구 여의도동 여의동로 330"));

        resultList.add(new ResultList("아쿠아플라넷 일산","images/aqua2.jpeg", "10:00 A.M.", "6:30 P.M.", "23,000", "25,000", "경기도 고양시 일산서구 대화동 한류월드로 282 KR"));
        resultList.add(new ResultList("방탈출 카페","images/escapeRoom.jpg", "10:30 A.M.", "12:00 A.M.", "19,000", "19,000", "경기도 성남시 분당구 서현로210번길 17 KR"));
        resultList.add(new ResultList("행주산성","images/sansung.jpg", "9:00 A.M.", "6:00 P.M.", "0", "0", "경기도 고양시 덕양구 행주동 행주로15번길 89"));
        resultList.add(new ResultList("에버랜드","images/everland.jpg", "10:00 A.M.", "9:00 P.M.", "47,000", "60,000", "경기도 용인시 처인구 포곡읍 에버랜드로 199"));

        resultList.add(new ResultList("국립중앙과학관","images/science.jpg", "9:30 A.M.", "5:50 P.M.", "1,000", "2,000", "대전광역시 유성구 대덕대로 481 국립중앙과학관"));
        resultList.add(new ResultList("한밭수목원","images/garden.jpg", "9:00 A.M.", "6:00 P.M.", "0", "0", "대전 서구 둔산대로 169 "));
        resultList.add(new ResultList("에당호 출렁다리","images/bridge.jpg", "9:00 A.M.", "10:00 P.M.", "0", "0", "충청남도 예산군 응봉면 예당관광로 161"));
        resultList.add(new ResultList("전주 한옥마을","images/village.jpg", "12:00 A.M.", "12:00 A.M.", "2,000", "3,000", "전라북도 전주시 완산구 풍남동3가 기린대로 99"));

        resultList.add(new ResultList("","images/carbbean.jpg", "9:30 A.M.", "6:00 P.M.", "39,000", "50,000", "경기도 용인시 처인구 포곡읍 에버랜드로 199"));
        resultList.add(new ResultList("","images/skiResort.jpg", "9:00 A.M.", "5:00 P.M.", "70,000", "70,000", "강원도 평창군 대관령면 올림픽로 715"));

        recoList.add(new RecommendList("삼성역 옆 COEX 지하에 위치한 아쿠아리움으로전시 생물 650여 종</br>" +
                "4만여 마리를 보유하고 있다. '국내 최다 상어 서식지'라는 타이틀을 가지고 있으며, 아쿠아리움 간판 생물은 매너티와 모래뱀상어, 그리고 훔볼트펭귄이다.",
                "수중공연 관람하기", "몇몇 동물들의 먹이주기 프로그램과 큐레이터 해설 프로그램을 진행 ","롯데 타워", "일산 아쿠아플레닛", "국립 중앙 과학관"));
        recoList.add(new RecommendList("롯데 타워는 대한민국 최고층 건물이자, 세계에서 5번째로 높은 건물이다. " +
                "기네스 세계 기록에 오른 가장 높은 유리바닥 전망대인 스타이데크가 있다. 또한 여러 쇼핑몰과 면세점 그리고 식당들이 자리잡고 있다." ,
                "스카이 테레스", "스카이 셔틀","코엑스 아쿠아리움", "방탈출 카페", "한밭 수목공원"));
        recoList.add(new RecommendList("경복궁은 동서남북으로 4개의 대문들을 두고 남쪽으로 정전, 편전, 침전과 후원을, 그리고 동쪽으로 동궁과 자전, " +
                "서쪽으로 궐내각사와 경회루를 각각 배치하는 형태로 수십 채의 전각들이 건축되었다." ,
                "경회루 특별 관람", "역사 지식 습득하기","한강공원", "행주산성", "에당호 출렁다리"));
        recoList.add(new RecommendList("서울에서 야외활동을 자유롭게 즐길 수 있는 공원이다. 한가롭게 피크닉을 즐길 수도 있고 자전거 타기, " +
                "생태 프로그램 체험 등 다양한 동적인 활동들도 즐길 수 있다. 생태프로그램 게이트볼장 등은 무료이며 자전거는 대여료를 내고 대여하여 탈수 있다.",
                "자전거 타기", "피크닉 즐기기","경복궁", "에버랜드", "전주 한옥마을 "));

        recoList.add(new RecommendList("수도권 아쿠아리움 중 수족관 시설 면적이 가장 큰 아쿠아리움으로 한국에서는 드물게 바다코끼리 메리를 볼 수 있다. " +
                "메인 수조에서는 수중 퍼포먼스가 펼쳐진다. 수조 밖에 진행자와 수조 안에 다이버들이 물고기들과 함께 공연을 펼치는 것을 관람할 수 있다." ,
                "공연 관람", "바다 코끼리 구경","방탈출 카페", "코엑스 아쿠아리움", "국립중앙과학관"));
        recoList.add(new RecommendList("추리물의 인기에 힘입어 2010년대 중반 이후 번화가에 들어서고 있는 놀이 문화 공간 중 하나로 친구/가족/연인과 함께 두루두루 " +
                "재미있는 시간을 보내기 좋은 장소이다. (카페라지만 음료를 전문적으로 팔지는 않고, 60분 제한시간 안에 추리 및 단서 발견, 퍼즐을 푸는 게임으로 밀실을 탈출)" ,
                "방탈출 게임", "다른 방도 체험 해보기","일산 아쿠아플레닛", "한밭수목원", "롯데 타워"));
        recoList.add(new RecommendList("고양시 덕양구 행주로 15번길 89에 위치한 행주산성은 임진 왜란 3대 대첩의 하나인 행주대첩으로 유명한 곳이다. " +
                "역사공부와 함께 휴식을 즐기기에 알맞은 경기도의 관광 명소이다. 길을 따라 정상으로 올라가면 한강을 한눈에 볼 수 있는 전경이 펼쳐지기도 한다. ",
                "역사 공부", "한강 경관 즐기기","에버랜드", "경복궁", "에당호 출렁다리"));
        recoList.add(new RecommendList("하루동안 다양한 놀이기구를 타며 재미있는 시간을 보낼 수 있고 놀이기구 외에도 사파리, 공연 등을 즐길 수 있다. " +
                "앱을 깔면 실시간으로 놀이기구 대기 상황과 공연 시간대도 쉽게 확인할 수 있어 더 즐겁게 시간을 즐길 수도 있다." ,
                "공연 관람", "놀이기구 타기","행주 산성", "한강 공원", "전주 한옥마을"));

        recoList.add(new RecommendList("국립중앙과학관은 과거와 현재, 미래의 과학기술을 체험할 수 있는 곳이다. 우주의 시작부터 생명의 탄생과 진화 과정에 이르는 " +
                "신비로운 과학 이야기가 넘쳐나고, 인공지능과 5G 기술이 주도하는 4차 산업혁명 시대에 과학기술이 주는 감동을 온몸으로 느낄 수 있는 세계적 수준의 과학기술 문화공간이다.",
                "과학기술관 관람", "온라인 교육 받기","한밭 수목원", "일산 아쿠아플레닛", "코엑스 아쿠아리움"));
        recoList.add(new RecommendList("열대식물원은 우리나라에서 자생하기 어려운 식물을 한데 모아 기르고 관리하는 곳이다. 요즘 같은 계절에 쉬이 보기 어려운 " +
                "꽃도 구경하고 실내에서 재미있는 시간을 보낼 수 있다. 열대식물원 옆에 곤충생태관도 있다. 곤충에 대해 거부감이 많은 이들에게 친숙한 느낌을 제공하기 위해 노력하는 곳이다. " +
                "이곳에서는 곤충을 직접 만져볼 수도, 가까이에서 관찰할 수도 있다. ",
                "생태학교 체험", "곤충 관찰","국립중앙과학관", "방탈출 카페", "롯데 타워"));
        recoList.add(new RecommendList("140m 길이의 부잔교와 함께 아름다운 경관을 조성한다. 또한 하얗고 웅장한 출렁다리의 모습이 넓은 예당호와 함께 조성된 " +
                "예당호 조각공원과 어우려저 그 웅장함과 아름다움을 함께 감상할 수 있다. 호수에 설치된 가장 넓은 음악분수로 한국기록원 공식 기록에 올랐다. " +
                "‘한국관광공사 야간 관광 100선’에 오른 예당호출렁다리에 그러데이션 기법을 적용한 형형색색 LED 불빛을 이용한 공연이 20분간 진행된다." ,
                "음악 분수 공연", "부진교에서 경관 즐기기","전주 한옥마을", "행주산성", "경복궁"));
        recoList.add(new RecommendList("전주 풍남동 일대에 700여 채의 한옥이 군락을 이루고 있는 국내 최대 규모의 전통 한옥촌이며, 전국 유일의 도심 한옥군이다. 1910년 조성되기 " +
                "시작한 우리나라 근대 주거문화 발달과정의 중요한 공간으로, 경기전, 오목대, 향교 등 중요 문화재와 20여개의 문화시설이 산재되어 있는 여행지이다",
                "전통문화관 체험", "공예품 전시관 관람","에당호 출렁다리", "에버랜드", "한강공원"));

        linkList.add(new PlaceLinkList("https://www.google.co.kr/maps/place/%EC%BD%94%EC%97%91%EC%8A%A4+%EC%95%84%EC%BF%A0%EC%95%84%EB%A6%AC%EC%9B%80/@37.513131,127.056094,17z/data=!3m1!4b1!4m5!3m4!1s0x357ca46a4cb562ef:0x7b791e85aa0df16b!8m2!3d37.513131!4d127.0582827?hl=ko"));
        linkList.add(new PlaceLinkList("https://www.google.co.kr/maps/place/%EB%A1%AF%EB%8D%B0%EC%9B%94%EB%93%9C%ED%83%80%EC%9B%8C/@37.5124705,127.1001945,17z/data=!3m1!4b1!4m5!3m4!1s0x357ca50a915f665b:0xabeb10cd5efdfce2!8m2!3d37.5124705!4d127.1023832?hl=ko"));
        linkList.add(new PlaceLinkList("https://www.google.co.kr/maps/place/%EA%B2%BD%EB%B3%B5%EA%B6%81/@37.579617,126.9748523,17z/data=!3m1!4b1!4m5!3m4!1s0x357ca2c74aeddea1:0x8b3046532cc715f6!8m2!3d37.579617!4d126.977041?hl=ko"));
        linkList.add(new PlaceLinkList("https://www.google.co.kr/maps/place/%EC%97%AC%EC%9D%98%EB%8F%84%ED%95%9C%EA%B0%95%EA%B3%B5%EC%9B%90/@37.5284017,126.8642634,12z/data=!4m9!1m2!2m1!1z7ZWc6rCV6rO17JuQ!3m5!1s0x357c9f3b03c4b7ef:0xa4d8869ebf8d452c!8m2!3d37.5284017!4d126.9343012!15sCgztlZzqsJXqs7Xsm5BaHgoN7ZWc6rCVIOqzteybkCIN7ZWc6rCVIOqzteybkJIBBHBhcms?hl=ko"));

        linkList.add(new PlaceLinkList("https://www.google.co.kr/maps/place/%EC%95%84%EC%BF%A0%EC%95%84%ED%94%8C%EB%9D%BC%EB%84%B7+%EC%9D%BC%EC%82%B0/@37.6633991,126.7532923,17z/data=!3m1!4b1!4m5!3m4!1s0x357c8568d5f080b9:0x9dbf9cfdd8897f56!8m2!3d37.6633991!4d126.755481?hl=ko"));
        linkList.add(new PlaceLinkList("https://www.google.co.kr/maps/place/%EC%A0%9C%EB%A1%9C%EC%9B%94%EB%93%9C+%EB%B0%A9%ED%83%88%EC%B6%9C+%EC%B9%B4%ED%8E%98+%EC%84%9C%ED%98%84%EC%A0%90/@37.3854751,127.1224119,17z/data=!3m1!4b1!4m5!3m4!1s0x357b597659fbd91f:0x3a3e9409a105f7a4!8m2!3d37.3854751!4d127.1246006?hl=ko"));
        linkList.add(new PlaceLinkList("https://www.google.co.kr/maps/place/%ED%96%89%EC%A3%BC%EC%82%B0%EC%84%B1/@37.5998788,126.8225866,17z/data=!3m1!4b1!4m5!3m4!1s0x357c9b09fc193cfd:0x39a4c1019b970dc0!8m2!3d37.5998788!4d126.8247753?hl=ko"));
        linkList.add(new PlaceLinkList("https://www.google.co.kr/maps/search/%EC%97%90%EB%B2%84%EB%9E%9C%EB%93%9C/@37.4767326,126.7359086,10z/data=!3m1!4b1?hl=ko"));

        linkList.add(new PlaceLinkList("https://www.google.co.kr/maps/place/%EA%B5%AD%EB%A6%BD%EC%A4%91%EC%95%99%EA%B3%BC%ED%95%99%EA%B4%80/@36.3755897,127.0410397,9z/data=!4m9!1m2!2m1!1z6rWt66a97KSR7JWZ6rO87ZWZ6rSA!3m5!1s0x35654a2c305b6c75:0x6f9b1a8b9fa123b2!8m2!3d36.3755897!4d127.3766119!15sChXqta3rpr3spJHslZnqs7ztlZnqtIBaGSIX6rWt66a9IOykkeyVmSDqs7ztlZnqtICSAQ5zY2llbmNlX211c2V1bZoBI0NoWkRTVWhOTUc5blMwVkpRMEZuU1VSSmFYSllUVkJSRUFF?hl=ko"));
        linkList.add(new PlaceLinkList("https://www.google.co.kr/maps/place/%ED%95%9C%EB%B0%AD%EC%88%98%EB%AA%A9%EC%9B%90/@36.3656689,127.3856981,17z/data=!3m1!4b1!4m5!3m4!1s0x3565497f5d03e619:0xb3fc1a9c65052b0!8m2!3d36.3656689!4d127.3878868?hl=ko"));
        linkList.add(new PlaceLinkList("https://www.google.co.kr/maps/place/%EC%98%88%EB%8B%B9%ED%98%B8+%EC%B6%9C%EB%A0%81%EB%8B%A4%EB%A6%AC/@36.637816,126.798169,17z/data=!3m1!4b1!4m5!3m4!1s0x357aed67543ca353:0xbbf9b997559f49be!8m2!3d36.637816!4d126.8003577?hl=ko"));
        linkList.add(new PlaceLinkList("https://www.google.co.kr/maps/place/%EC%A0%84%EC%A3%BC+%ED%95%9C%EC%98%A5%EB%A7%88%EC%9D%84/@35.8134575,127.1510731,17z/data=!4m9!1m2!2m1!1z7KCE7KO8IO2VnOyYpeuniOydhA!3m5!1s0x3570236212eebd4b:0x8ef4be1bc6d0848e!8m2!3d35.8146929!4d127.1526346!15sChPsoITso7wg7ZWc7Jil66eI7J2EWhYiFOyghOyjvCDtlZzsmKUg66eI7J2EkgESdG91cmlzdF9hdHRyYWN0aW9u?hl=ko"));

        Link=linkList.get(page_index).getPlaceLink();

        p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.setLayout(null);
        PlaceName=resultList.get(page_index).getPlaceName();
        TimeWeek=resultList.get(page_index).getTimeWeek();
        TimeWeekEnd=resultList.get(page_index).getTimeWeekEnd();
        PriceChild=resultList.get(page_index).getPriceChild();
        PriceAdult=resultList.get(page_index).getPriceAdult();
        Location=resultList.get(page_index).getLocation();
        PlaceInfo info=new PlaceInfo(TimeWeek, TimeWeekEnd, PriceChild, PriceAdult);

        imageString=resultList.get(page_index).getPlaceImage();
        placeImage=new ImageIcon(imageString).getImage();

        Point=recoList.get(page_index).getPoint();
        Activity=recoList.get(page_index).getActivity();
        Activity2=recoList.get(page_index).getActivity2();
        Other1=recoList.get(page_index).getOther1();
        Other2=recoList.get(page_index).getOther2();
        Other3=recoList.get(page_index).getOther3();
        RecommendPoint recommend=new RecommendPoint(Point, Activity, Activity2);

        JLabel name=new JLabel(PlaceName);
        name.setHorizontalAlignment(JLabel.CENTER);
        p2.add(name);
        name.setBounds(80, 0, 580, 90);
        name.setFont(fontName);

        location=new JLabel("장소 위치: "+Location);
        location.setFont(fontLocation);
        p2.add(location);
        location.setBounds(710, 10, 700, 30);

        mapB=new JButton("지도 보기");
        mapB.addActionListener(new PracFrame.LinkListener());
        p2.add(mapB);
        mapB.setBounds(1200, 10, 100, 30);

        tab=new JTabbedPane();
        OtherRecommend otherReco=new OtherRecommend(Other1, Other2, Other3);
        otherReco.setBorder(BorderFactory.createEmptyBorder(15, 0, 15, 0));
        tab.addTab("장소 정보", info);
        tab.addTab("추천 Point", recommend);
        tab.addTab("다른 추천", otherReco);
        p2.add(tab);
        tab.setBounds(700, 90, 700, 400);

        contentPane.add("Center", p2);

        bottom = new JPanel();
        bottom.setLayout(new BorderLayout());
        main = new RoundButton("메인으로");	main.setBackground(new Color(102, 102, 102));
        main.addActionListener(new PracFrame.MyActionListener());

        JPanel calP=new JPanel();
        calculatorB = new RoundButton("계산기");
        calculatorB.setBackground(new Color(102, 102, 102));
        calculatorB.addActionListener(new PracFrame.MyActionListener());
        calP.add(calculatorB);
        before = new RoundButton("이전으로");	before.setBackground(new Color(102, 102, 102));
        before.addActionListener(new PracFrame.MyActionListener());

        bottom.add("East",main);
        bottom.add("Center",calP);
        bottom.add("West",before);
        bottom.setBorder(BorderFactory.createEmptyBorder(0 , 80 , 50 , 80));
        contentPane.add("South", bottom);
        finalLi.addAll(threeLi);

        setSize(1500,800);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(150, 200, 1350, 200);
        g.drawImage(placeImage, 80, 305, null);
    }
    class LinkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == mapB) {
                new PlaceSearchLink(Link);
            }
        }
    }
    private class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            JButton b=(JButton)e.getSource();
            if (b.getText().equals("이전으로")){
                finalLi.remove(finalLi.size()-1);
                new PlaceQ_3(finalLi, username);
                PracFrame.this.setVisible(false);
            }
            else if (b.getText().equals("계산기")){
                new Calculater("입장료 계산하기");
            }
            else if (b.getText().equals("메인으로")){
                new survey(username);
                PracFrame.this.setVisible(false);
            }
        }
    }
}
