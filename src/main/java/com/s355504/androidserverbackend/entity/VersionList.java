package com.s355504.androidserverbackend.entity;

import lombok.Data;

import java.util.Date;

@Data
public class VersionList {
    private int id;
    private String version;
    private Date build_date;
    private String path;
    private Date publish_date;


}
