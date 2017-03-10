package mx.edu.cetis108.cetis1084av_app001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText text1;
    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Mostrar (View v) {
        text1 = (EditText)findViewById(R.id.editText);
        text2 = (TextView) findViewById(R.id.textView2);

        String a = text1.getText().toString();
        text2.setText(a);
        Toast.makeText(MainActivity.this,a, Toast.LENGTH_SHORT).show();


    }
    public void Borrar (View v) {

    }
}
