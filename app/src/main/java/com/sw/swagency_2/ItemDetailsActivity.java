package com.sw.swagency_2;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ItemDetailsActivity extends AppCompatActivity {
    TextView tvLink, tvDescription;
    ImageView ivDetails;
    ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);
        tvLink = (TextView) findViewById(R.id.tvDetailsTitle);
        tvDescription = (TextView) findViewById(R.id.tvDetailsDescription);
        ivDetails = (ImageView) findViewById(R.id.ivDetails);


        Intent intent = getIntent();

        String link = intent.getStringExtra("link");
        tvLink.setText(link);

        String description = intent.getStringExtra("description");
        tvDescription.setText(description);

        String title = intent.getStringExtra("title");

        toolbar = getSupportActionBar();
        toolbar.setTitle(title);
        toolbar.setDisplayHomeAsUpEnabled(true);



        String imageURL = intent.getStringExtra("image");
        Picasso.with(this)
                .load(imageURL)
                .resize(1100, ivDetails.getHeight())
                .into(ivDetails);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
