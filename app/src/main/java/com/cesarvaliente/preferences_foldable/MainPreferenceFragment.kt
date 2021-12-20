package com.cesarvaliente.preferences_foldable

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class MainPreferenceFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)
    }
}