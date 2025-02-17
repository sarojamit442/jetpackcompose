package com.example.jetpackcustomer.ui.theme.viewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jetpackcustomer.ui.theme.model.CountryData
import com.example.jetpackcustomer.ui.theme.model.SnackBarData
import com.example.jetpackcustomer.ui.theme.network.AuthRepository
import com.example.jetpackcustomer.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor() :ViewModel(){

    @Inject
    lateinit var repository:AuthRepository
    private val _snackbarMessage = MutableLiveData<SnackBarData>()
    val snackbarMessage: LiveData<SnackBarData> get() = _snackbarMessage
    private val _countryDataList = MutableLiveData<List<CountryData>>()
    val countryDataList: LiveData<List<CountryData>> get() = _countryDataList

    fun fetchCountrydata(){
        viewModelScope.launch {
            val param = hashMapOf<String, Any>(
                "device_id" to "ksahfjkdsfb",
                "device_type" to "ANDROID",
                "lang_code" to "en"
            )
            val data = when (val result = repository.callGetUserType(param)) {
                is Resource.Success -> {
                    val message = result.data
                    if (result.data.errorCode == 200) {
                        _countryDataList.value = result.data.data
                    } else {
                    }


                }

                is Resource.Error -> {

                }
            }

        }

    }
}