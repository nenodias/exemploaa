package br.com.victor.exemploAA;

import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by victoroliveira on 01/04/17.
 */

@EActivity(R.layout.activity_soma)
public class SomaAAActivity extends AppCompatActivity {

	@ViewById(R.id.numero1EditText)
	EditText numero1EditText;

	@ViewById(R.id.numero2EditText)
	EditText numero2EditText;

	@ViewById(R.id.resultadoTextView)
	TextView resultadoTextView;

	@Click(R.id.buttonCalcular)
	void buttonCalcularOnClick() {
		float numero1 = Float.parseFloat(numero1EditText.getText().toString());
		float numero2 = Float.parseFloat(numero2EditText.getText().toString());
		float resultado = numero1 + numero2;
		resultadoTextView.setText(Float.toString(resultado));

		numero1EditText.getEditableText().clear();
		numero2EditText.getEditableText().clear();
	}
}


