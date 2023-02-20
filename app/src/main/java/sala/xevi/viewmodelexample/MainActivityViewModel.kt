package sala.xevi.viewmodelexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.time.LocalDate

class MainActivityViewModel : ViewModel() {

    private val _textField = MutableLiveData<String>()
    val textField: LiveData<String> get() = _textField

    //Here add code will be executed when
    init {

        _textField.value = "Today is " + getDate()
    }

    //Functions that can be called from init or
    //if public from the activity.
    private fun getDate() : String {
        return LocalDate.now().toString()
    }

    fun changeTheTextField(newValue: String) {
        _textField.value = newValue
    }

}