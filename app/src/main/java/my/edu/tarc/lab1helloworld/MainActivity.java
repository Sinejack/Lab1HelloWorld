package my.edu.tarc.lab1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //global, module level variable
    EditText editTextName, editTextAge;
    TextView textViewMessage;
    Button buttonDisplay, buttonReset;

    //Main
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Display main UI, R = resource class
        setContentView(R.layout.activity_main);

        //Link UI to variable
        editTextName=(EditText)findViewById(R.id.editTextName);
        editTextAge=(EditText)findViewById(R.id.editTextAge);
        textViewMessage=(TextView)findViewById(R.id.textViewMessage);
    }

    public void displayMessage(View view) {
        String name, text="";
        int age;

        //Get user input
        name = editTextName.getText().toString();
        age = Integer.parseInt(editTextAge.getText().toString());
        age++;

        textViewMessage.setText("Hi " + name + ", you will be " + age + " old in 2018");


    }
    public void resetInput(View view)
    {
        editTextName.setText("");
        editTextAge.setText("");
        textViewMessage.setText("");
    }
}
