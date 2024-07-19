package com.chou.generic.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

/**
 * 用户
 * @author zhouchengjin
 * @since 2024/6/19 上午11:40
 */
@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors
public class User {
  /*姓名*/
  private String name;
  /*邮箱*/
  private String email;
  /*电话*/
  private String phone;
  /*密码*/
  private String password;
}
