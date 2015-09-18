package com.dinfogarneau.cours03e.ecotrajet;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class RechercheActivity extends Activity {
    /** Called when the activity is first created. */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recherche);

        Button btn = (Button)this.findViewById(R.id.btnRechercher);
    }

    public void onClickRechercher(View v) {
        Intent intent = new Intent(this, ResultatRechercheActivity.class);
        this.startActivity(intent);
    }
}