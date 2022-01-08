package com.finalytics.app.modules.googlepixel2xl7.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finalytics.app.R
import com.finalytics.app.appcomponents.base.BaseActivity
import com.finalytics.app.databinding.ActivityGooglePixel2Xl7Binding
import com.finalytics.app.modules.googlepixel2xl7.`data`.viewmodel.GooglePixel2Xl7VM
import com.finalytics.app.modules.googlepixel2xl8.ui.GooglePixel2Xl8Activity
import kotlin.String
import kotlin.Unit

public class GooglePixel2Xl7Activity :
    BaseActivity<ActivityGooglePixel2Xl7Binding>(R.layout.activity_google_pixel_2_xl_7) {
  private val viewModel: GooglePixel2Xl7VM by viewModels<GooglePixel2Xl7VM>()

  public override fun setUpClicks(): Unit {
    binding.image1.setOnClickListener {

      val destIntent = GooglePixel2Xl8Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.image1.setOnClickListener {

      val destIntent = GooglePixel2Xl8Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.image1.setOnClickListener {

      val destIntent = GooglePixel2Xl8Activity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.googlePixel2Xl7VM = viewModel
  }

  public companion object {
    public const val TAG: String = "GOOGLE_PIXEL2XL7ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GooglePixel2Xl7Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
