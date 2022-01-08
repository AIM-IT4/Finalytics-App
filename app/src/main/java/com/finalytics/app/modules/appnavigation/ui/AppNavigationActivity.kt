package com.finalytics.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.finalytics.app.R
import com.finalytics.app.appcomponents.base.BaseActivity
import com.finalytics.app.databinding.ActivityAppNavigationBinding
import com.finalytics.app.modules.a41.ui.A41Activity
import com.finalytics.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.finalytics.app.modules.googlepixel2xl10.ui.GooglePixel2Xl10Activity
import com.finalytics.app.modules.googlepixel2xl11.ui.GooglePixel2Xl11Activity
import com.finalytics.app.modules.googlepixel2xl12.ui.GooglePixel2Xl12Activity
import com.finalytics.app.modules.googlepixel2xl13.ui.GooglePixel2Xl13Activity
import com.finalytics.app.modules.googlepixel2xl14.ui.GooglePixel2Xl14Activity
import com.finalytics.app.modules.googlepixel2xl15.ui.GooglePixel2Xl15Activity
import com.finalytics.app.modules.googlepixel2xl16.ui.GooglePixel2Xl16Activity
import com.finalytics.app.modules.googlepixel2xl18.ui.GooglePixel2Xl18Activity
import com.finalytics.app.modules.googlepixel2xl2.ui.GooglePixel2Xl2Activity
import com.finalytics.app.modules.googlepixel2xl3.ui.GooglePixel2Xl3Activity
import com.finalytics.app.modules.googlepixel2xl4.ui.GooglePixel2Xl4Activity
import com.finalytics.app.modules.googlepixel2xl5.ui.GooglePixel2Xl5Activity
import com.finalytics.app.modules.googlepixel2xl6.ui.GooglePixel2Xl6Activity
import com.finalytics.app.modules.googlepixel2xl7.ui.GooglePixel2Xl7Activity
import com.finalytics.app.modules.googlepixel2xl8.ui.GooglePixel2Xl8Activity
import com.finalytics.app.modules.googlepixel2xl9.ui.GooglePixel2Xl9Activity
import com.finalytics.app.modules.splash.ui.SplashActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun setUpClicks(): Unit {
    binding.linear3.setOnClickListener {

      val destIntent = SplashActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear6.setOnClickListener {

      val destIntent = GooglePixel2Xl4Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear20.setOnClickListener {

      val destIntent = GooglePixel2Xl9Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear9.setOnClickListener {

      val destIntent = GooglePixel2Xl6Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear12.setOnClickListener {

      val destIntent = GooglePixel2Xl12Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear19.setOnClickListener {

      val destIntent = GooglePixel2Xl8Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear4.setOnClickListener {

      val destIntent = GooglePixel2Xl2Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear17.setOnClickListener {

      val destIntent = GooglePixel2Xl18Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear5.setOnClickListener {

      val destIntent = GooglePixel2Xl3Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear10.setOnClickListener {

      val destIntent = GooglePixel2Xl10Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear7.setOnClickListener {

      val destIntent = GooglePixel2Xl5Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear8.setOnClickListener {

      val destIntent = A41Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear15.setOnClickListener {

      val destIntent = GooglePixel2Xl15Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear13.setOnClickListener {

      val destIntent = GooglePixel2Xl13Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear14.setOnClickListener {

      val destIntent = GooglePixel2Xl14Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear16.setOnClickListener {

      val destIntent = GooglePixel2Xl16Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear18.setOnClickListener {

      val destIntent = GooglePixel2Xl7Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear11.setOnClickListener {

      val destIntent = GooglePixel2Xl11Activity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.appNavigationVM = viewModel
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
