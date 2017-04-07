package br.com.victor.exemploAA;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
	@Click(R.id.buttonSomaNormal)
	void buttonSomaNormalOnClick() {
		Intent intent = new Intent(this, SomaNormalActivity.class);
		startActivity(intent);
	}

	@Click(R.id.buttonSomaAA)
	void buttonSomaAAOnClick() {
		SomaAAActivity_.intent(this).start();
	}

	@Click(R.id.buttonThreadNormal)
	void buttonThreadNormalOnClick() {
		Intent intent = new Intent(this, ThreadNormalActivity.class);
		startActivity(intent);
	}

	@Click(R.id.buttonThreadAA)
	void buttonThreadAAOnClick() {
		ThreadAAActivity_.intent(this).start();
	}

	@Click(R.id.buttonOptionsMenuNormal)
	void buttonOptionsMenuNormalOnClick() {
		Intent intent = new Intent(this, OptionsMenuActivity.class);
		startActivity(intent);
	}

	@Click(R.id.buttonOptionsMenuAA)
	void buttonOptionsMenuAAOnClick() {
		OptionsMenuAAActivity_.intent(this).start();
	}

	@Click(R.id.buttonParametrosNormal)
	void buttonParametrosNormalOnClick() {
		Intent intent = new Intent(this, ParametrosNormalActivity.class);
		intent.putExtra("valorNumerico", 84.123f);
		intent.putExtra("valorTexto", "Flisol");
		startActivity(intent);
	}

	@Click(R.id.buttonParametrosAA)
	void buttonParametrosAAOnClick() {
		ParametrosAAActivity_.intent(this)
				.parametroValorNumerico(84.123f)
				.parametroValorTexto("Flisol")
				.start();
	}
}
