package com.alan.springbootmybatis.common;

import java.util.List;

import com.alan.springbootmybatis.entity.Person;

/**
 * @author alanwu
 */
public class PersonResult extends CommonResult{

    private Object result;

    @Override
    public Object getResult() {
        return result;
    }

    @Override
    public void setResult(Object result) {
        this.result = result;
    }

    //    private List<Person> result;
//
//    public List<Person> getResult() {
//        return result;
//    }
//
//    public void setResult(List<Person> result) {
//        this.result = result;
//    }


}
