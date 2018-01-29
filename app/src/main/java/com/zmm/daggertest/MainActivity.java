package com.zmm.daggertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zmm.daggertest.component.BaseComponent;
import com.zmm.daggertest.component.DaggerBaseComponent;
import com.zmm.daggertest.component.DaggerUserComponent;
import com.zmm.daggertest.model.User;
import com.zmm.daggertest.module.IntegerModule;
import com.zmm.daggertest.module.UserModule;
import com.zmm.daggertest.provides.Release;
import com.zmm.daggertest.provides.Test;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    @Inject
    User mUser;

    @Inject
    User mUser2;

    @Inject
    @Named("dev")
    String mStr;

    @Release
    @Inject
    int i1;

    @Test
    @Inject
    int i2;

    @Inject
    byte bys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BaseComponent baseComponent = DaggerBaseComponent.create();

        DaggerUserComponent.builder()
                .userModule(new UserModule())
                .baseComponent(baseComponent)
                .integerModule(new IntegerModule())
                .build()
                .inject(this);

        System.out.println("mUser = "+mUser);
        System.out.println("mUser2 = "+mUser2);

        System.out.println("mStr = "+mStr);

        System.out.println("i1 = "+i1);
        System.out.println("i2 = "+i2);

        System.out.println("bys = "+bys);
    }
}
