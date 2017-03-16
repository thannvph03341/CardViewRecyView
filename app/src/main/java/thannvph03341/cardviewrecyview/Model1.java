package thannvph03341.cardviewrecyview;

import java.io.Serializable;

/**
 * Created by Dominions on 14/2/2017.
 */

public class Model1 implements Serializable{
    String hotTen;
    Integer tuoi;

    public Model1(String hotTen, Integer tuoi) {
        this.hotTen = hotTen;
        this.tuoi = tuoi;
    }

    public String getHotTen() {
        return hotTen;
    }

    public void setHotTen(String hotTen) {
        this.hotTen = hotTen;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }
}
