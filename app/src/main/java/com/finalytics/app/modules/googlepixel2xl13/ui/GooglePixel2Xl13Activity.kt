package com.finalytics.app.modules.googlepixel2xl13.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finalytics.app.R
import com.finalytics.app.appcomponents.base.BaseActivity
import com.finalytics.app.databinding.ActivityGooglePixel2Xl13Binding
import com.finalytics.app.modules.googlepixel2xl13.`data`.viewmodel.GooglePixel2Xl13VM
import com.finalytics.app.modules.googlepixel2xl14.ui.GooglePixel2Xl14Activity
import kotlin.String
import kotlin.Unit

public class GooglePixel2Xl13Activity :
    BaseActivity<ActivityGooglePixel2Xl13Binding>(R.layout.activity_google_pixel_2_xl_13) {
  private val viewModel: GooglePixel2Xl13VM by viewModels<GooglePixel2Xl13VM>()

  public override fun setUpClicks(): Unit {
    binding.image1.setOnClickListener {

                  val destIntent = GooglePixel2Xl14Activity.getIntent(this, null)
                  startActivity(destIntent)

                }
  }

  public override fun onInitialized(): Unit {
    binding.googlePixel2Xl13VM = viewModel
  }

  public companion object {
    public const val TAG: String = "GOOGLE_PIXEL2XL13ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GooglePixel2Xl13Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
