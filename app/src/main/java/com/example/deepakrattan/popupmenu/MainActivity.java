package com.example.deepakrattan.popupmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPopUp(View v) {
        PopupMenu popupMenu = new PopupMenu(this, v);
        MenuInflater inflater = popupMenu.getMenuInflater();
        inflater.inflate(R.menu.pupup_menu, popupMenu.getMenu());
        popupMenu.show();

        // On clicking items of popup Menu
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.One:
                        Toast.makeText(MainActivity.this, "One clicked", Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.Two:
                        Toast.makeText(MainActivity.this, "Two clicked", Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.Three:
                        Toast.makeText(MainActivity.this, "Three clicked", Toast.LENGTH_LONG).show();
                        return true;
                    default:
                        return false;
                }

            }
        });


    }


}


