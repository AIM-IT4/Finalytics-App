package com.finalytics.app.modules.googlepixel2xl8.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finalytics.app.R
import com.finalytics.app.appcomponents.base.BaseActivity
import com.finalytics.app.databinding.ActivityGooglePixel2Xl8Binding
import com.finalytics.app.modules.googlepixel2xl8.`data`.viewmodel.GooglePixel2Xl8VM
import com.finalytics.app.modules.googlepixel2xl9.ui.GooglePixel2Xl9Activity
import kotlin.String
import kotlin.Unit

public class GooglePixel2Xl8Activity :
    BaseActivity<ActivityGooglePixel2Xl8Binding>(R.layout.activity_google_pixel_2_xl_8) {
  private val viewModel: GooglePixel2Xl8VM by viewModels<GooglePixel2Xl8VM>()

  public override fun setUpClicks(): Unit {
    binding.image1.setOnClickListener {

                  val destIntent = GooglePixel2Xl9Activity.getIntent(this, null)
                  startActivity(destIntent)

                }
    binding.image1.setOnClickListener {

                  val destIntent = GooglePixel2Xl9Activity.getIntent(this, null)
                  startActivity(destIntent)

                }
  }

  public override fun onInitialized(): Unit {
    binding.googlePixel2Xl8VM = viewModel
  }

  public companion object {
    public const val TAG: String = "GOOGLE_PIXEL2XL8ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GooglePixel2Xl8Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
