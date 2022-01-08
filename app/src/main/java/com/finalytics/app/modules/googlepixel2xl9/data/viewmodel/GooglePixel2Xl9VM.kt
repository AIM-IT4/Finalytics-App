package com.finalytics.app.modules.googlepixel2xl9.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finalytics.app.modules.googlepixel2xl9.`data`.model.GooglePixel2Xl9Model

public class GooglePixel2Xl9VM : ViewModel() {
  public val googlePixel2Xl9Model: MutableLiveData<GooglePixel2Xl9Model> =
      MutableLiveData(GooglePixel2Xl9Model())
}
