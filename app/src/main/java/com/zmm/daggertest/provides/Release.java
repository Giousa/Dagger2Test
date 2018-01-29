package com.zmm.daggertest.provides;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/1/29
 * Time:上午11:30
 */

@Qualifier
@Documented
@Retention(RUNTIME)
public @interface Release {
}
