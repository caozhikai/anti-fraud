package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.dao.LawyerMapper;
import com.tencent.wxcloudrun.entity.Lawyer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LawyerService {
    @Resource
    private LawyerMapper lawyerMapper;
    public List<Lawyer> getLawyer() {
        return lawyerMapper.getLawyer();
    }

    public List<Lawyer> updateLawyer(Integer lastId) {
        return lawyerMapper.updateLawyer(lastId);
    }

    public List<Lawyer> getLawyerById(Integer id) {
        return lawyerMapper.getLawyerById(id);
    }
}
