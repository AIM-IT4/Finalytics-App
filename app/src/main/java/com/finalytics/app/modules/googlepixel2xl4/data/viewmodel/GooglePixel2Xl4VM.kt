package com.finalytics.app.modules.googlepixel2xl4.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finalytics.app.modules.googlepixel2xl4.`data`.model.GooglePixel2Xl4Model

public class GooglePixel2Xl4VM : ViewModel() {
  public val googlePixel2Xl4Model: MutableLiveData<GooglePixel2Xl4Model> =
      MutableLiveData(GooglePixel2Xl4Model())
}
