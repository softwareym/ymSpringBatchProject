package ym.batch.job.apisample.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class ApiMapper {

    private final SqlSessionTemplate sqlSession;
    private final static String NAMESPACE = "ym.batch.job.repository.ApiMapper.";

    public ApiMapper(@Qualifier("sqlSession") SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public HashMap<String, Object> selectAllJobInstance() throws Exception{
        return sqlSession.selectOne(NAMESPACE+"selectAllJobInstance");
    }
}



