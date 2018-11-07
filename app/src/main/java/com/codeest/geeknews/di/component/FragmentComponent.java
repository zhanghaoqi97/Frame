package com.codeest.geeknews.di.component;

import android.app.Activity;

import com.codeest.geeknews.di.scope.FragmentScope;
import com.codeest.geeknews.di.module.FragmentModule;
import com.codeest.geeknews.ui.gank.fragment.GirlFragment;
import com.codeest.geeknews.ui.gank.fragment.TechFragment;
import com.codeest.geeknews.ui.gold.fragment.GoldMainFragment;
import com.codeest.geeknews.ui.gold.fragment.GoldPagerFragment;
import com.codeest.geeknews.ui.main.fragment.LikeFragment;
import com.codeest.geeknews.ui.main.fragment.SettingFragment;
import com.codeest.geeknews.ui.wechat.fragment.WechatMainFragment;

import dagger.Component;

/**
 * Created by codeest on 16/8/7.
 */

@FragmentScope
@Component(dependencies = AppComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {

    Activity getActivity();

    void inject(TechFragment techFragment);

    void inject(GirlFragment girlFragment);

    void inject(LikeFragment likeFragment);

    void inject(WechatMainFragment wechatMainFragment);

    void inject(SettingFragment settingFragment);

    void inject(GoldMainFragment goldMainFragment);

    void inject(GoldPagerFragment goldPagerFragment);

}
