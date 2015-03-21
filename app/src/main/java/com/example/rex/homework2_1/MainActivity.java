package com.example.rex.homework2_1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    public void findViews(){
        relativeLayout=(RelativeLayout)findViewById(R.id.relativeLayout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuBG:
                Toast.makeText(MainActivity.this,getString(R.string.menuBG),Toast.LENGTH_SHORT).show();
                break;
            case R.id.submenuBGB:
                //使用色碼方式顯示想要的顏色
                relativeLayout.setBackgroundColor(Color.parseColor("#46A3FF"));
                Toast.makeText(MainActivity.this,getString(R.string.submenuBGB),Toast.LENGTH_SHORT).show();
                break;
            case R.id.submenuBGY:
                //使用內建Yellow顯示黃色
                relativeLayout.setBackgroundColor(Color.YELLOW);
                Toast.makeText(MainActivity.this,getString(R.string.submenuBGY),Toast.LENGTH_SHORT).show();
                break;
            case R.id.submenuBGR:
                relativeLayout.setBackgroundColor(Color.parseColor("#FF79BC"));
                Toast.makeText(MainActivity.this,getString(R.string.submenuBGR),Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuWP:
                Toast.makeText(MainActivity.this,getString(R.string.menuWP),Toast.LENGTH_SHORT).show();
                break;
            case R.id.submenuWP1:
                relativeLayout.setBackgroundResource(R.drawable.a);
                Toast.makeText(MainActivity.this,getString(R.string.submenuWP1),Toast.LENGTH_SHORT).show();
                break;
            case R.id.submenuWP2:
                relativeLayout.setBackgroundResource(R.drawable.b);
                Toast.makeText(MainActivity.this,getString(R.string.submenuWP2),Toast.LENGTH_SHORT).show();
                break;
            case R.id.submenuWP3:
                relativeLayout.setBackgroundResource(R.drawable.c);
                Toast.makeText(MainActivity.this,getString(R.string.submenuWP3),Toast.LENGTH_SHORT).show();
                break;
            default:
                return super.onOptionsItemSelected(item);

        }
        return true;
    }
}
