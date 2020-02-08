package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

//リポジトリクラス。DBへ問合せする。
@Repository//CRUDを行う。
@Mapper//MyBatisをつかってORマッピングが使用可能になる。
public interface UserRepository {
	@Select("SELECT * FROM user WHERE id = #{id}")
	public UserEntity findOne(int id);

}