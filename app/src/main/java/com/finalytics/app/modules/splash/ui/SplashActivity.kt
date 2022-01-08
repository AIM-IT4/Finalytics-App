package com.finalytics.app.modules.splash.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finalytics.app.R
import com.finalytics.app.appcomponents.base.BaseActivity
import com.finalytics.app.databinding.ActivitySplashBinding
import com.finalytics.app.modules.googlepixel2xl2.ui.GooglePixel2Xl2Activity
import com.finalytics.app.modules.splash.`data`.viewmodel.SplashVM
import kotlin.String
import kotlin.Unit

public class SplashActivity : BaseActivity<ActivitySplashBinding>(R.layout.activity_splash) {
  private val viewModel: SplashVM by viewModels<SplashVM>()

  public override fun setUpClicks(): Unit {
    binding.btnGetStarted.setOnClickListener {

      val destIntent = GooglePixel2Xl2Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.btnGetStarted.setOnClickListener {

      val destIntent = GooglePixel2Xl2Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.btnGetStarted.setOnClickListener {

      val destIntent = GooglePixel2Xl2Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.btnGetStarted.setOnClickListener {

      val destIntent = GooglePixel2Xl2Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.btnGetStarted.setOnClickListener {

      val destIntent = GooglePixel2Xl2Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.btnGetStarted.setOnClickListener {

      val destIntent = GooglePixel2Xl2Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.btnGetStarted.setOnClickListener {

      val destIntent = GooglePixel2Xl2Activity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.splashVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SPLASH_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SplashActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
