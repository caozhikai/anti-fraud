package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.entity.Lawyer;
import org.springframework.web.bind.annotation.RequestParam;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface LawyerMapper extends Mapper<Lawyer> {
    List<Lawyer> getLawyer();

    List<Lawyer> updateLawyer(@RequestParam("lastId") Integer lastId);

    List<Lawyer> getLawyerById(@RequestParam("id") Integer id);
}
