package com.bdlbsc.common.api;

public interface APPLETSAPI {

    // 获取当前用户小程序列表版本
    String APPLETS_GET_VERSION = "applets/get/version";
    // 获取小程序列表
    String APPLETS_GET_APPS = "applets/get/apps";
    // 添加小程序
    String APPLETS_ADD = "applets/add";
    // 删除小程序
    String APPLETS_DELETE = "applets/delete";
}
