package algonquin.cst2335.sunrisesunsetlookup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /**
     * Starting point of an Android application
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // R stands for the /res folder. R.layout means there is a folder called layout inside /res folder
        // This function is loading the file activity_main.xml
        setContentView(R.layout.activity_main);
    }
}