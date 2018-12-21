package com.easy.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "e_emoticon")
public class Emoticon {
    @Id
    @Column(name = "emoticon_id")
    private String emoticonId;

    private String imgUrl;

    public String getEmoticonId() {
        return emoticonId;
    }

    public void setEmoticonId(String emoticonId) {
        this.emoticonId = emoticonId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
