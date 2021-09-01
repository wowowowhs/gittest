package com.alan.springbootmybatis.serviceImpl;
//测试同时提交两个文件serviceimpl，local_master commit to remote_dev-alan
import java.util.List;

import com.alan.springbootmybatis.common.CommonResult;
import com.alan.springbootmybatis.entity.Person;
import com.alan.springbootmybatis.dao.PersonDao;
import com.alan.springbootmybatis.service.PersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author alan
 * @since 2021-07-21
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonDao, Person> implements PersonService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private PersonDao personDao;

    @Override
    public CommonResult getAllPerson() {

        List<Person> allPerson =  personDao.getAllPerson();
        CommonResult commonResult = new CommonResult();
        if(allPerson!=null){
            commonResult.setCode("0");
            commonResult.setMsg("success");
        }else {
            commonResult.setCode("1");
            commonResult.setMsg("fail");
        }
        commonResult.setResult(allPerson);
        return commonResult;
    }

    @Override
    public CommonResult getPersonByIdS(Integer id) {
        Person person = personDao.getPersonById(id);
        CommonResult commonResult = new CommonResult();
        if(person!=null){
            commonResult.setCode("0");
            commonResult.setMsg("success");
        }else {
            commonResult.setCode("1");
            commonResult.setMsg("fail");
        }
        commonResult.setResult(person);
        return commonResult;
    }


}
