package br.com.victor.exemploAA;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by victoroliveira on 06/04/17.
 */

public class ParametrosNormalActivity extends AppCompatActivity {

	private TextView valorNumericoTextView;
	private TextView valorTextoTextView;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_parametros);

		valorNumericoTextView = (TextView)findViewById(R.id.valorNumericoTextView);
		valorTextoTextView = (TextView)findViewById(R.id.valorTextoTextView);

		float parametroValorNumerico = getIntent().getFloatExtra("valorNumerico", 0);
		String parametroValorTexto = getIntent().getStringExtra("valorTexto");

		valorNumericoTextView.setText(Float.toString(parametroValorNumerico));
		valorTextoTextView.setText(parametroValorTexto);
	}
}
