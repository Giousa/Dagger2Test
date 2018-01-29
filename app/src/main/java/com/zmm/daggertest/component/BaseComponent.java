package com.zmm.daggertest.component;

import com.zmm.daggertest.module.BaseModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/1/29
 * Time:上午11:34
 */

@Singleton
@Component(modules = BaseModule.class)
public interface BaseComponent {

    byte getByte();
}
