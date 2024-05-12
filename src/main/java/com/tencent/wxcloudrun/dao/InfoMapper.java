package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.entity.Info;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestParam;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@Repository
public interface InfoMapper extends Mapper<Info> {
    //@Select("select * from info")
    List<Info> getInfo(@Param("type") Integer type);
    List<Info> updateInfo(@RequestParam("lastId") Integer lastId,@RequestParam("type") Integer type);
    List<Info> getInfoById(@RequestParam("id") Integer id);
    List<Info> getCollection(@RequestParam("user_id") Integer user_id);

    List<Info> ifInCollection(@RequestParam("user_id") Integer user_id, @RequestParam("info_id") Integer info_id);

    void collect(@RequestParam("user_id") Integer user_id, @RequestParam("info_id") Integer info_id);

    void unCollect(@RequestParam("user_id") Integer user_id, @RequestParam("info_id") Integer info_id);

    List<Info> searchInfo(@RequestParam("index") String index);

    void changeInfo(@RequestParam("id") Integer id, @RequestParam("title") String title, @RequestParam("time") String time, @RequestParam("type") Integer type, @RequestParam("index") String index);

    void addInfo(@RequestParam("title") String title, @RequestParam("time") String time, @RequestParam("type") Integer type, @RequestParam("index") String index);

    void deleteInfo(@RequestParam("id") Integer id);
}
