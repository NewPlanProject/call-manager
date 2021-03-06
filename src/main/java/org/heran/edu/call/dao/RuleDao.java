package org.heran.edu.call.dao;

import org.citic.iiot.app.core.mybaits.MapperDaoTemplate;
import org.heran.edu.call.domain.Rule;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleDao extends MapperDaoTemplate<Rule> {

    @Autowired
    public RuleDao(SqlSessionTemplate sqlSessionTemplate){
        super(sqlSessionTemplate);
    }

}
