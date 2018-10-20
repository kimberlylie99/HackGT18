package edu.gatech.gtthrifty.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import edu.gatech.gtthrifty.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button mSell = findViewById(R.id.sell_button);
        mSell.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                sell();
            }
        });

        final Button mRequest = findViewById(R.id.req_button);
        mRequest.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                request();
            }
        });

        final Button mBrowse = findViewById(R.id.browse_button);
        mBrowse.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                browse();
            }
        });

        final Button mProfile = findViewById(R.id.prof_button);
        mProfile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                profile();
            }
        });
    }

    private void sell(){
        //Intent intent = new Intent(this, SellActivity.class);
        //startActivity(intent);
    }

    private void request(){
        //Intent intent = new Intent(this, ReqActivity.class);
        //startActivity(intent);
    }

    private void browse(){
        //Intent intent = new Intent(this, BrowseActivity.class);
        //startActivity(intent);
    }

    private void profile(){
        //Intent intent = new Intent(this, ProfileActivity.class);
        //startActivity(intent);
    }

}
