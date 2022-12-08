package com.example.sampleweb.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Select;
@Repository
@Mapper
public interface HelloMapper {

	@Select("select 'HELLO' from dual")
	String getHello();
}
