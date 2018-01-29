package com.zmm.daggertest.component;

import com.zmm.daggertest.MainActivity;
import com.zmm.daggertest.module.IntegerModule;
import com.zmm.daggertest.module.UserModule;
import com.zmm.daggertest.scope.UserScope;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/1/29
 * Time:上午11:15
 */

@UserScope
@Component(modules = {UserModule.class, IntegerModule.class},dependencies = BaseComponent.class)
public interface UserComponent {

    void inject(MainActivity mainActivity);

}
