package com.example.robin.project_4_group_5_app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    private void initializeTabs()
    {
        TabHost tabhost = (TabHost) findViewById(R.id.tabHost);

        tabhost.setup();
        TabHost.TabSpec tabSpec = tabhost.newTabSpec("StolenBikes");
        tabSpec.setContent(R.id.tabStolenBikes);
        tabSpec.setIndicator("Stolen Bikes");
        tabhost.addTab(tabSpec);

        tabSpec = tabhost.newTabSpec("BikeContainers");
        tabSpec.setContent(R.id.tabContainers);
        tabSpec.setIndicator("Bike Containers");
        tabhost.addTab(tabSpec);

        tabSpec = tabhost.newTabSpec("Combi");
        tabSpec.setContent(R.id.tabCombi);
        tabSpec.setIndicator("Combination");
        tabhost.addTab(tabSpec);
    }

    public void HomeButtonClick(View view)
    {
        setContentView(R.layout.screen_1);
    }

    public void secondHomeBttonClick(View view)
    {
        setContentView(R.layout.layoutfile);
        initializeTabs();
    }

    public void OnBackButton(View view)
    {
        setContentView(R.layout.content_main);
    }

    public void OnButtonClick(View view)
    {
//        GraphView graph = (GraphView) findViewById(R.id.graph);
//        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
//                new DataPoint(0, 1),
//                new DataPoint(1, 5),
//                new DataPoint(2, 3),
//                new DataPoint(3, 2),
//                new DataPoint(4, 6)
//        });
//        graph.addSeries(series);
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