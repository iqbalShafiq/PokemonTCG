package space.iqbalsyafiq.pokemontcg.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import space.iqbalsyafiq.pokemontcg.R
import space.iqbalsyafiq.pokemontcg.ui.list.PokemonListActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        runBlocking {
            lifecycleScope.launch {
                delay(1000)
                Intent(this@MainActivity, PokemonListActivity::class.java).apply {
                    startActivity(this)
                    finish()
                }
            }
        }
    }
}