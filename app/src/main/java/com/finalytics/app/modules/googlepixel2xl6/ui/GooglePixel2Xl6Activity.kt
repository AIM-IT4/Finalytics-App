package com.finalytics.app.modules.googlepixel2xl6.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finalytics.app.R
import com.finalytics.app.appcomponents.base.BaseActivity
import com.finalytics.app.databinding.ActivityGooglePixel2Xl6Binding
import com.finalytics.app.modules.googlepixel2xl6.`data`.viewmodel.GooglePixel2Xl6VM
import com.finalytics.app.modules.googlepixel2xl7.ui.GooglePixel2Xl7Activity
import kotlin.String
import kotlin.Unit

public class GooglePixel2Xl6Activity :
    BaseActivity<ActivityGooglePixel2Xl6Binding>(R.layout.activity_google_pixel_2_xl_6) {
  private val viewModel: GooglePixel2Xl6VM by viewModels<GooglePixel2Xl6VM>()

  public override fun setUpClicks(): Unit {
    binding.image.setOnClickListener {

              val destIntent = GooglePixel2Xl7Activity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.image.setOnClickListener {

              val destIntent = GooglePixel2Xl7Activity.getIntent(this, null)
              startActivity(destIntent)

            }
  }

  public override fun onInitialized(): Unit {
    binding.googlePixel2Xl6VM = viewModel
  }

  public companion object {
    public const val TAG: String = "GOOGLE_PIXEL2XL6ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GooglePixel2Xl6Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
