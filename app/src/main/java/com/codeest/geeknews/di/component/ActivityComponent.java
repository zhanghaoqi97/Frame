package com.codeest.geeknews.di.component;

import android.app.Activity;

import com.codeest.geeknews.di.scope.ActivityScope;
import com.codeest.geeknews.di.module.ActivityModule;
import com.codeest.geeknews.ui.main.activity.MainActivity;
import com.codeest.geeknews.ui.main.activity.WelcomeActivity;

import dagger.Component;

/**
 * Created by codeest on 16/8/7.
 */

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    Activity getActivity();

    void inject(WelcomeActivity welcomeActivity);

    void inject(MainActivity mainActivity);


}
