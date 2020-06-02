package com.ch.note.service.impl;

import com.ch.note.bean.NoteList;
import com.ch.note.repository.NoteListDao;
import com.ch.note.service.NoteListService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
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
    @Value("${file.path}")
    private String filePath;
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
        MultipartFile file = noteList.getFile();
        if (file.isEmpty()) {
            throw new RuntimeException("upload error");
        }
        String fileName = file.getOriginalFilename();
        String path = filePath + fileName;
        File dest = new File(path);
        if(!dest.getParentFile().exists()){    //判断服务器当前路径文件夹是否存在
            dest.getParentFile().mkdirs();    //不存在则创建文件夹
        }
        try {
            file.transferTo(dest);
            System.out.println("文件上传成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

        noteListDao.insert(noteList);
    }
}
