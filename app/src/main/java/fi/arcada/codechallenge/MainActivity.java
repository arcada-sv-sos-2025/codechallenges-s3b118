package fi.arcada.codechallenge;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.helloworldmessage);

        textView.setText("My app works!");

        ArrayList<Double> myDoubleArray = new ArrayList<Double>();
        myDoubleArray.add(2.1);
        myDoubleArray.add(4.2);
        myDoubleArray.add(6.3);
        myDoubleArray.add(8.4);
        myDoubleArray.add(10.5);
        System.out.println(myDoubleArray);


    }
}