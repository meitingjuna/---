package cn.ucai.fulicenter.bean;

/**
 * Created by MTJ on 2017/1/9.
 */

public class BoutiqueBean {

    /**
     * id : 263
     * title : 七分养三分妆，轻松打造氧气美女
     * description : 一支韩束红BB，一抹即刻隐形，萌到恰到好处！
     * name : 焕亮肤色同时绽放立体脸部轮廓。
     * imageurl : cat_image/boutique2.png
     */

    private int id;
    private String title;
    private String description;
    private String name;
    private String imageurl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public BoutiqueBean(int id, String title, String description, String name, String imageurl) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.name = name;
        this.imageurl = imageurl;
    }

    @Override
    public String toString() {
        return "BoutiqueBean{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", imageurl='" + imageurl + '\'' +
                '}';
    }
}
