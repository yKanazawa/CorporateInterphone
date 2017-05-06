package yakitori.android.corporateinterphone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import android.media.MediaPlayer;

public class CorporateInterphoneActivity extends AppCompatActivity {

    Button button1 = null;
    Button button2 = null;
    Button button3 = null;
    private MediaPlayer mediaPlayerGeneral;
    private MediaPlayer mediaPlayerYamato;
    private MediaPlayer mediaPlayer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corporate_interphone);

        mediaPlayerGeneral = MediaPlayer.create(this, R.raw.general);
        mediaPlayerYamato = MediaPlayer.create(this, R.raw.yamato);
        mediaPlayer1 = MediaPlayer.create(this, R.raw.interphone1);

        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new ButtonClickListener1());

        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new ButtonClickListener2());

        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new ButtonClickListener3());
    }

    class ButtonClickListener1 implements OnClickListener {
        public void onClick(View v) {
            mediaPlayerGeneral.start();
        }
    }
    class ButtonClickListener2 implements OnClickListener {
        public void onClick(View v) {
            mediaPlayer1.start();
        }
    }
    class ButtonClickListener3 implements OnClickListener {
        public void onClick(View v) {
            mediaPlayerYamato.start();
        }
    }


}
