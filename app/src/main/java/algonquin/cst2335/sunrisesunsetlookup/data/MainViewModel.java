package algonquin.cst2335.sunrisesunsetlookup.data;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * ? Part of the ViewModel pattern: a simple way to separate code into different portions to make
 * ? it easy to maintain in a GUI program
 * ?ViewModel
 * Implements all the variables required by the main activity class. The reason for this is when we
 * rotate our device, Android deltes the current screen and creates a new one for the new rotated
 * orientation. This means the variables get deleted and recreated
 *
 * We use a ViewModel separated from the AppCompatActivity so the variables are stored in a different
 * object that does not get deleted on orientation changes.
 *
 * A ViewModel should only hold data variables and never Widget objects
 */
public class MainViewModel extends ViewModel {
    //? Attributes:
    /*
     * We should store the variables holding the values of our widgets in MainViewModel so they can
     * survive the rotation changes.
     *
     * MutableLiveData are classes that alert whenever a value changes, so we can always set the new
     * value of a variable when it changes. Instead of the ViewModel class holding the variables directly
     * it should use the MutableLiveData<> variables that are parameterized to whatever the variable
     * type should be
     */
    //public String editString;
    public MutableLiveData<String> editString = new MutableLiveData<>();
    public MutableLiveData<Boolean> onOrOff = new MutableLiveData<>();

}
