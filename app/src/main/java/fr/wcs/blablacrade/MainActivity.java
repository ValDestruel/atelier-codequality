package fr.wcs.blablacrade;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button search = (Button) findViewById(R.id.search_itinerary);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intentItinerary = new Intent(MainActivity.this, SearchItineraryActivity.class);
                startActivity(intentItinerary);
            }});
    }
}
