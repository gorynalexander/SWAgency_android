package com.sw.swagency_2;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionMenuView;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        initFAB();

        ActionBar toolbar;
        toolbar = getSupportActionBar();
        toolbar.setTitle("Заказ");
        toolbar.setDisplayHomeAsUpEnabled(true);
    }

    private void initFAB() {
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Сообщение было отправлено", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();

                ViewGroup group = (ViewGroup) findViewById(R.id.formGroup);
                for (int i = 0, count = group.getChildCount(); i < count; ++i) {
                    View child = group.getChildAt(i);
                    if (child instanceof EditText) {
                        ((EditText) child).setText("");
                    }
                    if(child instanceof CheckBox){
                        ((CheckBox) child).setChecked(false);
                    }
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
