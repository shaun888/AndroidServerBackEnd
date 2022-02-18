package com.s355504.androidserverbackend.mapper;


import com.s355504.androidserverbackend.entity.VersionInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdVersionMapper {


    VersionInfo showVersionInfo();
}
