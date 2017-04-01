package br.com.victor.exemploAA;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;

/**
 * Created by victoroliveira on 01/04/17.
 */

@EActivity(R.layout.activity_thread)
public class ThreadAAActivity extends AppCompatActivity {
	@ViewById(R.id.labelSinalEspera)
	TextView labelSinalEspera;

	@Click(R.id.buttonEsperar)
	void esperarOnClick() {
		labelSinalEspera.setVisibility(View.GONE);
		mostrarLabel();
	}

	@UiThread(delay = 3000)
	void mostrarLabel() {
		labelSinalEspera.setVisibility(View.VISIBLE);
	}
}
