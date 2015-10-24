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

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

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

        button.setOnClickListener(this);

    }

    public void toastMsg()
    {
        String fullname = this.names.getText().toString() ;

        String gender = "person without the gender?";

        if(fullname.isEmpty())
        {
            fullname = "Stranger";
        }

        if(this.gender.getCheckedRadioButtonId() != -1)
        {
            gender = this.gender.getCheckedRadioButtonId() == R.id.man ? "Man" : "Woman";
        }


        String result = String.format("Hi! %s you are a %S",fullname,gender);

        Toast.makeText(this,result,Toast.LENGTH_LONG).show();
    }


    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        this.toastMsg();
    }
}