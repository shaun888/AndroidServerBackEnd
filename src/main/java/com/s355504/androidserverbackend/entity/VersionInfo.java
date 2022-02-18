package com.s355504.androidserverbackend.entity;


import lombok.Data;

@Data
public class VersionInfo {
    private int id;
    private String version;
    private String bsw;
    private String bsw_branch;
    private String bsw_modify;
    private String asw;
    private String asw_branch;
    private String asw_modify;
    private String dcm;
    private String dcm_modify;
    private String dcm_files;
}
