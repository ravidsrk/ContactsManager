package com.shivamdev.contactsmanager.di.module;

import android.app.Application;
import android.content.Context;

import com.shivamdev.contactsmanager.di.scope.ApplicationContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by shivam on 2/2/17.
 */

@Module
public class AppModule {
    private final Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

}
