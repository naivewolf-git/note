package com.ch.note.repository;

import com.ch.note.bean.NoteList;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* 列表(List)表Mapper类
*
* @author Mr.Wang
* @version 1.0
* @since 2020/5/31 23:47
*/
@Repository
public interface NoteListDao {

    NoteList selectById(int id);

    List<NoteList> selectAll();

    void insert(NoteList noteList);
}
