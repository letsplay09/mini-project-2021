package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {

	private EditText inputName;
    private TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        inputName = findViewById(R.id.input_name);
        textOutput = findViewById(R.id.text_output);
    }

    public void handleButton(View view) {
        String name = inputName.getText().toString();
        textOutput.setText("Welcome "+name);
    }

}
