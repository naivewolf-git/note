package com.ch.note.service;

import com.ch.note.bean.Catalogue;

import java.util.List;

/**
* 目录表(Catalogue)表服务类
*
* @author Mr.Wang
* @version 1.0
* @since 2020/5/31 23:45
*/
public interface CatalogueService {

    List<Catalogue> queryCatalogue();

    Catalogue queryCatalogueById(int id);

    void saveCatalogue(Catalogue catalogue);
}
