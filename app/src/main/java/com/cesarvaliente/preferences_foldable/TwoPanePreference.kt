package com.cesarvaliente.preferences_foldable

import androidx.preference.PreferenceFragmentCompat
import androidx.preference.PreferenceHeaderFragmentCompat

class TwoPanePreference : PreferenceHeaderFragmentCompat() {

    override fun onCreatePreferenceHeader(): PreferenceFragmentCompat {
        return MainPreferenceFragment()
    }
}