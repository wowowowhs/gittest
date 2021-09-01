package com.alan.springbootmybatis.dao;

import java.util.List;

import com.alan.springbootmybatis.entity.Person;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author alan
 * @since 2021-07-21
 */
@Mapper
public interface PersonDao extends BaseMapper<Person> {

    /**
     * 返回所有用户的信息
     * @return
     */
    List<Person> getAllPerson();

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    Person getPersonById(Integer id);

}
