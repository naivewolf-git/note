package com.ch.note.bean;

import lombok.Data;

/**
 * 目录表(Catalogue)表实体类
 *
 * @author Mr.Wang
 * @version 1.0
 * @since 2020/5/31 23:45
 */
@Data
public class Catalogue {

    /**
     * 目录id
     */
    private Integer catalogueId;

    /**
     * 编号
     */
    private String number;

    /**
     * 名称
     */
    private String name;

    /**
     * 层级
     */
    private Integer level;

    /**
     * 图标路径
     */
    private String iconPath;
}
