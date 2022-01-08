package com.finalytics.app.modules.a41.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finalytics.app.R
import com.finalytics.app.appcomponents.base.BaseActivity
import com.finalytics.app.databinding.ActivityA41Binding
import com.finalytics.app.modules.a41.`data`.viewmodel.A41VM
import com.finalytics.app.modules.googlepixel2xl18.ui.GooglePixel2Xl18Activity
import com.finalytics.app.modules.googlepixel2xl5.ui.GooglePixel2Xl5Activity
import com.finalytics.app.modules.splash.ui.SplashActivity
import kotlin.String
import kotlin.Unit

public class A41Activity : BaseActivity<ActivityA41Binding>(R.layout.activity_a4_1) {
  private val viewModel: A41VM by viewModels<A41VM>()

  public override fun setUpClicks(): Unit {
    binding.btnContact.setOnClickListener {

          val destIntent = GooglePixel2Xl18Activity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.btnContact.setOnClickListener {

          val destIntent = SplashActivity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.btnApps.setOnClickListener {

          val destIntent = GooglePixel2Xl5Activity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.btnHome.setOnClickListener {

          val destIntent = SplashActivity.getIntent(this, null)
          startActivity(destIntent)

        }
  }

  public override fun onInitialized(): Unit {
    binding.a41VM = viewModel
  }

  public companion object {
    public const val TAG: String = "A41ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, A41Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
