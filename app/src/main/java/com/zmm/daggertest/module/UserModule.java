package com.zmm.daggertest.module;

import com.zmm.daggertest.model.User;
import com.zmm.daggertest.scope.UserScope;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/1/29
 * Time:上午11:13
 */

@Module
public class UserModule {

    @Provides
    @UserScope
    public User getUser(){
        return new User("giousa","123");
    }

    @Provides
    @Named("dev")
    public String getDev(){

        return "dev";
    }

    @Provides
    @Named("release")
    public String getRelease(){

        return "release";
    }
}
