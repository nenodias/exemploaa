package br.com.victor.exemploAA;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SomaNormalActivity extends AppCompatActivity {

	private EditText numero1EditText;
	private EditText numero2EditText;
	private TextView resultadoTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_soma);

		numero1EditText = (EditText)findViewById(R.id.numero1EditText);
		numero2EditText = (EditText)findViewById(R.id.numero2EditText);
		resultadoTextView = (TextView)findViewById(R.id.resultadoTextView);

		Button buttonCalcular = (Button) findViewById(R.id.buttonCalcular);
		buttonCalcular.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				somar();
			}
		});
	}

	private void somar() {
		float numero1 = Float.parseFloat(numero1EditText.getText().toString());
		float numero2 = Float.parseFloat(numero2EditText.getText().toString());
		float resultado = numero1 + numero2;
		resultadoTextView.setText(Float.toString(resultado));

		numero1EditText.getEditableText().clear();
		numero2EditText.getEditableText().clear();
	}
}

