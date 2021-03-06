package com.example.android.SleepSuccess;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.example.android.sleepgeniusfinal.R;

import java.util.ArrayList;
import java.util.Calendar;
/*
Author: Chris V.
vinzant8892@gmail.com

This app creates a wakeup alarm and bedtime reminder
based upon the sleep habits of various successful people.
This app is not intended for commercial purposes and all names belong
to the original owner.
 */

public class MainActivity extends Activity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Switch switchBF =  findViewById(R.id.switchBF);
        Switch switchBG = findViewById(R.id.switchBG);
        Switch switchEM = findViewById(R.id.switchEM);
        Switch switchJB = findViewById(R.id.switchJB);
        Switch switchTE = findViewById(R.id.switchTE);
        Switch switchTC = findViewById(R.id.switchTC);



        switchBF.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                scheduleAlarmBF();
            }
        });
        switchBG.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                scheduleAlarmBG();
            }
        });
        switchEM.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                scheduleAlarmEM();
            }
        });
        switchJB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                scheduleAlarmJB();
            }
        });
        switchTE.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                scheduleAlarmTE();
            }
        });
        switchTC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                scheduleAlarmTC();
            }
        });



        }

        private void scheduleAlarmBF(){
            ArrayList<Integer> calendarArray= new ArrayList<Integer>();
            calendarArray.add(Calendar.MONDAY);
            calendarArray.add(Calendar.TUESDAY);
            calendarArray.add(Calendar.WEDNESDAY);
            calendarArray.add(Calendar.THURSDAY);
            calendarArray.add(Calendar.FRIDAY);
            calendarArray.add(Calendar.SATURDAY);
            calendarArray.add(Calendar.SUNDAY);

        Intent intentBF = new Intent();
        intentBF.setAction(AlarmClock.ACTION_SET_ALARM);

        intentBF.putExtra(AlarmClock.EXTRA_HOUR, 5);
        intentBF.putExtra(AlarmClock.EXTRA_MINUTES, 0);
        intentBF.putExtra(AlarmClock.EXTRA_DAYS, calendarArray);
        intentBF.putExtra(AlarmClock.EXTRA_SKIP_UI, true);


        startActivity(intentBF);

        Intent intentBF2 = new Intent();
        intentBF2.setAction(AlarmClock.ACTION_SET_ALARM);
        intentBF2.putExtra(AlarmClock.EXTRA_HOUR,21);
        intentBF2.putExtra(AlarmClock.EXTRA_MINUTES, 45);
        intentBF2.putExtra(AlarmClock.EXTRA_DAYS, calendarArray);
        intentBF2.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        intentBF2.putExtra(AlarmClock.EXTRA_MESSAGE, "You have 15 Minutes until Bedtime");

        startActivity(intentBF2);
        }
    private void scheduleAlarmBG(){
        ArrayList<Integer> calendarArray= new ArrayList<Integer>();
        calendarArray.add(Calendar.MONDAY);
        calendarArray.add(Calendar.TUESDAY);
        calendarArray.add(Calendar.WEDNESDAY);
        calendarArray.add(Calendar.THURSDAY);
        calendarArray.add(Calendar.FRIDAY);
        calendarArray.add(Calendar.SATURDAY);
        calendarArray.add(Calendar.SUNDAY);

        Intent intentBG = new Intent();
        intentBG.setAction(AlarmClock.ACTION_SET_ALARM);

        intentBG.putExtra(AlarmClock.EXTRA_HOUR, 7);
        intentBG.putExtra(AlarmClock.EXTRA_MINUTES, 0);
        intentBG.putExtra(AlarmClock.EXTRA_DAYS, calendarArray);
        intentBG.putExtra(AlarmClock.EXTRA_SKIP_UI, true);

        startActivity(intentBG);

        Intent intentBG2 = new Intent();
        intentBG2.setAction(AlarmClock.ACTION_SET_ALARM);
        intentBG2.putExtra(AlarmClock.EXTRA_HOUR,23);
        intentBG2.putExtra(AlarmClock.EXTRA_MINUTES, 45);
        intentBG2.putExtra(AlarmClock.EXTRA_DAYS, calendarArray);
        intentBG2.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        intentBG2.putExtra(AlarmClock.EXTRA_MESSAGE, "You have 15 Minutes until Bedtime");

        startActivity(intentBG2);
    }
    private void scheduleAlarmEM(){
        ArrayList<Integer> calendarArray= new ArrayList<Integer>();
        calendarArray.add(Calendar.MONDAY);
        calendarArray.add(Calendar.TUESDAY);
        calendarArray.add(Calendar.WEDNESDAY);
        calendarArray.add(Calendar.THURSDAY);
        calendarArray.add(Calendar.FRIDAY);
        calendarArray.add(Calendar.SATURDAY);
        calendarArray.add(Calendar.SUNDAY);

        Intent intentEM = new Intent();
        intentEM.setAction(AlarmClock.ACTION_SET_ALARM);

        intentEM.putExtra(AlarmClock.EXTRA_HOUR, 7);
        intentEM.putExtra(AlarmClock.EXTRA_MINUTES, 0);
        intentEM.putExtra(AlarmClock.EXTRA_DAYS, calendarArray);
        intentEM.putExtra(AlarmClock.EXTRA_SKIP_UI, true);

        startActivity(intentEM);

        Intent intentEM2 = new Intent();
        intentEM2.setAction(AlarmClock.ACTION_SET_ALARM);
        intentEM2.putExtra(AlarmClock.EXTRA_HOUR,0);
        intentEM2.putExtra(AlarmClock.EXTRA_MINUTES, 45);
        intentEM2.putExtra(AlarmClock.EXTRA_DAYS, calendarArray);
        intentEM2.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        intentEM2.putExtra(AlarmClock.EXTRA_MESSAGE, "You have 15 Minutes until Bedtime");

        startActivity(intentEM2);
    }
    private void scheduleAlarmJB(){
        ArrayList<Integer> calendarArray= new ArrayList<Integer>();
        calendarArray.add(Calendar.MONDAY);
        calendarArray.add(Calendar.TUESDAY);
        calendarArray.add(Calendar.WEDNESDAY);
        calendarArray.add(Calendar.THURSDAY);
        calendarArray.add(Calendar.FRIDAY);
        calendarArray.add(Calendar.SATURDAY);
        calendarArray.add(Calendar.SUNDAY);

        Intent intentJB = new Intent();
        intentJB.setAction(AlarmClock.ACTION_SET_ALARM);

        intentJB.putExtra(AlarmClock.EXTRA_HOUR, 5);
        intentJB.putExtra(AlarmClock.EXTRA_MINUTES, 0);
        intentJB.putExtra(AlarmClock.EXTRA_DAYS, calendarArray);
        intentJB.putExtra(AlarmClock.EXTRA_SKIP_UI, true);

        startActivity(intentJB);

        Intent intentJB2 = new Intent();
        intentJB2.setAction(AlarmClock.ACTION_SET_ALARM);
        intentJB2.putExtra(AlarmClock.EXTRA_HOUR,21);
        intentJB2.putExtra(AlarmClock.EXTRA_MINUTES, 45);
        intentJB2.putExtra(AlarmClock.EXTRA_DAYS, calendarArray);
        intentJB2.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        intentJB2.putExtra(AlarmClock.EXTRA_MESSAGE, "You have 15 Minutes until Bedtime");

        startActivity(intentJB2);
    }
    private void scheduleAlarmTE(){
        ArrayList<Integer> calendarArray= new ArrayList<Integer>();
        calendarArray.add(Calendar.MONDAY);
        calendarArray.add(Calendar.TUESDAY);
        calendarArray.add(Calendar.WEDNESDAY);
        calendarArray.add(Calendar.THURSDAY);
        calendarArray.add(Calendar.FRIDAY);
        calendarArray.add(Calendar.SATURDAY);
        calendarArray.add(Calendar.SUNDAY);

        Intent intentTE = new Intent();
        intentTE.setAction(AlarmClock.ACTION_SET_ALARM);

        intentTE.putExtra(AlarmClock.EXTRA_HOUR, 4);
        intentTE.putExtra(AlarmClock.EXTRA_MINUTES, 0);
        intentTE.putExtra(AlarmClock.EXTRA_DAYS, calendarArray);
        intentTE.putExtra(AlarmClock.EXTRA_SKIP_UI, true);

        startActivity(intentTE);

        Intent intentTE2 = new Intent();
        intentTE2.setAction(AlarmClock.ACTION_SET_ALARM);
        intentTE2.putExtra(AlarmClock.EXTRA_HOUR,22);
        intentTE2.putExtra(AlarmClock.EXTRA_MINUTES, 45);
        intentTE2.putExtra(AlarmClock.EXTRA_DAYS, calendarArray);
        intentTE2.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        intentTE2.putExtra(AlarmClock.EXTRA_MESSAGE, "You have 15 Minutes until Bedtime");

        startActivity(intentTE2);
    }
    private void scheduleAlarmTC(){
        ArrayList<Integer> calendarArray= new ArrayList<Integer>();
        calendarArray.add(Calendar.MONDAY);
        calendarArray.add(Calendar.TUESDAY);
        calendarArray.add(Calendar.WEDNESDAY);
        calendarArray.add(Calendar.THURSDAY);
        calendarArray.add(Calendar.FRIDAY);
        calendarArray.add(Calendar.SATURDAY);
        calendarArray.add(Calendar.SUNDAY);

        Intent intentTC = new Intent();
        intentTC.setAction(AlarmClock.ACTION_SET_ALARM);

        intentTC.putExtra(AlarmClock.EXTRA_HOUR, 4);
        intentTC.putExtra(AlarmClock.EXTRA_MINUTES, 30);
        intentTC.putExtra(AlarmClock.EXTRA_DAYS, calendarArray);
        intentTC.putExtra(AlarmClock.EXTRA_SKIP_UI, true);

        startActivity(intentTC);

        Intent intentTC2 = new Intent();
        intentTC2.setAction(AlarmClock.ACTION_SET_ALARM);
        intentTC2.putExtra(AlarmClock.EXTRA_HOUR,21);
        intentTC2.putExtra(AlarmClock.EXTRA_MINUTES, 15);
        intentTC2.putExtra(AlarmClock.EXTRA_DAYS, calendarArray);
        intentTC2.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        intentTC2.putExtra(AlarmClock.EXTRA_MESSAGE, "You have 15 Minutes until Bedtime");

        startActivity(intentTC2);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
