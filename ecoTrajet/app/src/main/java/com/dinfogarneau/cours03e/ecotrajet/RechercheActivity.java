package com.dinfogarneau.cours03e.ecotrajet;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RechercheActivity extends Activity {
    /** Called when the activity is first created. */

    //déclaration des variables.
    private Dialog dialogCalendrierOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recherche);
        Button btn = (Button)this.findViewById(R.id.btnRechercher);
        Button btnFirstDate = (Button)this.findViewById(R.id.idBoutonEntre);
        Button btnLastDate = (Button)this.findViewById(R.id.idBoutonEt);
    }

    public void onClickRechercher(View v) {
        Intent intent = new Intent(this, ResultatRechercheActivity.class);
        this.startActivity(intent);
    }

    public void ChoisirDateDebut(View v) {

        if(dialogCalendrierOne== null) {
            View setView = getLayoutInflater().inflate(R.layout.row_date, null);
            dialogCalendrierOne = new AlertDialog.Builder(this)
                    .setTitle(R.string.titrePopopCofirm)
                    .setView(setView)
                    .setMessage(R.string.textePopoAjout)
                    .setNegativeButton(android.R.string.cancel, null)
                    .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {

                        //méthode permettant la suppression
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    })
                    .create();
            dialogCalendrierOne.setOwnerActivity(this);
            dialogCalendrierOne.show();
        }
        else{
            dialogCalendrierOne.show();
        }
    }
}