package tunghim.wallace_chung;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name = (TextView) findViewById(R.id.name);
        Spanned text = Html.fromHtml("By <a href='https://twitter.com/tunghim'>@tunghim</a>");
        name.setMovementMethod(LinkMovementMethod.getInstance());
        name.setText(text);

        final ImageView imageView = (ImageView) findViewById(R.id.imageView);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.w_audio);

        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        mp.start();
                        imageView.setImageResource(R.drawable.w_10_2);
                        return true;
                    } else if (event.getAction() == MotionEvent.ACTION_UP) {
                        imageView.setImageResource(R.drawable.w_4_2);
                        mp.pause();
                        return true;
                    }

                return false;
            }
        });
    }
}
