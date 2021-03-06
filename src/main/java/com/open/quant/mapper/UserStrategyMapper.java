package com.open.quant.mapper;

import com.open.quant.domain.beans.UserStrategy;
import com.open.quant.domain.query.UserStrategyQuery;

import java.util.List;

/**
 * Created by yonggangli on 2016/8/24.
 */
public interface UserStrategyMapper {

    int queryUserStrategyTotalRows(UserStrategyQuery userStrategyQuery);

    List<UserStrategy> queryUserStrategyNameList(UserStrategyQuery userStrategyQuery);

    UserStrategy queryUserStrategyById(int id);

    UserStrategy queryUserStrategy(UserStrategyQuery userStrategyQuery);

    UserStrategy queryUserStrategyByName(UserStrategy userStrategy);

    int insertUserStrategy(UserStrategy userStrategy);

    int deleteUserStrategyById(int id);

    int updateUserStrategyById(UserStrategy userStrategy);

    int updateUserStrategyConditionById(UserStrategy userStrategy);

}
