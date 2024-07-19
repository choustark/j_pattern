package com.chou.generic.observer;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * 可以观察者实体
 *
 * @author zhouchengjin
 * @since 2024/6/20 下午4:20
 */
public class UserRegisterAction extends Observable<UserRegisterAction, Register, UserAction> {

  @Setter
  @Getter
  private UserAction userAction;

  @Setter
  @Getter
  private User user;

  public UserRegisterAction() {
    if (Objects.isNull(user)) {
      throw new RuntimeException("user is null");
    }
    if (Objects.isNull(userAction)){
      userAction = UserAction.NOTHING;
    }
  }

  public UserRegisterAction(UserAction userAction,User user) {
    this.userAction = userAction;
    this.user = user;
  }


  public void register() {
      notifyObservers(userAction);
  }

}
