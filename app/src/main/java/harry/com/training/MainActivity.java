package harry.com.training;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends Activity implements View.OnClickListener {
    Animal animal;
    public MainActivity() {
        Log.d("harry", "constructor ");
//        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("harry", "onCreate ");

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
//
//        animal = new Animal();
//
//        // to add a view dynamically and with respect to static view in xml layout
//        Button dynamicButton = new Button(this);
//        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);
//        relativeLayout.addView(dynamicButton);
//        dynamicButton.setText("Dynamic Button");
////        dynamicButton.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
////                RelativeLayout.LayoutParams.WRAP_CONTENT));
//        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
//                RelativeLayout.LayoutParams.WRAP_CONTENT);
//        layoutParams.addRule(RelativeLayout.BELOW,R.id.button2);
//        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
//        dynamicButton.setLayoutParams(layoutParams);
//
//        dynamicButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Intent intent1 = new Intent(this, Second.class);
                //subintent within intent
                Intent subIntent = new Intent();
                subIntent.putExtra("string", "test");
                                intent1.putExtras( subIntent);

                //seriliazation is by default
                //parcelable, we have to implement some methods in same Animal class with its implementation
//                intent1.putExtra("object", animal);
//                intent1.putExtra("hands", animal.getHands());
                Bundle bundle = new Bundle();
                bundle.putInt("legs", 20);
                intent1.putExtras(bundle);
//                startActivity(intent1);
                startActivityForResult(intent1, 123);
                break;
            case R.id.button2:
//                Intent intent2 = new Intent(this, Third.class);
                Intent intent2 = new Intent(this, Third.class);
                intent2.putExtra("string", "MMMMMMMMMM");
                startActivity(intent2);
                startActivityForResult(intent2, 789);

                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 123:
                Log.d("harry", "" + "coming from second activity");
                if (resultCode == RESULT_OK) {
                    Log.d("harry", "" + "i is > 100");
                } else {
                    Log.d("harry", "" + "i is < 100");
                }
                break;
            case 789:
                Log.d("harry", "" + "coming from third activity"+requestCode);
                break;
        }
        Log.d("harry", "onActivityResult created");


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("harry", "onRestart ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("harry", "onStart ");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("harry", "onResume ");

    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("harry", "onRestoreInstanceState ");

    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("harry", "onPause ");

    }

//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        Log.d("harry", "BACK PRESSED created");
//    }
//
//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        Log.d("harry", "KEYDOWN created");
//        return super.onKeyDown(keyCode, event);
//    }
//
//    @Override
//    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
//        Log.d("harry", "KEY LONG PRESS created");
//        return super.onKeyLongPress(keyCode, event);
//    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d("harry", "onConfiguration ");

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("harry", "onSaveInstanceState ");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("harry", "onStop ");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("harry", "onDestroy ");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        Log.d("harry", "onCreateOptionsMenu ");

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
            Log.d("harry", "onOptionsItemSelected ");

            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
