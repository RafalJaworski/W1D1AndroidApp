package domenafirmy.intrainrevision;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NamesActivity extends AppCompatActivity {
    
    public static final String EXTRA_NAME = "name";
    private TextView fullname ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_names);

        this.fullname = (TextView) findViewById(R.id.fullnameDisplay);

        if(getIntent().hasExtra(NamesActivity.EXTRA_NAME))
        {
            String paramValue = getIntent().getStringExtra(NamesActivity.EXTRA_NAME);

            this.fullname.setText(paramValue);
        }
    }
}
