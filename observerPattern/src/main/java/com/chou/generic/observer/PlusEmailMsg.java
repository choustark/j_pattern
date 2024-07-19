package com.chou.generic.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * 邮件发送观察者
 *
 * @author zhouchengjin
 * @since 2024/6/21 上午9:15
 */
@Slf4j
public class PlusEmailMsg implements Register{
  @Override
  public void update(UserRegisterAction subject, UserAction argument) {
    log.info(String.format("用户：%s注册/添加成功，给用户邮件：%s 发送了密码信息...",
        subject.getUser().getName(), subject.getUser().getEmail()));
  }
}