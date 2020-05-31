package com.ch.note.service.impl;

import com.ch.note.bean.Catalogue;
import com.ch.note.repository.CatalogueDao;
import com.ch.note.service.CatalogueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* 目录表(Catalogue)表服务实现类
*
* @author Mr.Wang
* @version 1.0
* @since 2020/5/31 23:45
*/
@Service("catalogueService")
public class CatalogueServiceImpl implements CatalogueService {
    /**
     * 目录表Mapper
     */
    @Resource
    private CatalogueDao catalogueDao;

    @Override
    public List<Catalogue> queryCatalogue() {
        return catalogueDao.selectAll();
    }

    @Override
    public Catalogue queryCatalogueById(int id) {
        return catalogueDao.selectById(id);
    }

    @Override
    public void saveCatalogue(Catalogue catalogue) {
        catalogueDao.insert(catalogue);
    }
}
