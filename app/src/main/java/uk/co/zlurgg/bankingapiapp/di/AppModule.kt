package uk.co.zlurgg.bankingapiapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import uk.co.zlurgg.bankingapiapp.common.Constants
import uk.co.zlurgg.bankingapiapp.data.remote.monzo.MonzoBankApi
import uk.co.zlurgg.bankingapiapp.data.remote.monzo.repository.MonzoBankRepositoryImpl
import uk.co.zlurgg.bankingapiapp.domain.repository.MonzoBankRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideBankingApi(): MonzoBankApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MonzoBankApi::class.java)
    }

    @Provides
    @Singleton
    fun provideBankingRepository(api: MonzoBankApi): MonzoBankRepository {
        return MonzoBankRepositoryImpl(api)
    }
}