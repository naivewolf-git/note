package com.ch.note.controller;

import com.ch.note.bean.Catalogue;
import com.ch.note.service.CatalogueService;
import com.ch.note.service.NoteListService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *
 * </p>
 *
 * @author ddyang
 * @date 2020/05/31
 */
@RestController
public class CatalogueController {
    @Resource
    private CatalogueService catalogueService;
    @Resource
    private NoteListService noteListService;

    @RequestMapping("/queryCatalogue")
    public Object queryCatalogue() {
        return catalogueService.queryCatalogue();
    }

    @RequestMapping("/queryCatalogueById")
    public Object queryCatalogueById(int id) {
        return catalogueService.queryCatalogueById(id);
    }

    @RequestMapping("/saveCatalogue")
    public void saveCatalogue(Catalogue catalogue) {
        catalogueService.saveCatalogue(catalogue);
    }
}
