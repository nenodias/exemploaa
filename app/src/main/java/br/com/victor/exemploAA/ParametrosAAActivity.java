package br.com.victor.exemploAA;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_parametros)
public class ParametrosAAActivity extends AppCompatActivity {

	@ViewById(R.id.valorNumericoTextView)
	TextView valorNumericoTextView;

	@ViewById(R.id.valorTextoTextView)
	TextView valorTextoTextView;

	@Extra("valorNumerico")
	float parametroValorNumerico;

	@Extra("valorTexto")
	String parametroValorTexto;

	@AfterViews
	void afterViews() {
		valorNumericoTextView.setText(Float.toString(parametroValorNumerico));
		valorTextoTextView.setText(parametroValorTexto);
	}
}
