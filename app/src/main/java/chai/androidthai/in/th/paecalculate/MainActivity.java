package chai.androidthai.in.th.paecalculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import chai.androidthai.in.th.paecalculate.fragment.Main_fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Add fragment of activity
        if (savedInstanceState == null) {
        getSupportFragmentManager().beginTransaction()
                .add(R.id.contenmainfragment, new Main_fragment())
                .commit();
    }
}   // main method
}//main class
