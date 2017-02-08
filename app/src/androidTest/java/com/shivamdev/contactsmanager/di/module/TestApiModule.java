package com.shivamdev.contactsmanager.di.module;

import com.shivamdev.contactsmanager.network.api.ContactsApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

import static org.mockito.Mockito.mock;

/**
 * Created by shivam on 8/2/17.
 */

@Module(includes = {TestNetworkModule.class})
public class TestApiModule {
    @Singleton
    @Provides
    ContactsApi contactsApi() {
        return mock(ContactsApi.class);
    }
}