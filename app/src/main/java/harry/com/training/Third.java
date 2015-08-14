package harry.com.training;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Third extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button button = (Button) findViewById(R.id.buttonThird);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Third.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Log.d("harry", " CREATE 33333333333333333");

        TextView text1 = new TextView(this);
        TextView text2 = new TextView(this);
        TextView text3 = new TextView(this);
        TextView text4 = new TextView(this);
        TextView text5 = new TextView(this);

        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);


        // dynamic text1
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.addRule(RelativeLayout.BELOW, R.id.buttonThird);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        text1.setLayoutParams(layoutParams);
        int t1 = text1.generateViewId();
        text1.setId(t1);
        text1.setText("text1");
        relativeLayout.addView(text1);


        // dynamic text2
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        layoutParams2.addRule(RelativeLayout.BELOW, t1);
        layoutParams2.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        text2.setLayoutParams(layoutParams2);
        int t2 = text2.generateViewId();
        text2.setId(t2);
        text2.setText("text2");
        relativeLayout.addView(text2);


        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        layoutParams3.addRule(RelativeLayout.BELOW, t2);
        layoutParams3.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        text3.setLayoutParams(layoutParams3);
        int t3 = text3.generateViewId();
        text3.setId(t3);
        text3.setText("text3");
        relativeLayout.addView(text3);



        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        layoutParams4.addRule(RelativeLayout.BELOW,t3);
        layoutParams4.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        text4.setLayoutParams(layoutParams4);
        int t4 = text4.generateViewId();
        text4.setId(t4);
        text4.setText("text4");
        relativeLayout.addView(text4);



        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        layoutParams5.addRule(RelativeLayout.BELOW,t4);
        layoutParams5.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        text5.setLayoutParams(layoutParams5);
        int t5 = text5.generateViewId();
        text5.setId(t5);
        text5.setText("text5");
        relativeLayout.addView(text5);





    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("harry", " onNEWintent method 33333333333333333");

    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("harry", " RESTART 33333333333333333");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("harry", " START 333333333333333333");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("harry", "RESUME 333333333333333333");

    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("harry", "RESTOREINSTANCESTATE 333333333333333333");

    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("harry", "PAUSE 333333333333333333");

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("harry", "SAVEINSTANCESTATE 333333333333333333");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("harry", "STOP 333333333333333333");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("harry", "DESTROY 333333333333333333");

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_third, menu);
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
