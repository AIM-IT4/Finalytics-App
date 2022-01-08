package com.finalytics.app.modules.googlepixel2xl10.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finalytics.app.modules.googlepixel2xl10.`data`.model.GooglePixel2Xl10Model

public class GooglePixel2Xl10VM : ViewModel() {
  public val googlePixel2Xl10Model: MutableLiveData<GooglePixel2Xl10Model> =
      MutableLiveData(GooglePixel2Xl10Model())
}
