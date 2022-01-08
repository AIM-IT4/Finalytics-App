package com.finalytics.app.modules.googlepixel2xl14.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finalytics.app.modules.googlepixel2xl14.`data`.model.GooglePixel2Xl14Model

public class GooglePixel2Xl14VM : ViewModel() {
  public val googlePixel2Xl14Model: MutableLiveData<GooglePixel2Xl14Model> =
      MutableLiveData(GooglePixel2Xl14Model())
}
