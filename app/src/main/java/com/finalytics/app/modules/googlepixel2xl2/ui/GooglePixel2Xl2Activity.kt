package com.finalytics.app.modules.googlepixel2xl2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finalytics.app.R
import com.finalytics.app.appcomponents.base.BaseActivity
import com.finalytics.app.databinding.ActivityGooglePixel2Xl2Binding
import com.finalytics.app.modules.googlepixel2xl2.`data`.viewmodel.GooglePixel2Xl2VM
import com.finalytics.app.modules.googlepixel2xl3.ui.GooglePixel2Xl3Activity
import com.finalytics.app.modules.googlepixel2xl5.ui.GooglePixel2Xl5Activity
import kotlin.String
import kotlin.Unit

public class GooglePixel2Xl2Activity :
    BaseActivity<ActivityGooglePixel2Xl2Binding>(R.layout.activity_google_pixel_2_xl_2) {
  private val viewModel: GooglePixel2Xl2VM by viewModels<GooglePixel2Xl2VM>()

  public override fun setUpClicks(): Unit {
    binding.image2.setOnClickListener {

                                  val destIntent = GooglePixel2Xl3Activity.getIntent(this, null)
                                  startActivity(destIntent)

                                }
    binding.image2.setOnClickListener {

                                  val destIntent = GooglePixel2Xl3Activity.getIntent(this, null)
                                  startActivity(destIntent)

                                }
    binding.image2.setOnClickListener {

                                  val destIntent = GooglePixel2Xl3Activity.getIntent(this, null)
                                  startActivity(destIntent)

                                }
    binding.image2.setOnClickListener {

                                  val destIntent = GooglePixel2Xl3Activity.getIntent(this, null)
                                  startActivity(destIntent)

                                }
    binding.image2.setOnClickListener {

                                  val destIntent = GooglePixel2Xl3Activity.getIntent(this, null)
                                  startActivity(destIntent)

                                }
    binding.image2.setOnClickListener {

                                  val destIntent = GooglePixel2Xl3Activity.getIntent(this, null)
                                  startActivity(destIntent)

                                }
    binding.image2.setOnClickListener {

                                  val destIntent = GooglePixel2Xl3Activity.getIntent(this, null)
                                  startActivity(destIntent)

                                }
    binding.image2.setOnClickListener {

                                  val destIntent = GooglePixel2Xl3Activity.getIntent(this, null)
                                  startActivity(destIntent)

                                }
    binding.image1.setOnClickListener {

                                  val destIntent = GooglePixel2Xl5Activity.getIntent(this, null)
                                  startActivity(destIntent)

                                }
    binding.image1.setOnClickListener {

                                  val destIntent = GooglePixel2Xl5Activity.getIntent(this, null)
                                  startActivity(destIntent)

                                }
    binding.image1.setOnClickListener {

                                  val destIntent = GooglePixel2Xl5Activity.getIntent(this, null)
                                  startActivity(destIntent)

                                }
    binding.image1.setOnClickListener {

                                  val destIntent = GooglePixel2Xl5Activity.getIntent(this, null)
                                  startActivity(destIntent)

                                }
    binding.image1.setOnClickListener {

                                  val destIntent = GooglePixel2Xl5Activity.getIntent(this, null)
                                  startActivity(destIntent)

                                }
  }

  public override fun onInitialized(): Unit {
    binding.googlePixel2Xl2VM = viewModel
  }

  public companion object {
    public const val TAG: String = "GOOGLE_PIXEL2XL2ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GooglePixel2Xl2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
