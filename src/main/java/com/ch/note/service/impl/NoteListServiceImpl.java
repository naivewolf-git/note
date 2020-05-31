package com.ch.note.service.impl;

import com.ch.note.bean.NoteList;
import com.ch.note.repository.NoteListDao;
import com.ch.note.service.NoteListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* 列表(List)表服务实现类
*
* @author Mr.Wang
* @version 1.0
* @since 2020/5/31 23:47
*/
@Service("listService")
public class NoteListServiceImpl implements NoteListService {
    /**
     * 列表Mapper
     */
    @Resource
    private NoteListDao noteListDao;

    @Override
    public List<NoteList> queryList() {
        return noteListDao.selectAll();
    }

    @Override
    public NoteList queryListById(int id) {
        return noteListDao.selectById(id);
    }

    @Override
    public void saveNoteList(NoteList noteList) {
        noteListDao.insert(noteList);
    }
}
