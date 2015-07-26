package com.quinoasoft.caloriecounter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.quinoasoft.caloriecounter.Utility.Alert;
import com.quinoasoft.caloriecounter.Utility.Value;


public class MainActivity extends ActionBarActivity {

    int caloriesToday=0;

    private EditText CurrentEntry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CurrentEntry = (EditText) findViewById(R.id.CurrentEntry);
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
        switch(id) {
            case R.id.action_settings:
                return true;
            case R.id.action_list:
                Alert.show(getApplicationContext(), "List");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void UpdateCalorieCount(View view) {
        Alert.show(getApplicationContext(),"Button Click");
        int amount = Value.toInt(CurrentEntry);
        caloriesToday += amount;
    }
}
