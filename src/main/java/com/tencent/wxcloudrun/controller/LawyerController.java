package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.entity.Lawyer;
import com.tencent.wxcloudrun.service.LawyerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value="/lawyer")
public class LawyerController {
    @Resource
    private LawyerService lawyerService;

    @GetMapping(value = "/getLawyer")
    public List<Lawyer> getLawyer(){
        return lawyerService.getLawyer();
    }

    @GetMapping(value = "/updateLawyer")
    public List<Lawyer> updateLawyer(Integer lastId){
        return lawyerService.updateLawyer(lastId);
    }

    @GetMapping(value = "/getLawyerById")
    public List<Lawyer> getLawyerById(Integer id){
        return lawyerService.getLawyerById(id);
    }

    @GetMapping(value = "/changeLawyer")
    public void changeLawyer(Integer id,String name,String sex,String phone,String email,String introduce,String avatar){
        lawyerService.changeLawyer(id,name,sex,phone,email,introduce,avatar);
    }

    @GetMapping(value = "/deleteLawyer")
    public void deleteLawyer(Integer id){
        lawyerService.deleteLawyer(id);
    }

    @GetMapping(value = "addLawyer")
    public void addLawyer(String name,String sex,String phone,String email,String introduce,String avatar){
        lawyerService.addLawyer(name,sex,phone,email,introduce,avatar);
    }
}
