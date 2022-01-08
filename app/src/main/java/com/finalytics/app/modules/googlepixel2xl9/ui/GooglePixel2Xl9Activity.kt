package com.finalytics.app.modules.googlepixel2xl9.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finalytics.app.R
import com.finalytics.app.appcomponents.base.BaseActivity
import com.finalytics.app.databinding.ActivityGooglePixel2Xl9Binding
import com.finalytics.app.modules.googlepixel2xl10.ui.GooglePixel2Xl10Activity
import com.finalytics.app.modules.googlepixel2xl9.`data`.viewmodel.GooglePixel2Xl9VM
import kotlin.String
import kotlin.Unit

public class GooglePixel2Xl9Activity :
    BaseActivity<ActivityGooglePixel2Xl9Binding>(R.layout.activity_google_pixel_2_xl_9) {
  private val viewModel: GooglePixel2Xl9VM by viewModels<GooglePixel2Xl9VM>()

  public override fun setUpClicks(): Unit {
    binding.image.setOnClickListener {

      val destIntent = GooglePixel2Xl10Activity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.googlePixel2Xl9VM = viewModel
  }

  public companion object {
    public const val TAG: String = "GOOGLE_PIXEL2XL9ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GooglePixel2Xl9Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
