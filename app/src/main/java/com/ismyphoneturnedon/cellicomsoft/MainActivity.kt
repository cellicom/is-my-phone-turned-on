package com.ismyphoneturnedon.cellicomsoft

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loadingLayout = findViewById<LinearLayout>(R.id.loadingLayout)
        val yesText = findViewById<TextView>(R.id.yesText)

        // Delay for 3.5 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            loadingLayout.visibility = View.GONE
            yesText.visibility = View.VISIBLE
        }, 3500)

        // Handle back button
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                showExitDialog()
            }
        })
    }

    private fun showExitDialog() {
        AlertDialog.Builder(this)
            .setTitle(R.string.exit_title)
            .setMessage(R.string.exit_message)
            .setPositiveButton(R.string.yes_label) { _, _ ->
                finish()
            }
            .setNegativeButton(R.string.no_label, null)
            .show()
    }
}
