package com.chou.generic.observer;

import lombok.Getter;

/**
 * 用户动作枚举
 *
 * @author by Axel
 * @since 2024/6/22 下午9:19
 */
public enum UserAction {

    ADD("新增用户"),
    UPDATE("更新用户"),
    DELETE("删除用户"),
    NOTHING("默认操作");

    @Getter
    private final String description;

    UserAction(String description){
        this.description = description;
    }



}
