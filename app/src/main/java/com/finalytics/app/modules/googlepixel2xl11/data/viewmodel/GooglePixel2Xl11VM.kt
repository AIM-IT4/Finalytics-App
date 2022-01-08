package com.finalytics.app.modules.googlepixel2xl11.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finalytics.app.modules.googlepixel2xl11.`data`.model.GooglePixel2Xl11Model

public class GooglePixel2Xl11VM : ViewModel() {
  public val googlePixel2Xl11Model: MutableLiveData<GooglePixel2Xl11Model> =
      MutableLiveData(GooglePixel2Xl11Model())
}
