package com.example.lab2_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void showPopup(View v)
    {
        PopupMenu popup = new PopupMenu(this,v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.optionmenu);
        popup.show();

    }



    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.Delete_ct:
                Toast.makeText(this,"Delete",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.New_sm:
                Toast.makeText(this,"New",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.Save_sm:
                Toast.makeText(this,"Save",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.Load_sm:
                Toast.makeText(this,"Load",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.Exit_sm:
                Toast.makeText(this,"Exit",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.Send:
                Toast.makeText(this,"Send",Toast.LENGTH_SHORT).show();
                return true;

        }
        return  true;
    }
}