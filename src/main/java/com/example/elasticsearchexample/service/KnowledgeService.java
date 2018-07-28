package com.example.elasticsearchexample.service;

import com.example.elasticsearchexample.service.model.KnowledgeReq;

/**
 * Created by liuzhuang on 2018/7/28.
 */
public interface KnowledgeService {

    void addKnowledge(KnowledgeReq knowledgeReq);

    void updateKnowledge(KnowledgeReq knowledgeReq);

    void deleteKnowledge(Integer id);
}
