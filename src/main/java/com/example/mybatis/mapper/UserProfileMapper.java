package com.example.mybatis.mapper;

import com.example.mybatis.model.UserProfile;
import org.apache.ibatis.annotations.*;


import java.util.List;

@Mapper
public interface UserProfileMapper {

    @Select("SELECT * FROM UserProfile WHERE id=#{id}")
    UserProfile getUserProfile(@Param("id") String id);

    @Select("SELECT * FROM UserProfile")
    List<UserProfile> getUserProfileList();

    @Insert("INSERT INTO UserProfile VALUES (#{id}, #{name}, #{phone}, #{address})")
    int insertUserProfile(@Param("id") String id, @Param("name") String name, @Param("address") String address, @Param("phone") String phone);

    @Update("UPDATE UserProfile SET name=#{name}, phone=#phone}, address=#{address} WHERE id=#{id}")
    int updateUserProfile(@Param("id") String id, @Param("name") String name, @Param("address") String address, @Param("phone") String phone);;

    @Delete("DELETE FROM UserProfile WHERE id=#{id}")
    int deleteUserProfile(@Param("id") String id);
}
