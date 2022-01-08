package com.finalytics.app.modules.googlepixel2xl16.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finalytics.app.modules.googlepixel2xl16.`data`.model.GooglePixel2Xl16Model

public class GooglePixel2Xl16VM : ViewModel() {
  public val googlePixel2Xl16Model: MutableLiveData<GooglePixel2Xl16Model> =
      MutableLiveData(GooglePixel2Xl16Model())
}
