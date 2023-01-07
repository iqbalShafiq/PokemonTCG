package space.iqbalsyafiq.pokemontcg

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import space.iqbalsyafiq.pokemontcg.di.networkModule
import space.iqbalsyafiq.pokemontcg.di.repositoryModule
import space.iqbalsyafiq.pokemontcg.di.viewModelModule

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    networkModule,
                    repositoryModule,
                    viewModelModule
                )
            )
        }
    }
}