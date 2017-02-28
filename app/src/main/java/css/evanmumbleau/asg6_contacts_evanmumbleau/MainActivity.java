package css.evanmumbleau.asg6_contacts_evanmumbleau;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    Button button1Call, button1text;
    TextView textViewStatus;

    Button button2Call,  button2text;

    Button button3Call, button3text;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewStatus = (TextView) findViewById(R.id.textViewStatus);
        setupButtonClickEvents();

    }


    private void setupButtonClickEvents() {
        // ======= call someone
        // need to add permission the manifests/AndroidManifest.xml file
        //<uses-permission android:name="android.permission.CALL_PHONE" />
        Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
        phoneIntent.setData(Uri.parse("tel:" + "(608)7808913"));
        if (phoneIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(phoneIntent);
            button1Call = (Button) findViewById(R.id.button1Call);
            button1Call.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    textViewStatus.setText("Calling Blake A....");
                }
            });
        }



        /**
         *   Set up button click event listener for the text button for Blake A.
         */
        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.setData(Uri.parse("sms:6087808913"));
        sendIntent.putExtra("sms_body", "Hi");
        button1text = (Button) findViewById(R.id.button1text);
        button1text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Sending text to Blake A....");
            }
        });
        startActivity(sendIntent);

    }


    private void setupButton2ClickEvents() {
        // ======= call someone
        // need to add permission the manifests/AndroidManifest.xml file
        //<uses-permission android:name="android.permission.CALL_PHONE" />
        Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
        phoneIntent.setData(Uri.parse("tel:" + "(507)4505798"));
        if (phoneIntent.resolveActivity(getPackageManager()) != null) {
            button2Call = (Button) findViewById(R.id.button2Call);
            button2Call.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    textViewStatus.setText("Calling Eric Devine...");
                }
            });
            startActivity(phoneIntent);
        }




        /**
         *   Set up button click event listener for the text button for Eric Devine
         */
        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.setData(Uri.parse("sms:5074505798"));
        sendIntent.putExtra("sms_body", "Hi");
        button2text = (Button) findViewById(R.id.button2text);
        button2text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Sending text to Eric Devine...");
            }
        });
        startActivity(sendIntent);

    }


    private void setupButton3ClickEvents() {
        // ======= call someone
        // need to add permission the manifests/AndroidManifest.xml file
        //<uses-permission android:name="android.permission.CALL_PHONE" />
        Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
        phoneIntent.setData(Uri.parse("tel:" + "(507)3138559"));
        if (phoneIntent.resolveActivity(getPackageManager()) != null) {
            button3Call = (Button) findViewById(R.id.button3Call);
            button3Call.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    textViewStatus.setText("Calling Nate Peterson...");
                }
            });
            startActivity(phoneIntent);
        }




        /**
         *   Set up button click event listener for the text button for Nate Peterson
         */
        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.setData(Uri.parse("sms:5073138559"));
        sendIntent.putExtra("sms_body", "Hi");
        button3text = (Button) findViewById(R.id.button3text);
        button3text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Sending text to Nate Peterson...");
            }
        });
        startActivity(sendIntent);



    }
}
