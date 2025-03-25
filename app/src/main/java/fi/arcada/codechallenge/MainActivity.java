package fi.arcada.codechallenge;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button calculateButton;
    private ArrayList<Double> myDoubleArray;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.helloworldmessage);
        calculateButton = findViewById(R.id.calculateButton); // Assuming the button has id 'calculateButton'

        textView.setText("My app works!");

        myDoubleArray = new ArrayList<>();
        myDoubleArray.add(2.1);
        myDoubleArray.add(4.2);
        myDoubleArray.add(6.3);
        myDoubleArray.add(8.4);
        myDoubleArray.add(10.5);
        System.out.println(myDoubleArray);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });
    }

    private void calculate() {
        double meanValue = Statistics.calcMean(myDoubleArray);
        textView.setText("Mean value: " + meanValue);
    }
}