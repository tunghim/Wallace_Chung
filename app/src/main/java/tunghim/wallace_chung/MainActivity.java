package tunghim.wallace_chung;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    String s = "Next";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next = (Button) findViewById(R.id.next);
        next.setText(s);

        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (s.equals("Next")) {
                    ImageView img = (ImageView) findViewById(R.id.imageView);

                    img.setImageResource(R.drawable.salmoon);
                    Button next = (Button) findViewById(R.id.next);
                    s = "Prev";
                    next.setText(s);
                } else {
                    ImageView img = (ImageView) findViewById(R.id.imageView);
                    img.setImageResource(R.drawable.lobster);
                    Button next = (Button) findViewById(R.id.next);
                    s = "Next";
                    next.setText(s);
                }
            }
        });
    }


}
