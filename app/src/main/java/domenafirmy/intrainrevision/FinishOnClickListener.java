package domenafirmy.intrainrevision;

import android.app.Activity;
import android.view.View;

/**
 * Created by jawa on 24/10/2015.
 */
public class FinishOnClickListener implements View.OnClickListener {

    private Activity activity;

    public FinishOnClickListener(Activity activity) {
        this.activity = activity;
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        this.activity.finish();
    }
}
