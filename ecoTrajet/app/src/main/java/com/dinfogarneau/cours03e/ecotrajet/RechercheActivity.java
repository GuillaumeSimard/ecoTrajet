package com.dinfogarneau.cours03e.ecotrajet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;


public class RechercheActivity extends Activity {
    /** Called when the activity is first created. */

    //déclaration des variables.
    Button btnFirstDate;
    Button btnLastDate;
    CalendarView calendarFirst;
    CalendarView calendarSecond;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recherche);
        Button btn = (Button)this.findViewById(R.id.btnRechercher);
        calendarFirst = (CalendarView) findViewById(R.id.calendar);
        calendarSecond = (CalendarView) findViewById(R.id.idCalendrier);


        //initialisation des calendriers
        initializeCalendar(calendarFirst);
        initializeCalendar(calendarSecond);
    }

    //Méthode permettant d'initiaiser le calendrier
    public void initializeCalendar(CalendarView cal) {


        // sets whether to show the week number.
        cal.setShowWeekNumber(false);

        // sets the first day of week according to Calendar.
        // here we set Monday as the first day of the Calendar
        cal.setFirstDayOfWeek(2);

        //The background color for the selected week.
        cal.setSelectedWeekBackgroundColor(getResources().getColor(R.color.green));

        //sets the color for the dates of an unfocused month.
        cal.setUnfocusedMonthDateColor(getResources().getColor(R.color.transparent));

        //sets the color for the separator line between weeks.
        cal.setWeekSeparatorLineColor(getResources().getColor(R.color.transparent));

        //sets the color for the vertical bar shown at the beginning and at the end of the selected date.
        cal.setSelectedDateVerticalBar(R.color.darkgreen);

        //sets the listener to be notified upon selected date change.
        cal.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int day) {

                Toast.makeText(getApplicationContext(), day + "/" + month + "/" + year, Toast.LENGTH_LONG).show();
            }

        });

    }


    public void onClickRechercher(View v) {
        Intent intent = new Intent(this, ResultatRechercheActivity.class);
        this.startActivity(intent);
    }

}