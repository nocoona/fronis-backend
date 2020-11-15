package ch.fronis.model.image;

import java.io.Serializable;

public class Image implements Serializable {

    private String data;

    public static Image from(String data) {
        var image = new Image();
        image.setData(data);
        return image;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}