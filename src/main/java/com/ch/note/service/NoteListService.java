package com.ch.note.service;

import com.ch.note.bean.NoteList;

import java.util.List;

/**
* 列表(List)表服务类
*
* @author Mr.Wang
* @version 1.0
* @since 2020/5/31 23:47
*/
public interface NoteListService {

    List<NoteList> queryList();

    NoteList queryListById(int id);

    void saveNoteList(NoteList noteList);
}
