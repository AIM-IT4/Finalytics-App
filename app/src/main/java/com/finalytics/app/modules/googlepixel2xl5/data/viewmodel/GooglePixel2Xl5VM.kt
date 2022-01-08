package com.finalytics.app.modules.googlepixel2xl5.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finalytics.app.modules.googlepixel2xl5.`data`.model.GooglePixel2Xl5Model

public class GooglePixel2Xl5VM : ViewModel() {
  public val googlePixel2Xl5Model: MutableLiveData<GooglePixel2Xl5Model> =
      MutableLiveData(GooglePixel2Xl5Model())
}
