package com.ch.note.repository;

import com.ch.note.bean.Catalogue;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* 目录表(Catalogue)表Mapper类
*
* @author Mr.Wang
* @version 1.0
* @since 2020/5/31 23:45
*/
@Repository
public interface CatalogueDao {

    List<Catalogue> selectAll();

    Catalogue selectById(int id);

    void insert(Catalogue catalogue);
}
