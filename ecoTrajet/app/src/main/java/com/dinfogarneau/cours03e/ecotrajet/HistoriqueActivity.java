package com.dinfogarneau.cours03e.ecotrajet;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Remy Huot on 2015-09-18.
 */
public class HistoriqueActivity extends ListActivity {

    //déclaration des variables
    private String[] lstDepartPassager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historique);
        lstDepartPassager = getResources().getStringArray(R.array.MesDepartsEmprunter);
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lstDepartPassager));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_historique, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.idInscHistorique) {
            Intent intent = new Intent(this, RechercheActivity.class);
            this.startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent i = new Intent(this, DescriptionParcoursActivity.class);
        this.startActivity(i);
    }
}
