package Final;

public class RecommendList {
    private String Point;
    private String Activity;
    private String Activity2;
    private String Other1;
    private String Other2;
    private String Other3;

    public String getPoint() {
        return Point;
    }

    public String getActivity() {
        return Activity;
    }

    public String getActivity2() {
        return Activity2;
    }

    public String getOther1() {
        return Other1;
    }

    public String getOther2() {
        return Other2;
    }

    public String getOther3() {
        return Other3;
    }

    public RecommendList(String Point, String Activity, String Activity2, String Other1, String Other2, String Other3) {
        this.Point=Point;
        this.Activity=Activity;
        this.Activity2=Activity2;
        this.Other1=Other1;
        this.Other2=Other2;
        this.Other3=Other3;
    }
}
