package com.base.di.module

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton
import com.msplabs.mvpapps.api.EndPoints

@Module
class ApiModule {
    @Provides
    @Singleton
    fun providesEndpoints(retrofit: Retrofit): EndPoints = retrofit.create(EndPoints::class.java)
}
