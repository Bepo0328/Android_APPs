package kr.co.bepo.repositorygithub.utility

import android.content.Context
import androidx.preference.PreferenceManager

class AuthTokenProvider(private val context: Context) {
    companion object {
        private const val KEY_AUTH_TOKEN = "auth_token"
    }

    val token: String?
        get() = PreferenceManager.getDefaultSharedPreferences(context)
            .getString(KEY_AUTH_TOKEN, null)

    fun updateToken(token: String) {
        PreferenceManager.getDefaultSharedPreferences(context).edit()
            .putString(KEY_AUTH_TOKEN, token)
            .apply()
    }
}
