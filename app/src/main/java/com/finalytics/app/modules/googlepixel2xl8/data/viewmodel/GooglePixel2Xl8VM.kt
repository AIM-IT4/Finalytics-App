package com.finalytics.app.modules.googlepixel2xl8.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finalytics.app.modules.googlepixel2xl8.`data`.model.GooglePixel2Xl8Model

public class GooglePixel2Xl8VM : ViewModel() {
  public val googlePixel2Xl8Model: MutableLiveData<GooglePixel2Xl8Model> =
      MutableLiveData(GooglePixel2Xl8Model())
}
