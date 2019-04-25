package gunjika.varshney.gla.studentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView,textView1;
    Button button,button1;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.editText);
        textView1=findViewById(R.id.editText2);
        button=findViewById(R.id.button);
        button1=findViewById(R.id.button2);
        checkBox=findViewById(R.id.checkBox);


    }
}
