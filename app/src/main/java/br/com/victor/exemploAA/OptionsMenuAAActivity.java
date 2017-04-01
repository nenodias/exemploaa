package br.com.victor.exemploAA;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;

/**
 * Created by victoroliveira on 01/04/17.
 */

@EActivity(R.layout.activity_options_menu)
@OptionsMenu(R.menu.menu_exemplo)
public class OptionsMenuAAActivity extends AppCompatActivity {
	@OptionsItem(R.id.buttonMostrarToast)
	void mostrarToast() {
		Toast.makeText(this, "Mostrando Toast!", Toast.LENGTH_SHORT).show();
	}
}

