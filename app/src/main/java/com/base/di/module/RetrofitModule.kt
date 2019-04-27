package com.base.di.module

import com.msplabs.mvpapps.BuildConfig
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class RetrofitModule {
    @Provides
    @Singleton
    fun providesRetrofit(client: OkHttpClient): Retrofit = Retrofit.Builder()
        .baseUrl(BuildConfig.ENDPOINT_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()
}
