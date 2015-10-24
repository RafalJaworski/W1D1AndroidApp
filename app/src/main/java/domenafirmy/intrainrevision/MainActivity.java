package domenafirmy.intrainrevision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText names ;
    private RadioGroup gender ;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.names = (EditText) findViewById(R.id.names_input);
        this.gender = (RadioGroup) findViewById(R.id.gender_group);
        this.button = (Button) findViewById(R.id.button_send);

    }

    public void toastMsg()
    {
        String fullname = this.names.getText().toString() ;

        if(fullname.isEmpty())
        {
            fullname = "Stranger";
        }

        String gender = this.gender.getCheckedRadioButtonId() == R.id.man ? "Man" : "Woman";

        String result = String.format("Hi! %s you are a %S",fullname,gender);

        Toast.makeText(this,result,Toast.LENGTH_SHORT).show();
    }

   
}