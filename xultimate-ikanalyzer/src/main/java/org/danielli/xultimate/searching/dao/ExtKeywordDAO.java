package org.danielli.xultimate.searching.dao;

import java.util.List;

import org.danielli.xultimate.orm.mybatis.MyBatisRepository;

@MyBatisRepository
public interface ExtKeywordDAO {
	
	List<String> find(Integer offset, Integer rows);
}
