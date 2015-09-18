package com.dinfogarneau.cours03e.ecotrajet;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

/**
 * Created by Remy Huot on 2015-09-18.
 */
public class ResultatRechercheActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultatrecherche);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(this, DescriptionParcoursActivity.class);
        this.startActivity(intent);
    }
}