package com.cesarvaliente.preferences_foldable

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PreferenceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preference)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.preference_container, TwoPanePreference())
            .commit()
    }
}