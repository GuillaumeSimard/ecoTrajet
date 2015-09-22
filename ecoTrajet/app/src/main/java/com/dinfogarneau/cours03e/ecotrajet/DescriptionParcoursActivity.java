package com.dinfogarneau.cours03e.ecotrajet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.dinfogarneau.cours03e.ecotrajet.R;

/**
 * Created by Remy Huot on 2015-09-18.
 */
public class DescriptionParcoursActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descriptionparcours);
    }

    protected void onClickDemander(View v) {
        Toast.makeText(getApplicationContext(), "La demande à été envoyée.", Toast.LENGTH_SHORT).show();
    }
}
