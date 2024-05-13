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

    public void changeLawyer(Integer id, String name, String sex, String phone, String email, String introduce, String avatar) {
        lawyerMapper.changeLawyer(id,name,sex,phone,email,introduce,avatar);
    }

    public void deleteLawyer(Integer id) {
        lawyerMapper.deleteLawyer(id);
    }

    public void addLawyer(String name, String sex, String phone, String email, String introduce, String avatar) {
        lawyerMapper.addLawyer(name,sex,phone,email,introduce,avatar);
    }
}
