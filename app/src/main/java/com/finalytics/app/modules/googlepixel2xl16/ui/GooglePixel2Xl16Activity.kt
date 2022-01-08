package com.finalytics.app.modules.googlepixel2xl16.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finalytics.app.R
import com.finalytics.app.appcomponents.base.BaseActivity
import com.finalytics.app.databinding.ActivityGooglePixel2Xl16Binding
import com.finalytics.app.modules.googlepixel2xl16.`data`.viewmodel.GooglePixel2Xl16VM
import com.finalytics.app.modules.googlepixel2xl18.ui.GooglePixel2Xl18Activity
import kotlin.String
import kotlin.Unit

public class GooglePixel2Xl16Activity :
    BaseActivity<ActivityGooglePixel2Xl16Binding>(R.layout.activity_google_pixel_2_xl_16) {
  private val viewModel: GooglePixel2Xl16VM by viewModels<GooglePixel2Xl16VM>()

  public override fun setUpClicks(): Unit {
    binding.image.setOnClickListener {

      val destIntent = GooglePixel2Xl18Activity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.googlePixel2Xl16VM = viewModel
  }

  public companion object {
    public const val TAG: String = "GOOGLE_PIXEL2XL16ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GooglePixel2Xl16Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
