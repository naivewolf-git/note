package com.ch.note.controller;

import com.ch.note.bean.NoteList;
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
public class NoteListController {
    @Resource
    private NoteListService noteListService;

    @RequestMapping("/queryList")
    public Object queryList() {
        return noteListService.queryList();
    }

    @RequestMapping("/queryListById")
    public Object queryListById(int id) {
        return noteListService.queryListById(id);
    }

    @RequestMapping("/saveNoteList")
    public void saveNoteList(NoteList noteList) {
        noteListService.saveNoteList(noteList);
    }
}
