package fi.arcada.codechallenge;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextView;
    private EditText windowInput;
    private Button calcButton;

    double[] temperatures = { 17.5, 16.0, 16.5, 15.0, 17.5, 18.0, 15.5, 20.0, 19.5, 16.0 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.textView);
        windowInput = findViewById(R.id.inputWindow);
        calcButton = findViewById(R.id.calcButton);

        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = windowInput.getText().toString();
                if (input.isEmpty()) {
                    Toast.makeText(MainActivity.this, getString(R.string.toast_enter_window), Toast.LENGTH_SHORT).show();
                    return;
                }

                int windowSize = Integer.parseInt(input);

                if (windowSize < 1 || windowSize > temperatures.length) {
                    Toast.makeText(MainActivity.this, getString(R.string.toast_invalid_window), Toast.LENGTH_SHORT).show();
                    return;
                }

                double[] sma = Statistics.movingAvg(temperatures, windowSize);

                // Formatera resulat (avrundar till 2 decimaler)
                StringBuilder formattedResult = new StringBuilder("[");
                for (int i = 0; i < sma.length; i++) {
                    formattedResult.append(String.format("%.2f", sma[i]));
                    if (i != sma.length - 1) {
                        formattedResult.append(", ");
                    }
                }
                formattedResult.append("]");

                resultTextView.setText(formattedResult.toString());
            }
        });
    }
}