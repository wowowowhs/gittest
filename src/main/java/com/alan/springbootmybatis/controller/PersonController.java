package com.alan.springbootmybatis.controller;


import java.util.List;

import com.alan.springbootmybatis.common.CommonResult;
import com.alan.springbootmybatis.common.PersonResult;
import com.alan.springbootmybatis.entity.Person;
import com.alan.springbootmybatis.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author alan
 * @since 2021-07-21
 */
@RestController
@RequestMapping("/person")
@Slf4j
public class PersonController {

//    private final static Logger logger = LoggerFactory.getLogger(PersonController.class);   //可直接在类上加上注解：@Slf4j，代替这一句

    @Autowired
    private PersonService personService;

    @RequestMapping("/getAll")
    public CommonResult getAllPerson(){

        log.info("获取所有用户的信息  @Slf4j");
        return personService.getAllPerson();
    }

    @RequestMapping("/getPersonById")
    public CommonResult getPersonById(Integer id){
        log.info("查询用户id为"+id+"的信息");
        //git commit test
        int a = 3;
        int b = 0;

        int c = 0;

        try {
            c = a/b;
        }catch (Exception e){
            log.error("b = 0"+e);
            throw e;
        }

        return personService.getPersonByIdS(id);
    }

}
