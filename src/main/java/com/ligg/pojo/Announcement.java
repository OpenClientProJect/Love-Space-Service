package com.ligg.pojo;


import lombok.*;


@Setter
@Getter
public class Announcement {
    private Integer announcement_id;
    private String title;
    private String text;
    private String imageUrl;// 封面图片地址
    private String videoUrl;// 视频地址

}
