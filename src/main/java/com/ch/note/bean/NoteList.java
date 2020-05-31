package com.ch.note.bean;

import lombok.Data;

import java.util.Date;

/**
 * 列表(List)表实体类
 *
 * @author Mr.Wang
 * @version 1.0
 * @since 2020/5/31 23:47
 */
@Data
public class NoteList {

    /**
     * 列表id
     */
    private Integer listId;

    /**
     * 目录id
     */
    private Integer catalogueId;

    /**
     * 日期
     */
    private Date noteDate;

    /**
     * 是否置顶，0：否，1：是
     */
    private int isTop;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 图片
     */
    private byte[] picture;

    /**
     * 文字
     */
    private String words;
}
