package br.com.victor.exemploAA;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadNormalActivity extends AppCompatActivity {

	private static final ScheduledExecutorService SCHEDULER = Executors.newSingleThreadScheduledExecutor();
	private TextView labelSinalEspera;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_thread);

		labelSinalEspera = (TextView)findViewById(R.id.labelSinalEspera);

		Button buttonEsperar = (Button)findViewById(R.id.buttonEsperar);
		buttonEsperar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				esperar();
			}
		});
	}

	private void esperar() {
		labelSinalEspera.setVisibility(View.GONE);

		SCHEDULER.schedule(new Runnable() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						labelSinalEspera.setVisibility(View.VISIBLE);
					}
				});
			}
		}, 3, TimeUnit.SECONDS);
	}
}

