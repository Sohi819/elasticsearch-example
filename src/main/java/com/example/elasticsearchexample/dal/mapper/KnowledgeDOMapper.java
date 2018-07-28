package com.example.elasticsearchexample.dal.mapper;

import com.example.elasticsearchexample.dal.dataobject.KnowledgeDO;
import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface KnowledgeDOMapper {

    Long insert(KnowledgeDO entity);

    Long update(KnowledgeDO entity);

    Long deleteByPrimary(Integer id);

    KnowledgeDO getByPrimary(Integer id);
}
