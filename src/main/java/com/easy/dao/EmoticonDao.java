package com.easy.dao;

import com.easy.model.Emoticon;
import com.easy.mybatis.CrudMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface EmoticonDao extends CrudMapper<Emoticon> {

}
