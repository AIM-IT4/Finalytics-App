package com.finalytics.app.modules.googlepixel2xl12.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finalytics.app.modules.googlepixel2xl12.`data`.model.GooglePixel2Xl12Model

public class GooglePixel2Xl12VM : ViewModel() {
  public val googlePixel2Xl12Model: MutableLiveData<GooglePixel2Xl12Model> =
      MutableLiveData(GooglePixel2Xl12Model())
}
