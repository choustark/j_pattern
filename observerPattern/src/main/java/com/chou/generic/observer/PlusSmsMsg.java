package com.chou.generic.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * 短信观察者
 *
 * @author zhouchengjin
 * @since 2024/6/21 上午9:16
 */
@Slf4j
public class PlusSmsMsg implements Register{
  @Override
  public void update(UserRegisterAction subject, UserAction argument) {
    log.info(String.format("用户：%s注册/添加成功，给用户手机号码：%s 发送了注册成功提醒...",
        subject.getUser().getName(), subject.getUser().getPhone()));
  }
}