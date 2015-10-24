package domenafirmy.intrainrevision;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;


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

        if(this.gender.getCheckedRadioButtonId() != -1)
        {
            gender = this.gender.getCheckedRadioButtonId() == R.id.man ? "Man" : "Woman";
        }


        String result = String.format("Hi! %s you are a %S",fullname,gender);


        Intent intent = new Intent(this , NamesActivity.class);

        if(fullname.length() < 2)
        {

            AlertDialog dialog = new AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("Get us your names")
                    //special onclick for dialogs
                    .setPositiveButton(R.string.btnOk, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    })
                    .create();

            dialog.show();

        }else{

            intent.putExtra(NamesActivity.EXTRA_NAME, fullname);
            startActivity(intent);

        }
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