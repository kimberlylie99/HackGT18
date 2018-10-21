package edu.gatech.gtthrifty.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import edu.gatech.gtthrifty.R;

public class SellActivity extends AppCompatActivity {

    private TextView mItemName;
    private TextView mPrice;
    private TextView mDescription;
    private ImageView mImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell);


    }
}
