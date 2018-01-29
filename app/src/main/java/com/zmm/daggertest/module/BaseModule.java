package com.zmm.daggertest.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/1/29
 * Time:上午11:38
 */

@Module
public class BaseModule {

    @Singleton
    @Provides
    public byte getByte(){
        return 0x0f;
    }
}
