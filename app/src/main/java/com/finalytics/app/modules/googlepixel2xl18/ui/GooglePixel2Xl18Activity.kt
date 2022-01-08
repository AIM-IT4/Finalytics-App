package com.finalytics.app.modules.googlepixel2xl18.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finalytics.app.R
import com.finalytics.app.appcomponents.base.BaseActivity
import com.finalytics.app.databinding.ActivityGooglePixel2Xl18Binding
import com.finalytics.app.modules.googlepixel2xl18.`data`.viewmodel.GooglePixel2Xl18VM
import kotlin.String
import kotlin.Unit

public class GooglePixel2Xl18Activity :
    BaseActivity<ActivityGooglePixel2Xl18Binding>(R.layout.activity_google_pixel_2_xl_18) {
  private val viewModel: GooglePixel2Xl18VM by viewModels<GooglePixel2Xl18VM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.googlePixel2Xl18VM = viewModel
  }

  public companion object {
    public const val TAG: String = "GOOGLE_PIXEL2XL18ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GooglePixel2Xl18Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
