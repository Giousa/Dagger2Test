package com.zmm.daggertest.module;

import com.zmm.daggertest.provides.Release;
import com.zmm.daggertest.provides.Test;

import dagger.Module;
import dagger.Provides;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/1/29
 * Time:上午11:29
 */

@Module
public class IntegerModule {


    @Release
    @Provides
    public int getNum(){
        return 100;
    }

    @Test
    @Provides
    public int getCount(){

        return 999;
    }

}
