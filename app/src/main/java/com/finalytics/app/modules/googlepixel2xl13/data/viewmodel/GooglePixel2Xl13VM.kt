package com.finalytics.app.modules.googlepixel2xl13.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finalytics.app.modules.googlepixel2xl13.`data`.model.GooglePixel2Xl13Model

public class GooglePixel2Xl13VM : ViewModel() {
  public val googlePixel2Xl13Model: MutableLiveData<GooglePixel2Xl13Model> =
      MutableLiveData(GooglePixel2Xl13Model())
}
