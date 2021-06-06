package Final;

public class ResultList {
    private String placeName;
    private String placeImage;
    private String TimeWeek;
    private String TimeWeekEnd;
    private String PriceChild;
    private String PriceAdult;
    private String Location;

    public String getPlaceName() {
        return placeName;
    }
    public String getPlaceImage(){
        return placeImage;
    }

    public String getTimeWeek(){
        return TimeWeek;
    }

    public String getTimeWeekEnd(){
        return TimeWeekEnd;
    }

    public String getPriceChild(){
        return PriceChild;
    }

    public String getPriceAdult(){
        return PriceAdult;
    }
    public String getLocation() {
        return Location;
    }


    public ResultList(String placeName, String placeImage, String TimeWeek, String TimeWeekEnd, String PriceChild, String PriceAdult, String Location) {
        this.placeName=placeName;
        this.placeImage = placeImage;
        this.TimeWeek = TimeWeek;
        this.TimeWeekEnd = TimeWeekEnd;
        this.PriceChild = PriceChild;
        this.PriceAdult = PriceAdult;
        this.Location=Location;
    }
}
