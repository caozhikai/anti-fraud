package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.entity.Lawyer;
import org.springframework.web.bind.annotation.RequestParam;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface LawyerMapper extends Mapper<Lawyer> {
    List<Lawyer> getLawyer();

    List<Lawyer> updateLawyer(@RequestParam("lastId") Integer lastId);

    List<Lawyer> getLawyerById(@RequestParam("id") Integer id);

    void changeLawyer(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("sex") String sex,@RequestParam("phone") String phone, @RequestParam("email") String email, @RequestParam("introduce") String introduce, @RequestParam("avatar") String avatar);

    void deleteLawyer(@RequestParam("id") Integer id);

    void addLawyer(@RequestParam("name") String name, @RequestParam("sex") String sex,@RequestParam("phone") String phone, @RequestParam("email") String email, @RequestParam("introduce") String introduce, @RequestParam("avatar") String avatar);
}
