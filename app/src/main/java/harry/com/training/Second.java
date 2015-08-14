package harry.com.training;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class Second extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("harry", " CREATE created");
        int i = 5 * getIntent().getIntExtra("int", 0);
        Log.d("harry", "" + i);


        Button buttonSecond = (Button) findViewById(R.id.buttonSecond);
        buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second.this, Third.class);
                startActivity(intent);
            }
        });
//        Intent intent2to1 = new Intent();
//        Animal animal = (Animal)getIntent().getParcelableExtra("object");
//        int hands = animal.getHands();
//        int legs = animal.getLegs();

        //getting data from subintent from intent
        String legs = getIntent().getExtras().getString("string");

        //getting value from Bundle
        int legss = getIntent().getExtras().getInt("legs");

        TextView textSecond = (TextView) findViewById(R.id.textSecond);
        textSecond.setText("Legs: " + legs );

        //getting int from second button
        String getDynamicText = getIntent().getStringExtra("string");
        TextView dynamicText = new TextView(this);
//        dynamicText.setText(""+getDynamicText);
        dynamicText.setText(String.valueOf(getDynamicText));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        dynamicText.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.MATCH_PARENT));
//        dynamicText.setEms(7);
        relativeLayout.addView(dynamicText);
        dynamicText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Second.this,"TextViewButton Pressed", Toast.LENGTH_SHORT).show();
            }
        });
//        relativeLayout.addView(dynamicText,2,relativeLayout.getLayoutParams());

//        intent2to1.putExtra("Value", i);
//        Log.d("harry", "" + RESULT_OK);
//        Log.d("harry", "" + i);
//        if (i > 100) {
//            setResult(RESULT_OK);
//        } else {
//            setResult(RESULT_CANCELED);
//        }

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("harry", " RESTART created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("harry", " START created");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("harry", "RESUME created");

    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("harry", "RESTOREINSTANCESTATE created");

    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("harry", "PAUSE created");

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("harry", "SAVEINSTANCESTATE created");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("harry", "STOP created");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("harry", "DESTROY created");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
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
