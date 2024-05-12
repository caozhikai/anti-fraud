package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.dao.InfoMapper;
import com.tencent.wxcloudrun.entity.Info;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class InfoService {
    @Resource
    private InfoMapper infoMapper;

    public List<Info> getInfo(Integer type) {
        return infoMapper.getInfo(type);
    }
    public List<Info> updateInfo(Integer lastId,Integer type){
        return infoMapper.updateInfo(lastId,type);
    }

    public List<Info> getInfoById(Integer id) {
        return infoMapper.getInfoById(id);
    }

    public List<Info> getCollection(Integer user_id) {
        return infoMapper.getCollection(user_id);
    }

    public List<Info> ifInCollection(Integer user_id, Integer info_id) {
        return infoMapper.ifInCollection(user_id,info_id);
    }

    public void collect(Integer user_id, Integer info_id) {
        infoMapper.collect(user_id,info_id);
    }

    public void unCollect(Integer user_id, Integer info_id) {
        infoMapper.unCollect(user_id,info_id);
    }

    public List<Info> searchInfo(String index) {
        index = "%" + index + "%";
        return infoMapper.searchInfo(index);
    }

    public void changeInfo(Integer id, String title, String time, Integer type, String index) {
        infoMapper.changeInfo(id,title,time,type,index);
    }

    public void addInfo(String title, String time, Integer type, String index) {
        infoMapper.addInfo(title,time,type,index);
    }

    public void deleteInfo(Integer id) {
        infoMapper.deleteInfo(id);
    }
}
