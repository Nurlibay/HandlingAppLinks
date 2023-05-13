package uz.nurlibaydev.handlingapplinks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * https://nurlibay.github.io/.well-known/assetlinks.json
     */

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        // ATTENTION: This was auto-generated to handle app links.
        val appLinkIntent: Intent = intent
        val appLinkAction: String? = appLinkIntent.action
        val appLinkData: Uri? = appLinkIntent.data
        setIntent(intent)
    }

    /**
     * https://nurlibay.github.io click this link from everywhere you navigate in this app
     */
}