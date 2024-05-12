package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.entity.Info;
import com.tencent.wxcloudrun.service.InfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/info")
public class InfoController {
    @Resource
    private InfoService infoService;

    @GetMapping(value = "/getInfo")
    public List<Info> getInfo(Integer type){
        System.out.println("----------------"+type);
        List<Info> list = infoService.getInfo(type);
        return list;
    }

    @GetMapping(value = "/updateInfo")
    public List<Info> updateInfo(Integer lastId, Integer type){
        List<Info> list = infoService.updateInfo(lastId,type);
        return list;
    }

    @GetMapping(value = "/getInfoById")
    public List<Info> getInfoById(Integer id){
        return infoService.getInfoById(id);
    }

    @GetMapping(value = "/getCollection")
    public List<Info> getCollection(Integer user_id){
        return infoService.getCollection(user_id);
    }

    @GetMapping(value = "/ifInCollection")
    public List<Info> ifInCollection(Integer user_id, Integer info_id){
        return infoService.ifInCollection(user_id,info_id);
    }

    @GetMapping(value = "/collect")
    public void collect(Integer user_id, Integer info_id){
        infoService.collect(user_id,info_id);
    }

    @GetMapping(value = "/unCollect")
    public void unCollect(Integer user_id,Integer info_id){
        infoService.unCollect(user_id,info_id);
    }

    @GetMapping(value = "/searchInfo")
    public List<Info> searchInfo(String index){
        return infoService.searchInfo(index);
    }

    @GetMapping(value = "/changeInfo")
    public void changeInfo(Integer id,String title,String time,Integer type,String index){
        infoService.changeInfo(id,title,time,type,index);
    }

    @GetMapping(value = "/addInfo")
    public void addInfo(String title,String time,Integer type,String index){
        infoService.addInfo(title,time,type,index);
    }

    @GetMapping(value = "/deleteInfo")
    public void deleteInfo(Integer id){
        infoService.deleteInfo(id);
    }
}
