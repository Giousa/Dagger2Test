package com.zmm.daggertest.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/1/29
 * Time:上午11:23
 */

@Scope
@Documented
@Retention(RUNTIME)
public @interface UserScope {
}
