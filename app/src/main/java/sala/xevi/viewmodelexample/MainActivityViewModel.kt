package sala.xevi.viewmodelexample

import androidx.lifecycle.ViewModel
import java.time.LocalDate

class MainActivityViewModel : ViewModel() {

    var textField = ""

    //Here add code will be executed when
    init {
        textField = "Today is " + getDate()
    }

    //Functions that can be called from init or
    //if public from the activity.
    private fun getDate() : String {
        return LocalDate.now().toString()
    }

}